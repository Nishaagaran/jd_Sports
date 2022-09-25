package WebdriverDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class MyContactForm {

	
	
	public static void main(String[] args) throws IOException
	{
		File f=new File("F:\\JD_Sports\\SeleniumDemo\\config.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chrome_104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the url
		driver.get("https://www.mycontactform.com/samples.php");
		
	/*//navigation commands
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.mycontactform.com/samples.php");*/
		//check box
		
		driver.findElement(By.xpath(p.getProperty("checkbox"))).click();
		driver.findElement(By.xpath(p.getProperty("checkbox2"))).click();
		//extbox"
		
		driver.findElement(By.id("subject")).sendKeys("Bihma");
		//dropdown
		
		
		WebElement ele=driver.findElement(By.id("q3"));
		System.out.println(ele.getText());
		Select s=new Select(ele);
		s.selectByVisibleText("Second Option");
		
		driver.findElement(By.xpath("//input[@value='Fourth Option']")).click();
		
		
		TakesScreenshot scrshot=((TakesScreenshot)driver);
		File scr=scrshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("E:\\screenshot.jpeg"));
		
		
	}
}
