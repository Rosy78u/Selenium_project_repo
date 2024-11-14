package Assignment1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./src/test/resource/check.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet2");
		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		for(int r=0;r<=lastRowNum; r++) {
			Row row = sheet.getRow(r);
			for(int c=0;c<lastCellNum; c++) {
				Cell cell = row.getCell(c);
				if(cell.getCellType().STRING!=null){
					System.out.println(cell.getStringCellValue());
					}
					else if(cell.getCellType().NUMERIC!=null)
					{
						 System.out.println((long)cell.getNumericCellValue());
					 }
					}
				}
			}
		}
					
		



