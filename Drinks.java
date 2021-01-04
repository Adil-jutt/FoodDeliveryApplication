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

public final class Drinks extends javax.swing.JFrame {

    ConnectionToDB conObj = new ConnectionToDB();
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet res;
    Connection con;
    String Orderno = null;
    ArrayList<String> drinksList = new ArrayList<>();
    int qtyShk = 0;
    int qtySoft = 0;
    int qtyPin = 0;
    int qtyLas = 0;

    boolean fruitshakes = false;
    boolean softdrinks = false;
    boolean pinacolada = false;
    boolean mangolassi = false;

    public Drinks() {
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
            Logger.getLogger(Drinks.class.getName()).log(Level.SEVERE, null, e);
        }

        String setOrder = "insert into Drinks(orderNo) values('" + Orderno + "')";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(setOrder);
        } catch (SQLException e) {

            Logger.getLogger(Drinks.class.getName()).log(Level.SEVERE, null, e);
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
        unitShakes = new javax.swing.JLabel();
        BtnMenu = new javax.swing.JButton();
        qtyShakes = new javax.swing.JComboBox<>();
        priceShakes = new javax.swing.JTextField();
        unitSoftDrinks = new javax.swing.JLabel();
        qtySoftDrinks = new javax.swing.JComboBox<>();
        priceSoftDrinks = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        chkSoftDrinks = new javax.swing.JCheckBox();
        chkPina = new javax.swing.JCheckBox();
        unitPina = new javax.swing.JLabel();
        pricePina = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        qtyPina = new javax.swing.JComboBox<>();
        unitLassi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        priceLassi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        chkShakes = new javax.swing.JCheckBox();
        qtyLassi = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        chkLassi = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/drinks/drinksPic.png"))); // NOI18N

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

        unitShakes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitShakes.setText("120");

        BtnMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnMenu.setText("Go to Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        qtyShakes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyShakes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyShakes.setEnabled(false);
        qtyShakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyShakesActionPerformed(evt);
            }
        });

        priceShakes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceShakes.setText("0");
        priceShakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceShakesActionPerformed(evt);
            }
        });

        unitSoftDrinks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitSoftDrinks.setText("60");

        qtySoftDrinks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtySoftDrinks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtySoftDrinks.setEnabled(false);
        qtySoftDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtySoftDrinksActionPerformed(evt);
            }
        });

        priceSoftDrinks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceSoftDrinks.setText("0");
        priceSoftDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceSoftDrinksActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/drinks/soft drinks.png"))); // NOI18N

        chkSoftDrinks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkSoftDrinks.setText("Soft Drinks");
        chkSoftDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSoftDrinksActionPerformed(evt);
            }
        });

        chkPina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkPina.setText("Pinacolada");
        chkPina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPinaActionPerformed(evt);
            }
        });

        unitPina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitPina.setText("180");

        pricePina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pricePina.setText("0");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/drinks/pinacolada.png"))); // NOI18N

        qtyPina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyPina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyPina.setEnabled(false);
        qtyPina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyPinaActionPerformed(evt);
            }
        });

        unitLassi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitLassi.setText("150");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/drinks/fruit shakes.png"))); // NOI18N

        priceLassi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceLassi.setText("0");
        priceLassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceLassiActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/drinks/MangoLassi.png"))); // NOI18N

        chkShakes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkShakes.setText("Fruit Drinks");
        chkShakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShakesActionPerformed(evt);
            }
        });

        qtyLassi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyLassi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyLassi.setEnabled(false);
        qtyLassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyLassiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item");

        chkLassi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkLassi.setText("Mango Lassi");
        chkLassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLassiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addGap(166, 166, 166)
                .addComponent(jLabel4)
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addGap(89, 89, 89)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkShakes)
                            .addComponent(chkSoftDrinks))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(unitPina))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(unitShakes)
                                    .addComponent(unitSoftDrinks))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtyPina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtySoftDrinks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyShakes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceSoftDrinks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceShakes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricePina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkPina)
                                    .addComponent(chkLassi))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel13)
                                        .addGap(79, 79, 79)
                                        .addComponent(unitLassi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(qtyLassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(priceLassi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(qtyShakes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceShakes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(unitShakes))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtySoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceSoftDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitSoftDrinks)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(chkShakes)))
                        .addGap(23, 23, 23)
                        .addComponent(chkSoftDrinks))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitPina)
                            .addComponent(qtyPina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricePina, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitLassi)
                            .addComponent(qtyLassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLassi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(chkPina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkLassi)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMenu)
                    .addComponent(btnClear))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalTotalActionPerformed

        int a = Integer.parseInt(priceShakes.getText());
        int b = Integer.parseInt(priceSoftDrinks.getText());
        int c = Integer.parseInt(pricePina.getText());
        int d = Integer.parseInt(priceLassi.getText());

        int total = a + b + c + d;
        txtTotal.setText("" + total);

        //================== DATABASE CONNECTION================
        int p = drinksList.indexOf("Fruit Shake");
        int q = drinksList.indexOf("Soft Drink");
        int x = drinksList.indexOf("Pinacolada");
        int y = drinksList.indexOf("Mango Lassi");
        String shk = "";
        String soft = "";
        String pina = "";
        String lassi = "";
        if (fruitshakes == true) {
            shk = (qtyShk + " " + drinksList.get(p) + " , ");
        }
        if (softdrinks == true) {
            soft = (qtySoft + " " + drinksList.get(q) + " , ");
        }
        if (pinacolada == true) {
            pina = (qtyPin + " " + drinksList.get(x) + " , ");
        }
        if (mangolassi == true) {
            lassi = (qtyLas + " " + drinksList.get(y) + " , ");
        }

        String drinks = shk + soft + pina + lassi;
