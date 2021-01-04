/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Burgers extends javax.swing.JFrame {

    ConnectionToDB conObj = new ConnectionToDB();
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet res;
    Connection con;
    String Orderno = null;
    ArrayList<String> burgerList = new ArrayList<>();
    int qtyChk = 0;
    int qtyZin = 0;
    int qtyChe = 0;
    int qtySp = 0;

    boolean chickenBurger = false;
    boolean zingerBurger = false;
    boolean cheeseBurger = false;
    boolean specialBurger = false;

    public Burgers() {
        conObj.EstablishCon();
        con = conObj.EstablishCon();
        initComponents();
        this.setLocation(500, 0);
        autoID();
    }

    public void autoID() {

        String query = "select max(orderNo) from customerInfo";

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                Orderno = rs.getString(1);
//                System.out.println(Orderno);

            }
          
        } catch (SQLException e) {
            Logger.getLogger(Burgers.class.getName()).log(Level.SEVERE, null, e);
        }

        String setOrder = "insert into Burger(orderNo) values('" + Orderno + "')";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(setOrder);
        } catch (SQLException e) {

            Logger.getLogger(Burgers.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkChickenBrgr = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        unitChickenBrgr = new javax.swing.JLabel();
        qtyChickenBrgr = new javax.swing.JComboBox<>();
        priceChickenBrgr = new javax.swing.JTextField();
        unitZingerBrgr = new javax.swing.JLabel();
        qtyZingerBrgr = new javax.swing.JComboBox<>();
        priceZingerBrgr = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        chkZingerBrgr = new javax.swing.JCheckBox();
        chkCheeseBrgr = new javax.swing.JCheckBox();
        unitCheeseBrgr = new javax.swing.JLabel();
        priceCheeseBrgr = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        qtyCheeseBrgr = new javax.swing.JComboBox<>();
        unitSpecialBrgr = new javax.swing.JLabel();
        priceSpecialBrgr = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        qtySpecialBrgr = new javax.swing.JComboBox<>();
        chkSpecialBrgr = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        txtTotal = new javax.swing.JTextField();
        btnCalTotal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Burger/BurgerPic.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Burger/chickenBurger.png"))); // NOI18N

        chkChickenBrgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkChickenBrgr.setText("Chicken Burger");
        chkChickenBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChickenBrgrActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Unit Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Qty");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price");

        unitChickenBrgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitChickenBrgr.setText("120");

        qtyChickenBrgr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyChickenBrgr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyChickenBrgr.setEnabled(false);
        qtyChickenBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyChickenBrgrActionPerformed(evt);
            }
        });

        priceChickenBrgr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceChickenBrgr.setText("0");
        priceChickenBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceChickenBrgrActionPerformed(evt);
            }
        });

        unitZingerBrgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitZingerBrgr.setText("150");

        qtyZingerBrgr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyZingerBrgr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyZingerBrgr.setEnabled(false);
        qtyZingerBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyZingerBrgrActionPerformed(evt);
            }
        });

        priceZingerBrgr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceZingerBrgr.setText("0");
        priceZingerBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceZingerBrgrActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Burger/zingerBurger.png"))); // NOI18N

        chkZingerBrgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkZingerBrgr.setText("Zinger Burger");
        chkZingerBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkZingerBrgrActionPerformed(evt);
            }
        });

        chkCheeseBrgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkCheeseBrgr.setText("Cheese Burger");
        chkCheeseBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCheeseBrgrActionPerformed(evt);
            }
        });

        unitCheeseBrgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitCheeseBrgr.setText("130");

        priceCheeseBrgr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceCheeseBrgr.setText("0");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Burger/cheeseBurger.png"))); // NOI18N

        qtyCheeseBrgr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyCheeseBrgr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyCheeseBrgr.setEnabled(false);
        qtyCheeseBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyCheeseBrgrActionPerformed(evt);
            }
        });

        unitSpecialBrgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitSpecialBrgr.setText("180");

        priceSpecialBrgr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceSpecialBrgr.setText("0");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Burger/specialBurger.png"))); // NOI18N

        qtySpecialBrgr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtySpecialBrgr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtySpecialBrgr.setEnabled(false);
        qtySpecialBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtySpecialBrgrActionPerformed(evt);
            }
        });

        chkSpecialBrgr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkSpecialBrgr.setText("Special Burger");
        chkSpecialBrgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSpecialBrgrActionPerformed(evt);
            }
        });

        btnCalTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalTotal.setText("Calculate Total");
        btnCalTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalTotalActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        BtnMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnMenu.setText("Go to Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3)
                        .addGap(194, 194, 194)
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(chkSpecialBrgr)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkCheeseBrgr)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)))
                                .addGap(153, 153, 153)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(qtyCheeseBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(priceCheeseBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(qtySpecialBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(priceSpecialBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(qtyZingerBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(priceZingerBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkChickenBrgr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64)
                                .addComponent(unitChickenBrgr)
                                .addGap(66, 66, 66)
                                .addComponent(qtyChickenBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceChickenBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkZingerBrgr)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(unitZingerBrgr)
                                            .addComponent(unitSpecialBrgr)
                                            .addComponent(unitCheeseBrgr))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(chkChickenBrgr))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(priceChickenBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(unitChickenBrgr)
                                .addComponent(qtyChickenBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unitZingerBrgr)
                                    .addComponent(qtyZingerBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceZingerBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(chkZingerBrgr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chkCheeseBrgr)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitCheeseBrgr)
                            .addComponent(qtyCheeseBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceCheeseBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkSpecialBrgr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(unitSpecialBrgr)
                                .addComponent(qtySpecialBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceSpecialBrgr, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMenu)
                    .addComponent(btnClear))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkChickenBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkChickenBrgrActionPerformed
        if (chkChickenBrgr.isSelected()) {
            

            qtyChickenBrgr.setSelectedIndex(1);
            burgerList.add("Chicken Burger");
            chickenBurger = true;
            qtyChickenBrgr.enable(true);
            int a = Integer.parseInt(unitChickenBrgr.getText());
            int b = qtyChickenBrgr.getSelectedIndex();
            priceChickenBrgr.setText("" + (a * b));
                       
        } else {
            qtyChickenBrgr.setSelectedIndex(0);
            chickenBurger = false;
            burgerList.remove("Chicken Burger");
            priceChickenBrgr.setText("0");
            qtyChickenBrgr.enable(false);
        }

    }//GEN-LAST:event_chkChickenBrgrActionPerformed

    private void qtyChickenBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyChickenBrgrActionPerformed
        if (chkChickenBrgr.isSelected()) {

            int a = Integer.parseInt(unitChickenBrgr.getText());
            int b = qtyChickenBrgr.getSelectedIndex();
            qtyChk = b;

            priceChickenBrgr.setText("" + (a * b));
        } else {

        }

    }//GEN-LAST:event_qtyChickenBrgrActionPerformed

    private void qtyZingerBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyZingerBrgrActionPerformed

        if (chkZingerBrgr.isSelected()) {
            int a = Integer.parseInt(unitZingerBrgr.getText());
            int b = qtyZingerBrgr.getSelectedIndex();
            qtyZin = b;
            priceZingerBrgr.setText("" + (a * b));
        }
    }//GEN-LAST:event_qtyZingerBrgrActionPerformed

    private void chkZingerBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkZingerBrgrActionPerformed
        if (chkZingerBrgr.isSelected()) {
            qtyZingerBrgr.setSelectedIndex(1);
            burgerList.add("Zinger Burger");
            zingerBurger = true;
            qtyZingerBrgr.enable(true);
            int a = Integer.parseInt(unitZingerBrgr.getText());
            int b = qtyZingerBrgr.getSelectedIndex();
            priceZingerBrgr.setText("" + (a * b));
        } else {
            qtyZingerBrgr.setSelectedIndex(0);
            burgerList.remove("Zinger Burger");
            zingerBurger = false;
            priceZingerBrgr.setText("0");
            qtyZingerBrgr.enable(false);
        }


    }//GEN-LAST:event_chkZingerBrgrActionPerformed

    private void chkCheeseBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCheeseBrgrActionPerformed
        if (chkCheeseBrgr.isSelected()) {
            qtyCheeseBrgr.setSelectedIndex(1);
            burgerList.add("Cheese Burger");
            cheeseBurger = true;
            qtyCheeseBrgr.enable(true);
            int a = Integer.parseInt(unitCheeseBrgr.getText());
            int b = qtyCheeseBrgr.getSelectedIndex();
            priceCheeseBrgr.setText("" + (a * b));
        } else {
            qtyCheeseBrgr.setSelectedIndex(0);
            cheeseBurger = false;
            burgerList.remove("Cheese Burger");
            priceCheeseBrgr.setText("0");
            qtyCheeseBrgr.enable(false);
        }

    }//GEN-LAST:event_chkCheeseBrgrActionPerformed

    private void qtyCheeseBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyCheeseBrgrActionPerformed
        if (chkCheeseBrgr.isSelected()) {

            int a = Integer.parseInt(unitCheeseBrgr.getText());
            int b = qtyCheeseBrgr.getSelectedIndex();
            qtyChe = b;
            priceCheeseBrgr.setText("" + (a * b));
        }

    }//GEN-LAST:event_qtyCheeseBrgrActionPerformed

    private void qtySpecialBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtySpecialBrgrActionPerformed
        if (chkSpecialBrgr.isSelected()) {

            int a = Integer.parseInt(unitSpecialBrgr.getText());
            int b = qtySpecialBrgr.getSelectedIndex();
            qtySp = b;
            priceSpecialBrgr.setText("" + (a * b));
        }

    }//GEN-LAST:event_qtySpecialBrgrActionPerformed

    private void chkSpecialBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSpecialBrgrActionPerformed
        if (chkSpecialBrgr.isSelected()) {
            qtySpecialBrgr.setSelectedIndex(1);
            burgerList.add("Special Burger");

            specialBurger = true;
            qtySpecialBrgr.enable(true);
            int a = Integer.parseInt(unitSpecialBrgr.getText());
            int b = qtySpecialBrgr.getSelectedIndex() + 1;
            priceSpecialBrgr.setText("" + (a * b));
        } else {
            qtySpecialBrgr.setSelectedIndex(0);
            specialBurger = false;
            burgerList.remove("Special Burger");
            priceSpecialBrgr.setText("0");
            qtySpecialBrgr.enable(false);
        }

    }//GEN-LAST:event_chkSpecialBrgrActionPerformed

    private void priceZingerBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceZingerBrgrActionPerformed

    }//GEN-LAST:event_priceZingerBrgrActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        chkChickenBrgr.setSelected(false);
        priceChickenBrgr.setText("0");
        qtyChickenBrgr.setSelectedIndex(0);
        qtyChickenBrgr.enable(false);

        chkZingerBrgr.setSelected(false);
        priceZingerBrgr.setText("0");
        qtyZingerBrgr.setSelectedIndex(0);
        qtyZingerBrgr.enable(false);

        chkCheeseBrgr.setSelected(false);
        priceCheeseBrgr.setText("0");
        qtyCheeseBrgr.setSelectedIndex(0);
        qtyCheeseBrgr.enable(false);

        chkSpecialBrgr.setSelected(false);
        priceSpecialBrgr.setText("0");
        qtySpecialBrgr.setSelectedIndex(0);
        qtySpecialBrgr.enable(false);

        txtTotal.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        this.setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void btnCalTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalTotalActionPerformed

        int a = Integer.parseInt(priceChickenBrgr.getText());
        int b = Integer.parseInt(priceZingerBrgr.getText());
        int c = Integer.parseInt(priceCheeseBrgr.getText());
        int d = Integer.parseInt(priceSpecialBrgr.getText());

        int total = a + b + c + d;
        txtTotal.setText("" + total);

        //================== DATABASE CONNECTION================
        int p = burgerList.indexOf("Chicken Burger");
        int q = burgerList.indexOf("Zinger Burger");
        int x = burgerList.indexOf("Cheese Burger");
        int y = burgerList.indexOf("Special Burger");
        String chk = "";
        String zin ="";
        String che="";
        String sp="";
        if (chickenBurger == true) {
            chk = (qtyChk + " " + burgerList.get(p)+" , ");
        }
        if (zingerBurger == true) {
            zin = (qtyZin + " " + burgerList.get(q)+" , ");
        }
        if (cheeseBurger == true) {
            che = (qtyChe + " " + burgerList.get(x)+" , ");
        }
        if (specialBurger == true) {
            sp = (qtySp + " " + burgerList.get(y)+",");
         }
      
        String burgers = chk + zin + che + sp;
