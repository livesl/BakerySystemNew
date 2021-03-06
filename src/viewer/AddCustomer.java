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
public class AddCustomer extends javax.swing.JPanel {

    /**
     * Creates new form additem
     */
    public AddCustomer() {
        initComponents();
        txtname.grabFocus();

        // txtname.getText();

        loadtable();

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
        tblCustomer = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbstatus = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtadre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtadre2 = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));
        setPreferredSize(new java.awt.Dimension(1026, 650));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Details");

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cus ID", "Name", "TP", "Mobile", "Adress Line 1", "Adress Line 2", "Cus Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cus ID");

        txtid.setEditable(false);
        txtid.setRequestFocusEnabled(false);
        txtid.setVerifyInputWhenFocusTarget(false);

        jLabel3.setText("Cus Name");

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

        txtmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileActionPerformed(evt);
            }
        });
        txtmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmobileKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmobileKeyReleased(evt);
            }
        });

        jLabel6.setText("Customer Status");

        cmbstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active", "Deactive" }));
        cmbstatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbstatusKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Cus_Adress_line 1");

        txtadre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtadre1KeyPressed(evt);
            }
        });

        jLabel8.setText("Cus_Adress_line 2");

        txtadre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtadre2KeyPressed(evt);
            }
        });

        txtname.setFocusCycleRoot(true);
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
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
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtadre1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtadre2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtmobile)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txttp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtadre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtadre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 45, Short.MAX_VALUE)))
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
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtempty();
        if (a) {
            return;
        }
        addCusdetails();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        if (evt.getClickCount() == 1) {
            DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();

            txtid.setText(dtm.getValueAt(tblCustomer.getSelectedRow(), 0).toString());
            txtid.setEnabled(false);
            txtname.setText(dtm.getValueAt(tblCustomer.getSelectedRow(), 1).toString());
            txttp.setText(dtm.getValueAt(tblCustomer.getSelectedRow(), 2).toString());
            txtmobile.setText(String.valueOf(dtm.getValueAt(tblCustomer.getSelectedRow(), 3).toString()));
            txtadre1.setText(String.valueOf(dtm.getValueAt(tblCustomer.getSelectedRow(), 4).toString()));
            txtadre2.setText(String.valueOf(dtm.getValueAt(tblCustomer.getSelectedRow(), 5).toString()));
            cmbstatus.setSelectedItem(String.valueOf(dtm.getValueAt(tblCustomer.getSelectedRow(), 6).toString()));
        }

    }//GEN-LAST:event_tblCustomerMouseClicked

    private void txttpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttpKeyPressed
        if (evt.getKeyCode() == 10) {
            txtmobile.grabFocus();

        }
    }//GEN-LAST:event_txttpKeyPressed

    private void txtmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileActionPerformed

    private void txtmobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbstatus.grabFocus();

        }
    }//GEN-LAST:event_txtmobileKeyPressed

    private void cmbstatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbstatusKeyPressed
        if (evt.getKeyCode() == 10) {
            txtadre1.grabFocus();

        }
    }//GEN-LAST:event_cmbstatusKeyPressed

    private void txtadre1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadre1KeyPressed
        if (evt.getKeyCode() == 10) {
            txtadre2.grabFocus();

        }
    }//GEN-LAST:event_txtadre1KeyPressed

    private void txtadre2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadre2KeyPressed
        if (evt.getKeyCode() == 10) {
            txtempty();
            if (a) {
                return;
            }
            addCusdetails();

        }
    }//GEN-LAST:event_txtadre2KeyPressed

    private void txttpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttpKeyReleased
        com.Validation.validatenumber(txttp);
    }//GEN-LAST:event_txttpKeyReleased

    private void txtmobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyReleased
        com.Validation.validatenumber(txtmobile);
    }//GEN-LAST:event_txtmobileKeyReleased

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        if (evt.getKeyCode() == 10) {
            txttp.grabFocus();

        }
    }//GEN-LAST:event_txtnameKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbstatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtadre1;
    private javax.swing.JTextField txtadre2;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttp;
    // End of variables declaration//GEN-END:variables
    boolean a;

    private void txtempty() {
        if (txtname.getText().trim().isEmpty()||txtmobile.getText().isEmpty()||txttp.getText().isEmpty()) {

            com.Messages.errorjoption( "Enter Customer Details!!!");
            a = true;
            txtname.grabFocus();

        } else {
            a = false;
        }
    }

    private void addCusdetails() {
        int Active = cmbstatus.getSelectedIndex();

        if (txtid.getText().isEmpty()) {

            try {
                db.change("insert into customer(name,tp,moble,address_line1,address_line2,status) "
                        + "value('" + txtname.getText().trim() + "','" + txttp.getText().trim() + "','" + txtmobile.getText().trim() + "','" + txtadre1.getText().trim() + "','" + txtadre2.getText() + "','" + Active + "')");

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
                db.change("update  customer set name= '" + txtname.getText() + "',"
                        + "tp='" + txttp.getText() + "',"
                        + "moble='" + txtmobile.getText() + "',address_line1='" + txtadre1.getText() + "',address_line2='" + txtadre2.getText() + "',status='" + Active + "' "
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
        txttp.setText("");
        txtmobile.setText("");
        txtadre1.setText("");
        txtadre2.setText("");

    }

    private void loadtable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();
            ResultSet rs = db.fetch("SELECT\n"
                    + "customer.id,\n"
                    + "customer.`name`,\n"
                    + "customer.tp,\n"
                    + "customer.moble,\n"
                    + "customer.address_line1,\n"
                    + "customer.address_line2,\n"
                    + "customer.`status`\n"
                    + "FROM\n"
                    + "customer\n"
                    + "ORDER BY\n"
                    + "customer.id ASC");

            dtm.setRowCount(rs.getRow());
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int tp = rs.getInt(3);
                int mobile = rs.getInt(4);
                String adr1 = rs.getString(5);
                String adr2 = rs.getString(6);
                int status = rs.getInt(7);

                String sta = null;
                if (status == 0) {
                    sta = "Active";
                } else if (status == 1) {
                    sta = "Deactive";

                }

                Object[] ar = {id, name, tp, mobile, adr1, adr2, sta};
                dtm.addRow(ar);
            }

        } catch (Exception e) {
            Logger.getLogger(Additem.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
