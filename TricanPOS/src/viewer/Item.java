/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.ConstantData;
import com.DBQueryEngine;
import com.Empty;
import com.Logs;
import com.Messages;
import com.Validation;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lasitha Ranawaka
 */
public class Item extends javax.swing.JDialog {

    boolean block = true;

    public Item(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        firstLoad();
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
        tbl_item = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblItemName = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        lblCategory = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        btnsubmit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblreorder = new javax.swing.JLabel();
        txtreorderqty = new javax.swing.JTextField();
        lblsubcat = new javax.swing.JLabel();
        cmbsubcategory = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Item Details");
        jLabel1.setOpaque(true);

        tbl_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category", "Sub Category", "Item Name", "Re-Order Qty", "Reg Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_item.getTableHeader().setReorderingAllowed(false);
        tbl_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_itemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_item);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("ID");

        txtId.setEditable(false);
        txtId.setEnabled(false);

        lblItemName.setText("Item Name*");

        txtItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItemNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemNameKeyReleased(evt);
            }
        });

        lblCategory.setText("Category*");

        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });
        cmbCategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbCategoryKeyPressed(evt);
            }
        });

        lblStatus.setText("Status*");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--", "Active", "Deactive" }));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });
        cmbStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbStatusKeyPressed(evt);
            }
        });

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        btnsubmit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsubmitKeyPressed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblreorder.setText("Re-Order Qty");

        txtreorderqty.setText("0");
        txtreorderqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreorderqtyActionPerformed(evt);
            }
        });
        txtreorderqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtreorderqtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtreorderqtyKeyReleased(evt);
            }
        });

        lblsubcat.setText("Sub Category*");

        cmbsubcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsubcategoryActionPerformed(evt);
            }
        });
        cmbsubcategory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbsubcategoryKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItemName)
                    .addComponent(jLabel2)
                    .addComponent(lblStatus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(lblCategory)
                            .addGap(18, 18, 18)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtItemName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblsubcat)
                        .addGap(29, 29, 29)
                        .addComponent(cmbsubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblreorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtreorderqty, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategory)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbsubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsubcat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtreorderqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblreorder))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblItemName)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsubmit)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        adddetails();
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void tbl_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_itemMouseClicked
        if (evt.getClickCount() == 2) {
            block = false;
            if (tbl_item.getRowCount() != 0) {
                loadItemstoFeild();
            }
            block = true;
        }
    }//GEN-LAST:event_tbl_itemMouseClicked

    private void cmbCategoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCategoryKeyPressed
        if (cmbCategory.getSelectedIndex() != 0) {

            if (evt.getKeyCode() == 10) {
                cmbsubcategory.grabFocus();
            }

        }
    }//GEN-LAST:event_cmbCategoryKeyPressed

    private void txtItemNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyPressed

        if (evt.getKeyCode() == 10) {
            txtreorderqty.grabFocus();
            txtreorderqty.selectAll();

        }


    }//GEN-LAST:event_txtItemNameKeyPressed

    private void cmbStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbStatusKeyPressed
        if (evt.getKeyCode() == 10) {
//            adddetails();
            btnsubmit.grabFocus();

        }
    }//GEN-LAST:event_cmbStatusKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtreorderqtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtreorderqtyKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbStatus.grabFocus();

        }
    }//GEN-LAST:event_txtreorderqtyKeyPressed

    private void txtreorderqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreorderqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreorderqtyActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        if (block) {

            if (cmbCategory.getSelectedIndex() != 0) {
                loadSubCategoryCombo(cmbCategory.getSelectedItem().toString());
                loadCategorystoTable();
            } else {
                loadtbl();
                cmbsubcategory.removeAllItems();
            }
        }
    }//GEN-LAST:event_cmbCategoryActionPerformed

    private void cmbsubcategoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbsubcategoryKeyPressed
        if (evt.getKeyCode() == 10) {
            txtItemName.grabFocus();

        }
    }//GEN-LAST:event_cmbsubcategoryKeyPressed

    private void btnsubmitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsubmitKeyPressed
        if (evt.getKeyCode() == 10) {

            adddetails();
        }

    }//GEN-LAST:event_btnsubmitKeyPressed

    private void txtreorderqtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtreorderqtyKeyReleased
        Validation.validatedouble(txtreorderqty);
    }//GEN-LAST:event_txtreorderqtyKeyReleased

    private void cmbsubcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsubcategoryActionPerformed
        if (block) {
            if (cmbCategory.getSelectedIndex() != 0) {

                loadSubCategorystoTable();
            } else {
                loadtbl();

            }
        }
    }//GEN-LAST:event_cmbsubcategoryActionPerformed

    private void txtItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNameKeyReleased
        if (block) {
            if (!txtItemName.getText().trim().isEmpty()) {

                loadItemtoTable();
            } else {
                loadtbl();

            }
        }
    }//GEN-LAST:event_txtItemNameKeyReleased

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed

        if (txtItemName.getText().isEmpty() && cmbCategory.getSelectedIndex() == 0) {

            if (cmbStatus.getSelectedIndex() != 0) {

                loadItemsByStatustoTable();
            } else {
                loadtbl();
            }
        }
    }//GEN-LAST:event_cmbStatusActionPerformed

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
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Item dialog = new Item(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox cmbCategory;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JComboBox cmbsubcategory;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblreorder;
    private javax.swing.JLabel lblsubcat;
    private javax.swing.JTable tbl_item;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtreorderqty;
    // End of variables declaration//GEN-END:variables

    private void adddetails() {
        if (Empty.ComboBox(cmbCategory, Empty.Text + lblCategory.getText())) {
        } else if (Empty.ComboBox(cmbsubcategory, Empty.Text + lblsubcat.getText())) {
        } else if (Empty.TxtFieldEmpty(txtItemName, Empty.Text + lblItemName.getText())) {
        } else if (Empty.ComboBox(cmbStatus, Empty.Text + lblStatus.getText())) {
        } else if (isThisItemNameExist()) {
            submit();

        } else {
            Messages.errorjoption("This Item Name Already Registered ! ");
            txtItemName.grabFocus();
            txtItemName.selectAll();
        }
    }

    private void submit() {

//        int cat_id = 0;
//        try {
//            ResultSet rs = model.DB.getData("SELECT\n"
//                    + "category.id,\n"
//                    + "category.category,\n"
//                    + "category.`status`\n"
//                    + "FROM\n"
//                    + "category\n"
//                    + "WHERE\n"
//                    + "category.`status` = 1 AND\n"
//                    + "category.category = '" + cmbCategory.getSelectedItem() + "'\n"
//                    + "");
//            if (rs.next()) {
//                cat_id = Integer.parseInt(rs.getString(1));
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        if (txtreorderqty.getText().isEmpty()) {
            txtreorderqty.setText("0");
        }

        if (txtId.getText().trim().isEmpty()) {
//            int ID = Integer.parseInt(GetID());
            //save

            if (isAlreadyAvailableItem()) {
                try {
                    model.DB.putData("INSERT INTO item (category_id,sub_category_id,name,reorderqty,regdate,status) values('" + DBQueryEngine.getIDofSelectedValue("id", "category", "category", cmbCategory.getSelectedItem().toString()) + "',"
                            + "'" + getSubcategoryID() + "','" + txtItemName.getText().trim() + "','" + txtreorderqty.getText().trim() + "',"
                            + "NOW(),'" + ConstantData.getStatusID(cmbStatus) + "')");
                    com.Messages.normaljoption("Data Saved!");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Messages.warningjoption("This Item Already Exist ! Please Check ");
            }
        } else {
            //update
            try {
                model.DB.putData("UPDATE item SET category_id='" + DBQueryEngine.getIDofSelectedValue("id", "category", "category", cmbCategory.getSelectedItem().toString()) + "',"
                        + "sub_category_id='" + getSubcategoryID() + "',name='" + txtItemName.getText().trim() + "',"
                        + "reorderqty='" + txtreorderqty.getText().trim() + "',"
                        + "status='" + ConstantData.getStatusID(cmbStatus) + "' WHERE id='" + txtId.getText().trim() + "' ");
                com.Messages.normaljoption("Data Updated!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        clear();
        new Logs().createLog("Item reg", ConstantData.logUserId);
    }

    private void loadtbl() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_item.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "item.id,\n"
                    + "category.category,\n"
                    + "sub_category.sub_category,\n"
                    + "item.`name`,\n"
                    + "item.`code`,\n"
                    + "item.reorderqty,\n"
                    + "item.regdate,\n"
                    + "item.`status`\n"
                    + "FROM\n"
                    + "item ,\n"
                    + "category ,\n"
                    + "sub_category\n"
                    + "WHERE\n"
                    + "item.category_id = category.id AND\n"
                    + "item.sub_category_id = sub_category.id order by item.id DESC");

            while (rs.next()) {
                int id = rs.getInt(1);
                String category = rs.getString(2);
                String subcate = rs.getString(3);
                String name = rs.getString(4);
                String code = rs.getString(5);
                String reoqty = rs.getString(6);
                String regdate = rs.getString(7);

                String status = "";

                if (rs.getString(8).equals(ConstantData.Status_ACTIVE)) {
                    status = "Active";

                } else {

                    status = "Deactive";
                }

                Object arr[] = {id, category, subcate, name, reoqty, regdate, status};
                dtm.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String GetID() { // return next new id
        String id = "1";
        try {
            ResultSet rs = model.DB.getData("select max(id) from item");

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

    private void clear() {
        txtId.setText("");
        txtItemName.setText("");
//        txtcode.setText("");
        txtreorderqty.setText("0");
        cmbCategory.setSelectedIndex(0);
        cmbsubcategory.removeAllItems();
        cmbStatus.setSelectedIndex(0);
        cmbCategory.grabFocus();
        loadtbl();
    }

    private void loadItemstoFeild() {

        txtId.setText(tbl_item.getValueAt(tbl_item.getSelectedRow(), 0).toString());
        cmbCategory.setSelectedItem(tbl_item.getValueAt(tbl_item.getSelectedRow(), 1).toString());
        loadSubCategoryCombo(tbl_item.getValueAt(tbl_item.getSelectedRow(), 1).toString());
        cmbsubcategory.setSelectedItem(tbl_item.getValueAt(tbl_item.getSelectedRow(), 2).toString());
        txtItemName.setText(tbl_item.getValueAt(tbl_item.getSelectedRow(), 3).toString());
//        txtcode.setText(tbl_item.getValueAt(tbl_item.getSelectedRow(), 4).toString());
        txtreorderqty.setText(tbl_item.getValueAt(tbl_item.getSelectedRow(), 4).toString());
        cmbStatus.setSelectedItem(tbl_item.getValueAt(tbl_item.getSelectedRow(), 6).toString());
    }

    private void firstLoad() {

        DBQueryEngine.loadSelectedComboItems(cmbCategory, "SELECT\n"
                + "category.category\n"
                + "FROM\n"
                + "category\n"
                + "WHERE\n"
                + "category.`status` = '" + ConstantData.Status_ACTIVE + "'");

        loadtbl();
        cmbCategory.grabFocus();
    }

    private void loadSubCategoryCombo(String category) {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmbsubcategory.getModel();
        dcbm.removeAllElements();

        try {
            dcbm.addElement("--Select--");
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "sub_category.sub_category\n"
                    + "FROM\n"
                    + "category ,\n"
                    + "sub_category\n"
                    + "WHERE\n"
                    + "sub_category.`status` = '" + ConstantData.Status_ACTIVE + "' AND\n"
                    + "sub_category.category_id = category.id AND\n"
                    + "category.category = '" + category + "'");
            while (rs.next()) {

                dcbm.addElement(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getSubcategoryID() {
        String val = "0";

        try {
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "sub_category.id\n"
                    + "FROM\n"
                    + "category ,\n"
                    + "sub_category\n"
                    + "WHERE\n"
                    + "sub_category.category_id = category.id AND\n"
                    + "category.category = '" + cmbCategory.getSelectedItem() + "' AND\n"
                    + "category.`status` = '" + ConstantData.Status_ACTIVE + "' AND\n"
                    + "sub_category.sub_category = '" + cmbsubcategory.getSelectedItem() + "' AND\n"
                    + "sub_category.`status` = '" + ConstantData.Status_ACTIVE + "'");

            if (rs.next()) {

                val = rs.getString(1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return val;
    }

    private boolean isAlreadyAvailableItem() {

        try {
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "item.id\n"
                    + "FROM\n"
                    + "category ,\n"
                    + "sub_category ,\n"
                    + "item\n"
                    + "WHERE\n"
                    + "item.`name` = '" + txtItemName.getText().trim() + "' AND\n"
                    + "\n"
                    + "item.category_id = category.id AND\n"
                    + "category.category = '" + cmbCategory.getSelectedItem() + "' AND\n"
                    + "item.sub_category_id = sub_category.id AND\n"
                    + "sub_category.sub_category = '" + cmbsubcategory.getSelectedItem() + "'");

            if (rs.next()) {

                return false;

            }
        } catch (Exception e) {

            e.printStackTrace();
            return false;

        }

        return true;
    }

    private void loadCategorystoTable() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_item.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "item.id,\n"
                    + "category.category,\n"
                    + "sub_category.sub_category,\n"
                    + "item.`name`,\n"
                    + "item.`code`,\n"
                    + "item.reorderqty,\n"
                    + "item.regdate,\n"
                    + "item.`status`\n"
                    + "FROM\n"
                    + "item ,\n"
                    + "category ,\n"
                    + "sub_category\n"
                    + "WHERE\n"
                    + "item.category_id = category.id AND\n"
                    + "item.sub_category_id = sub_category.id and category.category='" + cmbCategory.getSelectedItem() + "' order by item.id DESC");

            while (rs.next()) {
                int id = rs.getInt(1);
                String category = rs.getString(2);
                String subcate = rs.getString(3);
                String name = rs.getString(4);
                String code = rs.getString(5);
                String reoqty = rs.getString(6);
                String regdate = rs.getString(7);

                String status;
                if (rs.getString(8).equals(ConstantData.Status_ACTIVE)) {
                    status = "Active";

                } else {

                    status = "Deactive";
                }

                Object arr[] = {id, category, subcate, name, reoqty, regdate, status};
                dtm.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadSubCategorystoTable() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_item.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "item.id,\n"
                    + "category.category,\n"
                    + "sub_category.sub_category,\n"
                    + "item.`name`,\n"
                    + "item.`code`,\n"
                    + "item.reorderqty,\n"
                    + "item.regdate,\n"
                    + "item.`status`\n"
                    + "FROM\n"
                    + "item ,\n"
                    + "category ,\n"
                    + "sub_category\n"
                    + "WHERE\n"
                    + "item.category_id = category.id AND\n"
                    + "item.sub_category_id = sub_category.id and category.category='" + cmbCategory.getSelectedItem() + "'"
                    + "and sub_category.sub_category='" + cmbsubcategory.getSelectedItem() + "'"
                    + " order by item.id DESC");

            while (rs.next()) {
                int id = rs.getInt(1);
                String category = rs.getString(2);
                String subcate = rs.getString(3);
                String name = rs.getString(4);
                String code = rs.getString(5);
                String reoqty = rs.getString(6);
                String regdate = rs.getString(7);

                String status;
                if (rs.getString(8).equals(ConstantData.Status_ACTIVE)) {
                    status = "Active";

                } else {

                    status = "Deactive";
                }

                Object arr[] = {id, category, subcate, name, reoqty, regdate, status};
                dtm.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadItemtoTable() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_item.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "item.id,\n"
                    + "category.category,\n"
                    + "sub_category.sub_category,\n"
                    + "item.`name`,\n"
                    + "item.`code`,\n"
                    + "item.reorderqty,\n"
                    + "item.regdate,\n"
                    + "item.`status`\n"
                    + "FROM\n"
                    + "item ,\n"
                    + "category ,\n"
                    + "sub_category\n"
                    + "WHERE\n"
                    + "item.category_id = category.id AND\n"
                    + "item.sub_category_id = sub_category.id and category.category='" + cmbCategory.getSelectedItem() + "'"
                    + "and sub_category.sub_category='" + cmbsubcategory.getSelectedItem() + "' and item.`name` like '" + txtItemName.getText().trim() + "%'"
                    + " order by item.id DESC");

            while (rs.next()) {
                int id = rs.getInt(1);
                String category = rs.getString(2);
                String subcate = rs.getString(3);
                String name = rs.getString(4);
                String code = rs.getString(5);
                String reoqty = rs.getString(6);
                String regdate = rs.getString(7);

                String status;
                if (rs.getString(8).equals(ConstantData.Status_ACTIVE)) {
                    status = "Active";

                } else {

                    status = "Deactive";
                }

                Object arr[] = {id, category, subcate, name, reoqty, regdate, status};
                dtm.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isThisItemNameExist() {
        try {
            if (txtId.getText().isEmpty()) {

                ResultSet rs = model.DB.getData("SELECT\n"
                        + "item.id\n"
                        + "FROM\n"
                        + "category ,\n"
                        // + "sub_category ,\n"
                        + "item\n"
                        + "WHERE\n"
                        + "item.`name` = '" + txtItemName.getText().trim() + "' \n"
                        + "");

                if (rs.next()) {

                    return false;

                }
            }
        } catch (Exception e) {

            e.printStackTrace();
            return false;

        }

        return true;

    }

    private void loadItemsByStatustoTable() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_item.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "item.id,\n"
                    + "category.category,\n"
                    + "sub_category.sub_category,\n"
                    + "item.`name`,\n"
                    + "item.`code`,\n"
                    + "item.reorderqty,\n"
                    + "item.regdate,\n"
                    + "item.`status`\n"
                    + "FROM\n"
                    + "item ,\n"
                    + "category ,\n"
                    + "sub_category\n"
                    + "WHERE\n"
                    + "item.category_id = category.id AND\n"
                    + "item.sub_category_id = sub_category.id and   "
                    + "item.`status`='" + ConstantData.getStatusID(cmbStatus) + "'"
                    + " order by item.id DESC");

            while (rs.next()) {
                int id = rs.getInt(1);
                String category = rs.getString(2);
                String subcate = rs.getString(3);
                String name = rs.getString(4);
                String code = rs.getString(5);
                String reoqty = rs.getString(6);
                String regdate = rs.getString(7);

                String status;
                if (rs.getString(8).equals(ConstantData.Status_ACTIVE)) {
                    status = "Active";

                } else {

                    status = "Deactive";
                }

                Object arr[] = {id, category, subcate, name, reoqty, regdate, status};
                dtm.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
