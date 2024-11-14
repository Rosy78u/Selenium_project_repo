package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromTheExcelSheet {
	public static void main(String[] args,Object STRING ,Object NUMERIC) 
		throws EncryptedDocumentException , IOException {
		 FileInputStream	filePath= new FileInputStream("./src/test/resource/Studentdetails.xlsx");
		 Workbook workbook	= WorkbookFactory.create(filePath);
		  Sheet sheet = workbook.getSheetAt(0);
		                int numOfRows =sheet.getLastRowNum();
		              int  numOfCells = sheet.getRow(0).getLastCellNum();
		              for(int r=0 ; r<=numOfRows; r++)
		              {
		            	  Row row = sheet.getRow(r);
		            	  
		            	  
		            	  
		            	  for(int c=0; c<numOfCells; c++)
		            	  {
		            		  Cell cell = row.getCell(c);
		            		  CellType cellType = cell.getCellType();
		            		  if(cellType.equals(STRING))
		            		  {
		            			  System.out.println(cell.getStringCellValue());
		            		  }
		            		  else
		            		  {
		            			  System.out.println(cell.getNumericCellValue());
		             		  }
		            		  System.out.println();
		            	  }
		              }
	 
		
		
		
	}
}


		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			 			  
		            			  
		            			  
		            			  
		            			  
		            			  
		            			  
		           
