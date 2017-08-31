package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {

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
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// ignore for now 
		//(used in case if Ex: 4 out of 5 scenarios passed, and we can say "pass" for the group) 
		
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



}
