/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.AllCalculations;
import com.ConstantData;
import com.DBQueryEngine;
import com.DateUp;
import com.Empty;
import com.Format;
import com.Logs;
import com.Messages;
import com.Validation;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DB;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author
 */
public class Grn extends javax.swing.JDialog {

    GrnPayment grnpay;

    public Grn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        FirstLoad();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblgrnno = new javax.swing.JLabel();
        txtGrnno = new javax.swing.JTextField();
        lbldate = new javax.swing.JLabel();
        txtfDate = new javax.swing.JFormattedTextField();
        lblbatchno1 = new javax.swing.JLabel();
        cmbstorekeep = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblgrn = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblfinaldis = new javax.swing.JLabel();
        txtfinaldiscount = new javax.swing.JTextField();
        lblgrandamount = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbfinaldiscount = new javax.swing.JComboBox();
        lblfinaldiscount = new javax.swing.JLabel();
        txtgrandfinalamount = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnclear = new javax.swing.JButton();
        btnpayment = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblitemcount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtgrandamount = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtitemid = new javax.swing.JTextField();
        lblitemname = new javax.swing.JLabel();
        txtitemname = new javax.swing.JTextField();
        lblbatchno = new javax.swing.JLabel();
        cmbbatchno = new javax.swing.JComboBox();
        lblserialtype = new javax.swing.JLabel();
        cmbserialtype = new javax.swing.JComboBox();
        lblserialno = new javax.swing.JLabel();
        txtserialno = new javax.swing.JTextField();
        lblavailabaleqty = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        lblqty = new javax.swing.JLabel();
        lblwarranty = new javax.swing.JLabel();
        txtwarranty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblcostprice = new javax.swing.JLabel();
        txtcostprice = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cmbcostdiscount = new javax.swing.JComboBox();
        lblcostdis = new javax.swing.JLabel();
        txtcostdiscount = new javax.swing.JTextField();
        lblcostdiscount = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcostamount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtlastcost = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        lblsellprice = new javax.swing.JLabel();
        txtsellprice = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cmbselldiscount = new javax.swing.JComboBox();
        lbldis1 = new javax.swing.JLabel();
        txtselldiscount = new javax.swing.JTextField();
        lblselldiscount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtsellamount = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GRN");
        jLabel1.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblgrnno.setText("GRN No");

