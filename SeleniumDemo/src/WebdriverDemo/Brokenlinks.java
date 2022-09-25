package WebdriverDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chrome_104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the url
		driver.get("https://www.mycontactform.com/samples.php");
		
		int total_size=driver.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul/li/a")).size();
		System.out.println(total_size);
		
		int mainlinks=driver.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul")).size();
		for(int i=1;i<=mainlinks;i++)
		{
		int lowerlinks=driver.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul["+i+"]/li/a")).size();
		for(int j=1;j<=lowerlinks;j++)
		{
			driver.findElement(By.xpath("//*[@id=\"left_col_top\"]/ul["+i+"]/li["+j+"]/a")).click();
			TakesScreenshot scrshot=((TakesScreenshot)driver);
			File scr=scrshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr,new File("E:\\screenshot"+System.currentTimeMillis()+"jpeg"));
			
		}
	}

}
}
