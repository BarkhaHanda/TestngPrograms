package TestngListeners;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;


public class TestngListeners1 {

	@Test
	public void test() {
		System.out.println("Test Method 1");
	}
	
	@Test
		public void test2() {
			System.out.println("Test Method 2");	
		}
	
	@Test(retryAnalyzer=Retry.class)
	public void test3() {
		
		System.out.println("Test Method 3");
		Assert.assertEquals(true, false);
	}
	
	@Test(retryAnalyzer=Retry.class)	//Calling Retry Method to retry test case if fails.
	public void test4() {
		Assert.assertEquals(true, false);
		System.out.println("Test Method 4");
	}
	
	@BeforeMethod
	public void testBefore() {
		System.out.println();
		System.out.println("Before test");
	}
	
	@AfterMethod
	public void testAfter() {
			System.out.println("After Test");
	}
	
	@BeforeClass
	public static void startProgram() {
	
		System.out.println("Start First Program");
	}
	
	@AfterClass
	public static void endProgram() {
		System.out.println("End First Program");
		
	}
	
}
