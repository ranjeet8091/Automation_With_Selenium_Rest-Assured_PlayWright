package jan28ApachePoiExcelWork;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
    public static void main(String[] args) throws IOException {
     	String sheet_Location="C:\\Users\\rantiwar1\\eclipse-workspace\\javaMavenProject\\data\\Write.xlsx";
        String subSheet_Name="Exployee Data";
        
        //HSSWorkbook book1=new HSSWorkbook() // create xls
        
        XSSFWorkbook book=new XSSFWorkbook(); // create
        XSSFSheet sheet=book.createSheet(subSheet_Name);
        XSSFRow row;
        
        HashMap<String,Object>empData=new HashMap<String,Object>();
        
        empData.put("1", new Object[] {"Employee ID","NAME","POST"});
        empData.put("2", new Object[] {"PS1011","Shubham","Associate"});
        
        Set<String> keyId = empData.keySet();
        
        int rowId=0;
        for(String key : keyId) {
        	 row=sheet.createRow(rowId++);
        	 Object[] objArray = (Object[]) empData.get(key);
        	 int cellId = 0;
        	   
        	      for(Object obj:objArray) {
        	    	   Cell cell = row.createCell(cellId++);
        	    	   cell.setCellValue((String) obj);
        	    	   System.out.println(cellId + " " + cell);  
        	      }
        }
        
        File myFile = new File(sheet_Location);
        FileOutputStream fos= new FileOutputStream(myFile);
        book.write(fos);
        fos.close();
        
    }
}

