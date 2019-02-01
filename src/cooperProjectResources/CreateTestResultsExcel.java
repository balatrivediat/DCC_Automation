package cooperProjectResources;

import org.automationtesting.excelreport.Xl;

public class CreateTestResultsExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String fileName = "Test_Execution_Status.xlsx";
//		String folderPath ="C:\\MALLIKARJUN\\SELENIUM\\CooperProject\\Test_Results_Screens\\Test_Execution_Results_Sheet\\";
//		String fileName ="C:\\MALLIKARJUN\\SELENIUM\\CooperProject\\Test_Results_Screens\\Test_Execution_Results_Sheet\\Test_Execution_Status.xlsx";
//		System.out.println("file path : " + fileName);
//	    try {
//	        XSSFWorkbook  workbook = new XSSFWorkbook();            
//	        XSSFSheet sheet = workbook.createSheet("ExecutionStatus");      
//	        Row row = sheet.createRow(0);   
//	        Cell cell0 = row.createCell(0);
//	        cell0.setCellValue("Date_Time");
//	        cell0.getCellStyle().setFillForegroundColor(IndexedColors.RED.getIndex());
//	        Cell cell1 = row.createCell(1);
//	        cell1.setCellValue("Test_Case_Name");    
//	        Cell cell2 = row.createCell(2);
//	        cell2.setCellValue("Test_Case_Description"); 
//	        Cell cell3 = row.createCell(3);
//	        cell3.setCellValue("Execution_Status"); 
//	        FileOutputStream fos = new FileOutputStream(fileName);
//	        workbook.write(fos);
//	        fos.close();
//	        workbook.close();
//	        System.out.println("Excel created successfully!");
//	    } catch (Exception e) {
//	        // TODO Auto-generated catch block
//	        e.printStackTrace();
//	    }
		
		Xl.generateReport("Test_Execution_Status.xlsx");
	}
}
