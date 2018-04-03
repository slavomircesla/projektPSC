package sk.akademiasovy.db;
import com.sun.rowset.internal.Row;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import sk.akademiasovy.TownsPscApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelToDatabase {public static void main(String[] args) {
    try{

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/psctowns","root","");
        con.setAutoCommit(false);
        PreparedStatement pstm = null ;
        FileInputStream input = new FileInputStream("C:\\Users\\NTB\\Desktop\\PSCobci.xlsx");
        POIFSFileSystem fs = new POIFSFileSystem( input );
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        HSSFSheet sheet = wb.getSheetAt(0);
        org.apache.poi.ss.usermodel.Row row;
        for(int i=1; i<=sheet.getLastRowNum(); i++){
            row = sheet.getRow(i);
            String town = row.getCell(0).getStringCellValue();
            String part = row.getCell(1).getStringCellValue();
            int PSC = (int) row.getCell(2).getNumericCellValue();

            String sql = "INSERT INTO towns VALUES('"+town+"','"+part+"','"+PSC+"')";
            pstm = (PreparedStatement) con.prepareStatement(sql);
            pstm.execute();
            System.out.println("Import rows "+i);
        }
        con.commit();
        pstm.close();
        con.close();
        input.close();
        System.out.println("Success import excel to mysql table");
    }catch(ClassNotFoundException e){
        System.out.println(e);
    }catch(SQLException ex){
        System.out.println(ex);
    }catch(IOException ioe){
        System.out.println(ioe);
    }

}

}
