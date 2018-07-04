package datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider(String excelpath) {
		
		try {
			wb=new XSSFWorkbook(new FileInputStream(new File(excelpath)));
			
		} catch (Exception e) {
			System.out.println("unable to open filepath"+e);
			
			// TODO: handle exception
		}
		

	
	
}
	
	public int getrows(String sheetname) {
		
		int rows=wb.getSheet(sheetname).getLastRowNum();
		//return sheetname;
		return rows+1;
		
		
		
	}
	
	
	public String getstringdata(String sheetname,int row,int col) {
		
		
		return wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}
	
	
	
}