        txtGrnno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGrnnoKeyPressed(evt);
            }
        });

        lbldate.setText("Date");

        try {
            txtfDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfDateKeyPressed(evt);
            }
        });

        lblbatchno1.setText("Store Keeper");

        cmbstorekeep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstorekeepActionPerformed(evt);
            }
        });
        cmbstorekeep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbstorekeepKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblgrnno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGrnno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lbldate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(lblbatchno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbstorekeep, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbldate)
                        .addComponent(txtfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblbatchno1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbstorekeep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblgrnno)
                        .addComponent(txtGrnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tblgrn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Serial Type", "Batch No", "Serial No", "Warranty", "Qty", "Cost Price", "Last Cost Price", "Discount Opt", "Discount", "Amount Rs.", "Sell Price", "Discount Opt", "Sell Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblgrn.getTableHeader().setReorderingAllowed(false);
        tblgrn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblgrnMouseClicked(evt);
            }
        });
        tblgrn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblgrnKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblgrnKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblgrn);
        if (tblgrn.getColumnModel().getColumnCount() > 0) {
            tblgrn.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblgrn.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblgrn.getColumnModel().getColumn(13).setPreferredWidth(0);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Final"));

        lblfinaldis.setText("Final Discount");

        txtfinaldiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfinaldiscount.setText("0.0");
        txtfinaldiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfinaldiscountActionPerformed(evt);
            }
        });
        txtfinaldiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfinaldiscountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfinaldiscountKeyReleased(evt);
            }
        });

        lblgrandamount.setText("Grand Amount Rs.");

        jLabel21.setText("Discount Opt");

        cmbfinaldiscount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Price", "%" }));
        cmbfinaldiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbfinaldiscountKeyPressed(evt);
            }
        });

        lblfinaldiscount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblfinaldiscount.setText("0.0");

        txtgrandfinalamount.setEditable(false);
        txtgrandfinalamount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtgrandfinalamount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtgrandfinalamount.setText("0.0");
        txtgrandfinalamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgrandfinalamountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfinaldis)
                    .addComponent(lblgrandamount)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbfinaldiscount, javax.swing.GroupLayout.Alignment.LEADING, 0, 126, Short.MAX_VALUE)
                            .addComponent(txtfinaldiscount, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblfinaldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtgrandfinalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbfinaldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfinaldis)
                    .addComponent(txtfinaldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfinaldiscount))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgrandamount)
                    .addComponent(txtgrandfinalamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnclear.setText("Reset");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnpayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnpayment.setText("Payment");
        btnpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btnpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Item Count");

        lblitemcount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblitemcount.setText("0");

        jLabel3.setText("Net Amount Rs.");

        txtgrandamount.setEditable(false);
        txtgrandamount.setBackground(new java.awt.Color(255, 255, 204));
        txtgrandamount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtgrandamount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtgrandamount.setText("0.0");
        txtgrandamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgrandamountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblitemcount, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(txtgrandamount, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblitemcount)
                    .addComponent(jLabel3)
                    .addComponent(txtgrandamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Item"));

        jLabel10.setText("Item ID");

        txtitemid.setEditable(false);
        txtitemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemidActionPerformed(evt);
            }
        });
        txtitemid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtitemidKeyReleased(evt);
            }
        });

        lblitemname.setText("Item Name");

        txtitemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemnameActionPerformed(evt);
            }
        });
        txtitemname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitemnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtitemnameKeyReleased(evt);
            }
        });

        lblbatchno.setText("Batch No");

        cmbbatchno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbatchnoActionPerformed(evt);
            }
        });
        cmbbatchno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbbatchnoKeyPressed(evt);
            }
        });

        lblserialtype.setText("Serial Type");

        cmbserialtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbserialtypeActionPerformed(evt);
            }
        });
        cmbserialtype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbserialtypeKeyPressed(evt);
            }
        });

        lblserialno.setText("Serial No");

        txtserialno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtserialnoKeyPressed(evt);
            }
        });

        lblavailabaleqty.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblavailabaleqty.setForeground(new java.awt.Color(0, 0, 204));
        lblavailabaleqty.setText("0");

        txtqty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtqty.setText("1");
        txtqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtqtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtqtyKeyReleased(evt);
            }
        });

        lblqty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblqty.setText("Qty");

        lblwarranty.setText("Warranty");

        txtwarranty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtwarranty.setText("0");
        txtwarranty.setToolTipText("0 for nowarranty & 1000 for lifetime warranty");
        txtwarranty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtwarrantyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtwarrantyKeyReleased(evt);
            }
        });

        jLabel9.setText("(Months)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblserialtype)
                    .addComponent(lblitemname)
                    .addComponent(lblbatchno)
                    .addComponent(lblserialno)
                    .addComponent(lblqty)
                    .addComponent(lblwarranty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbbatchno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbserialtype, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblavailabaleqty, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtitemname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(txtwarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel9))
                                .addComponent(txtserialno, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblitemname)
                    .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbserialtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblserialtype))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbatchno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbbatchno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtserialno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblserialno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtwarranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblwarranty)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblqty)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblavailabaleqty))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cost"));

        lblcostprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcostprice.setText("Cost Price");

        txtcostprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtcostprice.setText("0.0");
        txtcostprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcostpriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcostpriceKeyReleased(evt);
            }
        });

        jLabel19.setText("Discount Opt");

        cmbcostdiscount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Price", "%" }));
        cmbcostdiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcostdiscountActionPerformed(evt);
            }
        });
        cmbcostdiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbcostdiscountKeyPressed(evt);
            }
        });

        lblcostdis.setText("Discount");

        txtcostdiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtcostdiscount.setText("0.0");
        txtcostdiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcostdiscountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcostdiscountKeyReleased(evt);
            }
        });

        lblcostdiscount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblcostdiscount.setText("0.0");

        jLabel5.setText("Amount Rs.");

        txtcostamount.setEditable(false);
        txtcostamount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcostamount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtcostamount.setText("0.0");

        jLabel4.setText("Last Cost Rs.");

        txtlastcost.setEditable(false);
        txtlastcost.setBackground(new java.awt.Color(255, 204, 204));
        txtlastcost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtlastcost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtlastcost.setText("0.0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcostprice)
                    .addComponent(jLabel19)
                    .addComponent(lblcostdis)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtlastcost, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(txtcostamount, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbcostdiscount, javax.swing.GroupLayout.Alignment.LEADING, 0, 131, Short.MAX_VALUE)
                    .addComponent(txtcostdiscount, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcostprice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcostdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcostprice)
                    .addComponent(txtcostprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbcostdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcostdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcostdis)
                    .addComponent(lblcostdiscount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlastcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcostamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sell"));

        lblsellprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsellprice.setText("Sell Price");

        txtsellprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtsellprice.setText("0.0");
        txtsellprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsellpriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsellpriceKeyReleased(evt);
            }
        });

        jLabel20.setText("Discount Opt");

        cmbselldiscount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Price", "%" }));
        cmbselldiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbselldiscountActionPerformed(evt);
            }
        });
        cmbselldiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbselldiscountKeyPressed(evt);
            }
        });

        lbldis1.setText("Sell Discount");

        txtselldiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtselldiscount.setText("0.0");
        txtselldiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtselldiscountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtselldiscountKeyReleased(evt);
            }
        });

        lblselldiscount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblselldiscount.setText("0.0");

        jLabel7.setText("Last Sell Price Rs.");

        txtsellamount.setEditable(false);
        txtsellamount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtsellamount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtsellamount.setText("0.0");

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(lbldis1)
                            .addComponent(lblsellprice))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbselldiscount, 0, 131, Short.MAX_VALUE)
                            .addComponent(txtsellprice))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtsellamount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtselldiscount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblselldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsellprice)
                    .addComponent(txtsellprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbselldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtselldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldis1)
                    .addComponent(lblselldiscount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsellamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnadd))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaymentActionPerformed
        if (tblgrn.getRowCount() != 0 && Double.parseDouble(txtgrandfinalamount.getText()) > 0
                && !txtGrnno.getText().isEmpty() && cmbstorekeep.getSelectedIndex() != 0 && Empty.DateFormatedFeild(txtfDate)) {
//
            if (grnpay == null) {
                grnpay = new GrnPayment(ConstantData.home, this, false, txtgrandfinalamount.getText().trim());
                grnpay.setVisible(true);
//        new GrnPayment(ConstantData.Home, true).setVisible(true);
            } else {
                grnpay.lblgrandamount.setText(Format.decimal3.format(Double.parseDouble(txtgrandfinalamount.getText())));
                grnpay.AllFinalCalculations();
                grnpay.setVisible(true);
            }

        } else {

            Messages.warningjoption("Please Check GRN no , Date , Storekeeper Fields & data are Filled Correctly ! ");
        }

    }//GEN-LAST:event_btnpaymentActionPerformed

    private void cmbcostdiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcostdiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcostdiscountActionPerformed

    private void txtgrandamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgrandamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgrandamountActionPerformed

    private void txtGrnnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrnnoKeyPressed
        if (evt.getKeyCode() == 10) {

            if (isnotGRNnoAlreadyExist()) {
                txtfDate.grabFocus();
            } else {
                Messages.warningjoption("This GRN Number already exist ! Please try another ! ");
            }
        }
    }//GEN-LAST:event_txtGrnnoKeyPressed

    private void txtfDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfDateKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbstorekeep.grabFocus();
        }
    }//GEN-LAST:event_txtfDateKeyPressed

    private void txtitemnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitemnameKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbserialtype.grabFocus();

        } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
            cmbfinaldiscount.grabFocus();
        }

    }//GEN-LAST:event_txtitemnameKeyPressed

    private void txtcostpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostpriceKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbcostdiscount.grabFocus();
        }
    }//GEN-LAST:event_txtcostpriceKeyPressed

    private void txtsellpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsellpriceKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbselldiscount.grabFocus();
        }
    }//GEN-LAST:event_txtsellpriceKeyPressed

    private void txtqtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtyKeyPressed
        if (evt.getKeyCode() == 10) {
            if (!txtcostprice.isEditable()) {
                btnadd.grabFocus();
            } else {
                txtcostprice.grabFocus();
                txtcostprice.selectAll();
            }
        }
    }//GEN-LAST:event_txtqtyKeyPressed

    private void cmbcostdiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbcostdiscountKeyPressed
        if (evt.getKeyCode() == 10) {
            txtcostdiscount.grabFocus();
            txtcostdiscount.selectAll();
        }
    }//GEN-LAST:event_cmbcostdiscountKeyPressed

    private void txtcostdiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostdiscountKeyPressed
        if (evt.getKeyCode() == 10) {
            txtsellprice.grabFocus();
            txtsellprice.selectAll();
        }
    }//GEN-LAST:event_txtcostdiscountKeyPressed

    private void cmbfinaldiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbfinaldiscountKeyPressed
        if (evt.getKeyCode() == 10) {
            txtfinaldiscount.grabFocus();
            txtfinaldiscount.selectAll();
        }
    }//GEN-LAST:event_cmbfinaldiscountKeyPressed

    private void txtfinaldiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfinaldiscountKeyPressed
        if (evt.getKeyCode() == 10) {
            btnpayment.grabFocus();

        }
    }//GEN-LAST:event_txtfinaldiscountKeyPressed

    private void txtitemnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitemnameKeyReleased
        if (!txtitemname.getText().isEmpty()) {

            LoadItemid();
            ClearItemdetailsoutName();
        }
    }//GEN-LAST:event_txtitemnameKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (tblgrn.getRowCount() != 0) {
            int part = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit GRN ? ", "Message", 0, 0);

            if (part == JOptionPane.YES_OPTION) {
                if (grnpay != null) {
                    grnpay.dispose();
                }
                this.dispose();

            }

        } else {
            if (grnpay != null) {
                grnpay.dispose();
            }
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void cmbbatchnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbbatchnoKeyPressed
        if (evt.getKeyCode() == 10) {

            if (cmbserialtype.getSelectedItem().equals("None")) {
                txtwarranty.grabFocus();
                txtwarranty.selectAll();
            } else {
                txtserialno.grabFocus();
            }

        }
    }//GEN-LAST:event_cmbbatchnoKeyPressed

    private void cmbbatchnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbatchnoActionPerformed
        DefaultComboBoxModel boxModel = (DefaultComboBoxModel) cmbbatchno.getModel();

        if (boxModel.getSize() != 0) {

            if (cmbbatchno.getSelectedIndex() == 0) {
                ClearItemBatchDetails();
                setEnableDisableCosttab(true);
            } else if (cmbbatchno.getSelectedIndex() == 1) {
                ClearItemBatchDetails();
                setEnableDisableCosttab(true);
                setAvailableQtyUniqItem();
            } else {
                SelectBatchNoforFeilds();

            }

        }
    }//GEN-LAST:event_cmbbatchnoActionPerformed

    private void txtcostdiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostdiscountKeyReleased
        Validation.validatedouble(txtcostdiscount);

        if (txtcostdiscount.getText().isEmpty()) {
            txtcostdiscount.setText("0.0");
            txtcostdiscount.selectAll();
        }

        if (!txtqty.getText().isEmpty() && !txtcostprice.getText().isEmpty()) {
            double qty = Double.parseDouble(txtqty.getText());
            double cost = Double.parseDouble(txtcostprice.getText());
            if (qty > 0 && cost > 0) {
                CalculationsCost();
            }

        }

    }//GEN-LAST:event_txtcostdiscountKeyReleased

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        ClearItemdetails();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if (Empty.TxtFieldEmpty(txtitemname, Empty.Text + lblitemname.getText())) {
        } else if (Empty.ComboBox(cmbserialtype, Empty.Text + lblserialtype.getText())) {
        } else if (Empty.ComboBox(cmbbatchno, Empty.Text + lblbatchno.getText())) {
        } else if (Empty.TxtFieldEmpty(txtserialno, Empty.Text + lblserialno.getText())) {
        } else if (Empty.TxtFieldEmpty(txtwarranty, Empty.Text + lblwarranty.getText())) {

        } else if (Empty.TxtFieldEmpty(txtqty, Empty.Text + lblqty.getText())) {
        } else if (Empty.TxtFieldEmpty(txtcostprice, Empty.Text + lblcostprice.getText())) {
        } else if (Empty.TxtFieldEmpty(txtsellprice, Empty.Text + lblsellprice.getText())) {

        } else if (Empty.TxtFieldEmpty(txtcostdiscount, Empty.Text + lblcostdis.getText())) {
        } else if (Empty.TxtFieldEmpty(txtselldiscount, Empty.Text + lblselldiscount.getText())) {
        } else if (checkFeildValues()) {
            if (isSerialNumberexist()) {

                CalculationsCost();

                if (isBatchCostPricewithSerialNoAvialbale()) {

                    if (isAlreadyExistthisItem()) {
                        addItemDetailstoTable();
                        TableItemAmountandItemCount();
                        clearItemDetailsSpec();

                    } else {

                        clearItemDetailsSpec();

                    }
                }

            } else {
                Messages.warningjoption("This Serial No already registered in the System ! ");
                txtserialno.grabFocus();
                txtserialno.selectAll();
            }

        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtcostpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostpriceKeyReleased
        Validation.validatedouble(txtcostprice);
    }//GEN-LAST:event_txtcostpriceKeyReleased

    private void txtsellpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsellpriceKeyReleased
        Validation.validatedouble(txtsellprice);

