
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


public class Dessert extends javax.swing.JFrame {

     ConnectionToDB conObj = new ConnectionToDB();
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet res;
    Connection con;
    String Orderno = null;
    ArrayList<String> dessertList = new ArrayList<>();
    int qtyCup = 0;
    int qtyDon = 0;
    int qtyIce = 0;
    int qtyLava = 0;

    boolean cupcake = false;
    boolean donut = false;
    boolean icecream = false;
    boolean lavacake = false;

    
    public Dessert() {
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
            Logger.getLogger(Dessert.class.getName()).log(Level.SEVERE, null, e);
        }

        String setOrder = "insert into Dessert(orderNo) values('" + Orderno + "')";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(setOrder);
        } catch (SQLException e) {

            Logger.getLogger(Dessert.class.getName()).log(Level.SEVERE, null, e);
        }
    }




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
        unitCupCake = new javax.swing.JLabel();
        BtnMenu = new javax.swing.JButton();
        qtyCupCake = new javax.swing.JComboBox<>();
        priceCupCake = new javax.swing.JTextField();
        unitDonuts = new javax.swing.JLabel();
        qtyDonuts = new javax.swing.JComboBox<>();
        priceDonuts = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        chkDonuts = new javax.swing.JCheckBox();
        chkIceCream = new javax.swing.JCheckBox();
        unitIceCream = new javax.swing.JLabel();
        priceIceCream = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        qtyIceCream = new javax.swing.JComboBox<>();
        unitLavaCake = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        priceLavaCake = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        chkCupCake = new javax.swing.JCheckBox();
        qtyLavaCake = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        chkLavaCake = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/dessert/dessertPic.png"))); // NOI18N

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

        unitCupCake.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitCupCake.setText("120");

        BtnMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnMenu.setText("Go to Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        qtyCupCake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyCupCake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyCupCake.setEnabled(false);
        qtyCupCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyCupCakeActionPerformed(evt);
            }
        });

        priceCupCake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceCupCake.setText("0");

        unitDonuts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitDonuts.setText("150");

        qtyDonuts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyDonuts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyDonuts.setEnabled(false);
        qtyDonuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyDonutsActionPerformed(evt);
            }
        });

        priceDonuts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceDonuts.setText("0");
        priceDonuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceDonutsActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/dessert/donuts.png"))); // NOI18N

        chkDonuts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkDonuts.setText("Donuts");
        chkDonuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDonutsActionPerformed(evt);
            }
        });

        chkIceCream.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkIceCream.setText("Ice-cream");
        chkIceCream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIceCreamActionPerformed(evt);
            }
        });

        unitIceCream.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitIceCream.setText("100");

        priceIceCream.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceIceCream.setText("0");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/dessert/icecream.png"))); // NOI18N

        qtyIceCream.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyIceCream.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyIceCream.setEnabled(false);
        qtyIceCream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyIceCreamActionPerformed(evt);
            }
        });

        unitLavaCake.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitLavaCake.setText("180");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/dessert/cup cakes.png"))); // NOI18N

        priceLavaCake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceLavaCake.setText("0");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/dessert/lava cake.png"))); // NOI18N

        chkCupCake.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkCupCake.setText("Cup Cakes");
        chkCupCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCupCakeActionPerformed(evt);
            }
        });

        qtyLavaCake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyLavaCake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyLavaCake.setEnabled(false);
        qtyLavaCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLavaCakeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item");

        chkLavaCake.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkLavaCake.setText("Lava Cake");
        chkLavaCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLavaCakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(chkLavaCake)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkIceCream)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addGap(98, 98, 98)
                        .addComponent(unitLavaCake))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkDonuts)
                            .addComponent(chkCupCake))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(unitDonuts)
                            .addComponent(unitCupCake)
                            .addComponent(unitIceCream))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(qtyCupCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(priceCupCake, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qtyLavaCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyDonuts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceDonuts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceIceCream, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLavaCake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(chkCupCake))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unitCupCake)
                                    .addComponent(qtyCupCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceCupCake, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unitDonuts)
                                    .addComponent(qtyDonuts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceDonuts, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(chkDonuts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chkIceCream)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitIceCream)
                            .addComponent(qtyIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkLavaCake, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(unitLavaCake)
                                .addComponent(qtyLavaCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceLavaCake, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMenu)
                    .addComponent(btnClear))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalTotalActionPerformed

        int a = Integer.parseInt(priceCupCake.getText());
        int b = Integer.parseInt(priceDonuts.getText());
        int c = Integer.parseInt(priceIceCream.getText());
        int d = Integer.parseInt(priceLavaCake.getText());

        int total = a+b+c+d ;
        txtTotal.setText(""+total);

          //================== DATABASE CONNECTION================
         int p = dessertList.indexOf("Cup Cake");
        int q = dessertList.indexOf("Donut");
        int x = dessertList.indexOf("Ice-cream");
        int y = dessertList.indexOf("Lava Cake");
        String cup = "";
        String don ="";
        String ice="";
        String lava="";
        if (cupcake == true) {
            cup = (qtyCup + " " + dessertList.get(p)+" , ");
        }
        if (donut == true) {
            don = (qtyDon + " " + dessertList.get(q)+" , ");
        }
        if (icecream == true) {
            ice = (qtyIce + " " + dessertList.get(x)+" , ");
        }
        if (lavacake == true) {
            lava = (qtyLava + " " + dessertList.get(y)+" ,");
        }
        String desserts = cup + don + ice + lava ;
