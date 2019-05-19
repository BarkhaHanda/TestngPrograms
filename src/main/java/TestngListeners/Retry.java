package TestngListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer

{
	public boolean retry	(ITestResult result)
	//IRetryAnalyzer Is an Interface Used to Retry test cases if fail and will convert into listener using IAnnotation transfer. 
		{
	
		for(int i=0;i<=4;i++) {
			
			System.out.println("Program Execution: " + i +" Times and Test Name is: "+result.getName());
		}	
		return false;
	}

	
	
}
