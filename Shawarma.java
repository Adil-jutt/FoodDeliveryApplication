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

public class Shawarma extends javax.swing.JFrame {

    ConnectionToDB conObj = new ConnectionToDB();
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet res;
    Connection con;
    String Orderno = "";
    ArrayList<String> shawarmaList = new ArrayList<>();
    int qtyChk = 0;
    int qtyBeef = 0;
    int qtyVeg = 0;
    int qtyKeema = 0;

    boolean chickenShawarma = false;
    boolean beefShawarma = false;
    boolean vegShawarma = false;
    boolean keemaShawarma = false;

    public Shawarma() {
        conObj.EstablishCon();
        con = conObj.EstablishCon();
        initComponents();
        this.setLocation(500, 0);
        autoID();
    }

    public final void autoID() {

        String query = "select max(orderNo) from customerInfo";

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                Orderno = rs.getString(1);
//                System.out.println(Orderno);
            }
        } catch (SQLException e) {
            Logger.getLogger(Shawarma.class.getName()).log(Level.SEVERE, null, e);
        }

        String setOrder = "insert into Shawarma(orderNo) values('" + Orderno + "')";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(setOrder);
        } catch (SQLException e) {

            Logger.getLogger(Shawarma.class.getName()).log(Level.SEVERE, null, e);
        }
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
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCalTotal = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnClear = new javax.swing.JButton();
        unitChickenRoll = new javax.swing.JLabel();
        BtnMenu = new javax.swing.JButton();
        qtyChickenRoll = new javax.swing.JComboBox<>();
        priceChickenRoll = new javax.swing.JTextField();
        unitBeefRoll = new javax.swing.JLabel();
        qtyBeefRoll = new javax.swing.JComboBox<>();
        priceBeefRoll = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        chkBeefRoll = new javax.swing.JCheckBox();
        chkVegRoll = new javax.swing.JCheckBox();
        unitVegRoll = new javax.swing.JLabel();
        priceVegRoll = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        qtyVegRoll = new javax.swing.JComboBox<>();
        unitKeemaRoll = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        priceKeemaRoll = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        chkChickenRoll = new javax.swing.JCheckBox();
        qtyKeemaRoll = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        chkKeemaRoll = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/shawarma/ShawarmaPic.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Unit Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Qty");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price");

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

        unitChickenRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitChickenRoll.setText("120");

        BtnMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnMenu.setText("Go to Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        qtyChickenRoll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyChickenRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyChickenRoll.setEnabled(false);
        qtyChickenRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyChickenRollActionPerformed(evt);
            }
        });

        priceChickenRoll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceChickenRoll.setText("0");
        priceChickenRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceChickenRollActionPerformed(evt);
            }
        });

        unitBeefRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitBeefRoll.setText("150");

        qtyBeefRoll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyBeefRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyBeefRoll.setEnabled(false);
        qtyBeefRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyBeefRollActionPerformed(evt);
            }
        });

        priceBeefRoll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceBeefRoll.setText("0");
        priceBeefRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBeefRollActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/shawarma/beef Shawarma.png"))); // NOI18N

        chkBeefRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkBeefRoll.setText("Beef Shawarma");
        chkBeefRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBeefRollActionPerformed(evt);
            }
        });

        chkVegRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkVegRoll.setText("Veg Shawarma");
        chkVegRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVegRollActionPerformed(evt);
            }
        });

        unitVegRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitVegRoll.setText("100");

        priceVegRoll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceVegRoll.setText("0");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/shawarma/vegShawarma.png"))); // NOI18N

        qtyVegRoll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyVegRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyVegRoll.setEnabled(false);
        qtyVegRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyVegRollActionPerformed(evt);
            }
        });

        unitKeemaRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitKeemaRoll.setText("180");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/shawarma/chicken Shawarma.png"))); // NOI18N

        priceKeemaRoll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceKeemaRoll.setText("0");
        priceKeemaRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceKeemaRollActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/shawarma/keema shawarma.png"))); // NOI18N

        chkChickenRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkChickenRoll.setText("Chicken Shawarna");
        chkChickenRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChickenRollActionPerformed(evt);
            }
        });

        qtyKeemaRoll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyKeemaRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyKeemaRoll.setEnabled(false);
        qtyKeemaRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyKeemaRollActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item");

        chkKeemaRoll.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkKeemaRoll.setText("Keema Shawarma");
        chkKeemaRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKeemaRollActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkVegRoll)
                            .addComponent(chkBeefRoll))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkKeemaRoll)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkChickenRoll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unitChickenRoll)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qtyChickenRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceChickenRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qtyKeemaRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceKeemaRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qtyBeefRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qtyVegRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceVegRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(unitVegRoll)
                    .addComponent(unitBeefRoll)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unitKeemaRoll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priceBeefRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addComponent(chkChickenRoll))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitChickenRoll)
                            .addComponent(qtyChickenRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceChickenRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unitBeefRoll)
                                    .addComponent(qtyBeefRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceBeefRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chkBeefRoll)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(unitVegRoll)
                        .addComponent(qtyVegRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceVegRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkVegRoll, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitKeemaRoll)
                            .addComponent(qtyKeemaRoll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceKeemaRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chkKeemaRoll)
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(BtnMenu))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalTotalActionPerformed

        int a = Integer.parseInt(priceChickenRoll.getText());
        int b = Integer.parseInt(priceBeefRoll.getText());
        int c = Integer.parseInt(priceVegRoll.getText());
        int d = Integer.parseInt(priceKeemaRoll.getText());

        int total = a + b + c + d;
        txtTotal.setText("" + total);

        //================== DATABASE CONNECTION================
        int p = shawarmaList.indexOf("Chicken Shawarma");
        int q = shawarmaList.indexOf("Beef Shawarma");
        int x = shawarmaList.indexOf("Veg Shawarma");
        int y = shawarmaList.indexOf("Keema Shawarma");
        String chk = "";
        String beef = "";
        String veg = "";
        String keema = "";
        if (chickenShawarma == true) {
            chk = (qtyChk + " " + shawarmaList.get(p) + " , ");
        }
        if (beefShawarma == true) {
            beef = (qtyBeef + " " + shawarmaList.get(q) + " , ");
        }
        if (vegShawarma == true) {
            veg = (qtyVeg + " " + shawarmaList.get(x) + " , ");
        }
        if (keemaShawarma == true) {
            keema = (qtyKeema + " " + shawarmaList.get(y) + " , ");
        }

        String shawarmas = chk + beef + veg + keema;
