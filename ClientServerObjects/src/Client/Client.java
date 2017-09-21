
package Client;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
  // Transfer whole objects example
public class Client extends Frame implements ActionListener {

   private TextField userName, emailAddress;
   private TextArea sentData;
   private Button startProcessing, quit;
   private Socket s;
   private GUIData dataObj = null;       // Object for communication with server   
   private ObjectInputStream objIS = null;  // Streams definition for connection
   private ObjectOutputStream objOS = null;

   Client(String title) {
      super(title);
      userName = new TextField(10);
      emailAddress = new TextField(20);
      this.sentData = new TextArea(20, 3);
      this.emailAddress.setEditable(false);
      this.sentData.setEditable(false);
      startProcessing = new Button("Start");
      quit = new Button("Quit");
      setLayout(new GridLayout(4, 2));
      add(new Label("User Name"));
      add(userName);
      add(new Label("Email Address"));
      add(emailAddress);
      add(new Label("Sent data received back from Server"));
      add(this.sentData);
      add(startProcessing);
      add(quit);
      setSize(500, 300);
      setVisible(true);

      startProcessing.addActionListener(this);
      quit.addActionListener(this);

      // Set up connection to the server on the loop back address
      // and the same port number as the Server is expecting
      try {
         this.s = new Socket("127.0.0.1", 2000);
         this.objOS = new ObjectOutputStream(s.getOutputStream());
         this.objIS = new ObjectInputStream(s.getInputStream());
      } catch (IOException e) {
         System.out.printf("Error connecting wth the Server %s\n", e);
      }  // end try to set connection
   }  // end ClientExample2 construtor

   public void actionPerformed(ActionEvent ae) {
      String buttonClicked = ae.getActionCommand();
      try {
         if (buttonClicked.equals("Quit")) {
            System.out.println("Exiting Client 2");
            this.objOS.writeObject(new GUIData("Exit"));  // Send to Server
            this.objOS.flush();
            System.exit(0);
         } // end if Quit
         if (buttonClicked.equals("Start")) {
            this.dataObj = new GUIData(userName.getText());
            System.out.printf("Sending [%s] from Client 2.  Obj No. %d\n",
                    this.dataObj.getData1(), this.dataObj.getNum());

            this.objOS.writeObject(this.dataObj);  // Send to Server
            this.objOS.flush();
            
            this.dataObj = (GUIData) objIS.readObject();  // Receive reply
         }  // end if Start

         emailAddress.setText(this.dataObj.getData2());
         String dataSent = "User name = " + this.dataObj.getData1() + "\n\n";
         dataSent += "Object number = " + Integer.toString(this.dataObj.getNum());
         this.sentData.setText(dataSent);
      } catch (Exception e) {
         System.out.printf("Problem with send or receive %s\n", e);
      }  // end try send or receive
   }  // end actionPerformed method

   public static void main(String[] args) {
      new Client("Client 2 Example - Transfer Whole Objects");
   }  // end main method
}  // end ClientExample2 class
