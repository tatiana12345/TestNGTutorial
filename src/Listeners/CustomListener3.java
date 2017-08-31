package Listeners;


import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {

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



}
