package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.CommonPaths;

public class Testutil {
	
	public static String findAddressByName(String nameToSearch) throws IOException {
        String fileLocation = CommonPaths.Test_data+"TestData.xlsx";
        File file=new File(fileLocation);
        FileInputStream file1=new FileInputStream(fileLocation);
        XSSFWorkbook wb = new XSSFWorkbook(file1);
        
        for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {
            XSSFSheet sheet = wb.getSheetAt(sheetIndex);
            for (int rowIndex = 0; rowIndex < sheet.getLastRowNum(); rowIndex++) {
                XSSFRow row = sheet.getRow(rowIndex);
                if (row != null && row.getCell(0).getStringCellValue().equals(nameToSearch)) {
                    return row.getCell(1).getRawValue();
                }
                else {
                	System.out.println("Data not available");
                }
            }
        }
        return "";
    }
  
	
	public static void main(String[] args) throws IOException {
		System.out.println(findAddressByName("Search"));
		
	}
}
