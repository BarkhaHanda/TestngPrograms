package TestngListeners;

import org.testng.annotations.Test;

public class Practicejavascript {

	
		@Test(dataProvider="New data",dataProviderClass=Practicedataprovider.class)
		public void Newdata(String m,String n,String o) {
				
			int a=Integer.parseInt(m);
			System.out.println(m);
			System.out.println(n);
			System.out.println(o);
		}
		
		@Test(dataProvider="New data",dataProviderClass=Practicedataprovider.class)
		public void Newdata1(String m,String n,String o) {
			
			int k=Integer.parseInt(m);
			int q=Integer.parseInt(n);
			int p=Integer.parseInt(o);
			System.out.println("Addition:" + (k+q));
			System.out.println("Addition:" + (q+p));
			System.out.println("Addition:" + (p+k));
		}
				
	}
	