//        System.out.println(desserts);

        // set values in database
        String adddessert = "update Dessert set items = '" + desserts + "' where orderNo = '" + Orderno + "'";
        String addTotal = "update Dessert set Total = '" + total + "' where orderNo = '" + Orderno + "'";
        try {

            stmt = con.createStatement();
            stmt.executeUpdate(adddessert);
            stmt.executeUpdate(addTotal);
//            JOptionPane.showMessageDialog(null, "mobarak ho bahiii....");
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

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        chkCupCake.setSelected(false);
        priceCupCake.setText("0");
        qtyCupCake.setSelectedIndex(0);
        qtyCupCake.enable(false);

        chkDonuts.setSelected(false);
        priceDonuts.setText("0");
        qtyDonuts.setSelectedIndex(0);
        qtyDonuts.enable(false);

        chkIceCream.setSelected(false);
        priceIceCream.setText("0");
        qtyIceCream.setSelectedIndex(0);
        qtyIceCream.enable(false);

        chkLavaCake.setSelected(false);
        priceLavaCake.setText("0");
        qtyLavaCake.setSelectedIndex(0);
        qtyLavaCake.enable(false);

        txtTotal.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        this.setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void qtyCupCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyCupCakeActionPerformed
        if(chkCupCake.isSelected()){
            int a = Integer.parseInt(unitCupCake.getText());
            int b = qtyCupCake.getSelectedIndex();
            qtyCup = b;
            priceCupCake.setText(""+(a*b));
        }
    }//GEN-LAST:event_qtyCupCakeActionPerformed

    private void qtyDonutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyDonutsActionPerformed

        if(chkDonuts.isSelected()){
            int a = Integer.parseInt(unitDonuts.getText());
            int b = qtyDonuts.getSelectedIndex();
            qtyDon = b;
            priceDonuts.setText(""+(a*b));
        }
    }//GEN-LAST:event_qtyDonutsActionPerformed

    private void priceDonutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceDonutsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceDonutsActionPerformed

    private void chkDonutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDonutsActionPerformed
        if(chkDonuts.isSelected()){
             qtyDonuts.setSelectedIndex(1);
            dessertList.add("Donut");
            donut = true;
            qtyDonuts.enable(true);
            int a = Integer.parseInt(unitDonuts.getText());
            int b = qtyDonuts.getSelectedIndex();
            priceDonuts.setText(""+(a*b));
        }
        else {
             qtyDonuts.setSelectedIndex(0);
            dessertList.remove("Donut");
            donut = false;
            priceDonuts.setText("0");
            qtyDonuts.enable(false);
        }

    }//GEN-LAST:event_chkDonutsActionPerformed

    private void chkIceCreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIceCreamActionPerformed
        if(chkIceCream.isSelected()){
             qtyIceCream.setSelectedIndex(1);
            dessertList.add("Ice-cream");
            icecream = true;
            qtyIceCream.enable(true);
            int a = Integer.parseInt(unitIceCream.getText());
            int b = qtyIceCream.getSelectedIndex();
            priceIceCream.setText(""+(a*b));
        }
        else {
             qtyIceCream.setSelectedIndex(0);
            dessertList.remove("Ice-cream");
            icecream = false;
            priceIceCream.setText("0");
            qtyIceCream.enable(false);
        }
    }//GEN-LAST:event_chkIceCreamActionPerformed

    private void qtyIceCreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyIceCreamActionPerformed
        if(chkIceCream.isSelected()){
            int a = Integer.parseInt(unitIceCream.getText());
            int b = qtyIceCream.getSelectedIndex();
            qtyIce = b;
            priceIceCream.setText(""+(a*b));
        }
    }//GEN-LAST:event_qtyIceCreamActionPerformed

    private void chkCupCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCupCakeActionPerformed
        if(chkCupCake.isSelected()){
             qtyCupCake.setSelectedIndex(1);
            dessertList.add("Cup Cake");
            cupcake = true;
            qtyCupCake.enable(true);
            int a = Integer.parseInt(unitCupCake.getText());
            int b = qtyCupCake.getSelectedIndex();
            priceCupCake.setText(""+(a*b));
        }
        else {
             qtyCupCake.setSelectedIndex(0);
            dessertList.remove("Cup Cake");
            cupcake = false;
            priceCupCake.setText("0");
            qtyCupCake.enable(false);
        }
    }//GEN-LAST:event_chkCupCakeActionPerformed

    private void qtyLavaCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLavaCakeActionPerformed
        if(chkLavaCake.isSelected()){
            int a = Integer.parseInt(unitLavaCake.getText());
            int b = qtyLavaCake.getSelectedIndex();
            qtyLava = b;
            priceLavaCake.setText(""+(a*b));
        }
    }//GEN-LAST:event_qtyLavaCakeActionPerformed

    private void chkLavaCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLavaCakeActionPerformed
        if(chkLavaCake.isSelected()){
             qtyLavaCake.setSelectedIndex(1);
            dessertList.add("Lava Cake");
            lavacake = true;
            qtyLavaCake.enable(true);
            int a = Integer.parseInt(unitLavaCake.getText());
            int b = qtyLavaCake.getSelectedIndex();
            priceLavaCake.setText(""+(a*b));
        }
        else {
             qtyLavaCake.setSelectedIndex(0);
            dessertList.remove("Lava Cake");
            lavacake = false;
            priceLavaCake.setText("0");
            qtyLavaCake.enable(false);
        }
    }//GEN-LAST:event_chkLavaCakeActionPerformed

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
            java.util.logging.Logger.getLogger(Dessert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dessert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dessert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dessert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dessert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton btnCalTotal;
    private javax.swing.JButton btnClear;
    private javax.swing.JCheckBox chkCupCake;
    private javax.swing.JCheckBox chkDonuts;
    private javax.swing.JCheckBox chkIceCream;
    private javax.swing.JCheckBox chkLavaCake;
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
    private javax.swing.JTextField priceCupCake;
    private javax.swing.JTextField priceDonuts;
    private javax.swing.JTextField priceIceCream;
    private javax.swing.JTextField priceLavaCake;
    private javax.swing.JComboBox<String> qtyCupCake;
    private javax.swing.JComboBox<String> qtyDonuts;
    private javax.swing.JComboBox<String> qtyIceCream;
    private javax.swing.JComboBox<String> qtyLavaCake;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel unitCupCake;
    private javax.swing.JLabel unitDonuts;
    private javax.swing.JLabel unitIceCream;
    private javax.swing.JLabel unitLavaCake;
    // End of variables declaration//GEN-END:variables
}
