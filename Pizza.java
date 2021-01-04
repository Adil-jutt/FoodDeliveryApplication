
package foodorderingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pizza extends javax.swing.JFrame {
 ConnectionToDB conObj = new ConnectionToDB();
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet res;
    Connection con;
    int totalChickenPizza=0;   
    int totalMargaritaPizza=0;   
    int totalPepironiPizza=0;   
    int totalBbqPizza=0;
    Vector PizzaList=new Vector();
    Vector CL=new Vector();
    Vector ML=new Vector();
    Vector PL=new Vector();
    Vector BL=new Vector();
    String Orderno;
    boolean CP=false,MP=false,PP=false,BP=false;
    public Pizza() {
        con=conObj.EstablishCon();
        initComponents();
        autoID();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        qtyChickenSmall = new javax.swing.JComboBox<>();
        qtyChickenMedium = new javax.swing.JComboBox<>();
        qtyChickenLarge = new javax.swing.JComboBox<>();
        ucs = new javax.swing.JLabel();
        ucm = new javax.swing.JLabel();
        ucl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chkChicken = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        qtyMSmall = new javax.swing.JComboBox<>();
        qtyMMedium = new javax.swing.JComboBox<>();
        chkMar = new javax.swing.JCheckBox();
        qtyMLarge = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        ums = new javax.swing.JLabel();
        umm = new javax.swing.JLabel();
        uml = new javax.swing.JLabel();
        chkPEP = new javax.swing.JCheckBox();
        qtyPLarge = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        ups = new javax.swing.JLabel();
        upm = new javax.swing.JLabel();
        upl = new javax.swing.JLabel();
        qtyPSmall = new javax.swing.JComboBox<>();
        qtyPMedium = new javax.swing.JComboBox<>();
        ubl = new javax.swing.JLabel();
        qtyBLarge = new javax.swing.JComboBox<>();
        qtyBMedium = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        chkBBQ = new javax.swing.JCheckBox();
        qtyBSmall = new javax.swing.JComboBox<>();
        ubm = new javax.swing.JLabel();
        ubs = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TotalPizza = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        BtnMenu = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/pizza/Screenshot 2020-12-23 123850.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 210));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Unit Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Qty");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 242, 607, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        qtyChickenSmall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyChickenSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyChickenSmallActionPerformed(evt);
            }
        });
        getContentPane().add(qtyChickenSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 41, -1));

        qtyChickenMedium.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyChickenMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyChickenMediumActionPerformed(evt);
            }
        });
        getContentPane().add(qtyChickenMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 45, -1));

        qtyChickenLarge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyChickenLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyChickenLargeActionPerformed(evt);
            }
        });
        getContentPane().add(qtyChickenLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 45, -1));

        ucs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ucs.setText("250");
        getContentPane().add(ucs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        ucm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ucm.setText("400");
        getContentPane().add(ucm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        ucl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ucl.setText("700");
        getContentPane().add(ucl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("S");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("M");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("L");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("L");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("M");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("S");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        chkChicken.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkChicken.setText("Chicken");
        chkChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChickenActionPerformed(evt);
            }
        });
        getContentPane().add(chkChicken, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/pizza/chickenFajita.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        qtyMSmall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyMSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyMSmallActionPerformed(evt);
            }
        });
        getContentPane().add(qtyMSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 41, -1));

        qtyMMedium.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyMMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyMMediumActionPerformed(evt);
            }
        });
        getContentPane().add(qtyMMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 45, -1));

        chkMar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkMar.setText("Margarita");
        chkMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMarActionPerformed(evt);
            }
        });
        getContentPane().add(chkMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        qtyMLarge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyMLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyMLargeActionPerformed(evt);
            }
        });
        getContentPane().add(qtyMLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 45, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/pizza/margherita.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        ums.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ums.setText("250");
        getContentPane().add(ums, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        umm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        umm.setText("400");
        getContentPane().add(umm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        uml.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uml.setText("700");
        getContentPane().add(uml, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        chkPEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkPEP.setText("Pepperoni");
        chkPEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPEPActionPerformed(evt);
            }
        });
        getContentPane().add(chkPEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        qtyPLarge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyPLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyPLargeActionPerformed(evt);
            }
        });
        getContentPane().add(qtyPLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 45, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/pizza/pepperoni.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        ups.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ups.setText("250");
        getContentPane().add(ups, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, -1));

        upm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        upm.setText("400");
        getContentPane().add(upm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        upl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        upl.setText("700");
        getContentPane().add(upl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        qtyPSmall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyPSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyPSmallActionPerformed(evt);
            }
        });
        getContentPane().add(qtyPSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 41, -1));

        qtyPMedium.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyPMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyPMediumActionPerformed(evt);
            }
        });
        getContentPane().add(qtyPMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 45, -1));

        ubl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ubl.setText("700");
        getContentPane().add(ubl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, -1));

        qtyBLarge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyBLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyBLargeActionPerformed(evt);
            }
        });
        getContentPane().add(qtyBLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 45, -1));

        qtyBMedium.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyBMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyBMediumActionPerformed(evt);
            }
        });
        getContentPane().add(qtyBMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 45, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/pizza/bbq.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        chkBBQ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkBBQ.setText("BBQ Pizza");
        chkBBQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBBQActionPerformed(evt);
            }
        });
        getContentPane().add(chkBBQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

        qtyBSmall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        qtyBSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyBSmallActionPerformed(evt);
            }
        });
        getContentPane().add(qtyBSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 41, -1));

        ubm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ubm.setText("400");
        getContentPane().add(ubm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));

        ubs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ubs.setText("250");
        getContentPane().add(ubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Calculate Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, -1, 30));
        getContentPane().add(TotalPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 90, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 672, 600, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 584, 10));

        BtnMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnMenu.setText("Go to Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     public void autoID() {

        String query = "select max(orderNo) from customerInfo";

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                Orderno = rs.getString(1);
//                System.out.println(Orderno);

            }
          
        } catch (SQLException e) {
            Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, e);
        }

        String setOrder = "insert into Pizza(orderNo) values('" + Orderno + "')";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(setOrder);
        } catch (SQLException e) {

            Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void qtyChickenMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyChickenMediumActionPerformed
        if(chkChicken.isSelected()){ 
            qtychkM= qtyChickenMedium.getSelectedIndex();
            if(qtychkM>0){
                CL.add(qtychkM+" Medium");
            }else{
                CL.remove(qtychkM+" Medium");
            }
        }
    }//GEN-LAST:event_qtyChickenMediumActionPerformed

    private void qtyChickenLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyChickenLargeActionPerformed
        if(chkChicken.isSelected()){
            qtychkL= qtyChickenLarge.getSelectedIndex();
            if (qtychkL>0) {
                CL.add(qtychkL+" Large");
            }else{
                 CL.remove(qtychkL+" Large");
            }
            
        }
    }//GEN-LAST:event_qtyChickenLargeActionPerformed

    private void chkChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkChickenActionPerformed
       
         if (chkChicken.isSelected()) {
            
            CP=true; 
            CL.add("Chicken Fajita");
            qtyChickenSmall.enable(true);
            qtyChickenMedium.enable(true);
            qtyChickenLarge.enable(true);

                       
        } else {
           
            CP=false;
            CL.remove("Chicken Fajita");
            qtyChickenSmall.setSelectedIndex(0);
            qtyChickenMedium.setSelectedIndex(0);
            qtyChickenLarge.setSelectedIndex(0);
            qtyChickenSmall.enable(false);
            qtyChickenMedium.enable(false);
            qtyChickenLarge.enable(false); 
        }

    }                                         

    private void chkIceCreamActionPerformed(java.awt.event.ActionEvent evt) {                                            
     
      
    }                                           

    private void qtyIceCreamActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }//GEN-LAST:event_chkChickenActionPerformed

    private void qtyMMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyMMediumActionPerformed
