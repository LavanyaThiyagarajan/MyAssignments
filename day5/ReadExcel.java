package week6.day5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static String[][] readData(String sheetName) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./data/ReadExcel.xlsx");
		XSSFSheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row: "+rowCount);
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column: "+columnCount);
		
		String[][] data=new String[rowCount][columnCount];
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columnCount;j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
		}
		wb.close();
		return data;
	}
}
