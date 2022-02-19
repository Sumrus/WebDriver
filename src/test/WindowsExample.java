package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");    
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait for browser to load - implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String ParentWin = driver.getWindowHandle();
		System.out.println(ParentWin);
		
		WebElement element = driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		element.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr = handles.iterator();
		while(itr.hasNext()) {
			
			String CurrentVal = itr.next();
			System.out.println(CurrentVal);
			
			if(!CurrentVal.equals(ParentWin)) {
				driver.switchTo().window(CurrentVal);
			}
		}
		
		
		
		WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(text.getText());

	}


}
