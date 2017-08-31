package Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener {

	//IInvokedMethod listener
	
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		//Will run before every method in the class
		System.out.println("Before Invocation: " + testResult.getTestClass().getName()
				+ " => " + method.getTestMethod().getMethodName());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		//Will run after every method in the class
		System.out.println("afterInvocation: " + testResult.getTestClass().getName() +
				" => " + method.getTestMethod().getMethodName());
	}

}
