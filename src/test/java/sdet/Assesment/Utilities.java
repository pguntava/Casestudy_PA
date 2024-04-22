package sdet.Assesment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	
	public static void takeSnapshot(WebDriver driver, String filePath) throws IOException {
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File DesnFile =new File(filePath);
		
		FileUtils.copyFile(SrcFile, DesnFile);
		
		
	}
	

}
