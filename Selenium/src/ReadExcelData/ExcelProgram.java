package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExcelProgram {

	public static void main(String[] args) throws IOException {
	//readExcel();
	//writeExcel();
		readExcel();
				}
		                    
public static void readExcel() throws IOException
{
FileInputStream fis=new FileInputStream("C:\\Users\\u44728\\Desktop\\Book1.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet=wb.getSheetAt(0);
int rowcount=sheet.getPhysicalNumberOfRows();
System.out.println("Now of rows:" +rowcount);
int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
System.out.println("Now of colums:" +colcount);
//	for(int i=0;i<rowcount;i++){		
//		for(int j=0;j<colcount;j++){
		String value=sheet.getRow(1).getCell(2).getStringCellValue();
 		System.out.println(value);
}

//************Write into Excel

public static void writeExcel() throws IOException{
FileInputStream fis=new FileInputStream("C:\\Users\\u44728\\Desktop\\QAtestdata.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet=wb.getSheet("Sheet1");
Row row=sheet.createRow(1);
Cell cell = row.createCell(1);
cell.setCellType(cell.CELL_TYPE_STRING);
cell.setCellValue("SoftwareTestingMaterial.com");
FileOutputStream fos = new FileOutputStream("C:\\Users\\u44728\\Desktop\\QAtestdata.xlsx");
wb.write(fos);
fos.close();
System.out.println("END OF WRITING DATA IN EXCEL");

}
public static void readExcel1() throws IOException
{

	FileInputStream fis=new FileInputStream("C:\\Users\\u44728\\Desktop\\QAtestdata.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet=wb.getSheetAt(0);
int rowcount=sheet.getPhysicalNumberOfRows();
System.out.println("Now of rows:" +rowcount);
int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
System.out.println("Now of colums:" +colcount);
//	for(int i=0;i<rowcount;i++){		
//		for(int j=0;j<colcount;j++){
		String value=sheet.getRow(1).getCell(2).getStringCellValue();
 		System.out.println(value);


}
}