//        if (txtsellprice.getText().isEmpty()) {
//            txtsellprice.setText("0.0");
//            txtsellprice.selectAll();
//        }
//        
//        if (!txtcostprice.getText().isEmpty() && !txtsellprice.getText().isEmpty()) {
//            
//            double cost = Double.parseDouble(txtcostprice.getText());
//            double sell = Double.parseDouble(txtsellprice.getText());
//            
//            if (cost > 0 && sell > 0) {
//                if (cost >= sell) {
//                    txtsellprice.setText(""+cost);
//                }
//            }
//        }

    }//GEN-LAST:event_txtsellpriceKeyReleased

    private void txtqtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqtyKeyReleased
        Validation.validatedouble(txtqty);
    }//GEN-LAST:event_txtqtyKeyReleased

    private void txtfinaldiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfinaldiscountKeyReleased
        Validation.validatedouble(txtfinaldiscount);

        if (grnpay != null) {
            grnpay.hide();
        }

        if (Double.parseDouble(txtgrandamount.getText()) > 0) {
            if (txtfinaldiscount.getText().isEmpty()) {
                txtgrandfinalamount.setText("0.0");
                lblfinaldiscount.setText("0.0");
                txtfinaldiscount.setText("0.0");
                txtfinaldiscount.selectAll();
                Calculations_Finals();
            } else {
                Calculations_Finals();
            }
        }


    }//GEN-LAST:event_txtfinaldiscountKeyReleased

    private void tblgrnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblgrnKeyPressed
        if (evt.getKeyCode() == 127) {
            if (tblgrn.getRowCount() != 0) {
                int part = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Item ? ", "Message", 0, 0);

                if (part == JOptionPane.YES_OPTION) {

                    deleteItem();

                }

            }
        }
    }//GEN-LAST:event_tblgrnKeyPressed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        if (tblgrn.getRowCount() != 0) {
            int part = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete All Details ? ", "Message", 0, 0);

            if (part == JOptionPane.YES_OPTION) {

                clearAll();
            }

        }
    }//GEN-LAST:event_btnclearActionPerformed

    private void tblgrnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblgrnMouseClicked
        if (evt.getClickCount() == 2) {
            if (tblgrn.getRowCount() != 0) {

                UpdateItem();

            }
        }
    }//GEN-LAST:event_tblgrnMouseClicked

    private void txtfinaldiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfinaldiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfinaldiscountActionPerformed

    private void txtgrandfinalamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgrandfinalamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgrandfinalamountActionPerformed

    private void tblgrnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblgrnKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblgrnKeyReleased

    private void cmbstorekeepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstorekeepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstorekeepActionPerformed

    private void cmbstorekeepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbstorekeepKeyPressed
        if (evt.getKeyCode() == 10) {
            txtitemname.grabFocus();

        }
    }//GEN-LAST:event_cmbstorekeepKeyPressed

    private void cmbserialtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbserialtypeActionPerformed
        try {

            if (cmbserialtype.getSelectedIndex() != 0) {

                if (cmbserialtype.getSelectedItem().equals("None")) {

                    txtserialno.setText("0");
                    txtserialno.setEnabled(false);

                } else {
                    txtserialno.setText("0");
                    txtserialno.setEnabled(true);
                }

                if (cmbserialtype.getSelectedItem().equals("Uniqe Serialize")) {
                    resetBatchCombo();
                    cmbbatchno.setSelectedItem("New");
                    txtqty.setEnabled(false);
                } else {

                    loadSerialTypeBatches();
                    txtqty.setText("1");
                    txtqty.setEnabled(true);
                }

            } else {
                resetBatchCombo();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_cmbserialtypeActionPerformed

    private void cmbselldiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbselldiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbselldiscountActionPerformed

    private void cmbselldiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbselldiscountKeyPressed
        if (evt.getKeyCode() == 10) {
            txtselldiscount.grabFocus();
            txtselldiscount.selectAll();
        }
    }//GEN-LAST:event_cmbselldiscountKeyPressed

    private void txtselldiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtselldiscountKeyPressed
        if (evt.getKeyCode() == 10) {
            btnadd.grabFocus();
        }
    }//GEN-LAST:event_txtselldiscountKeyPressed

    private void txtselldiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtselldiscountKeyReleased
        Validation.validatedouble(txtselldiscount);

        if (txtselldiscount.getText().isEmpty()) {
            txtselldiscount.setText("0.0");
            txtselldiscount.selectAll();
        }

        if (!txtlastcost.getText().isEmpty() && !txtsellprice.getText().isEmpty()) {
            double cost = Double.parseDouble(txtlastcost.getText());
            double sell = Double.parseDouble(txtsellprice.getText());

            if (cost > 0 && sell > 0) {
                if (cost > sell) {

                    txtsellprice.grabFocus();
                    txtsellprice.selectAll();
                } else {

                    CalculationsSell();

                }
            }

        }

    }//GEN-LAST:event_txtselldiscountKeyReleased

    private void cmbserialtypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbserialtypeKeyPressed
        if (evt.getKeyCode() == 10) {
            cmbbatchno.grabFocus();
        }
    }//GEN-LAST:event_cmbserialtypeKeyPressed

    private void txtserialnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserialnoKeyPressed
        if (evt.getKeyCode() == 10) {
            txtwarranty.grabFocus();
            txtwarranty.selectAll();
        } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
            btnadd.grabFocus();

        }
    }//GEN-LAST:event_txtserialnoKeyPressed

    private void txtwarrantyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwarrantyKeyPressed
        if (evt.getKeyCode() == 10) {

            if (!txtqty.isEnabled()) {
                txtcostprice.grabFocus();
                txtcostprice.selectAll();
            } else {

                txtqty.grabFocus();
                txtqty.selectAll();
            }
        }
    }//GEN-LAST:event_txtwarrantyKeyPressed

    private void txtwarrantyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtwarrantyKeyReleased
        Validation.validatenumber(txtwarranty);
    }//GEN-LAST:event_txtwarrantyKeyReleased

    private void txtitemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemnameActionPerformed

    }//GEN-LAST:event_txtitemnameActionPerformed

    private void txtitemidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitemidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemidKeyReleased

    private void txtitemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemidActionPerformed

    }//GEN-LAST:event_txtitemidActionPerformed

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
            java.util.logging.Logger.getLogger(Grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Grn dialog = new Grn(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnpayment;
    private javax.swing.JButton btnreset;
    private javax.swing.JComboBox cmbbatchno;
    private javax.swing.JComboBox cmbcostdiscount;
    private javax.swing.JComboBox cmbfinaldiscount;
    private javax.swing.JComboBox cmbselldiscount;
    private javax.swing.JComboBox cmbserialtype;
    public javax.swing.JComboBox cmbstorekeep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblavailabaleqty;
    private javax.swing.JLabel lblbatchno;
    private javax.swing.JLabel lblbatchno1;
    private javax.swing.JLabel lblcostdis;
    private javax.swing.JLabel lblcostdiscount;
    private javax.swing.JLabel lblcostprice;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldis1;
    private javax.swing.JLabel lblfinaldis;
    private javax.swing.JLabel lblfinaldiscount;
    private javax.swing.JLabel lblgrandamount;
    private javax.swing.JLabel lblgrnno;
    private javax.swing.JLabel lblitemcount;
    private javax.swing.JLabel lblitemname;
    private javax.swing.JLabel lblqty;
    private javax.swing.JLabel lblselldiscount;
    private javax.swing.JLabel lblsellprice;
    private javax.swing.JLabel lblserialno;
    private javax.swing.JLabel lblserialtype;
    private javax.swing.JLabel lblwarranty;
    private javax.swing.JTable tblgrn;
    private javax.swing.JTextField txtGrnno;
    private javax.swing.JTextField txtcostamount;
    private javax.swing.JTextField txtcostdiscount;
    private javax.swing.JTextField txtcostprice;
    private javax.swing.JFormattedTextField txtfDate;
    private javax.swing.JTextField txtfinaldiscount;
    private javax.swing.JTextField txtgrandamount;
    private javax.swing.JTextField txtgrandfinalamount;
    private javax.swing.JTextField txtitemid;
    private javax.swing.JTextField txtitemname;
    private javax.swing.JTextField txtlastcost;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsellamount;
    private javax.swing.JTextField txtselldiscount;
    private javax.swing.JTextField txtsellprice;
    private javax.swing.JTextField txtserialno;
    private javax.swing.JTextField txtwarranty;
    // End of variables declaration//GEN-END:variables

    private void FirstLoad() {
        txtfDate.setValue(new DateUp().getCurrentDate());
        loadUsertoCombo();
        LoadItemstoTxt();
        loadSerialTypes();
        loadSerialNo();
        txtGrnno.grabFocus();
    }

    private void loadSerialTypes() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmbserialtype.getModel();
        dcbm.removeAllElements();

        try {
            dcbm.addElement("--Select--");
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "serialize.type\n"
                    + "FROM\n"
                    + "serialize"); //usertype id
            while (rs.next()) {

                dcbm.addElement(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadUsertoCombo() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmbstorekeep.getModel();
        dcbm.removeAllElements();

        try {
            dcbm.addElement("--Select--");
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "`user`.id,\n"
                    + "`user`.fname,\n"
                    + "`user`.lname\n"
                    + "FROM\n"
                    + "`user` ,\n"
                    + "user_type\n"
                    + "WHERE\n"
                    + "\n"
                    + "`user`.user_type_id = user_type.id AND `user`.status='" + ConstantData.Status_ACTIVE + "' and user.id<>1 and \n"
                    + "user_type.id in ('1','3');"); //usertype id
            while (rs.next()) {

                dcbm.addElement(rs.getString(1) + "- " + rs.getString(2) + " " + rs.getString(3));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void LoadItemstoTxt() {
        ArrayList<String> li = new ArrayList<String>();

        //  TextAutoCompleter tx = new TextAutoCompleter(txtitemname);
        try {

            ResultSet rs = DB.getData("SELECT\n"
                    + "item.`name`\n"
                    + "FROM\n"
                    + "item\n"
                    + "WHERE\n"
                    + "item.`status` = '" + ConstantData.Status_ACTIVE + "'");
            while (rs.next()) {
                li.add(rs.getString(1));
                //tx.addItem(rs.getString(1));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        AutoCompleteDecorator.decorate(txtitemname, li, true);
    }

    private void LoadItemid() {
        try {
            ResultSet rs = DB.getData("SELECT\n"
                    + ""
                    + "item.id\n"
                    + "FROM\n"
                    + "item\n"
                    + "WHERE\n"
                    + "item.`status` = '" + ConstantData.Status_ACTIVE + "' AND\n"
                    + "item.`name` = '" + txtitemname.getText().trim() + "'");
            if (rs.next()) {

                txtitemid.setText(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void resetBatchCombo() {
        DefaultComboBoxModel dcmb = (DefaultComboBoxModel) cmbbatchno.getModel();
        dcmb.removeAllElements();
        dcmb.addElement("--Select--");
        dcmb.addElement("New");
    }

    private void ClearItemdetails() {
        txtitemid.setText("");
        txtitemname.setText("");
        ClearItemBatchDetails();
        LoadItemstoTxt();
        setEnableDisableCosttab(true);
        resetBatchCombo();
        loadSerialNo();
        cmbserialtype.setSelectedIndex(0);
        txtqty.setEnabled(true);
        txtqty.setEditable(true);
        txtitemname.grabFocus();

    }

    private void ClearItemdetailsoutName() {

        ClearItemBatchDetails();

        setEnableDisableCosttab(true);
        resetBatchCombo();
        loadSerialNo();
        cmbserialtype.setSelectedIndex(0);
        txtqty.setEnabled(true);
        txtqty.setEditable(true);

    }

    private void ClearUniqserialItemdetails() {
        txtserialno.setText("0");
        loadSerialNo();

        txtserialno.grabFocus();
        txtserialno.selectAll();

    }

    private void ClearItemBatchDetails() {

        cmbcostdiscount.setSelectedIndex(0);
        cmbselldiscount.setSelectedIndex(0);
        txtcostprice.setText("0.0");
        txtsellprice.setText("0.0");
        txtqty.setText("1");
        lblavailabaleqty.setText("0");
        txtcostdiscount.setText("0.0");
        txtsellamount.setText("0.0");
        txtcostamount.setText("0.0");
        txtserialno.setText("0");
        txtwarranty.setText("0");
        txtlastcost.setText("0");
        lblcostdiscount.setText("0.0");
        lblselldiscount.setText("0.0");
        txtselldiscount.setText("0.0");
    }

    private void SelectBatchNoforFeilds() {
        try {

            ResultSet rs = DB.getData("SELECT\n"
                    + "serial_details.serialno,\n"
                    + "batch.warranty,\n"
                    + "SUM(stock.qty),\n"
                    + "batch.cost_price,\n"
                    + "batch.discount_opt,\n"
                    + "batch.discount,\n"
                    + "batch.sell_price\n"
                    + "FROM\n"
                    + "batch ,\n"
                    + "stock ,\n"
                    + "serialize ,\n"
                    + "serial_details\n"
                    + "WHERE\n"
                    + "batch.id = serial_details.batch_id AND\n"
                    + "batch.id = '" + cmbbatchno.getSelectedItem() + "' AND\n"
                    + "serial_details.id = stock.serial_details_id AND\n"
                    + "serial_details.serialize_id = serialize.id AND\n"
                    + "serialize.type = '" + cmbserialtype.getSelectedItem() + "' AND\n"
                    + "stock.`status` = '" + ConstantData.Status_ACTIVE + "' AND \n"
                    + "batch.item_id = '" + txtitemid.getText().trim() + "'");
            if (rs.next()) {

                txtserialno.setText(rs.getString(1));
                txtwarranty.setText(rs.getString(2));
                lblavailabaleqty.setText(rs.getString(3));
                txtcostprice.setText(rs.getString(4));
                txtsellprice.setText(rs.getString(7));
                cmbselldiscount.setSelectedItem(rs.getString(5));
                txtselldiscount.setText(rs.getString(6));
                setEnableDisableCosttab(false);
                CalculationsCost();
                CalculationsSell();
            }
        } catch (Exception e) {
            Messages.errorjoption("Error Occur for last Action  ! ");
            e.printStackTrace();
            ClearItemdetails();
        }
    }

    private void CalculationsSell() {
        double cost = Double.parseDouble(txtlastcost.getText());
        double sell = Double.parseDouble(txtsellprice.getText());
        double value = Double.parseDouble(txtselldiscount.getText());

        if (cmbselldiscount.getSelectedItem().toString().equals("%")) {
            if (cost <= sell) {
                double lastsellprice = Double.parseDouble(AllCalculations.DiscountforPrecentage(sell, value));

                if (lastsellprice >= cost) {
                    lblselldiscount.setText("Rs. " + (sell - lastsellprice));
                    txtsellamount.setText("" + lastsellprice);
                } else {
                    txtsellamount.setText("" + sell);
                    lblselldiscount.setText("0.0");
                    txtselldiscount.setText("0.0");
                    txtselldiscount.selectAll();
                }
            } else {
                txtsellamount.setText("0.0");
                lblselldiscount.setText("0.0");
                txtselldiscount.setText("0.0");
                txtselldiscount.selectAll();
                CalculationsSell();
            }

        } else if (cmbselldiscount.getSelectedItem().toString().equals("Price")) {
            if (cost <= sell) {
                double lastsellprice = sell - value;

                if (lastsellprice >= cost) {
                    lblselldiscount.setText(AllCalculations.DiscountforPricePrecentage(sell, lastsellprice) + "%");
                    txtsellamount.setText("" + lastsellprice);
                } else {
                    txtsellamount.setText("" + sell);
                    lblselldiscount.setText("0.0");
                    txtselldiscount.setText("0.0");
                    txtselldiscount.selectAll();
                }
            } else {
                txtsellamount.setText("0.0");
                lblselldiscount.setText("0.0");
                txtselldiscount.setText("0.0");
                txtselldiscount.selectAll();
                CalculationsSell();
            }
//     
        }

    }

    private void CalculationsCost() {

        double cost = Double.parseDouble(txtcostprice.getText());
        double qty = Double.parseDouble(txtqty.getText());
        double value = Double.parseDouble(txtcostdiscount.getText());
        //double lasttotal = Double.parseDouble(AllCalculations.TotalofItem(Double.parseDouble(txtcostprice.getText()), qty));

        if (cmbcostdiscount.getSelectedItem().toString().equals("%")) {
            if (value < 100) {

                double lastdiscount = Double.parseDouble(AllCalculations.DiscountforPrecentage(cost, value));

                lblcostdiscount.setText("Rs. " + Format.decimal3.format(lastdiscount));
                txtlastcost.setText(Format.decimal3.format(lastdiscount));
                txtcostamount.setText(Format.decimal3.format((lastdiscount * qty)));

            } else {
                txtcostamount.setText("0.0");
                lblcostdiscount.setText("0.0");
                txtcostdiscount.setText("0.0");
                txtlastcost.setText("0.0");
                txtcostdiscount.selectAll();
                CalculationsCost();
            }

        } else if (value <= cost) {

            double lastdiscount = Double.parseDouble(AllCalculations.DiscountforPrice(cost, value));

            lblcostdiscount.setText(Format.decimal3.format((100 - lastdiscount)) + "%");
            txtlastcost.setText(Format.decimal3.format((cost - value)));
            txtcostamount.setText(Format.decimal3.format((cost - value) * qty));

//    
        } else {
            txtcostamount.setText("0.0");
            lblcostdiscount.setText("0.0");
            txtcostdiscount.setText("0.0");
            txtlastcost.setText("0.0");
            txtcostdiscount.selectAll();
            CalculationsCost();
        }

    }

    private boolean checkFeildValues() {
        if (txtitemid.getText().isEmpty()) {

            Messages.warningjoption("Please Enter Correct Item ! ");
            txtitemname.grabFocus();
            txtitemname.selectAll();
            return false;
        } else if (Double.parseDouble(txtcostprice.getText()) <= 0) {
            Messages.warningjoption("Incorrect Data on the Field Please Check ! ");
            txtcostprice.grabFocus();
            txtcostprice.selectAll();
            return false;

        } else if (Double.parseDouble(txtsellprice.getText()) <= 0) {
            Messages.warningjoption("Incorrect Data on the Field Please Check ! ");
            txtsellprice.grabFocus();
            txtsellprice.selectAll();
            return false;

        } else if (Double.parseDouble(txtqty.getText()) <= 0) {
            Messages.warningjoption("Incorrect Data on the Field Please Check ! ");
            txtqty.grabFocus();
            txtqty.selectAll();
            return false;
        } else if (Double.parseDouble(txtcostdiscount.getText()) < 0) {
            Messages.warningjoption("Incorrect Data on the Field Please Check ! ");
            txtcostdiscount.grabFocus();
            txtcostdiscount.selectAll();
            return false;
        } else if (Double.parseDouble(txtselldiscount.getText()) < 0) {
            Messages.warningjoption("Incorrect Data on the Field Please Check ! ");
            txtselldiscount.grabFocus();
            txtselldiscount.selectAll();
            return false;

        } else if (Double.parseDouble(txtwarranty.getText()) < 0) {
            Messages.warningjoption("Incorrect Data on the Field Please Check ! ");
            txtwarranty.grabFocus();
            txtwarranty.selectAll();
            return false;
        } else {
            return true;
        }

    }

    private void addItemDetailstoTable() {
        try {
            DefaultTableModel df = (DefaultTableModel) tblgrn.getModel();
            if (df.getRowCount() == 0) {
                df.setRowCount(0);
            }

            String itemid = txtitemid.getText();
            String itemname = txtitemname.getText();
            String serialtype = cmbserialtype.getSelectedItem().toString();
            String batchno = cmbbatchno.getSelectedItem().toString();
            String serialno = txtserialno.getText();
            String warranty = txtwarranty.getText();
            double qty = Double.parseDouble(txtqty.getText());
            double cost = Double.parseDouble(txtcostprice.getText());
            double lastcost = Double.parseDouble(txtlastcost.getText());
            String discounopcost = cmbcostdiscount.getSelectedItem().toString();
            double discountcost = Double.parseDouble(txtcostdiscount.getText());
            double amount = Double.parseDouble(txtcostamount.getText());
            double sell = Double.parseDouble(txtsellprice.getText());
            String discounopsell = cmbselldiscount.getSelectedItem().toString();
            double selldiscount = Double.parseDouble(txtselldiscount.getText());

            Object arr[] = {itemid, itemname, serialtype, batchno, serialno, warranty, qty, cost, lastcost,
                discounopcost, discountcost, amount, sell, discounopsell, selldiscount};
            df.addRow(arr);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isThisItemPricesAlreadyinDB() {
        boolean bol = true;
        try {

            if (cmbbatchno.getSelectedIndex() == 1) { //if select New batch
                ResultSet rs = DB.getData("SELECT\n"
                        + "batch.`status`\n"
                        + "FROM\n"
                        + "batch\n"
                        + "WHERE\n"
                        //   + "batch.id = '" + cmbbatchno.getSelectedItem() + "' AND\n"
                        + "batch.item_id = '" + txtitemid.getText() + "' AND\n"
                        + "batch.cost_price = '" + txtcostprice.getText() + "' AND\n"
                        + "batch.sell_price = '" + txtsellprice.getText() + "' "
                        + "");
                if (rs.next()) {
                    Messages.warningjoption("This Item already has this Cost & Sell price, Please Check ! ");
                    bol = false;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return bol;
    }

    private boolean isAlreadyExistthisItem() {

        DefaultTableModel dft = (DefaultTableModel) tblgrn.getModel();

        boolean bol = true;

        for (int i = 0; i < tblgrn.getRowCount(); i++) {

            String itemid = txtitemid.getText();
            String batchno = cmbbatchno.getSelectedItem().toString();
            String serialno = txtserialno.getText();
            double costprice = Double.parseDouble(txtcostprice.getText());

            if (itemid.equals(tblgrn.getValueAt(i, 0)) && batchno.equals(tblgrn.getValueAt(i, 3)) && serialno.equals(tblgrn.getValueAt(i, 4)) && costprice == Double.parseDouble(tblgrn.getValueAt(i, 7).toString())) {
                Messages.warningjoption("This Item Already Exist in the Table. Please Check ! ");
                bol = false;
                break;
            } else {
                bol = true;
            }

        }

        return bol;
    }

    private void TableItemAmountandItemCount() {
        if (tblgrn.getRowCount() != 0) {

            clearFinalDiscountFeilds();

            double grandamount = 0.0;
            for (int i = 0; i < tblgrn.getRowCount(); i++) {

                grandamount += Double.parseDouble(tblgrn.getValueAt(i, 11).toString());

            }
            txtgrandamount.setText(Format.decimal3.format(grandamount));
            txtgrandfinalamount.setText(Format.decimal3.format(grandamount));

            if (grnpay != null) {
                grnpay.lblgrandamount.setText(Format.decimal3.format(grandamount));
                grnpay.AllFinalCalculations();
            }

        } else {
            clreaGrandAmountFeilds();
        }
        lblitemcount.setText(String.valueOf(tblgrn.getRowCount()));
    }

    private void deleteItem() {

        try {
            DefaultTableModel df = (DefaultTableModel) tblgrn.getModel();
            df.removeRow(tblgrn.getSelectedRow());
            TableItemAmountandItemCount();
            if (tblgrn.getRowCount() == 0) {
                grnpay = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void UpdateItem() {
        try {
            txtitemid.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 0).toString());
            txtitemname.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 1).toString());

            cmbserialtype.setSelectedItem(tblgrn.getValueAt(tblgrn.getSelectedRow(), 2).toString());
            cmbbatchno.setSelectedItem(tblgrn.getValueAt(tblgrn.getSelectedRow(), 3).toString());
            txtserialno.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 4).toString());
            txtwarranty.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 5).toString());
            txtqty.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 6).toString());
            txtcostprice.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 7).toString());
            txtlastcost.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 8).toString());
            cmbcostdiscount.setSelectedItem(tblgrn.getValueAt(tblgrn.getSelectedRow(), 9).toString());
            txtcostdiscount.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 10).toString());

            txtsellprice.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 12).toString());
            cmbselldiscount.setSelectedItem(tblgrn.getValueAt(tblgrn.getSelectedRow(), 13).toString());
            txtselldiscount.setText(tblgrn.getValueAt(tblgrn.getSelectedRow(), 14).toString());

            CalculationsCost();
            CalculationsSell();

            deleteItem();
            cmbbatchno.grabFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clreaGrandAmountFeilds() {

        cmbfinaldiscount.setSelectedIndex(0);
        txtfinaldiscount.setText("0.0");
        lblfinaldiscount.setText("0.0");
        txtgrandamount.setText("0.0");
        txtgrandfinalamount.setText("0.0");
    }

    private void Calculations_Finals() {
        try {
//            double num = Double.parseDouble(txtfinaldiscount.getText());
//            double lasttotal = Double.parseDouble(txtgrandamount.getText());
//
//            if (cmbfinaldiscount.getSelectedItem().toString().equals("%")) {
//                if (num < 100) {
//                    double discountfortotal = Double.valueOf(AllCalculations.DiscountforPrecentage(lasttotal, Double.parseDouble(txtfinaldiscount.getText())));
//                    lblfinaldiscount.setText("Rs. " + Format.decimal3.format(lasttotal - discountfortotal));
//                    txtgrandfinalamount.setText(String.valueOf(discountfortotal));
//                } else {
//                    txtgrandfinalamount.setText("0.0");
//                    lblfinaldiscount.setText("0.0");
//                    txtfinaldiscount.setText("0.0");
//                    txtfinaldiscount.selectAll();
//                    Calculations_Finals();
//                }
//
//            } else if (num <= lasttotal && lasttotal != 0) {
//                double discountforpricetotal = Double.valueOf(AllCalculations.DiscountforPrice(lasttotal, Double.parseDouble(txtfinaldiscount.getText())));
//                lblfinaldiscount.setText(AllCalculations.DiscountforPricePrecentage(lasttotal, discountforpricetotal) + "%");
//                txtgrandfinalamount.setText(String.valueOf(discountforpricetotal));
//            } else {
//                txtgrandfinalamount.setText("0.0");
//                lblfinaldiscount.setText("0.0");
//                txtfinaldiscount.setText("0.0");
//                txtfinaldiscount.selectAll();
//                Calculations_Finals();
//            }

            double cost = Double.parseDouble(txtgrandamount.getText());
            double value = Double.parseDouble(txtfinaldiscount.getText());

            if (cmbfinaldiscount.getSelectedItem().toString().equals("%")) {
                if (value < 100) {

                    double lastdiscount = Double.parseDouble(AllCalculations.DiscountforPrecentage(cost, value));

                    lblfinaldiscount.setText("Rs. " + Format.decimal3.format(lastdiscount));
                    txtgrandfinalamount.setText(Format.decimal3.format(lastdiscount));

                } else {
                    txtgrandfinalamount.setText("0.0");
                    lblfinaldiscount.setText("0.0");
                    txtfinaldiscount.setText("0.0");
                    txtfinaldiscount.selectAll();
                    Calculations_Finals();
                }

            } else if (value <= cost) {

                double lastdiscount = Double.parseDouble(AllCalculations.DiscountforPrice(cost, value));

                lblfinaldiscount.setText(Format.decimal3.format((100 - lastdiscount)) + "%");
                txtgrandfinalamount.setText(Format.decimal3.format((cost - value)));

            } else {
                txtgrandfinalamount.setText("0.0");
                lblfinaldiscount.setText("0.0");
                txtfinaldiscount.setText("0.0");
                txtfinaldiscount.selectAll();
                Calculations_Finals();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clearFinalDiscountFeilds() {

        try {

            cmbfinaldiscount.setSelectedIndex(0);
            txtfinaldiscount.setText("0.0");
            lblfinaldiscount.setText("0.0");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected synchronized void saveAllGRNDetails() {
        Connection conn = null;

        try {
            if (isnotGRNnoAlreadyExist()) {

                if (checkBatchnoAvailability()) {

                    SaveGRN(conn);// save Grn
                    new Logs().createLog("Save GRN", cmbstorekeep.getSelectedItem().toString().split("-")[0]);
                }

            } else {
                Messages.warningjoption("This GRN Number already exist ! Please try another ! ");
            }

        } catch (Exception e) {
            Messages.warningjoption("OOoppzz ,Somthing wrong this Saving Process,Plaese Try again !");

            try {
                conn.rollback();
                e.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    private boolean isnotGRNnoAlreadyExist() {
        boolean bol = true;
        try {
            ResultSet rs = DB.getData("SELECT\n"
                    + "grn.grnno\n"
                    + "FROM\n"
                    + "grn\n"
                    + "WHERE\n"
                    + "grn.grnno = '" + txtGrnno.getText().trim() + "'");
            if (rs.next()) {
                bol = false;
            }
        } catch (Exception e) {
            bol = false;
            e.printStackTrace();
        }
        return bol;
    }

    private boolean checkBatchnoAvailability() {
        boolean bol = true;
        try {
            if (tblgrn.getRowCount() != 0) {
                for (int i = 0; i < tblgrn.getRowCount(); i++) {
                    String itmid = tblgrn.getValueAt(i, 0).toString();
                    String itmname = tblgrn.getValueAt(i, 1).toString();
                    String btchid = tblgrn.getValueAt(i, 2).toString();

                    if (checkItemStatusByIDandBatch(itmid, btchid)) {// true if batch status not = 1
                        Messages.errorjoption("Sorry this Item- " + itmname + " Batch- " + btchid + "  Currently Not Available, Plaese Check ! ");
                        bol = false;
                        break;
                    } else {
                        bol = true;
                    }

                }
            }

        } catch (Exception e) {
            bol = false;
            e.printStackTrace();
        }
        return bol;

    }

    private boolean checkItemStatusByIDandBatch(String itemid, String btchid) {
        boolean bol = false;
        try {
            ResultSet rs = DB.getData("SELECT\n"
                    + "batch.id\n"
                    + "FROM\n"
                    + "batch\n"
                    + "WHERE\n"
                    + "batch.item_id = '" + itemid + "' AND\n"
                    + "batch.id = '" + btchid + "' AND\n"
                    + "batch.`status` <> '1'");
            if (rs.next()) {
                bol = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bol;

    }

    private void SaveGRN(Connection conn) throws Exception {
////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        model.DB2.putData("insert into Grn () values ('"++"','"++"',"
//        + "'"++"','"++"',)"
//        + "'"++"','"++"',)");
////////////////////////////////////////////////////////////////////////////////////////////////////////////

        conn = model.DB2.getconn();

        String grnid = DBQueryEngine.GetMaxID("grn");
        String buzman = DBQueryEngine.GetMaxID("buz_man");

        String datetime = txtfDate.getText().trim() + " " + DateUp.getCurrentTime();
        int newbatchdbid = DBQueryEngine.GetMaxIDInt("batch");
        int serialdetails = DBQueryEngine.GetMaxIDInt("serial_details");

        ////save buz man
        if (!grnpay.txtsupid.getText().isEmpty()) {
            buzman = grnpay.txtsupid.getText().trim();
            model.DB2.putData("update buz_man set nic='" + grnpay.txtnic.getText().trim() + "',company='" + grnpay.txtcompany.getText().trim() + "' where  id='" + grnpay.txtsupid.getText().trim() + "' ");

        } else {// new supplier
            model.DB2.putData("INSERT INTO buz_man(id,user_type_id,branch_id,fname,lname,nic,contact_1,company,"
                    + "status) values('" + buzman + "','" + DBQueryEngine.getIDofSelectedValuenoStatus("user_type", "type", "Supplier") + "','" + ConstantData.branchId + "','" + grnpay.txtfirstname.getText().trim() + "','" + grnpay.txtlastname.getText().trim() + "','" + grnpay.txtnic.getText().trim() + "','" + grnpay.txtfcontact1.getText().trim() + "',"
                    + "'" + grnpay.txtcompany.getText().trim() + "','" + ConstantData.Status_ACTIVE + "')");

        }

        /////////////save Grn
        model.DB2.putData("insert into grn (id,grnno,user_id,branch_id,buz_man_id,holder_id,date,discount_opt,discount,grand_tot,status) "
                + " values ('" + grnid + "','" + txtGrnno.getText().trim() + "','" + ConstantData.logUserId + "',"
                + "'" + ConstantData.branchId + "','" + buzman + "','" + cmbstorekeep.getSelectedItem().toString().split("-")[0] + "','" + datetime + "','" + cmbfinaldiscount.getSelectedItem() + "','" + txtfinaldiscount.getText().trim() + "',"
                + "'" + txtgrandfinalamount.getText().trim() + "','" + ConstantData.Status_ACTIVE + "')");

        for (int i = 0; i < tblgrn.getRowCount(); i++) {

            String itemid = tblgrn.getValueAt(i, 0).toString();
            String itemname = tblgrn.getValueAt(i, 1).toString();
            String serialtype = DBQueryEngine.getIDofSelectedValuenoStatus("serialize", "type", tblgrn.getValueAt(i, 2).toString());
            String batchno = tblgrn.getValueAt(i, 3).toString();
            String serialno = tblgrn.getValueAt(i, 4).toString();
            String warranty = tblgrn.getValueAt(i, 5).toString();
            String qty = tblgrn.getValueAt(i, 6).toString();
            String cost = tblgrn.getValueAt(i, 7).toString();
            String lastcost = tblgrn.getValueAt(i, 8).toString();
            String discounopcost = tblgrn.getValueAt(i, 9).toString();
            String discountcost = tblgrn.getValueAt(i, 10).toString();
            String costamount = tblgrn.getValueAt(i, 11).toString();
            String sell = tblgrn.getValueAt(i, 12).toString();
            String discounopsell = tblgrn.getValueAt(i, 13).toString();
            String selldiscount = tblgrn.getValueAt(i, 14).toString();

            String barcode = "96";
            String stockid = getStockID(batchno, serialno);

            if (batchno.equals("New")) { //new save batch

                String bar = barcode + newbatchdbid;
                /////batch tble save
                model.DB2.putData("insert into batch (id,item_id,barcode,date,warranty,cost_price,discount_opt,discount,sell_price,status) "
                        + " values ('" + newbatchdbid + "','" + itemid + "','" + bar + "','" + datetime + "','" + warranty + "','" + lastcost + "',"
                        + "'" + discounopsell + "','" + selldiscount + "','" + sell + "',"
                        + "'" + ConstantData.Status_ACTIVE + "')");

                ////////save serialdetails
                model.DB2.putData("insert into serial_details (id,batch_id,serialize_id,serialno,status) "
                        + " values ('" + serialdetails + "','" + newbatchdbid + "',"
                        + "'" + serialtype + "',"
                        + "'" + serialno + "','" + ConstantData.Status_ACTIVE + "')");

                /////save stock
                model.DB2.putData("insert into stock (serial_details_id,branch_id,date,qty,status) "
                        + " values ('" + serialdetails + "','" + ConstantData.branchId.trim() + "',"
                        + "Now(),"
                        + "'" + qty + "','" + ConstantData.Status_ACTIVE + "')");

                //////save Grn details
                model.DB2.putData("insert into grn_detail (grn_id,item_id,batch_id,cost_price,lastcost_price,sell_price,qty,discount_opt,discount,total,status) "
                        + " values ('" + grnid + "','" + itemid + "',"
                        + "'" + newbatchdbid + "','" + cost + "','" + lastcost + "',"
                        + "'" + sell + "','" + qty + "',"
                        + "'" + discounopcost + "','" + discountcost + "',"
                        + "'" + costamount + "',"
                        + "'" + ConstantData.Status_ACTIVE + "')");

////////////////////////////////////////////////////////////////////
                ///////// manual increment tbl id ///////////////////
                newbatchdbid++;
                serialdetails++;
////////////////////////////////////////////////////// ////////////////// 
            } else {// update batchno

                //////stock table update
                model.DB2.putData("update stock set qty=qty+'" + qty.trim() + "',status='" + ConstantData.Status_ACTIVE + "'  where id='" + stockid + "' ");

                //////save Grn details
                model.DB2.putData("insert into grn_detail (grn_id,item_id,batch_id,cost_price,lastcost_price,sell_price,qty,discount_opt,discount,total,status) "
                        + " values ('" + grnid + "','" + itemid + "',"
                        + "'" + batchno + "','" + cost + "','" + lastcost + "',"
                        + "'" + sell + "','" + qty + "',"
                        + "'" + discounopcost + "','" + discountcost + "',"
                        + "'" + costamount + "',"
                        + "'" + ConstantData.Status_ACTIVE + "')");
            }

/////////////////////////////////////////////////////////////////////////////
            ///////// manual increment tbl id ///////////////////
///////////////////////////////////////////////////////////////////////////
        }

        grnpay.SavePayment(conn, grnid, buzman);

        if (conn != null) {
            conn.commit();
            Messages.normaljoption("GRN Saved Successfully ! ");

            grnpay.dispose();
            grnpay = null;
            clearAll();
        }

    }

    private void clearAll() {
        try {
            ClearItemdetails();
            clreaGrandAmountFeilds();

            DefaultTableModel df = (DefaultTableModel) tblgrn.getModel();
            df.setRowCount(0);
            TableItemAmountandItemCount();
            txtfDate.setValue(new DateUp().getCurrentDate());
            txtGrnno.setText("");

            LoadItemstoTxt();

            txtGrnno.grabFocus();
        } catch (Exception e) {
        }

    }

    private void loadSerialTypeBatches() {
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmbbatchno.getModel();
        dcbm.removeAllElements();

        try {
            dcbm.addElement("--Select--");
            dcbm.addElement("New");
            ResultSet rs = model.DB.getData("SELECT\n"
                    + "serial_details.batch_id\n"
                    + "FROM\n"
                    + "batch ,\n"
                    + "serialize ,\n"
                    + "serial_details\n"
                    + "WHERE\n"
                    //  + "serial_details.`status` = '" + ConstantData.Status_ACTIVE + "' AND\n"
                    + "batch.`status` in('" + ConstantData.Status_ACTIVE + "') AND\n"
                    + "serial_details.batch_id = batch.id AND\n"
                    + "batch.item_id = '" + txtitemid.getText().trim() + "' AND\n"
                    + "serial_details.serialize_id = serialize.id AND\n"
                    + "serialize.type = '" + cmbserialtype.getSelectedItem() + "' ORDER BY\n"
                    + "serial_details.batch_id DESC ");
            while (rs.next()) {

                dcbm.addElement(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadSerialNo() {
        List<String> li = new ArrayList<String>();

        try {

            ResultSet rs = DB.getData("SELECT\n"
                    + "serial_details.serialno\n"
                    + "FROM\n"
                    + "serial_details\n"
                    + "WHERE\n"
                    + "serial_details.`status`  in ('1','2') and serial_details.serialno<>0;");
            while (rs.next()) {
                li.add(rs.getString(1));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        AutoCompleteDecorator.decorate(txtserialno, li, false);

    }

    private void setEnableDisableCosttab(boolean bol) {

        if (bol) {
            txtcostprice.setEditable(bol);
            txtlastcost.setEditable(bol);
            txtserialno.setEditable(bol);
            txtwarranty.setEditable(bol);
            txtcostdiscount.setEditable(bol);
            cmbcostdiscount.setEnabled(bol);
            txtsellprice.setEditable(bol);
            txtselldiscount.setEditable(bol);

            cmbselldiscount.setEnabled(bol);

//            if (cmbserialtype.getSelectedItem().toString().equalsIgnoreCase("Uniqe Serialize")) {
//                txtserialno.setEditable(!bol);
//                txtqty.setText("1");
//                txtqty.setEditable(!bol);
//            }
//            if (cmbserialtype.getSelectedItem().toString().equalsIgnoreCase("Bulk Serialize")) {
//                txtserialno.setEditable(!bol);
//            } else {
//                txtserialno.setEditable(bol);
//            }
        } else {
            txtcostprice.setEditable(bol);
            txtcostdiscount.setEditable(bol);
            txtlastcost.setEditable(bol);
            txtserialno.setEditable(bol);
            txtwarranty.setEditable(bol);
            cmbcostdiscount.setEnabled(bol);
            txtsellprice.setEditable(bol);
            txtselldiscount.setEditable(bol);
            cmbselldiscount.setEnabled(bol);
//            if (cmbserialtype.getSelectedItem().toString().equalsIgnoreCase("Uniqe Serialize")) {
//                txtserialno.setEditable(!bol);
//                txtqty.setText("1");
//                txtqty.setEditable(!bol);
//            }

//            if (cmbserialtype.getSelectedItem().toString().equalsIgnoreCase("Bulk Serialize")) {
//                txtserialno.setEditable(!bol);
//            } else {
//                txtserialno.setEditable(bol);
//            }
        }
    }

    private void setEnableDisableUniquesrial(boolean bol) {

        if (bol) {
            txtcostprice.setEditable(bol);
            txtlastcost.setEditable(bol);
            txtqty.setEditable(bol);
            txtwarranty.setEditable(bol);
            txtcostdiscount.setEditable(bol);
            cmbcostdiscount.setEnabled(bol);
            txtsellprice.setEditable(bol);
            txtselldiscount.setEditable(bol);
            cmbselldiscount.setEnabled(bol);

//           
        } else {
            txtcostprice.setEditable(bol);
            txtlastcost.setEditable(bol);
            txtqty.setEditable(bol);
            txtwarranty.setEditable(bol);
            txtcostdiscount.setEditable(bol);
            cmbcostdiscount.setEnabled(bol);
            txtsellprice.setEditable(bol);
            txtselldiscount.setEditable(bol);
            cmbselldiscount.setEnabled(bol);
//         
        }
    }

    private void clearItemDetailsSpec() {
        if (cmbserialtype.getSelectedItem().equals("Uniqe Serialize")) {
            ClearUniqserialItemdetails();
            setEnableDisableUniquesrial(false);
        } else {
            setEnableDisableUniquesrial(true);
            ClearItemdetails();
            txtitemname.grabFocus();
        }

    }

    private boolean isSerialNumberexist() {
        boolean bol = true;

        try {

            if (cmbbatchno.getSelectedItem().toString().equalsIgnoreCase("New")) {

                ResultSet rs = DB.getData("SELECT\n"
                        + "serial_details.id\n"
                        + "FROM\n"
                        + "serial_details\n"
                        + "WHERE\n"
                        + "serial_details.`status` in ('1','2') AND\n"
                        + "serial_details.serialno = '" + txtserialno.getText().trim() + "' and serial_details.serialno<>0 ");
                while (rs.next()) {
                    bol = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bol;
    }

    private String getStockID(String batchno, String serialno) {

        String id = "0";
        try {

            ResultSet rs = DB.getData("SELECT\n"
                    + "stock.id\n"
                    + "FROM\n"
                    + "stock ,\n"
                    + "serial_details\n"
                    + "WHERE\n"
                    + "serial_details.batch_id = '" + batchno.trim() + "' AND\n"
                    + "serial_details.serialno = '" + serialno.trim() + "' AND\n"
                    + "serial_details.id = stock.serial_details_id AND\n"
                    + "stock.branch_id = '" + ConstantData.branchId.trim() + "' AND\n"
                    + "stock.`status`<>6");
            if (rs.next()) {
                id = rs.getString(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }

    private void setAvailableQtyUniqItem() {
        if ((cmbserialtype.getSelectedItem().toString().equalsIgnoreCase("Uniqe Serialize")) && !txtitemid.getText().isEmpty()) {
            try {

                ResultSet rs = DB.getData("SELECT\n"
                        + "SUM(stock.qty)\n"
                        + "FROM\n"
                        + "batch ,\n"
                        + "serial_details ,\n"
                        + "serialize ,\n"
                        + "stock\n"
                        + "WHERE\n"
                        + "stock.`status` = '1' AND\n"
                        + "batch.item_id = '" + txtitemid.getText().trim() + "' AND\n"
                        + "batch.id = serial_details.batch_id AND\n"
                        + "serial_details.id = stock.serial_details_id AND serial_details.serialize_id = serialize.id   AND\n"
                        + "serialize.type = 'Uniqe Serialize'   and  stock.`status`<>6 ");
                if (rs.next()) {
                    if (rs.getString(1) == null) {
                        lblavailabaleqty.setText("0");
                    } else {

                        lblavailabaleqty.setText(rs.getString(1));
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private boolean isBatchCostPricewithSerialNoAvialbale() {
        boolean bol = true;

        try {

            if (cmbserialtype.getSelectedItem().toString().equalsIgnoreCase("Bulk Serialize")) { //cost price & serialno

                if (cmbbatchno.getSelectedItem().toString().equalsIgnoreCase("New")) {

//                
                    ResultSet rs = DB.getData("SELECT\n"
                            + "                            batch.id\n"
                            + "FROM\n"
                            + "batch ,\n"
                            + "serialize ,\n"
                            + "serial_details\n"
                            + "WHERE\n"
                            + "batch.cost_price = '" + txtlastcost.getText().trim() + "' AND\n"
                            + "batch.`status` = '1' AND\n"
                            + "batch.item_id = '" + txtitemid.getText().trim() + "' AND\n"
                            + "batch.id = serial_details.batch_id AND\n"
                            + "serial_details.serialize_id = serialize.id AND\n"
                            + "serialize.type = '" + cmbserialtype.getSelectedItem() + "' and serial_details.serialno='" + txtserialno.getText().trim() + "'"
                    );
                    if (rs.next()) {
                        bol = false;
                        Messages.warningjoption("This Cost Price-" + txtlastcost.getText().trim() + "/= & SerialNo- " + txtserialno.getText() + "  included Batch no Already exist for this item,Please Check Batch Numbers ! ");
                        cmbbatchno.grabFocus();
                    }

                }
            } else if (cmbserialtype.getSelectedItem().toString().equalsIgnoreCase("None")) {
                if (cmbbatchno.getSelectedItem().toString().equalsIgnoreCase("New")) {

//                
                    ResultSet rs = DB.getData("SELECT\n"
                            + "                            batch.id\n"
                            + "FROM\n"
                            + "batch ,\n"
                            + "serialize ,\n"
                            + "serial_details\n"
                            + "WHERE\n"
                            + "batch.cost_price = '" + txtlastcost.getText().trim() + "' AND\n"
                            + "batch.`status` = '1' AND\n"
                            + "batch.item_id = '" + txtitemid.getText().trim() + "' AND\n"
                            + "batch.id = serial_details.batch_id AND\n"
                            + "serial_details.serialize_id = serialize.id AND\n"
                            + "serialize.type = '" + cmbserialtype.getSelectedItem() + "' "
                    );
                    if (rs.next()) {
                        bol = false;
                        Messages.warningjoption("This Cost Price-" + txtlastcost.getText().trim() + "/=   included Batch no Already exist for this item,Please Check Batch Numbers ! ");
                        cmbbatchno.grabFocus();
                    }

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bol;

    }

}
