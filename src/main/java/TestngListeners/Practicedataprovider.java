package TestngListeners;

import java.io.File;

import org.testng.annotations.DataProvider;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Practicedataprovider {

	@DataProvider(name="New data")
	public Object[][] pdata(){
		Object[][] obj=null;
		try{
			
			File file=new File("D:\\Selenium\\Projects\\TestngPrograms\\Data 2.xls");
			Workbook w =Workbook.getWorkbook(file);
			Sheet s=w.getSheet(0);
			int rows=s.getRows();
			int columns=s.getColumns();
			obj=new Object[rows][columns];
			
			for(int i=0;i<rows;i++) {
				
				for(int j=0;j<columns;j++) {
					
					Cell c=s.getCell(j, i);
					obj[i][j]=c.getContents();
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return obj;
		
	}
	
}
