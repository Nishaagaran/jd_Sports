package WebdriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chrome_104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//launch the url
		driver.get("https://jqueryui.com/selectable/");
		
		
		WebElement rightclick=driver.findElement(By.linkText("Droppable"));
		Actions ac=new Actions(driver);
		ac.contextClick(rightclick);
		ac.sendKeys(Keys.DOWN,Keys.DOWN);
				ac.build().perform();
				Thread.sleep(2000);//
		//	WebDriverWait wait=new WebDriverWait(driver,15);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
			
				
		WebElement ele=	driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(ele);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
	}

}
