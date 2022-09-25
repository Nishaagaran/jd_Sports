package WebdriverDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chrome_104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();*/
		
		//launch the url
		File f=new File("F:\\JD_Sports\\SeleniumDemo\\config.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
	 driver=Browser_intiate.browser_startup(p.getProperty("browsername"));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	
	Alert a=driver.switchTo().alert();
	a.accept();
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
	
	Alert a1=driver.switchTo().alert();
	a1.dismiss();
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
	Alert a2=driver.switchTo().alert();
	a2.sendKeys("Mohammed");
	a2.accept();
	}

}
