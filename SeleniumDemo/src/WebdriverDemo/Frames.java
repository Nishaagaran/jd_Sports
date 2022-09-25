package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chrome_104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the url
		driver.get("https://jqueryui.com/selectable/");
		
		driver.findElement(By.linkText("Selectable")).click();
	WebElement ele=	driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).click();
	}

}