if(chkMar.isSelected()){
            qtymarM= qtyMMedium.getSelectedIndex();
            if(qtymarM>0){
                ML.add(qtymarM+" Medium");
            }else{
                ML.remove(qtymarM+" Medium");
            }
                    }       
    }//GEN-LAST:event_qtyMMediumActionPerformed

    private void chkMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMarActionPerformed
            if (chkMar.isSelected()) {
                ML.add("Margarita Pizza");
                MP=true;

              qtyMSmall.enable(true);
                 qtyMMedium.enable(true);
                    qtyMLarge.enable(true);
                       
        } else {
                ML.remove("Margarita Pizza");
                MP=false;
            qtyMSmall.setSelectedIndex(0);
            qtyMMedium.setSelectedIndex(0);
            qtyMLarge.setSelectedIndex(0);

            qtyMSmall.enable(false);
             qtyMMedium.enable(false);
              qtyMLarge.enable(false);
            }

        
    }//GEN-LAST:event_chkMarActionPerformed

    private void qtyMLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyMLargeActionPerformed
if(chkMar.isSelected()){
            qtymarL= qtyMLarge.getSelectedIndex();
            if(qtymarL>0){
                ML.add(qtymarL+" Large");
            }else{
                ML.remove(qtymarM+" Large");
            }
                    }         
    }//GEN-LAST:event_qtyMLargeActionPerformed

    private void chkPEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPEPActionPerformed
            if (chkPEP.isSelected()) {
            
                PL.add("Peperoni Pizza");
                PP=true;
            qtyPSmall.enable(true);
             qtyPMedium.enable(true);
              qtyPLarge.enable(true);
                       
        } else {
                PL.remove("Peperoni Pizza");
                PP=false;
            qtyPSmall.setSelectedIndex(0);
            qtyPMedium.setSelectedIndex(0);
            qtyPLarge.setSelectedIndex(0);
            qtyPSmall.enable(false);
             qtyPMedium.enable(false);
              qtyPLarge.enable(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_chkPEPActionPerformed

    private void qtyPLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyPLargeActionPerformed
if(chkPEP.isSelected()){
            qtypepL= qtyPLarge.getSelectedIndex();
            if(qtypepL>0){
                PL.add(qtypepL+" Large");
            }else{
                PL.remove(qtypepL+" Large");
            }
                    }       
    }//GEN-LAST:event_qtyPLargeActionPerformed

    private void qtyPMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyPMediumActionPerformed
    if(chkPEP.isSelected()){
            qtypepM= qtyPMedium.getSelectedIndex();
            if(qtypepM>0){
                PL.add(qtypepM+" Medium");
            }else{
                PL.remove(qtypepM+" Medium");
            }
                    }        
    }//GEN-LAST:event_qtyPMediumActionPerformed

    private void qtyBLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyBLargeActionPerformed
