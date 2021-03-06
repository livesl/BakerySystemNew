/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.CalMaster;
import com.Messages;
import com.userstatus;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.db;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author LasithaRanawaka
 */
public class StockTransfer extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public StockTransfer() {
        initComponents();
        FirstLoad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date_StockTrance = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cmb_Department = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txt_Total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_StockTranc = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_ItemID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_ItemName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmb_BatchID = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txt_CostPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_SellPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Qty = new javax.swing.JTextField();
        btn_Submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_RemQty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stock Transfer..");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Date");

        jLabel3.setText("Department Name");

        cmb_Department.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_DepartmentKeyPressed(evt);
            }
        });

        jLabel4.setText("Total");

        txt_Total.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_StockTrance, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(cmb_Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(date_StockTrance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_StockTranc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Batch ID", "Cost Price", "Sell Price", "Qty", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_StockTranc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_StockTrancKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_StockTranc);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Item ID");

        txt_ItemID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ItemIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ItemIDKeyReleased(evt);
            }
        });

        jLabel6.setText("Item Name");

        txt_ItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ItemNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ItemNameKeyReleased(evt);
            }
        });

        jLabel7.setText("Batch ID");

        cmb_BatchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_BatchIDActionPerformed(evt);
            }
        });
        cmb_BatchID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_BatchIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmb_BatchIDKeyReleased(evt);
            }
        });

        jLabel8.setText("Cost Price");

        txt_CostPrice.setText("0.0");
        txt_CostPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CostPriceKeyPressed(evt);
            }
        });

        jLabel9.setText("Sell Price");

        txt_SellPrice.setText("0.0");
        txt_SellPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_SellPriceKeyPressed(evt);
            }
        });

        jLabel10.setText("Qty");

        txt_Qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_QtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_QtyKeyReleased(evt);
            }
        });

        btn_Submit.setText("Submit");
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });

        jLabel1.setText("Rem.Qty");

        lbl_RemQty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_RemQty.setText("0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_ItemID)
                    .addComponent(txt_CostPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_BatchID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_SellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_RemQty, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btn_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_ItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txt_ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cmb_BatchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_CostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txt_SellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txt_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lbl_RemQty)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_DepartmentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_DepartmentKeyPressed
        if (evt.getKeyCode() == 10) {
            if (cmb_Department.getSelectedIndex() != 0) {
                txt_ItemID.grabFocus();
                
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_DepartmentKeyPressed
    
    private void txt_ItemNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ItemNameKeyPressed
        if (evt.getKeyCode() == 10) {
            if (!txt_ItemName.getText().isEmpty()) {
                
                SetBatchesFromName();
                
            }
        } else if (evt.getKeyCode() == 113) {
            if (!txt_Total.getText().isEmpty() && !txt_Total.getText().equals("0.0")) {
                btn_Submit.grabFocus();
            }
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txt_ItemNameKeyPressed
    
    private void cmb_BatchIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_BatchIDKeyPressed
        if (evt.getKeyCode() == 10) {
            if (cmb_BatchID.getSelectedIndex() != -1) {
                SetPrices();
                txt_CostPrice.grabFocus();
                txt_CostPrice.selectAll();
            }
            
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_BatchIDKeyPressed
    
    private void txt_ItemIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ItemIDKeyPressed
        if (evt.getKeyCode() == 10) {
            if (!txt_ItemID.getText().isEmpty()) {
                SetBatchesFromID();
            }
        } else if (evt.getKeyCode() == 113) {
            if (!txt_Total.getText().isEmpty() && !txt_Total.getText().equals("0.0")) {
                btn_Submit.grabFocus();
            }
        }  // TODO add your handling code here:
    }//GEN-LAST:event_txt_ItemIDKeyPressed
    
    private void txt_CostPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CostPriceKeyPressed
        if (evt.getKeyCode() == 10) {
            if (!txt_CostPrice.getText().isEmpty()) {
                txt_SellPrice.grabFocus();
                txt_SellPrice.selectAll();
            }
        }  // TODO add your handling code here:
    }//GEN-LAST:event_txt_CostPriceKeyPressed
    
    private void txt_SellPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SellPriceKeyPressed
        if (evt.getKeyCode() == 10) {
            if (!txt_SellPrice.getText().isEmpty()) {
                txt_Qty.grabFocus();
                
            }
        } // TODO add your handling code here:
    }//GEN-LAST:event_txt_SellPriceKeyPressed
    
    private void txt_QtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_QtyKeyPressed
        if (evt.getKeyCode() == 10) {
            if (!txt_Qty.getText().isEmpty() && cmb_BatchID.getSelectedIndex() != -1) {
                
                double qty = Double.parseDouble(txt_Qty.getText());
                double avqty = Double.parseDouble(lbl_RemQty.getText());
                
                if (qty > avqty) {
                    Messages.warningjoption("Remaining Qty is Over ! Please Check !");
                    txt_Qty.grabFocus();
                    txt_Qty.selectAll();
                } else {
                    if (isItemAvailable()) {/// one stock transfer reg has only one batch item
                        Messages.normaljoption("This item is already exist ! Please Check ! ");
                    } else {
                        
                       
                        
                        AddItemToTable();
                        txt_ItemID.grabFocus();
                    }
                }
                
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_QtyKeyPressed
    
    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        if (cmb_Department.getSelectedIndex() != 0 && date_StockTrance.getDate() != null && tbl_StockTranc.getRowCount() != 0) {
            
            Save();
            
        } else {
            Messages.fillemptydata();
            cmb_Department.grabFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SubmitActionPerformed
    
    private void txt_ItemIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ItemIDKeyReleased
        if (!txt_ItemID.getText().isEmpty()) {
            //SetBatchesFromID();
        } else {
            ClearAll(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ItemIDKeyReleased
    
    private void txt_ItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ItemNameKeyReleased
        if (!txt_ItemName.getText().isEmpty()) {
            // SetBatchesFromName();
        } else {
            
            ClearAll(0);
            txt_ItemName.grabFocus();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_ItemNameKeyReleased
    
    private void cmb_BatchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_BatchIDActionPerformed
        if (cmb_BatchID.getSelectedIndex() != -1) {
            SetPrices();
            
        }
    }//GEN-LAST:event_cmb_BatchIDActionPerformed
    
    private void tbl_StockTrancKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_StockTrancKeyPressed
        if (tbl_StockTranc.getRowCount() != 0) {
            if (evt.getKeyCode() == 127) {
                DeleteTableItem();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_StockTrancKeyPressed
    
    private void txt_QtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_QtyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_QtyKeyReleased
    
    private void cmb_BatchIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_BatchIDKeyReleased
//        if (cmb_BatchID.getSelectedIndex() != -1) {
//            SetPrices();
//            txt_CostPrice.grabFocus();
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_BatchIDKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StockTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockTransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockTransfer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Submit;
    private javax.swing.JComboBox cmb_BatchID;
    private javax.swing.JComboBox cmb_Department;
    private com.toedter.calendar.JDateChooser date_StockTrance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_RemQty;
    private javax.swing.JTable tbl_StockTranc;
    private javax.swing.JTextField txt_CostPrice;
    private javax.swing.JTextField txt_ItemID;
    private javax.swing.JTextField txt_ItemName;
    private javax.swing.JTextField txt_Qty;
    private javax.swing.JTextField txt_SellPrice;
    private javax.swing.JTextField txt_Total;
    // End of variables declaration//GEN-END:variables

    private void FirstLoad() {
        LoadComboDepartment();
        System.out.println(GetID());
        date_StockTrance.setDate(new Date());
        LoadItemName();
        cmb_Department.grabFocus();
    }
    
    private void LoadComboDepartment() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmb_Department.getModel();
        dcbm.removeAllElements();
        
        try {
            dcbm.addElement("--Select--");
            ResultSet rs = model.db.fetch("SELECT\n"
                    + "department.`name`\n"
                    + "FROM\n"
                    + "department\n"
                    + "WHERE\n"
                    + "department.`status` = '0'");
            
            while (rs.next()) {
                dcbm.addElement(rs.getString(1));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private String GetID() { // return next new id
        String id = "1";
        try {
            ResultSet rs = model.db.fetch("select max(id) from stock_transfer_reg");
            
            if (rs.next()) {
                
                if (rs.getString(1) != null) {
                    int num = Integer.parseInt(rs.getString(1));
                    num++;
                    id = "" + num;
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return id;
    }
    
    private void AddItemToTable() {
        
        if (cmb_BatchID.getSelectedIndex() != -1 && !txt_CostPrice.getText().isEmpty() && !txt_SellPrice.getText().isEmpty() && !txt_Qty.getText().isEmpty()) {
            DefaultTableModel dtm = (DefaultTableModel) tbl_StockTranc.getModel();
            
            int itemid = Integer.parseInt(txt_ItemID.getText());
            String name = txt_ItemName.getText();
            double cost = Double.parseDouble(txt_CostPrice.getText());
            double sell = Double.parseDouble(txt_SellPrice.getText());
            double qty = Double.parseDouble(txt_Qty.getText());
            int btchid = Integer.parseInt(cmb_BatchID.getSelectedItem().toString());
            double total = Double.parseDouble("" + cost * qty);
            
            Object arr[] = {itemid, name, btchid, cost, sell, qty, total};
            dtm.addRow(arr);
            
            double amounttot = 0.0; // get amout of table content

            for (int i = 0; i < tbl_StockTranc.getRowCount(); i++) {
                
                amounttot += Double.parseDouble(tbl_StockTranc.getValueAt(i, 6).toString());
                txt_Total.setText("" + amounttot);
            }
        } else {
            Messages.fillemptydata();
        }
        ClearAll(0);
        txt_ItemID.grabFocus();
    }
    
    private void ClearAll(int i) {
        
        if (i == 1) { // only 1 for all
            LoadComboDepartment();
            LoadItemName();
            DefaultTableModel dtm = (DefaultTableModel) tbl_StockTranc.getModel();
            dtm.setRowCount(0);
            txt_Total.setText("0.0");
            date_StockTrance.setDate(new Date());
        }
        txt_ItemID.setText(null);
        txt_ItemName.setText(null);
        txt_CostPrice.setText("0.0");
        txt_SellPrice.setText("0.0");
        lbl_RemQty.setText("0.0");
        cmb_BatchID.removeAllItems();
        txt_Qty.setText(null);
        
        
    }
    
    private void Save() {
        
        String stocktrancid = GetID();
        
        
        int department_id = 0;
        try {
            ResultSet rs = model.db.fetch("select * from  department where name='" + cmb_Department.getSelectedItem() + "' and status='0' ");
            if (rs.next()) {
                
                department_id = Integer.parseInt(rs.getString(1));
                // System.out.println(supplier_id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa").format(.getDate()));
        try {
            
            
            
            db.change("insert into stock_transfer_reg(id,date,total,user_name,department_id) "
                    + "values('" + stocktrancid.trim() + "','" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date_StockTrance.getDate()) + "'," + txt_Total.getText().trim() + ",'" + userstatus.LodUser.trim() + "','" + department_id + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        try {
            
            for (int i = 0; i < tbl_StockTranc.getRowCount(); i++) {
                
                
                double cost = Double.parseDouble(tbl_StockTranc.getValueAt(i, 3).toString());
                double sell = Double.parseDouble(tbl_StockTranc.getValueAt(i, 4).toString());
                double qty = Double.parseDouble(tbl_StockTranc.getValueAt(i, 5).toString());
                int batch = Integer.parseInt(tbl_StockTranc.getValueAt(i, 2).toString());
                
                int itemid = Integer.parseInt(tbl_StockTranc.getValueAt(i, 0).toString());
                
                
                
                db.change("insert into stock_transfer(cost,sell,qty,stock_transfer_reg_id,batch_item_id,batch_item_grn_items_id) "
                        + "values('" + cost + "','" + sell + "','" + qty + "','" + stocktrancid + "','" + batch + "','" + itemid + "')");

                // batch item update reduce rem qty
                db.change("Update batch_item set  rem_qty=rem_qty-'" + qty + "' where id='" + batch + "'");
                
                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Messages.datasaved();
        ClearAll(1);
        
        
        
    }
    
    private void SetBatchesFromID() {
        try {
            DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmb_BatchID.getModel();
            dcbm.removeAllElements();
            
            
            ResultSet rs = model.db.fetch("SELECT\n"
                    + "batch_item.id,\n"
                    + "items.`name`\n"
                    + "FROM\n"
                    + "batch_item ,\n"
                    + "items\n"
                    + "WHERE\n"
                    + "batch_item.grn_items_id = items.id AND\n"
                    + "batch_item.rem_qty > 0 AND\n"
                    + "batch_item.grn_items_id = '" + txt_ItemID.getText() + "'");
            
            while (rs.next()) {
                dcbm.addElement(rs.getString(1));
                txt_ItemName.setText(rs.getString(2));
            }
            cmb_BatchID.grabFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private void SetBatchesFromName() {
        try {
            
            DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmb_BatchID.getModel();
            dcbm.removeAllElements();
            
            
            ResultSet rs = model.db.fetch("SELECT\n"
                    + "batch_item.id,\n"
                    + "items.id\n"
                    + "FROM\n"
                    + "batch_item ,\n"
                    + "items\n"
                    + "WHERE\n"
                    + "batch_item.grn_items_id = items.id AND\n"
                    + "items.`name` = '" + txt_ItemName.getText() + "' AND\n"
                    + "batch_item.rem_qty > 0");
            
            while (rs.next()) {
                dcbm.addElement(rs.getString(1)); // batch id
                txt_ItemID.setText(rs.getString(2)); // item id
            }
            cmb_BatchID.grabFocus();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void SetPrices() {
        try {
            
            
            
            ResultSet rs = model.db.fetch("SELECT\n"
                    + "grn.cost,\n"
                    + "grn.sell,\n"
                    + "batch_item.rem_qty\n"
                    + "FROM\n"
                    + "batch_item ,\n"
                    + "grn\n"
                    + "WHERE\n"
                    + "batch_item.grn_raw = grn.raw AND\n"
                    + "batch_item.id = '" + cmb_BatchID.getSelectedItem() + "'");
            
            while (rs.next()) {
                txt_CostPrice.setText(rs.getString(1));
                txt_SellPrice.setText(rs.getString(2));
                lbl_RemQty.setText(rs.getString(3));
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void DeleteTableItem() {
        DefaultTableModel tbl = (DefaultTableModel) tbl_StockTranc.getModel();
        tbl.removeRow(tbl_StockTranc.getSelectedRow());
        
        double amounttot = 0.0;
        
        for (int i = 0; i < tbl_StockTranc.getRowCount(); i++) {
            
            amounttot += Double.parseDouble(tbl_StockTranc.getValueAt(i, 6).toString());
            txt_Total.setText("" + amounttot);
        }
        
        if (tbl_StockTranc.getRowCount() == 0) {
            txt_Total.setText("0.0");
        }
        
        txt_ItemID.grabFocus();
        
    }
    
    private void LoadItemName() {
        
        
        List<String> li = new ArrayList<String>();
        
        try {
            ResultSet rs = model.db.fetch("SELECT\n"
                    + "items.`name`\n"
                    + "FROM\n"
                    + "items\n"
                    + "WHERE\n"
                    + "items.`status` = '0'");
            while (rs.next()) {
                li.add(rs.getString(1));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        AutoCompleteDecorator.decorate(txt_ItemName, li, true);
    }
    
    private boolean isItemAvailable() {
        
        boolean bol = false;
        
        String itemid = cmb_BatchID.getSelectedItem().toString();
        
        for (int i = 0; i < tbl_StockTranc.getRowCount(); i++) {
            
            String value = tbl_StockTranc.getValueAt(i, 2).toString();
            if (itemid.equals(value)) {
                bol = true;
                break;
            }
        }
        return bol;
    }
}
