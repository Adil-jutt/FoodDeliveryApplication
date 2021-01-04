package foodorderingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bill extends javax.swing.JFrame {

    ConnectionToDB conObj = new ConnectionToDB();
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet res;
    Connection con;
    String Orderno;
    String Name;
    String Address;
    String[] Items = new String[6];
    String[] totals = new String[6];

    public Bill() {
        con = conObj.EstablishCon();
        conObj.EstablishCon();
        initComponents();
        ID();
        GenerateBill();
    }

    public void ID() {
        String order = "select max(orderNo) from customerInfo";

        try (Statement stmt = con.createStatement()) {

            ResultSet rsOrder = stmt.executeQuery(order);
            while (rsOrder.next()) {
                Orderno = rsOrder.getString(1);
            txtOrderNo.setText(Orderno);
            }
            String name = "select name from customerInfo where orderNo='"+Orderno+"'";
            ResultSet rsName = stmt.executeQuery(name);
            while (rsName.next()) {
                Name = rsName.getString(1);
            txtThankYou.setText("Thank You "+Name);
            }
            String add = "select address from customerInfo where orderNo='"+Orderno+"'";
            ResultSet rsAddress = stmt.executeQuery(add);
            while (rsAddress.next()) {
                Address = rsAddress.getString(1);
            txtAddress.setText(Address);
            }
//            System.out.println(Orderno);
        } catch (SQLException e) {
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void GenerateBill() {
        String BurgerItems = "select * from Burger where orderNo='" + Orderno + "'";
        String PizzaItems = "select * from Pizza where orderNo='" + Orderno + "'";
        String BiryaniItems = "select * from Biryani where orderNo='" + Orderno + "'";
        String ShawarmaItems = "select * from Shawarma where orderNo='" + Orderno + "'";
        String DessertItems = "select * from Dessert where orderNo='" + Orderno + "'";
        String DrinksItems = "select * from Drinks where orderNo='" + Orderno + "'";

        try (Statement stmt = con.createStatement()) {
            ResultSet rsBur = stmt.executeQuery(BurgerItems);
            ResultSet rsPizza = stmt.executeQuery(PizzaItems);
            ResultSet rsBiryani = stmt.executeQuery(BiryaniItems);
            ResultSet rsShr = stmt.executeQuery(ShawarmaItems);
            ResultSet rsDes = stmt.executeQuery(DessertItems);
            ResultSet rsDri = stmt.executeQuery(DrinksItems);

//            ========== PIZZA ==============
            while (rsPizza.next()) {
//
                Items[0] = rsPizza.getString(2);
                totals[0] = rsPizza.getString(3);
            }
            txtPizza.setText(Items[0]);
            txtPizzaTotal.setText(totals[0]);
            //========== BURGER ==============
            while (rsBur.next()) {

                Items[1] = rsBur.getString(1);
                totals[1] = rsBur.getString(2);
            }
            txtBurger.setText(Items[1]);
            txtBurTotal.setText(totals[1]);

            //========== BIRYANI ==============
            while (rsBiryani.next()) {

                Items[2] = rsBiryani.getString(1);
                totals[2] = rsBiryani.getString(2);
            }
            txtBiryani.setText(Items[2]);
            txtBiryaniTotal.setText(totals[2]);

            //========== SHAWARMA ==============
            while (rsShr.next()) {

                Items[3] = rsShr.getString(1);
                totals[3] = rsShr.getString(2);
            }
            txtShawarma.setText(Items[3]);
            txtShrTotal.setText(totals[3]);

            //========== DESSERT ==============
            while (rsDes.next()) {

                Items[4] = rsDes.getString(1);
                totals[4] = rsDes.getString(2);
            }
            txtDessert.setText(Items[4]);
            txtDessertTotal.setText(totals[4]);

            //========== DRINKS ==============
            while (rsDri.next()) {

                Items[5] = rsDri.getString(1);
                totals[5] = rsDri.getString(2);
            }
            txtDrinks.setText(Items[5]);
            txtDrinksTotal.setText(totals[5]);

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            int f = 0;
            if (!"".equals(txtBurTotal.getText())) {
                a = Integer.parseInt(txtBurTotal.getText());
            }
            if (!"".equals(txtBiryaniTotal.getText())) {
                b = Integer.parseInt(txtBiryaniTotal.getText());
            }
            
            if (!"".equals(txtPizzaTotal.getText())) {
                c = Integer.parseInt(txtPizzaTotal.getText());
            }
            
            if (!"".equals(txtShrTotal.getText())) {
                d = Integer.parseInt(txtShrTotal.getText());
            }
            if (!"".equals(txtDessertTotal.getText())) {
                e = Integer.parseInt(txtDessertTotal.getText());
            }
            if (!"".equals(txtDrinksTotal.getText())) {
                f = Integer.parseInt(txtDrinksTotal.getText());
            }

            int total = a + b + c + d + e + f;
            txtTotalAll.setText("" + total);

        } catch (SQLException e) {
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBurger = new javax.swing.JTextArea();
        txtBurTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPizza = new javax.swing.JTextArea();
        txtPizzaTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtBiryani = new javax.swing.JTextArea();
        txtBiryaniTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDrinksTotal = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtShawarma = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtShrTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtDessert = new javax.swing.JTextArea();
        txtDessertTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtDrinks = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtTotalAll = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtThankYou = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtAddress = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtOrderNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Burgers");

        jScrollPane3.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtBurger.setEditable(false);
        txtBurger.setColumns(20);
        txtBurger.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBurger.setForeground(new java.awt.Color(102, 102, 102));
        txtBurger.setLineWrap(true);
        txtBurger.setRows(2);
        txtBurger.setToolTipText("");
        txtBurger.setWrapStyleWord(true);
        txtBurger.setSelectedTextColor(new java.awt.Color(51, 0, 255));
        jScrollPane3.setViewportView(txtBurger);

        txtBurTotal.setEditable(false);
        txtBurTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBurTotalActionPerformed(evt);
            }
        });

        jLabel2.setText("price Burgers");
        jLabel2.setAutoscrolls(true);

        jScrollPane4.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtPizza.setEditable(false);
        txtPizza.setColumns(20);
        txtPizza.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPizza.setForeground(new java.awt.Color(102, 102, 102));
        txtPizza.setLineWrap(true);
        txtPizza.setRows(5);
        txtPizza.setToolTipText("");
        txtPizza.setWrapStyleWord(true);
        txtPizza.setSelectedTextColor(new java.awt.Color(51, 0, 255));
        jScrollPane4.setViewportView(txtPizza);

        txtPizzaTotal.setEditable(false);
        txtPizzaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPizzaTotalActionPerformed(evt);
            }
        });

        jLabel3.setText("price Pizza");
        jLabel3.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Biryani");

        jScrollPane5.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtBiryani.setEditable(false);
        txtBiryani.setColumns(20);
        txtBiryani.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBiryani.setForeground(new java.awt.Color(102, 102, 102));
        txtBiryani.setLineWrap(true);
        txtBiryani.setRows(5);
        txtBiryani.setToolTipText("");
        txtBiryani.setWrapStyleWord(true);
        txtBiryani.setSelectedTextColor(new java.awt.Color(51, 0, 255));
        jScrollPane5.setViewportView(txtBiryani);

        txtBiryaniTotal.setEditable(false);
        txtBiryaniTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiryaniTotalActionPerformed(evt);
            }
        });

        jLabel5.setText(" price Biryani");
        jLabel5.setAutoscrolls(true);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Pizza");

        txtDrinksTotal.setEditable(false);
        txtDrinksTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrinksTotalActionPerformed(evt);
            }
        });

        jScrollPane6.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtShawarma.setEditable(false);
        txtShawarma.setColumns(20);
        txtShawarma.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtShawarma.setForeground(new java.awt.Color(102, 102, 102));
        txtShawarma.setLineWrap(true);
        txtShawarma.setRows(5);
        txtShawarma.setToolTipText("");
        txtShawarma.setWrapStyleWord(true);
        txtShawarma.setAutoscrolls(false);
        txtShawarma.setSelectedTextColor(new java.awt.Color(51, 0, 255));
        jScrollPane6.setViewportView(txtShawarma);

        jLabel7.setText("price Drinks");
        jLabel7.setAutoscrolls(true);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Dessert");

        txtShrTotal.setEditable(false);
        txtShrTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShrTotalActionPerformed(evt);
            }
        });

        jLabel9.setText(" price Shawarma");
        jLabel9.setAutoscrolls(true);

        jScrollPane7.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDessert.setEditable(false);
        txtDessert.setColumns(20);
        txtDessert.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDessert.setForeground(new java.awt.Color(102, 102, 102));
        txtDessert.setLineWrap(true);
        txtDessert.setRows(5);
        txtDessert.setToolTipText("");
        txtDessert.setWrapStyleWord(true);
        txtDessert.setSelectedTextColor(new java.awt.Color(51, 0, 255));
        jScrollPane7.setViewportView(txtDessert);

        txtDessertTotal.setEditable(false);
        txtDessertTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDessertTotalActionPerformed(evt);
            }
        });

        jLabel10.setText("price Dessert");
        jLabel10.setAutoscrolls(true);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Shawarma");

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Drinks");

        jScrollPane8.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtDrinks.setEditable(false);
        txtDrinks.setColumns(20);
        txtDrinks.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDrinks.setForeground(new java.awt.Color(102, 102, 102));
        txtDrinks.setLineWrap(true);
        txtDrinks.setRows(5);
        txtDrinks.setToolTipText("");
        txtDrinks.setWrapStyleWord(true);
        txtDrinks.setSelectedTextColor(new java.awt.Color(51, 0, 255));
        jScrollPane8.setViewportView(txtDrinks);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/logo.png"))); // NOI18N

        jButton2.setText("back to menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 51));
        jLabel17.setText("Total Bill :");

        txtTotalAll.setEditable(false);
        txtTotalAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAllActionPerformed(evt);
            }
        });

        txtThankYou.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtThankYou.setForeground(new java.awt.Color(255, 0, 0));
        txtThankYou.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("For Ordering From Food N Spicy");

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 0, 0));
        txtAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Your Order Will Be Recieved At");

        txtOrderNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtOrderNo.setForeground(new java.awt.Color(255, 0, 0));
        txtOrderNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalAll, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(txtThankYou, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOrderNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtThankYou, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtTotalAll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jLabel14))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(325, 325, 325)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtBurTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(325, 325, 325)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtBiryaniTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(300, 300, 300)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtPizzaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(305, 305, 305)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtShrTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(315, 315, 315)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtDrinksTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtDessertTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBurTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBiryaniTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel11))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPizzaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel12))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShrTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDrinksTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDessertTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBurTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBurTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBurTotalActionPerformed

    private void txtPizzaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPizzaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPizzaTotalActionPerformed

    private void txtBiryaniTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiryaniTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBiryaniTotalActionPerformed

    private void txtDrinksTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrinksTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrinksTotalActionPerformed

    private void txtShrTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShrTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShrTotalActionPerformed

    private void txtDessertTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDessertTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDessertTotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu men = new Menu();
        men.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTotalAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAllActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JTextArea txtBiryani;
    private javax.swing.JTextField txtBiryaniTotal;
    private javax.swing.JTextField txtBurTotal;
    private javax.swing.JTextArea txtBurger;
    private javax.swing.JTextArea txtDessert;
    private javax.swing.JTextField txtDessertTotal;
    private javax.swing.JTextArea txtDrinks;
    private javax.swing.JTextField txtDrinksTotal;
    private javax.swing.JLabel txtOrderNo;
    private javax.swing.JTextArea txtPizza;
    private javax.swing.JTextField txtPizzaTotal;
    private javax.swing.JTextArea txtShawarma;
    private javax.swing.JTextField txtShrTotal;
    private javax.swing.JLabel txtThankYou;
    private javax.swing.JTextField txtTotalAll;
    // End of variables declaration//GEN-END:variables
}
