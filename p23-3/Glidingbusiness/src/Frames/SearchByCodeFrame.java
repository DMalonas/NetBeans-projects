/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import MyClasses.Voucher;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dmalonas
 */
public class SearchByCodeFrame extends javax.swing.JInternalFrame {

    private ArrayList<Voucher> listVouchers;
    private ObjectInputStream serverInputStream;
    PrintWriter out;
    private Socket socket;
    DefaultTableModel model;
    
    /**
     * Creates new form SearchByCodeFrame
     */
    public SearchByCodeFrame() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        // Add listener for double click and show voucher details
        jTable1.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent me)
            {
                JTable table =(JTable) me.getSource();
                Point p = me.getPoint();
                int selectedRow = table.rowAtPoint(p);
                if (me.getClickCount() == 2)
                {
                    showVoucherDetails(selectedRow);
                }
            }
        });
    }
    
    public void showVoucherDetails(int row)
    {
        ViewVoucherDetailsFrame viewVoucherDetailsFrame = new ViewVoucherDetailsFrame(listVouchers.get(row));
        viewVoucherDetailsFrame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search by code:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Voucher code", "Customer name", "Gift", "Redeemed", "Completed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jButton2)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton2)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Populate rows with vouchers' data
        listVouchers = new ArrayList<Voucher>();
        try
        {
            // Connect to server
            if (connectToServer() > 0)
            {
                out.print(jTextField1.getText() + "\r\n"); // send voucher code to server
                out.flush();
                serverInputStream = new ObjectInputStream(socket.getInputStream());
                
                // Receive vouchers as ArrayList listVouchers
                receiveVouchers();
                
                // Sort by customer name
                Collections.sort(listVouchers, new Comparator<Voucher>() {
                    @Override
                    public int compare(Voucher voucher1, Voucher voucher2)
                    {
                        return  voucher1.getPurchaserName().compareTo(voucher2.getPurchaserName());
                    }
                });
                // Populate vouchers in the form
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                Iterator<Voucher> myVoucherIterator = listVouchers.iterator();
		while (myVoucherIterator.hasNext())
                {
                    Voucher tempVoucher = myVoucherIterator.next();
                    model.addRow(new Object[]{tempVoucher.getVoucherCode(), tempVoucher.getPurchaserName(), 
                        tempVoucher.getGift() ? "YES":"NO", tempVoucher.getRedeemed() ? "YES":"NO", 
                        tempVoucher.getCompleted() ? "YES":"NO"});
		}
            }
        }
        catch (Exception ex)
        {
            Logger.getLogger(RedeemVoucherFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void receiveVouchers()
    {
        try
        {
            try {
                listVouchers = (ArrayList<Voucher>)serverInputStream.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CompleteVoucherFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (IOException ex) {
            Logger.getLogger(CompleteVoucherFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private int connectToServer()
    {
        closeConnection();
        try
        {
            socket = new Socket("127.0.0.1", 2222);
            out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Send type of communication
            out.print("SEARCH_BY_CODE\r\n"); // send to server
            out.flush();
            // Receive confirmation
            String serverResponse = in.readLine();
            if (serverResponse.equals("OK"))
                return 1;
            else
                return -1;
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Connection to server failed.", "Network Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
            return -1;
        }
    }

    private void closeConnection()
    {
        if (socket != null)
        {
            try
            {
                socket.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Disconnection from server failed.", "Network Error", JOptionPane.ERROR_MESSAGE);
            } finally
            {
                socket = null;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
