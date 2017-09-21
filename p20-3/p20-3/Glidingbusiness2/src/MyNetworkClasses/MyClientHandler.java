/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyNetworkClasses;

import MyClasses.Club;
import MyClasses.NonRedeemedVoucher;
import MyClasses.RedeemedVoucher;
import MyClasses.Voucher;
import com.mysql.jdbc.Connection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dmalonas
 */
public class MyClientHandler implements Runnable
{
    private final Socket socket;
    
    private final PrintWriter printWriter;
    private final BufferedReader bufferedReader;
    
    private static int connectionCount = 0;
    private final int connectionNumber;

    /**
     * Constructor just initialises the connection to client.
     * 
     * @param socket the socket to establish the connection to client.
     * @param hashMapNames a reference to the lookup table for getting email.
     * @throws IOException if an I/O error occurs when creating the input and
     * output streams, or if the socket is closed, or socket is not connected.
     */
    public MyClientHandler(Socket socket) throws IOException
    {
        this.socket = socket;
        printWriter = new PrintWriter(socket.getOutputStream(), true);
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        connectionCount++;
        connectionNumber = connectionCount;
        threadSays("Connection " + connectionNumber + " established.");
    }

    /**
     * The run method is overridden from the Runnable interface. It is called
     * when the Thread is in a 'running' state - usually after thread.start()
     * is called. This method reads client requests and processes names until
     * an exception is thrown.
     */
    @Override
    public void run()
    {
        try
        {
            // Read and process names until an exception is thrown.
            threadSays("Waiting for type of communication from client...");
            // Read type of communication
            String textFromClient = bufferedReader.readLine();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/glidingdb","root","");
            if (textFromClient.equals("NEW_VOUCHER"))
            {
                printWriter.print("OK\r\n"); // Send confirmation to client
                printWriter.flush();
                System.out.println("Received request for new voucher. Receiving data...");
                // Receive new voucher
                ObjectInputStream serverInputStream = new ObjectInputStream(socket.getInputStream());
                NonRedeemedVoucher newVoucher = (NonRedeemedVoucher)serverInputStream.readObject();
                serverInputStream.close();
                System.out.println("Data received");
                // Connect to DB
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/glidingdb","root","");
                // Write to DB
                try
                {
                    //Insert to DB
                    if (newVoucher.insertToDB(con) > 0)
                    {
                        // Confirm everything is fine
                        System.out.println("Voucher succesfully created in DB.");
                    }
                }
                catch (Exception ex)
                {
                    Logger.getLogger(MyClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally
                {
                    con.close();
                }
            }
            else if (textFromClient.equals("REDEEM_VOUCHER"))
            {
                printWriter.print("OK\r\n"); // Send confirmation to client
                printWriter.flush();
                System.out.println("Received request for redeeming voucher. Sending data...");
                // Send non-redeemed vouchers
                // Connect to DB
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/glidingdb","root","");
                // Retrieve and load to the memory the available vouchers to redeem
                ArrayList<NonRedeemedVoucher> listVouchers = new ArrayList<NonRedeemedVoucher>(); // It is our memory that keeps/edits temp data from DB for better speed performance
                Statement st = con.createStatement();
                String queryStatement = "select * from vouchers where redeemed = 0";
                ResultSet rs = st.executeQuery(queryStatement);
                while (rs.next())
                {
                    // Create Voucher instance and insert to ArrayList
                    NonRedeemedVoucher tempVoucher = new NonRedeemedVoucher(rs.getString("CODE"), rs.getString("CUSTOMER_NAME"), (rs.getString("GIFT").equals("1")) ? true:false, rs.getString("GIFT_RECIPIENT_NAME"), rs.getString("DELIVERY_ADDRESS"), rs.getString("CUSTOMER_EMAIL_ADDRESS"), rs.getString("PURCHASE_DATE"));
                    listVouchers.add(tempVoucher);
                }
                rs.close();
                st.close();
                ObjectOutputStream clientOutputStream = new ObjectOutputStream(socket.getOutputStream());
                clientOutputStream.writeObject(listVouchers);
                
                // Send clubs' information
                ArrayList<Club> listClubs = new ArrayList<Club>(); // It is our memory that keeps/edits temp data from DB for better speed performance
                // Retrieve and load to the memory the available clubs and flight types per club
                st = con.createStatement();
                queryStatement = "select * from clubs";
                rs = st.executeQuery(queryStatement);
                while (rs.next())
                {
                    // Create Club instance and insert to ArrayList
                    Club tempClub = new Club(rs.getString("NAME"), (rs.getString("AEROTOW").equals("1")) ? true:false, (rs.getString("WINCH").equals("1")) ? true:false);
                    listClubs.add(tempClub);
                }
                rs.close();
                st.close();
                clientOutputStream.writeObject(listClubs);
                // Receive voucher to redeem
                ObjectInputStream serverInputStream = new ObjectInputStream(socket.getInputStream());
                RedeemedVoucher newRedeemedVoucher = (RedeemedVoucher)serverInputStream.readObject();
                serverInputStream.close();
                // Redeem in DB
                if (newRedeemedVoucher.updateToDB(con) > 0)
                        System.out.println("Voucher succesfully redeemed in DB.");
            }
        }
        catch (Exception ex)
        {
            Logger.getLogger(MyClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                threadSays("We have lost connection to client " + connectionNumber + ".");
                socket.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(MyClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * Private helper method outputs to standard output stream for debugging.
     * @param say the String to write to standard output stream.
     */
    private void threadSays(String say) {
        System.out.println("ClientHandlerThread" + connectionNumber + ": " + say);
    }
}