//        System.out.println(burgers);

        // set values in database
        String addburger = "update Burger set items = '" + burgers + "' where orderNo = '" + Orderno + "'";
        String addTotal = "update Burger set Total = '" + total + "' where orderNo = '" + Orderno + "'";
        try {

            stmt = con.createStatement();
            stmt.executeUpdate(addburger);
            stmt.executeUpdate(addTotal);
            int ch = JOptionPane.showConfirmDialog(this, "Generate Bill?");
            if(ch==0){
                Bill bill= new Bill();
                bill.setVisible(true);
                this.setVisible(false);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Burgers.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btnCalTotalActionPerformed

    private void priceChickenBrgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceChickenBrgrActionPerformed
       
    }//GEN-LAST:event_priceChickenBrgrActionPerformed

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
            java.util.logging.Logger.getLogger(Burgers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Burgers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Burgers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Burgers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Burgers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton btnCalTotal;
    private javax.swing.JButton btnClear;
    private javax.swing.JCheckBox chkCheeseBrgr;
    private javax.swing.JCheckBox chkChickenBrgr;
    private javax.swing.JCheckBox chkSpecialBrgr;
    private javax.swing.JCheckBox chkZingerBrgr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField priceCheeseBrgr;
    private javax.swing.JTextField priceChickenBrgr;
    private javax.swing.JTextField priceSpecialBrgr;
    private javax.swing.JTextField priceZingerBrgr;
    private javax.swing.JComboBox<String> qtyCheeseBrgr;
    private javax.swing.JComboBox<String> qtyChickenBrgr;
    private javax.swing.JComboBox<String> qtySpecialBrgr;
    private javax.swing.JComboBox<String> qtyZingerBrgr;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel unitCheeseBrgr;
    private javax.swing.JLabel unitChickenBrgr;
    private javax.swing.JLabel unitSpecialBrgr;
    private javax.swing.JLabel unitZingerBrgr;
    // End of variables declaration//GEN-END:variables
}
