package cooperProjectResources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CooperReadFromExcel {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fis;
	
	public static String getAppURL(int rownum, int col) throws IOException {
		fis = new FileInputStream("C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\CooperProject2019\\COOPER_HELPER_EXCEL\\CooperHelperExcel.xlsm");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Credentials");
		row = sheet.getRow(rownum);
		cell = row.getCell(col);
		return cell.getStringCellValue();
	}
	
	public static String getUsername(int rownum, int col) throws IOException {
		fis = new FileInputStream("C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\CooperProject2019\\COOPER_HELPER_EXCEL\\CooperHelperExcel.xlsm");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Credentials");
		row = sheet.getRow(rownum);
		cell = row.getCell(col);
		return cell.getStringCellValue();
	}	
	
	public static String getPassword(int rownum, int col) throws IOException {
		fis = new FileInputStream("C:\\Test_Automation\\Working_Dir\\Coopers_Selenium_Dir\\CooperProject2019\\COOPER_HELPER_EXCEL\\CooperHelperExcel.xlsm");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Credentials");
		row = sheet.getRow(rownum);
		cell = row.getCell(col);
		return cell.getStringCellValue();
	}
}
