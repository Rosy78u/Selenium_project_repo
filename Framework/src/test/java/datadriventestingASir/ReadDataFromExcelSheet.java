package datadriventestingASir;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testdata/TestscriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
	
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(3).getBooleanCellValue();
		System.out.println(status);
		LocalDateTime date= workbook.getSheet("Sheet1").getRow(1).getCell(4).getLocalDateTimeCellValue();
		System.out.println(date);
		int price = (int) workbook.getSheet("Sheet1").getRow(1).getCell(5).getNumericCellValue();
		System.out.println(price);
		
		
		
		
		
	}

}
