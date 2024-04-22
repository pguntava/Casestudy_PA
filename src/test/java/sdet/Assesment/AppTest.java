package sdet.Assesment;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sdet.Assesment.pageObjects.loginPage;

/**
 * Unit test for simple App.
 */
public class AppTest {
	  private WebDriver driver;

	@BeforeSuite
	public void initialize() {
		   driver = new ChromeDriver();
		  driver.get("https://saucedemo.com");
	
}
  @Parameters ({"userName", "password"})
  @Test	
	public void loginTest(String username, String password) {
	  
	  driver.findElement(By.xpath(loginPage.username)).sendKeys(username);
	  driver.findElement(By.xpath(loginPage.password)).sendKeys(password);
	  driver.findElement(By.xpath(loginPage.loginbtn)).click();
	  String browserTitle ="Swag Labs";
	  AssertJUnit.assertEquals(driver.getTitle(), browserTitle);
	 
	
	  System.out.println("Swag Lab logged in succesful");
	}
  
  @AfterSuite
  public void teardown() {
//	  driver.close();
  }
	
	
}