if(chkBBQ.isSelected()){
            qtybbqL = qtyBLarge.getSelectedIndex();
            if(qtybbqL>0){
                BL.add(qtybbqL+" Large");
            }else{
                BL.remove(qtypepL+" Large");
            }
                    }        // TODO add your handling code here:
    }//GEN-LAST:event_qtyBLargeActionPerformed

    private void qtyBMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyBMediumActionPerformed
    if(chkBBQ.isSelected()){
            qtybbqM= qtyBMedium.getSelectedIndex();
            if(qtybbqM>0){
                PL.add(qtybbqM+" Medium");
            }else{
                PL.remove(qtybbqM+" Medium");
            }
                    }       
    }//GEN-LAST:event_qtyBMediumActionPerformed

    private void chkBBQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBBQActionPerformed
        if (chkBBQ.isSelected()) {
            
            BL.add("BBQ Pizza");
            BP=true;
            qtyBSmall.enable(true);
             qtyBMedium.enable(true);
              qtyBLarge.enable(true);

        } else {
            BL.remove("BBQ Pizza");
            BP=false;
            qtyBSmall.setSelectedIndex(0);
            qtyBMedium.setSelectedIndex(0);
            qtyBLarge.setSelectedIndex(0);

            qtyBSmall.enable(false);
             qtyBMedium.enable(false);
              qtyBLarge.enable(false);
    
        }


    }//GEN-LAST:event_chkBBQActionPerformed

    private void qtyChickenSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyChickenSmallActionPerformed
if(chkChicken.isSelected()){
            qtychkS= qtyChickenSmall.getSelectedIndex();
            if (qtychkS>0) {
                CL.add(qtychkS+" Small");
            }else{
                CL.remove(qtychkS+" Small");
            }
                    }                
    }//GEN-LAST:event_qtyChickenSmallActionPerformed

    private void qtyMSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyMSmallActionPerformed
 if(chkMar.isSelected()){
            qtymarS= qtyMSmall.getSelectedIndex();
            if(qtymarS>0){
                ML.add(qtymarS+" Small");
            }else{
                ML.remove(qtymarS+" Small");
            }
                    }       // TODO add your handling code here:
    }//GEN-LAST:event_qtyMSmallActionPerformed

    private void qtyPSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyPSmallActionPerformed
        if(chkPEP.isSelected()){
            qtypepS= qtyPSmall.getSelectedIndex();
            if(qtypepS>0){
                PL.add(qtypepS+" Small");
            }else{
                PL.remove(qtypepS+" Small");
            }
                    }        // TODO add your handling code here:
    }//GEN-LAST:event_qtyPSmallActionPerformed

    private void qtyBSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyBSmallActionPerformed
        if(chkBBQ.isSelected()){
            qtybbqS= qtyBSmall.getSelectedIndex();
            if(qtybbqS>0){
                BL.add(qtybbqS+" Small");
            }else{
                BL.remove(qtybbqM+" Small");
            }
                    }       // TODO add your handling code here:
    }//GEN-LAST:event_qtyBSmallActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        totalCP();
        totalMP();
        totalPP();
        totalBP();
        int total=(totalChickenPizza+totalMargaritaPizza+totalPepironiPizza+totalBbqPizza);
        String Total=String.valueOf(total);
        TotalPizza.setText(Total);
        
        
        // ============== DATABASE =====================
        String Items="";
        if(CP==true)
        PizzaList.add(CL);
        if(MP==true)
        PizzaList.add(ML);
        if(PP==true)
        PizzaList.add(PL);
        if(BP==true)
        PizzaList.add(BL);
        for (int i = 0; i <PizzaList.size(); i++) {
            Items+=PizzaList.get(i);
        }
