
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hasanguzelmansur
 */
public class ExcelOperation {
    
    public static void createExcellDoku(){
        
        MagneticInpectorInformation mI = new MagneticInpectorInformation();
        
        
        
         try {
            
            FileInputStream file = new FileInputStream(new File("/Users/hasanguzelmansur/NetBeansProjects/InspectorDeskop/MagneticReport.xlsx"));
            
            XSSFWorkbook wb = new XSSFWorkbook(file);
            
            XSSFSheet sh = wb.getSheetAt(0);
            
            Cell cll = null;
            
            cll = sh.getRow(3).getCell(2);

            cll.setCellValue(mI.jTextField1.getText());

            file.close();

            FileOutputStream outFile =new FileOutputStream(new File("/Users/hasanguzelmansur/NetBeansProjects/InspectorDeskop/MagneticReport.xlsx"));

            wb.write(outFile);

            outFile.close();
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
    }
    
}
