/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.CalMaster;
import com.Messages;
import java.sql.Array;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LasithaRanawaka
 */
public class GrnView extends javax.swing.JFrame {

    /**
     * Creates new form viewGRN
     */
    public GrnView() {
        initComponents();
        LoadSearchCombo();
        LoadSuppliers();
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
        txt_GrnID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date_From = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        cmb_Supplier = new javax.swing.JComboBox();
        btn_Find = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmb_Search = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        date_To = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_GrnViewItems = new javax.swing.JTable();
        btn_GrnPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_GrnView = new javax.swing.JTable();
        btn_ClearAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View GRN");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("GRN ID");

        txt_GrnID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_GrnIDKeyPressed(evt);
            }
        });

        jLabel3.setText("From");

        date_From.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                date_FromMouseClicked(evt);
            }
        });
        date_From.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_FromPropertyChange(evt);
            }
        });

        jLabel4.setText("Supplier Name");

        cmb_Supplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_SupplierKeyPressed(evt);
            }
        });

        btn_Find.setText("Find");
        btn_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FindActionPerformed(evt);
            }
        });

        jLabel10.setText("Search");

        cmb_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_SearchActionPerformed(evt);
            }
        });
        cmb_Search.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmb_SearchPropertyChange(evt);
            }
        });
        cmb_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_SearchKeyPressed(evt);
            }
        });

        jLabel11.setText("To");

        date_To.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_ToPropertyChange(evt);
            }
        });
        date_To.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                date_ToKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(date_From, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(date_To, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmb_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_GrnID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmb_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmb_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_GrnID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(cmb_Search)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(date_From, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date_To, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addComponent(btn_Find))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tbl_GrnViewItems.setBackground(new java.awt.Color(255, 255, 153));
        tbl_GrnViewItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Name", "Cost Price", "Selling Price", "Dis %", "Dis Cost Price", "Qty", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_GrnViewItems);

        btn_GrnPrint.setText("Print");

        tbl_GrnView.setBackground(new java.awt.Color(255, 102, 255));
        tbl_GrnView.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbl_GrnView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Total", "Discount", "Grand_Total", "Supplier", "Log User"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_GrnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_GrnViewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_GrnView);

        btn_ClearAll.setText("ClearAll");
        btn_ClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_ClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_GrnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btn_GrnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FindActionPerformed
        FindGrnAll();   // TODO add your handling code here:
    }//GEN-LAST:event_btn_FindActionPerformed

    private void btn_ClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearAllActionPerformed
        ClearAll(1);    // TODO add your handling code here:
    }//GEN-LAST:event_btn_ClearAllActionPerformed

    private void txt_GrnIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_GrnIDKeyPressed
        if (evt.getKeyCode() == 10) {
            FindGrnAll();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GrnIDKeyPressed

    private void cmb_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_SearchActionPerformed
        if (cmb_Search.getSelectedIndex() != 0) {
            Clear();
        }
        //GrabToSelected(); // TODO add your handling code here:
    }//GEN-LAST:event_cmb_SearchActionPerformed

    private void cmb_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_SearchKeyPressed
        if (evt.getKeyCode() == 10) {
            GrabToSelected();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_SearchKeyPressed

    private void tbl_GrnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_GrnViewMouseClicked
        if (evt.getClickCount() == 2) {
            AddGrnItems();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_GrnViewMouseClicked

    private void cmb_SupplierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_SupplierKeyPressed
        if (evt.getKeyCode() == 10) {
            FindGrnAll();
        } // TODO add your handling code here:
    }//GEN-LAST:event_cmb_SupplierKeyPressed

    private void date_FromPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_FromPropertyChange

        if (date_From.getDate() != null && cmb_Search.getSelectedIndex() == 3) {
            FindGrnAll();
        }

    }//GEN-LAST:event_date_FromPropertyChange

    private void date_FromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_date_FromMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_date_FromMouseClicked

    private void date_ToPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_ToPropertyChange
    }//GEN-LAST:event_date_ToPropertyChange

    private void date_ToKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_ToKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_ToKeyPressed

    private void cmb_SearchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmb_SearchPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_SearchPropertyChange

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GrnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrnView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrnView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ClearAll;
    private javax.swing.JButton btn_Find;
    private javax.swing.JButton btn_GrnPrint;
    private javax.swing.JComboBox cmb_Search;
    private javax.swing.JComboBox cmb_Supplier;
    private com.toedter.calendar.JDateChooser date_From;
    private com.toedter.calendar.JDateChooser date_To;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_GrnView;
    private javax.swing.JTable tbl_GrnViewItems;
    private javax.swing.JTextField txt_GrnID;
    // End of variables declaration//GEN-END:variables

    private void LoadSearchCombo() {

        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmb_Search.getModel();
        dcbm.removeAllElements();

        dcbm.addElement("--Select--");
        dcbm.addElement("GRN ID");
        dcbm.addElement("Supplier");
        dcbm.addElement("One Date");
        dcbm.addElement("More Dates");
        dcbm.addElement("More Dates & Supplier");

    }

    private void LoadSuppliers() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmb_Supplier.getModel();
        dcbm.removeAllElements();

        try {
            dcbm.addElement("--Select--");
            ResultSet rs = model.db.fetch("SELECT\n"
                    + "supplier.`name`\n"
                    + "FROM\n"
                    + "supplier\n"
                    + "WHERE\n"
                    + "supplier.`status` = '0'");

            while (rs.next()) {
                dcbm.addElement(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void FindGrnAll() {

        if (cmb_Search.getSelectedIndex() != 0) {

            if (cmb_Search.getSelectedIndex() == 1) {

                SearchGrnId();

            } else if (cmb_Search.getSelectedIndex() == 2) {

                SearchSupplier();

            } else if (cmb_Search.getSelectedIndex() == 3) {

                SearchOneDate();

            } else if (cmb_Search.getSelectedIndex() == 4) {

                SearchMoreDates();

            } else if (cmb_Search.getSelectedIndex() == 5) {

                SearchMoreDatesAndSupplier();

            }

        }
    }

    private void ClearAll(int a) {

        if (a == 1) { // if 1 
            LoadSearchCombo();
            LoadSuppliers();
        }

        txt_GrnID.setText(null);
        date_From.setDate(null);
        date_To.setDate(null);
        DefaultTableModel tb1 = (DefaultTableModel) tbl_GrnView.getModel();
        DefaultTableModel tb2 = (DefaultTableModel) tbl_GrnViewItems.getModel();
        tb1.setRowCount(0);
        tb2.setRowCount(0);
        cmb_Search.grabFocus();

    }

    private void SearchGrnId() {
        try {

            DefaultTableModel tb = (DefaultTableModel) tbl_GrnView.getModel();
            tb.setRowCount(0);

            if (!txt_GrnID.getText().equals("")) {
                try {

                    ResultSet rs = model.db.fetch("SELECT\n"
                            + "grnreg.id,\n"
                            + "grnreg.date,\n"
                            + "grnreg.total,\n"
                            + "grnreg.discount,\n"
                            + "grnreg.grand_total,\n"
                            + "grnreg.user_name,\n"
                            + "supplier.`name`\n"
                            + "FROM\n"
                            + "grnreg ,\n"
                            + "supplier\n"
                            + "WHERE\n"
                            + "grnreg.supplier_id = supplier.id AND\n"
                            + "grnreg.id = '" + txt_GrnID.getText() + "'");

                    while (rs.next()) {
                        String id = rs.getString(1);
                        Date date = rs.getDate(2);
                        String total = rs.getString(3);
                        String disc = rs.getString(4);
                        String grandTot = rs.getString(5);
                        String supplier = rs.getString(7);
                        String logUser = rs.getString(6);

                        Object arr[] = {id, date, total, disc, grandTot, supplier, logUser};
                        tb.addRow(arr);
                    }



                    LoadSuppliers();
                    date_From.setDate(null);
                    date_To.setDate(null);
                    DefaultTableModel tb2 = (DefaultTableModel) tbl_GrnViewItems.getModel();
                    tb2.setRowCount(0);
                    txt_GrnID.grabFocus();
                    txt_GrnID.selectAll();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {

                Messages.warningjoption("Please Fill Empty Feilds ! ");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void GrabToSelected() {
        try {
            // ClearAll(0);
            if (cmb_Search.getSelectedIndex() == 1) {

                txt_GrnID.grabFocus();
                txt_GrnID.selectAll();
            } else if (cmb_Search.getSelectedIndex() == 2) {

                cmb_Supplier.grabFocus();

            } else if (cmb_Search.getSelectedIndex() == 3) {
                // date_From.grabFocus();
            } else if (cmb_Search.getSelectedIndex() == 4) {
                //date_To.grabFocus();
            } else if (cmb_Search.getSelectedIndex() == 5) {
                cmb_Supplier.grabFocus();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void SearchSupplier() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) tbl_GrnView.getModel();
            dtm.setRowCount(0);

            if (cmb_Supplier.getSelectedIndex() != 0) {
                try {

                    ResultSet rs = model.db.fetch("SELECT\n"
                            + "grnreg.id,\n"
                            + "grnreg.date,\n"
                            + "grnreg.total,\n"
                            + "grnreg.discount,\n"
                            + "grnreg.grand_total,\n"
                            + "supplier.`name`,\n"
                            + "grnreg.user_name\n"
                            + "FROM\n"
                            + "grnreg ,\n"
                            + "supplier\n"
                            + "WHERE\n"
                            + "\n"
                            + "grnreg.supplier_id = supplier.id AND\n"
                            + "supplier.`name` = '" + cmb_Supplier.getSelectedItem() + "'");

                    while (rs.next()) {
                        String id = rs.getString(1);
                        Date date = rs.getDate(2);
                        String total = rs.getString(3);
                        String disc = rs.getString(4);
                        String grandTot = rs.getString(5);
                        String supplier = rs.getString(6);
                        String logUser = rs.getString(7);

                        Object arr[] = {id, date, total, disc, grandTot, supplier, logUser};
                        dtm.addRow(arr);
                    }



                    txt_GrnID.setText(null);
                    date_From.setDate(null);
                    date_To.setDate(null);
                    DefaultTableModel dtm1 = (DefaultTableModel) tbl_GrnViewItems.getModel();
                    dtm1.setRowCount(0);
                    cmb_Supplier.grabFocus();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {

                Messages.warningjoption("Please Fill Empty Feilds ! ");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void AddGrnItems() {
        try {


            if (tbl_GrnView.getRowCount() != 0) {
                DefaultTableModel dtm = (DefaultTableModel) tbl_GrnViewItems.getModel();
                dtm.setRowCount(0);

                try {

                    ResultSet rs = model.db.fetch("SELECT\n"
                            + "grn.grnreg_id,\n"
                            + "items.`name`,\n"
                            + "grn.cost,\n"
                            + "grn.sell,\n"
                            + "grn.qty,\n"
                            + "grn.doscount\n"
                            + "\n"
                            + "\n"
                            + "FROM\n"
                            + "grn ,\n"
                            + "grnreg ,\n"
                            + "items\n"
                            + "WHERE\n"
                            + "grn.items_id = items.id AND\n"
                            + "grn.grnreg_id = grnreg.id AND\n"
                            + "grnreg.id ='" + tbl_GrnView.getValueAt(tbl_GrnView.getSelectedRow(), 0) + "'");

                    while (rs.next()) {
                        String id = rs.getString(1);
                        String itemname = rs.getString(2);
                        double cost = Double.parseDouble(rs.getString(3));
                        double sell = Double.parseDouble(rs.getString(4));
                        double qty = Double.parseDouble(rs.getString(5));
                        double discount = Double.parseDouble(rs.getString(6));

                        double discPrice = CalMaster.DiscountPrecent(discount, cost);
                        double total = CalMaster.DiscountPrecent(discount, cost) * qty;


                        Object arr[] = {id, itemname, cost, sell, discount, discPrice, qty, total};
                        dtm.addRow(arr);
                    }



                } catch (Exception e) {
                    e.printStackTrace();
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void SearchOneDate() {
        try {


            DefaultTableModel dtm = (DefaultTableModel) tbl_GrnView.getModel();
            dtm.setRowCount(0);
            if (date_From.getDate() != null) {



                try {

                    ResultSet rs = model.db.fetch("SELECT\n"
                            + "grnreg.id,\n"
                            + "grnreg.date,\n"
                            + "grnreg.total,\n"
                            + "grnreg.discount,\n"
                            + "grnreg.grand_total,\n"
                            + "grnreg.user_name,\n"
                            + "supplier.`name`\n"
                            + "FROM\n"
                            + "grnreg ,\n"
                            + "supplier\n"
                            + "WHERE\n"
                            + "grnreg.supplier_id = supplier.id AND\n"
                            + "grnreg.date  like '" + new SimpleDateFormat("yyyy-MM-dd").format(date_From.getDate())
                            + "%'");

                    while (rs.next()) {
                        String id = rs.getString(1);
                        Date date = rs.getDate(2);
                        String total = rs.getString(3);
                        String disc = rs.getString(4);
                        String grandTot = rs.getString(5);
                        String supplier = rs.getString(7);
                        String logUser = rs.getString(6);

                        Object arr[] = {id, date, total, disc, grandTot, supplier, logUser};
                        dtm.addRow(arr);


                    }

                    txt_GrnID.setText(null);
                    LoadSuppliers();
                    date_To.setDate(null);
                    DefaultTableModel dtm1 = (DefaultTableModel) tbl_GrnViewItems.getModel();
                    dtm1.setRowCount(0);


                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {

                Messages.warningjoption("Please Fill Empty Feilds ! ");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void SearchMoreDates() {

        try {
            DefaultTableModel dtm = (DefaultTableModel) tbl_GrnView.getModel();
            dtm.setRowCount(0);
            if (date_From.getDate() != null && date_To.getDate() != null) {



                try {

                    ResultSet rs = model.db.fetch("SELECT\n"
                            + "grnreg.id,\n"
                            + "grnreg.date,\n"
                            + "grnreg.total,\n"
                            + "grnreg.discount,\n"
                            + "grnreg.grand_total,\n"
                            + "grnreg.user_name,\n"
                            + "supplier.`name`\n"
                            + "FROM\n"
                            + "grnreg ,\n"
                            + "supplier\n"
                            + "WHERE\n"
                            + "grnreg.supplier_id = supplier.id  AND\n"
                            + "grnreg.date BETWEEN '" + new SimpleDateFormat("yyyy-MM-dd").format(date_From.getDate()) + "%' AND\n"
                            + "'" + new SimpleDateFormat("yyyy-MM-dd").format(date_To.getDate()) + "%'");

                    while (rs.next()) {
                        String id = rs.getString(1);
                        Date date = rs.getDate(2);
                        String total = rs.getString(3);
                        String disc = rs.getString(4);
                        String grandTot = rs.getString(5);
                        String supplier = rs.getString(7);
                        String logUser = rs.getString(6);

                        Object arr[] = {id, date, total, disc, grandTot, supplier, logUser};
                        dtm.addRow(arr);


                    }

                    txt_GrnID.setText(null);
                    LoadSuppliers();
                    DefaultTableModel dtm1 = (DefaultTableModel) tbl_GrnViewItems.getModel();
                    dtm1.setRowCount(0);


                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                Messages.warningjoption("Please Fill Empty Feilds ! ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void SearchMoreDatesAndSupplier() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tbl_GrnView.getModel();
            dtm.setRowCount(0);
            if (date_From.getDate() != null && date_To.getDate() != null && cmb_Supplier.getSelectedIndex() != 0) {



                try {

                    ResultSet rs = model.db.fetch("SELECT\n"
                            + "grnreg.id,\n"
                            + "grnreg.date,\n"
                            + "grnreg.total,\n"
                            + "grnreg.discount,\n"
                            + "grnreg.grand_total,\n"
                            + "grnreg.user_name,\n"
                            + "supplier.`name`\n"
                            + "FROM\n"
                            + "grnreg ,\n"
                            + "supplier\n"
                            + "WHERE\n"
                            + "grnreg.supplier_id = supplier.id AND\n"
                            + "grnreg.date BETWEEN '" + new SimpleDateFormat("yyyy-MM-dd").format(date_From.getDate()) + "%' AND '" + new SimpleDateFormat("yyyy-MM-dd").format(date_To.getDate()) + "%' AND\n"
                            + "supplier.`name` = '" + cmb_Supplier.getSelectedItem() + "'");

                    while (rs.next()) {
                        String id = rs.getString(1);
                        Date date = rs.getDate(2);
                        String total = rs.getString(3);
                        String disc = rs.getString(4);
                        String grandTot = rs.getString(5);
                        String supplier = rs.getString(7);
                        String logUser = rs.getString(6);

                        Object arr[] = {id, date, total, disc, grandTot, supplier, logUser};
                        dtm.addRow(arr);


                    }

                    txt_GrnID.setText(null);
                    // LoadSuppliers();
                    DefaultTableModel dtm1 = (DefaultTableModel) tbl_GrnViewItems.getModel();
                    dtm1.setRowCount(0);


                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {

                Messages.warningjoption("Please Fill Empty Feilds ! ");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void Clear() {
        LoadSuppliers();
        txt_GrnID.setText(null);
        date_From.setDate(null);
        date_To.setDate(null);
        DefaultTableModel tb1 = (DefaultTableModel) tbl_GrnView.getModel();
        DefaultTableModel tb2 = (DefaultTableModel) tbl_GrnViewItems.getModel();
        tb1.setRowCount(0);
        tb2.setRowCount(0);
    }
}