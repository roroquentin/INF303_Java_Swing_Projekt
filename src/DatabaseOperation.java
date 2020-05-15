/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hasanguzelmansur
 */
public class DatabaseOperation {
    
    public static void insertData(String name, String surname, String level, String status, String pass){
        
        String databaseOperation = "INSERT INTO user (name,surname,level,status,pass) VALUES (?,?,?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, name);
            p.setString(2, surname);
            p.setString(3, level);
            p.setString(4, status);
            p.setString(5, pass);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Ekleme yapıldı!");
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
    
    public static void updateData(String name, String surname, String level, String status, String pass, String id){
        
        String databaseOperation = "UPDATE user SET name=?,surname=?,level=?,status=?,pass=? WHERE user_id=?";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            
            p.setString(1, name);
            p.setString(2, surname);
            p.setString(3, level);
            p.setString(4, status);
            p.setString(5, pass);
            p.setString(6, id);
            
            
            p.executeUpdate();
            
            p.close();
            
            JOptionPane.showMessageDialog(null,"Ekleme yapıldı!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
    
    
    public static void deleteData(String name , String surname, String level, String status, String pass, String id){
        
        String databaseOperation = "DELETE FROM user WHERE user_id=?";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, id);
            p.executeUpdate();
            
            p.close();
            
            JOptionPane.showMessageDialog(null,"Silindi!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Silinemedi!\n" + e);
        }
        
        
    }
   
}
