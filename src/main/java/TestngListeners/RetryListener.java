package TestngListeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer	

//IAnnotationtransfer is used to convert RetryAnalyzer into Listener.
{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
	
		annotation.setRetryAnalyzer(Retry.class);	//calling RetryAnalyzer to convert it into Listener
	}		
}