//        System.out.println(PizzaList);
        String addPizza = "update Pizza set Items = '" + Items + "',Total = '" + Total + "' where orderNo = '" + Orderno + "'";
        try {

            stmt = con.createStatement();
            stmt.executeUpdate(addPizza);
//            System.out.println("Alhamdullilah done ");
            int ch = JOptionPane.showConfirmDialog(this, "Generate Bill?");
            if(ch==0){
                Bill bill= new Bill();
                bill.setVisible(true);
                this.setVisible(false);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Burgers.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        this.setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_BtnMenuActionPerformed

    public void totalCP(){
        int a=Integer.parseInt(ucs.getText());
        int b=Integer.parseInt(ucm.getText());
        int c=Integer.parseInt(ucl.getText());
     totalChickenPizza=((qtychkS*a)+(qtychkM*b)+(qtychkL*c));  

    }
    public void totalMP(){
        int a=Integer.parseInt(ums.getText());
        int b=Integer.parseInt(umm.getText());
        int c=Integer.parseInt(uml.getText());
     totalMargaritaPizza=((qtymarS*a)+(qtymarM*b)+(qtymarL*c));  

    }
    public void totalPP(){
        int a=Integer.parseInt(ups.getText());
        int b=Integer.parseInt(upm.getText());
        int c=Integer.parseInt(upl.getText());
     totalPepironiPizza=((qtypepS*a)+(qtypepM*b)+(qtypepL*c));  

    }
    public void totalBP(){
        int a=Integer.parseInt(ubs.getText());
        int b=Integer.parseInt(ubm.getText());
        int c=Integer.parseInt(ubl.getText());
     totalBbqPizza=((qtybbqS*a)+(qtybbqM*b)+(qtybbqL*c));  

    }
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
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza().setVisible(true);
            }
        });
    }
    int qtychkS;
    int qtychkM;
    int qtychkL;
    int qtymarS;
    int qtymarM;
    int qtymarL;
    int qtypepS;
    int qtypepM;
    int qtypepL;
    int qtybbqS;
    int qtybbqM;
    int qtybbqL;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMenu;
    private javax.swing.JTextField TotalPizza;
    private javax.swing.JCheckBox chkBBQ;
    private javax.swing.JCheckBox chkChicken;
    private javax.swing.JCheckBox chkMar;
    private javax.swing.JCheckBox chkPEP;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> qtyBLarge;
    private javax.swing.JComboBox<String> qtyBMedium;
    private javax.swing.JComboBox<String> qtyBSmall;
    private javax.swing.JComboBox<String> qtyChickenLarge;
    private javax.swing.JComboBox<String> qtyChickenMedium;
    private javax.swing.JComboBox<String> qtyChickenSmall;
    private javax.swing.JComboBox<String> qtyMLarge;
    private javax.swing.JComboBox<String> qtyMMedium;
    private javax.swing.JComboBox<String> qtyMSmall;
    private javax.swing.JComboBox<String> qtyPLarge;
    private javax.swing.JComboBox<String> qtyPMedium;
    private javax.swing.JComboBox<String> qtyPSmall;
    private javax.swing.JLabel ubl;
    private javax.swing.JLabel ubm;
    private javax.swing.JLabel ubs;
    private javax.swing.JLabel ucl;
    private javax.swing.JLabel ucm;
    private javax.swing.JLabel ucs;
    private javax.swing.JLabel uml;
    private javax.swing.JLabel umm;
    private javax.swing.JLabel ums;
    private javax.swing.JLabel upl;
    private javax.swing.JLabel upm;
    private javax.swing.JLabel ups;
    // End of variables declaration//GEN-END:variables
}