//        System.out.println(drinks);

        // set values in database
        String adddrink = "update Drinks set items = '" + drinks + "' where orderNo = '" + Orderno + "'";
        String addTotal = "update Drinks set Total = '" + total + "' where orderNo = '" + Orderno + "'";
        try {

            stmt = con.createStatement();
            stmt.executeUpdate(adddrink);
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
        chkShakes.setSelected(false);
        priceShakes.setText("0");
        qtyShakes.setSelectedIndex(0);
        qtyShakes.enable(false);

        chkSoftDrinks.setSelected(false);
        priceSoftDrinks.setText("0");
        qtySoftDrinks.setSelectedIndex(0);
        qtySoftDrinks.enable(false);

        chkPina.setSelected(false);
        pricePina.setText("0");
        qtyPina.setSelectedIndex(0);
        qtyPina.enable(false);

        chkLassi.setSelected(false);
        priceLassi.setText("0");
        qtyLassi.setSelectedIndex(0);
        qtyLassi.enable(false);

        txtTotal.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        this.setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void qtyShakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyShakesActionPerformed
        if (chkShakes.isSelected()) {
            int a = Integer.parseInt(unitShakes.getText());
            int b = qtyShakes.getSelectedIndex();
            qtyShk = b;
            priceShakes.setText("" + (a * b));
        }
    }//GEN-LAST:event_qtyShakesActionPerformed

    private void qtySoftDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtySoftDrinksActionPerformed

        if (chkSoftDrinks.isSelected()) {
            int a = Integer.parseInt(unitSoftDrinks.getText());
            int b = qtySoftDrinks.getSelectedIndex();
            qtySoft = b;
            priceSoftDrinks.setText("" + (a * b));
        }
    }//GEN-LAST:event_qtySoftDrinksActionPerformed

    private void priceSoftDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceSoftDrinksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceSoftDrinksActionPerformed

    private void chkSoftDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSoftDrinksActionPerformed
        if (chkSoftDrinks.isSelected()) {
            qtySoftDrinks.setSelectedIndex(1);
            drinksList.add("Soft Drink");
            softdrinks = true;
            qtySoftDrinks.enable(true);
            int a = Integer.parseInt(unitSoftDrinks.getText());
            int b = qtySoftDrinks.getSelectedIndex();
            priceSoftDrinks.setText("" + (a * b));
        } else {
            qtySoftDrinks.setSelectedIndex(0);
            drinksList.remove("Soft Drink");
            softdrinks = false;
            priceSoftDrinks.setText("0");
            qtySoftDrinks.enable(false);
        }

    }//GEN-LAST:event_chkSoftDrinksActionPerformed

    private void chkPinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPinaActionPerformed
        if (chkPina.isSelected()) {
            qtyPina.setSelectedIndex(1);
            drinksList.add("Pinacolada");
            pinacolada = true;
            qtyPina.enable(true);
            int a = Integer.parseInt(unitPina.getText());
            int b = qtyPina.getSelectedIndex();
            pricePina.setText("" + (a * b));
        } else {
            qtyPina.setSelectedIndex(0);
            pinacolada = false;
            drinksList.remove("Pinacolada");
            pricePina.setText("0");
            qtyPina.enable(false);
        }
    }//GEN-LAST:event_chkPinaActionPerformed

    private void qtyPinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyPinaActionPerformed
        if (chkPina.isSelected()) {
            int a = Integer.parseInt(unitPina.getText());
            int b = qtyPina.getSelectedIndex();
            qtyPin = b;
            pricePina.setText("" + (a * b));
        }
    }//GEN-LAST:event_qtyPinaActionPerformed

    private void chkShakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShakesActionPerformed
        if (chkShakes.isSelected()) {
            qtyShakes.setSelectedIndex(1);
            drinksList.add("Fruit Shake");
            fruitshakes = true;
            qtyShakes.enable(true);
            int a = Integer.parseInt(unitShakes.getText());
            int b = qtyShakes.getSelectedIndex();
            priceShakes.setText("" + (a * b));
        } else {
            qtyShakes.setSelectedIndex(0);
            fruitshakes = false;
            drinksList.remove("Fruit Shake");
            priceShakes.setText("0");
            qtyShakes.enable(false);
        }
    }//GEN-LAST:event_chkShakesActionPerformed

    private void qtyLassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyLassiActionPerformed
        if (chkLassi.isSelected()) {
            int a = Integer.parseInt(unitLassi.getText());
            int b = qtyLassi.getSelectedIndex();
            qtyLas = b;
            priceLassi.setText("" + (a * b));
        }
    }//GEN-LAST:event_qtyLassiActionPerformed

    private void chkLassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLassiActionPerformed
        if (chkLassi.isSelected()) {
            qtyLassi.setSelectedIndex(1);
            drinksList.add("Mango Lassi");

            mangolassi = true;
            qtyLassi.enable(true);
            int a = Integer.parseInt(unitLassi.getText());
            int b = qtyLassi.getSelectedIndex();
            priceLassi.setText("" + (a * b));
        } else {
            qtyLassi.setSelectedIndex(0);
            mangolassi = false;
            drinksList.remove("Mango Lassi");
            priceLassi.setText("0");
            qtyLassi.enable(false);
        }
    }//GEN-LAST:event_chkLassiActionPerformed

    private void priceShakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceShakesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceShakesActionPerformed

    private void priceLassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceLassiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceLassiActionPerformed

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
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Drinks().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton btnCalTotal;
    private javax.swing.JButton btnClear;
    private javax.swing.JCheckBox chkLassi;
    private javax.swing.JCheckBox chkPina;
    private javax.swing.JCheckBox chkShakes;
    private javax.swing.JCheckBox chkSoftDrinks;
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
    private javax.swing.JTextField priceLassi;
    private javax.swing.JTextField pricePina;
    private javax.swing.JTextField priceShakes;
    private javax.swing.JTextField priceSoftDrinks;
    private javax.swing.JComboBox<String> qtyLassi;
    private javax.swing.JComboBox<String> qtyPina;
    private javax.swing.JComboBox<String> qtyShakes;
    private javax.swing.JComboBox<String> qtySoftDrinks;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel unitLassi;
    private javax.swing.JLabel unitPina;
    private javax.swing.JLabel unitShakes;
    private javax.swing.JLabel unitSoftDrinks;
    // End of variables declaration//GEN-END:variables
}
