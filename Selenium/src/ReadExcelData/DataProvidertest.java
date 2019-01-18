package ReadExcelData;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

/*public class DataProvidertest {
 Workbook wb=null;
//	@DataProvider(name = "Authentication")
	public static Object[][] login() throws FileNotFoundException {
		Object[][] arrayObject = getExcelData("D:\\Sravya KT Documents\\Book1.xlsx", "Sheet1");
		return arrayObject;
	}

	public static Object[][] getExcelData(String fileName, String sheetName) throws FileNotFoundException {

	//	FileInputStream fis = new FileInputStream(fileName);
	//	XSSFWorkbook wb;
		         Object[][] arrayExcelData = null;
				 XSSFWorkbook wb=new XSSFWorkbook(fileName);
				 XSSFSheet sheet=wb.getSheetAt(0);
				 int rowcount=sheet.getPhysicalNumberOfRows();
				 System.out.println("Now of rows:" +rowcount);
				 int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
				 System.out.println("Now of colums:" +colcount);
				 arrayExcelData= new Object[rowcount-1][colcount];
			  	for(int i=1;i<rowcount;i++){		
				 		for(int j=0;j<colcount;j++){
				 			//		 arrayExcelData[i-1][j]=sheet.get		  		
				}
		
		}
		return arrayExcelData;
	}

}*/