//        System.out.println(shawarmas);

        // set values in database
        String addshawarma = "update Shawarma set items = '" + shawarmas + "' where orderNo = '" + Orderno + "'";
        String addTotal = "update Shawarma set Total = '" + total + "' where orderNo = '" + Orderno + "'";
        try {

            stmt = con.createStatement();
            stmt.executeUpdate(addshawarma);
            stmt.executeUpdate(addTotal);
//            JOptionPane.showMessageDialog(null, "mobarak ho bahiii....");
            int ch = JOptionPane.showConfirmDialog(this, "Generate Bill?");
            if (ch == 0) {
                Bill bill = new Bill();
                bill.setVisible(true);
                this.setVisible(false);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Burgers.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnCalTotalActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        chkChickenRoll.setSelected(false);
        priceChickenRoll.setText("0");
        qtyChickenRoll.setSelectedIndex(0);
        qtyChickenRoll.enable(false);

        chkBeefRoll.setSelected(false);
        priceBeefRoll.setText("0");
        qtyBeefRoll.setSelectedIndex(0);
        qtyBeefRoll.enable(false);

        chkVegRoll.setSelected(false);
        priceVegRoll.setText("0");
        qtyVegRoll.setSelectedIndex(0);
        qtyVegRoll.enable(false);

        chkKeemaRoll.setSelected(false);
        priceKeemaRoll.setText("0");
        qtyKeemaRoll.setSelectedIndex(0);
        qtyKeemaRoll.enable(false);

        txtTotal.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        this.setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void qtyChickenRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyChickenRollActionPerformed
        if (chkChickenRoll.isSelected()) {
            int a = Integer.parseInt(unitChickenRoll.getText());
            int b = qtyChickenRoll.getSelectedIndex();
            qtyChk = b;
            priceChickenRoll.setText("" + (a * b));
        }
    }//GEN-LAST:event_qtyChickenRollActionPerformed

    private void qtyBeefRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyBeefRollActionPerformed

        if (chkBeefRoll.isSelected()) {
            int a = Integer.parseInt(unitBeefRoll.getText());
            int b = qtyBeefRoll.getSelectedIndex();
            qtyBeef = b;
            priceBeefRoll.setText("" + (a * b));
        }
    }//GEN-LAST:event_qtyBeefRollActionPerformed

    private void priceBeefRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceBeefRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceBeefRollActionPerformed

    private void chkBeefRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBeefRollActionPerformed
        if (chkBeefRoll.isSelected()) {
            qtyBeefRoll.setSelectedIndex(1);
            shawarmaList.add("Beef Shawarma");
            beefShawarma = true;
            qtyBeefRoll.enable(true);
            int a = Integer.parseInt(unitBeefRoll.getText());
            int b = qtyBeefRoll.getSelectedIndex();
            priceBeefRoll.setText("" + (a * b));
        } else {
            qtyBeefRoll.setSelectedIndex(0);
            shawarmaList.remove("Beef Shawarma");
            beefShawarma = false;
            priceBeefRoll.setText("0");
            qtyBeefRoll.enable(false);
        }

    }//GEN-LAST:event_chkBeefRollActionPerformed

    private void chkVegRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVegRollActionPerformed
        if (chkVegRoll.isSelected()) {

            qtyVegRoll.setSelectedIndex(1);
            shawarmaList.add("Veg Shawarma");
            vegShawarma = true;

            qtyVegRoll.enable(true);
            int a = Integer.parseInt(unitVegRoll.getText());
            int b = qtyVegRoll.getSelectedIndex();
            priceVegRoll.setText("" + (a * b));
        } else {
            qtyVegRoll.setSelectedIndex(0);
            vegShawarma = false;
            shawarmaList.remove("Veg Shawarma");
            priceVegRoll.setText("0");
            qtyVegRoll.enable(false);
        }
    }//GEN-LAST:event_chkVegRollActionPerformed

    private void qtyVegRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyVegRollActionPerformed
        if (chkVegRoll.isSelected()) {
            int a = Integer.parseInt(unitVegRoll.getText());
            int b = qtyVegRoll.getSelectedIndex();
            qtyVeg = b;
            priceVegRoll.setText("" + (a * b));
        }
    }//GEN-LAST:event_qtyVegRollActionPerformed

    private void chkChickenRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkChickenRollActionPerformed
        if (chkChickenRoll.isSelected()) {
            qtyChickenRoll.setSelectedIndex(1);
            shawarmaList.add("Chicken Shawarma");
            chickenShawarma = true;
            qtyChickenRoll.enable(true);
            int a = Integer.parseInt(unitChickenRoll.getText());
            int b = qtyChickenRoll.getSelectedIndex();
            priceChickenRoll.setText("" + (a * b));
        } else {
            qtyChickenRoll.setSelectedIndex(0);
            chickenShawarma = false;
            shawarmaList.remove("Chicken Shawarma");
            priceChickenRoll.setText("0");
            qtyChickenRoll.enable(false);
        }
    }//GEN-LAST:event_chkChickenRollActionPerformed

    private void qtyKeemaRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyKeemaRollActionPerformed
        if (chkKeemaRoll.isSelected()) {
            int a = Integer.parseInt(unitKeemaRoll.getText());
            int b = qtyKeemaRoll.getSelectedIndex();
            qtyKeema = b;
            priceKeemaRoll.setText("" + (a * b));
        }
    }//GEN-LAST:event_qtyKeemaRollActionPerformed

    private void chkKeemaRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKeemaRollActionPerformed
        if (chkKeemaRoll.isSelected()) {

            qtyKeemaRoll.setSelectedIndex(1);
            shawarmaList.add("Keema Shawarma");
            keemaShawarma = true;
            qtyKeemaRoll.enable(true);
            int a = Integer.parseInt(unitKeemaRoll.getText());
            int b = qtyKeemaRoll.getSelectedIndex();
            priceKeemaRoll.setText("" + (a * b));
        } else {
            qtyKeemaRoll.setSelectedIndex(0);
            keemaShawarma = false;
            shawarmaList.remove("Keema Shawarma");
            priceKeemaRoll.setText("0");
            qtyKeemaRoll.enable(false);
        }
    }//GEN-LAST:event_chkKeemaRollActionPerformed

    private void priceChickenRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceChickenRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceChickenRollActionPerformed

    private void priceKeemaRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceKeemaRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceKeemaRollActionPerformed

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
            java.util.logging.Logger.getLogger(Shawarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shawarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shawarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shawarma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shawarma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton btnCalTotal;
    private javax.swing.JButton btnClear;
    private javax.swing.JCheckBox chkBeefRoll;
    private javax.swing.JCheckBox chkChickenRoll;
    private javax.swing.JCheckBox chkKeemaRoll;
    private javax.swing.JCheckBox chkVegRoll;
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
    private javax.swing.JTextField priceBeefRoll;
    private javax.swing.JTextField priceChickenRoll;
    private javax.swing.JTextField priceKeemaRoll;
    private javax.swing.JTextField priceVegRoll;
    private javax.swing.JComboBox<String> qtyBeefRoll;
    private javax.swing.JComboBox<String> qtyChickenRoll;
    private javax.swing.JComboBox<String> qtyKeemaRoll;
    private javax.swing.JComboBox<String> qtyVegRoll;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel unitBeefRoll;
    private javax.swing.JLabel unitChickenRoll;
    private javax.swing.JLabel unitKeemaRoll;
    private javax.swing.JLabel unitVegRoll;
    // End of variables declaration//GEN-END:variables
}