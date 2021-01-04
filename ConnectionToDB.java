
package foodorderingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionToDB {
  Connection con=null;
    public Connection EstablishCon(){
    try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        con=DriverManager.getConnection("jdbc:ucanaccess://src\\Record\\DBFoodOrder.accdb");
//        JOptionPane.showMessageDialog(null, "Connected....");
        }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
     }
    return con;   
}
}