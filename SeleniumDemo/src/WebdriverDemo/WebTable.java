package WebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Downloads\\chrome_104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		int row_count=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")).size();
		int col_count=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td")).size();
		System.out.println(row_count);
		System.out.println(col_count);
		
		for(int i=1;i<=row_count;i++)
		{
			for(int j=1;j<=col_count;j++)
			{
				String text=driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]")).getText();
			System.out.println(text);
			}
		}
	}

}
