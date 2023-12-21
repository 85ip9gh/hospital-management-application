/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author pesanth
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public Connection getConnection(){
        // TODO code application logic here
        
        try{
            Class.forName("org.h2.Driver");
            Connection connection = DriverManager.getConnection("jdbc:h2:./database/hospital", "admin","");
            System.out.println("Connected to Database");
            return connection;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Database Connection Error: \n" + ex);
            return null;
        }
    }
    
}
