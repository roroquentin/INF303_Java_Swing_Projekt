/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jdk.jshell.StatementSnippet;
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
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Silinemedi!\n" + e);
        }
        
        
    }
    
     public static void formDataInsert(String name, String surname, String date) {
         
         String databaseOperation = "INSERT INTO form_operator (operator_name,operator_surname,operator_date) VALUES (?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, name);
            p.setString(2, surname);
            p.setString(3, date);

            p.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Ekleme yapıldı!");
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }

        }
     
     public static void insertFirstStepData(
             String costumerFirstStep,
             String projektNameFirstStep,
             String inspectionPlaceFirstStep,
             String inspectionStandartFirstStep,
             String evaluationStandartFirstStep,
             String inspectionProcedureFirstStep,
             String inspectionScopeFirstStep,
             String drawingNoFirstStep,
             String surfaceConditionFirstStep,
             String stageOfExaminationFirstStep,
             String pageFirstStep,
             String reportNoFirstStep,
             String reportDateFirstStep,
             String jobOrderNoFirstStep,
             String offerNoFirstStep){
        
        String databaseOperation = "INSERT INTO first_step_information ("
                + "customer,project_name,inspection_place,"
                + "inspection_standart,evaluation_standart,"
                + "inspection_procedure,inspection_scope,"
                + "drawing_no,surface_condition,"
                + "stage_of_xamination,page,"
                + "report_no,report_date,job_order_no,offer_no) VALUES "
                + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, costumerFirstStep);
            p.setString(2, projektNameFirstStep);
            p.setString(3, inspectionPlaceFirstStep);
            p.setString(4, inspectionStandartFirstStep);
            p.setString(5, evaluationStandartFirstStep);
            p.setString(6, inspectionProcedureFirstStep);
            p.setString(7, inspectionScopeFirstStep);
            p.setString(8, drawingNoFirstStep);
            p.setString(9, surfaceConditionFirstStep);
            p.setString(10, stageOfExaminationFirstStep);
            p.setString(11, pageFirstStep);
            p.setString(12, reportNoFirstStep);
            p.setString(13, reportDateFirstStep);
            p.setString(14, jobOrderNoFirstStep);
            p.setString(15, offerNoFirstStep);
           
            
            p.executeUpdate();
            
            
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
    
   public static void insertEquipmentInformationsData(String poleDistance,
           String equipment,
           String mpCarrierMedium,
           String magneticTech,
           String uvLightIntensity,
           String distanceOfLight,
           String examinationArea,
           String currentType,
           String luxmeter,
           String testMedium,
           String demagnetization,
           String heatTreatment,
           String surfaceTemperature,
           String gaussFieldStrength,
           String surfaceCondition,
           String identificationOfLightEquip,
           String liftingTestDate){
        
        String databaseOperation = "INSERT INTO equipment_informations (pole_distance,"
                + "equipment,mp_carrier_medium,"
                + "mag_tech,uv_light_intensity,distance_of_light,"
                + "examination_area,current_type,luxmeter,"
                + "test_medium,demagnetization,heat_reatment,surface_temperature,"
                + "gauss_field_strength,surface_condition,identification_of_light_equip,"
                + "lifting_test_date_number) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, poleDistance);
            p.setString(2, equipment);
            p.setString(3, mpCarrierMedium);
            p.setString(4, magneticTech);
            p.setString(5, uvLightIntensity);
            p.setString(6, distanceOfLight);
            p.setString(7, examinationArea);
            p.setString(8, currentType);
            p.setString(9, luxmeter);
            p.setString(10, testMedium);
            p.setString(11, demagnetization);
            p.setString(12, heatTreatment);
            p.setString(13, surfaceTemperature);
            p.setString(14, gaussFieldStrength);
            p.setString(15, surfaceCondition);
            p.setString(16, identificationOfLightEquip);
            p.setString(17, liftingTestDate);
            
            
            p.executeUpdate();
            
          
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
   
    public static void insertRestData(String standardDeviations, String inspectionDates, String descriptionAndAttachments){
        
        String databaseOperation = "INSERT INTO rest_data_equipment (standard_deviations,"
                + "inspection_dates,description_and_attachments) VALUES (?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, standardDeviations);
            p.setString(2, inspectionDates);
            p.setString(3, descriptionAndAttachments);
            
            p.executeUpdate();
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
    
    public static void insertResultData(String pieceNo, String testLenght, String weldingProcess,
            String thickness, String diameter, String defectType, String defectLoc,
            String result){
        
        String databaseOperation = "INSERT INTO results (piece_no,"
                + "test_lenght,welding_process,thickness,diameter,"
                + "defect_type,defect_loc,result) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, result);
            p.setString(2, testLenght);
            p.setString(3, weldingProcess);
            p.setString(4, thickness);
            p.setString(5, diameter);
            p.setString(6, defectType);
            p.setString(7, defectLoc);
            p.setString(8, result);
            
            
            
            p.executeUpdate();
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
    
    public static void getDataForTable(JTable jTable1){
        
        Connection conn = DataBaseConnect.getConnection();
        Statement s;
        ResultSet rs;
        
        try {
            
            s = conn.createStatement();
            rs = s.executeQuery("SELECT * FROM results");
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            while (rs.next()){
                
                String id = rs.getString("id_results");
                String pieceNo = rs.getString("piece_no");
                String testLenght = rs.getString("test_lenght");
                String weldingProcess = rs.getString("welding_process");
                String thickness = rs.getString("thickness");
                String diameter = rs.getString("diameter");
                String defectType = rs.getString("defect_type");
                String defectLoc = rs.getString("defect_loc");
                String result = rs.getString("result");
                
                model.addRow(new Object[] {id,pieceNo,testLenght,weldingProcess,thickness,diameter,defectType,defectLoc,result});
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
            
        }
        
           
        
    }
    
    public static void insertOperatorData(String operatorNameSurname, String operatorLevel, String operatorDate){
        
        String databaseOperation = "INSERT INTO form_operator (operator_name,"
                + "operator_surname,operator_date) VALUES (?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, operatorNameSurname);
            p.setString(2, operatorLevel);
            p.setString(3, operatorDate);
            
            p.executeUpdate();
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
    
    public static void insertEvalutedData(String evalutedNameSurname, String evalutedLevel, String evalutedDate){
        
        String databaseOperation = "INSERT INTO form_evaluated (form_evaluated_name,"
                + "form_evaluated_surname,form_evaluated_date) VALUES (?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, evalutedNameSurname);
            p.setString(2, evalutedLevel);
            p.setString(3, evalutedDate);
            
            p.executeUpdate();
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
    
    public static void insertConfirmData(String confirmNameSurname, String confirmLevel, String confirmDate){
        
        String databaseOperation = "INSERT INTO form_conformation (form_conformation_name,"
                + "form_conformation_surname,form_conformation_date) VALUES (?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, confirmNameSurname);
            p.setString(2, confirmLevel);
            p.setString(3, confirmDate);
            
            p.executeUpdate();
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
    
    public static void insertCostumerData(String costumerNameSurname, String costumerLevel, String costumerDate){
        
        String databaseOperation = "INSERT INTO form_costumer (form_costumer_name,"
                + "form_costumer_surname,form_costumer_date) VALUES (?,?,?)";
        
        try {
            Connection conn = DataBaseConnect.getConnection();
            PreparedStatement p;
            
            p = conn.prepareStatement(databaseOperation);
            
            p.setString(1, costumerNameSurname);
            p.setString(2, costumerLevel);
            p.setString(3, costumerDate);
            
            p.executeUpdate();
            
            p.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ekleme yapılamadı!\n" + e);
        }
    }
    
    
   
}
