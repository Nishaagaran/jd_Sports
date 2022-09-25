package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chrome_104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
	WebElement ele=	driver.findElement(By.id("product-menu-toggle"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).build().perform();
	
	driver.findElement(By.xpath("//*[@id='product-menu-dropdown']/div[1]/ul[1]/li[3]/a/div[2]/div[1]")).click();
	}

}
