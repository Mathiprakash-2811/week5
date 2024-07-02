package testngassignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MergeExcel {
public static String[][] readExcel() throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/testng.xlsx");

		XSSFSheet sheet = wb.getSheetAt(2); 

        int rowCount = sheet.getLastRowNum();
		
        int cellCount = sheet.getRow(1).getLastCellNum();
        
		String[][] value = new String[rowCount][cellCount];
        for (int i = 1; i <=rowCount; i++) {

		for (int j = 0; j < cellCount; j++) {

		String data = sheet.getRow(i).getCell(j).getStringCellValue();
		
        value[i-1][j]=data;
        
		}
		}

		wb.close();
		
		return value;
}

}
