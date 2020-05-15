
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hasanguzelmansur
 */
public class DataBaseConnect {
      public static Connection getConnection(){
        
             Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/se_projekt","root","hasan202");
                
        } catch (Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Database Bağlanmadı!!\n" + e);
        }
        return conn;
    }
}
