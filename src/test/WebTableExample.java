package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		List<WebElement> tbrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println(tbrows.size());
		
		List<WebElement> thcol = driver.findElements(By.xpath("//table[@id='customers']//th"));
		
		System.out.println(thcol.size());
		
		List<WebElement> tdrowsdata = driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
		
		for(WebElement elm: tdrowsdata) {
		
		System.out.println(elm.getText());
		
		}
		

	}

}
