package TestngListeners;

import java.io.File;
import org.testng.annotations.DataProvider;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class DataProviderListener {
	
	@DataProvider(name="dp1")
	public Object[][] dataSet()
	{
		Object[][]obj=null;
		try {
			File file= new File("D:\\Selenium\\Projects\\TestngPrograms\\Data.xls");
			Workbook workbook=Workbook.getWorkbook(file);		
			Sheet sh=workbook.getSheet(0);
			int rows=sh.getRows();
			int columns=sh.getColumns();
			obj=new Object[rows][columns];
			
			for(int i=0; i<rows;i++) {
				for(int j=0; j<columns; j++) {
					
					Cell cell=sh.getCell(j, i);
					obj[i][j]=cell.getContents();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return obj;		
	}
	}
