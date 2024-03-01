package util;

import java.io.File;  
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.CommonPaths;

public class TestDataReader  
{  
    
	public static HashMap<Object, Object> Testdata = new HashMap<Object, Object>();
	
	
	public static void tetsdatareader(String filename) {
		
		try  
		{  
		File file = new File(CommonPaths.Test_data+filename);   
		FileInputStream fis = new FileInputStream(file);   
		XSSFWorkbook wb = new XSSFWorkbook(fis);   
		XSSFSheet sheet = wb.getSheetAt(0);     
	
		
				
		for(int i=0;i<=sheet.getLastRowNum();i++) 
		{
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
				
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		
		
		
//		Iterator<Row> itr = sheet.iterator();     
//		while (itr.hasNext())                 
//		{  
//		Row row = itr.next();  
//		Iterator<Cell> cellIterator = row.cellIterator();   
//		while (cellIterator.hasNext())   
//		{  
//		Cell cell = cellIterator.next();  
//		switch (cell.getCellType())               
//		{  
//		case Cell.CELL_TYPE_STRING:      
//		System.out.print(cell.getStringCellValue() + "\t\t\t");  
//		break;  
//		case Cell.CELL_TYPE_NUMERIC:     
//		System.out.print(cell.getNumericCellValue() + "\t\t\t");  
//		break;  
//		default:  
//		}  
//		}  
//		System.out.println("");  
//		}  
		
		
		
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}
		
	}
	
public static void main(String[] args)   
{  
	tetsdatareader("TestData.xlsx");
}  
}  
