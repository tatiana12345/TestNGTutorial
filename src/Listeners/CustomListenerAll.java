package Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListenerAll implements IInvokedMethodListener, ITestListener, ISuiteListener{

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
	
	//ITestResult listener
	
		@Override
		public void onTestStart(ITestResult result) {
			//Executed when test methods starts (@Test)
			System.out.println("onTestStart -> Test Name: " + result.getName());
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			//Executed when test methods is successful
			System.out.println("onTestSuccess -> Test Name: " + result.getName());
		}

		@Override
		public void onTestFailure(ITestResult result) {
			//Executed when test methods is failed
			System.out.println("onTestFailure -> Test Name: " + result.getName());
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			//Executed when test methods is skipped
			System.out.println("onTestSkipped -> Test Name: " + result.getName());
			
		}

		@Override
		public void onStart(ITestContext context) {
			//Executed before "test" tag (.xml file <test>)
			System.out.println("onStart(ITestContext) -> Test Tag Name: " + context.getName());
			//Prints out all method names that are going to be executed in this <test>HERE</test>
			ITestNGMethod methods[] = context.getAllTestMethods();
			System.out.println("These methods will be executed in this test suite: ");
			for (ITestNGMethod method : methods) {
				System.out.println(method.getMethodName());
			}
		}

		@Override
		public void onFinish(ITestContext context) {
			//Executed after "test" tag (.xml file <test>)
			System.out.println("onFinish(ITestContext) -> Test Tag Name: " + context.getName());
			//Prints out all method names that are going to be executed in this <test>HERE</test>
			ITestNGMethod methods[] = context.getAllTestMethods();
			System.out.println("These methods will be executed in this test suite: ");
			for (ITestNGMethod method : methods) {
				System.out.println(method.getMethodName());
			}
			
		}

		// ISuiteListener method
		
		@Override
		public void onStart(ISuite suite) {
			//When Suite tag starts in .xml file <suite>
			System.out.println("Before suite starts");
		}

		@Override
		public void onFinish(ISuite suite) {
			//When Suite tag ends in .xml file <suite>
			System.out.println("After suite ends");
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}


	
}
