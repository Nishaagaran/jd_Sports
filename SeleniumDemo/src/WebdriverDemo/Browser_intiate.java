package WebdriverDemo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_intiate {
static WebDriver driver;
	
	
	public static WebDriver browser_startup(String browsername)
	{
		//Scanner sc=new Scanner(System.in);
		//String browsername=sc.next();
		
		switch(browsername)
		{
		case "chrome":
		{	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chrome_104\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			break;
		}
		case "edge":
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\91978\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			 driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			break;
		}
		

	
	}
		return driver;
}
}