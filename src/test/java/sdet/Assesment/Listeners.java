package sdet.Assesment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver =null;
		String path =System.getProperty("user.dir") + "/screenshot/";
		try {
			Utilities.takeSnapshot(driver, path);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	

}
