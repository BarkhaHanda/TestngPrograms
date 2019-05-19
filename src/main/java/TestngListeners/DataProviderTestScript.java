package TestngListeners;

import org.testng.annotations.Test;

public class DataProviderTestScript {

	@Test(dataProvider="dp1",dataProviderClass=DataProviderListener.class)
	public void dataProvider(String m, String n, String o) {
		System.out.println(m+n);
		System.out.println(n);
		int a=Integer.parseInt(m);
		System.out.println(o);
	
	}

}