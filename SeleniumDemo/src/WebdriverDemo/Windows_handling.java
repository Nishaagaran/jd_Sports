package WebdriverDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chrome_104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
	Set<String>windownames=	driver.getWindowHandles();
	System.out.println(windownames);
	Iterator<String> itr=windownames.iterator();
	String win1=itr.next();
	String win2=itr.next();
	driver.switchTo().window(win2);
		driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a")).click();
	}

}
