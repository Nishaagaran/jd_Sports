package TestNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import WebdriverDemo.Browser_intiate;

public class FlowExection {
	Properties p;
	FileInputStream fis;
	WebDriver driver;
	@BeforeClass
	public void filehandle() throws IOException
	{
		File f=new File("F:\\JD_Sports\\SeleniumDemo\\config.properties");
		fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	@BeforeMethod
	public void browser()
	{
		
	 driver=Browser_intiate.browser_startup(p.getProperty("browsername"));		//launch the url
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	@AfterClass
	public void close() throws IOException
	{
		fis.close();
	}
	
  @Test(dataProvider="Authentication")
  public void test1(String user, String pass) throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys(user);
	  driver.findElement(By.name("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(2000);
  }
  
 @DataProvider(name="Authentication")
 public Object[][] demo()
 {
	 return new Object[][]
			 {
		 {"Admin","admin123"},
		 {"",""}
			 };
 }
}