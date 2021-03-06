/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.Messages;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.db;

/**
 *
 * @author Lasitha Ranawaka
 */
public class AddSupplier extends javax.swing.JPanel {

    /**
     * Creates new form additem
     */
    public AddSupplier() {
        initComponents();
        loadtable();
        txtname.grabFocus();
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
        tblsupplier = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtadr1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtadr2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcompany = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));
        setPreferredSize(new java.awt.Dimension(1026, 650));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Details");

        tblsupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cus ID", "Name", "Company", "TP", "Mobile", "Adress Line 1", "Adress Line 2", "Cus Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsupplier);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Sup ID");

        txtid.setEditable(false);

        jLabel3.setText("Sup Name");

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });

        jLabel4.setText("TP");

        txttp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttpKeyReleased(evt);
            }
        });

        jLabel5.setText("Mobile");

        txtmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmobileKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmobileKeyReleased(evt);
            }
        });

        jLabel6.setText("Sup Status");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active", "Deactive" }));
        cmbStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbStatusKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Sup_Adress_line 1");

        txtadr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtadr1KeyPressed(evt);
            }
        });

        jLabel8.setText("Sup_Adress_line 2");

        txtadr2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtadr2KeyPressed(evt);
            }
        });

        jLabel9.setText("Company");

        txtcompany.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcompanyKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmobile, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtadr2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtadr1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtadr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtadr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtempty();
        if (a) {
            return;
        }
        addSupdetails();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsupplierMouseClicked
        if (evt.getClickCount() == 1) {
            DefaultTableModel dtm = (DefaultTableModel) tblsupplier.getModel();

            txtid.setText(dtm.getValueAt(tblsupplier.getSelectedRow(), 0).toString());
            txtid.setEnabled(false);
            txtname.setText(dtm.getValueAt(tblsupplier.getSelectedRow(), 1).toString());
            txtcompany.setText(dtm.getValueAt(tblsupplier.getSelectedRow(), 2).toString());
            txttp.setText(dtm.getValueAt(tblsupplier.getSelectedRow(), 3).toString());
            txtmobile.setText(String.valueOf(dtm.getValueAt(tblsupplier.getSelectedRow(), 4).toString()));
            txtadr1.setText(String.valueOf(dtm.getValueAt(tblsupplier.getSelectedRow(), 5).toString()));
            txtadr2.setText(String.valueOf(dtm.getValueAt(tblsupplier.getSelectedRow(), 6).toString()));
            cmbStatus.setSelectedItem(String.valueOf(dtm.getValueAt(tblsupplier.getSelectedRow(), 7).toString()));
        }
    }//GEN-LAST:event_tblsupplierMouseClicked

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        if (evt.getKeyCode() == 10) {
            txtcompany.grabFocus();
        }
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtcompanyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcompanyKeyPressed
        if (evt.getKeyCode() == 10) {
            txttp.grabFocus();
        }
    }//GEN-LAST:event_txtcompanyKeyPressed

    private void txttpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttpKeyPressed
        if (evt.getKeyCode() == 10) {
            txtmobile.grabFocus();
        }
    }//GEN-LAST:event_txttpKeyPressed

    private void txtmobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyPressed
        if (evt.getKeyCode() == 10) {
            txtadr1.grabFocus();
        }
    }//GEN-LAST:event_txtmobileKeyPressed

    private void txtadr1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadr1KeyPressed
        if (evt.getKeyCode() == 10) {
            txtadr2.grabFocus();
        }
    }//GEN-LAST:event_txtadr1KeyPressed

    private void txtadr2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadr2KeyPressed
        if (evt.getKeyCode() == 10) {
            cmbStatus.grabFocus();
        }
    }//GEN-LAST:event_txtadr2KeyPressed

    private void cmbStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbStatusKeyPressed
        if (evt.getKeyCode() == 10) {
            txtempty();
            if (a) {
                return;
            }
            addSupdetails();

        }
    }//GEN-LAST:event_cmbStatusKeyPressed

    private void txttpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttpKeyReleased
       com.Validation.validatenumber(txttp);
    }//GEN-LAST:event_txttpKeyReleased

    private void txtmobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyReleased
       com.Validation.validatenumber(txtmobile);
    }//GEN-LAST:event_txtmobileKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsupplier;
    private javax.swing.JTextField txtadr1;
    private javax.swing.JTextField txtadr2;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttp;
    // End of variables declaration//GEN-END:variables
boolean a;

    private void txtempty() {
        if (txtname.getText().trim().isEmpty()|| txtmobile.getText().isEmpty()||txttp.getText().isEmpty()) {

            com.Messages.errorjoption("Enter Supplier Details!!!");
            a = true;
            txtname.grabFocus();

        } else {
            a = false;
        }
    }

    private void addSupdetails() {
        int Active = cmbStatus.getSelectedIndex();

        if (txtid.getText().isEmpty()) {

            try {
                db.change("insert into supplier(name,company,tp,mobile,address_line1,address_line2,status) "
                        + "value('" + txtname.getText().trim() + "','" + txtcompany.getText().trim() + "','" + txttp.getText().trim() + "','" + txtmobile.getText().trim() + "','" + txtadr1.getText().trim() + "','" + txtadr2.getText() + "','" + Active + "')");

            } catch (Exception e) {
                Messages.normaljoption("" + e);
                return;
            }
            Messages.datasaved();
            cleartext();
            txtname.grabFocus();
            loadtable();
        } else {
            try {
                db.change("update  supplier set name= '" + txtname.getText() + "',"
                        + "company='" + txtcompany.getText() + "',"
                        + "tp='" + txttp.getText() + "',mobile='" + txtmobile.getText() + "',address_line1='" + txtadr1.getText() + "',address_line2='" + txtadr2.getText() + "',status='" + Active + "' "
                        + "where id='" + txtid.getText() + "'");

            } catch (Exception e) {
                Messages.normaljoption("" + e);
                return;
            }
            Messages.dataupdated();
            cleartext();

            txtname.grabFocus();
            loadtable();
        }
    }

    private void cleartext() {
        txtid.setText("");
        txtname.setText("");
        txtcompany.setText("");
        txtadr1.setText("");
        txtadr2.setText("");

    }

    private void loadtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblsupplier.getModel();
            ResultSet rs = db.fetch("SELECT\n"
                    + "supplier.id,\n"
                    + "supplier.`name`,\n"
                    + "supplier.company,\n"
                    + "supplier.tp,\n"
                    + "supplier.mobile,\n"
                    + "supplier.address_line1,\n"
                    + "supplier.address_line2,\n"
                    + "supplier.`status`\n"
                    + "FROM\n"
                    + "supplier\n"
                    + "ORDER BY\n"
                    + "supplier.id ASC");

            dtm.setRowCount(rs.getRow());
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String company = rs.getString(3);

                int tp = rs.getInt(4);
                int mobile = rs.getInt(5);
                String adr1 = rs.getString(6);
                String adr2 = rs.getString(7);
                int status = rs.getInt(8);

                String sta = null;
                if (status == 0) {
                    sta = "Active";
                } else if (status == 1) {
                    sta = "Deactive";

                }

                Object[] ar = {id, name, company, tp, mobile, adr1, adr2, sta};
                dtm.addRow(ar);
            }

        } catch (Exception e) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
