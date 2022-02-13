package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Createaccount = driver.findElement(By.xpath("//*[contains(@data-testid,'open-registration')]"));
		
		Createaccount.click();
		
		WebElement Firstname = driver.findElement(By.cssSelector("input[aria-label='First name']"));
		WebElement Surname = driver.findElement(By.cssSelector("input[aria-label='Surname']"));
		WebElement Email = driver.findElement(By.cssSelector("input[aria-label*='Mobile number']"));
		WebElement ReEmail = driver.findElement(By.cssSelector("input[aria-label*='Re-']"));
		
		WebElement Pass = driver.findElement(By.cssSelector("input[aria-label='New password']"));
		Select Day = new Select(driver.findElement(By.cssSelector("select[aria-label*='Day']")));
		Select Month = new Select(driver.findElement(By.cssSelector("select[aria-label*='Month']")));
		Select Year = new Select(driver.findElement(By.cssSelector("select[aria-label*='Year']")));
		
		
		
		Firstname.sendKeys("Sumit");
		Surname.sendKeys("Rusia");
		Email.sendKeys("sumit.rusia3@gmail.com");
		ReEmail.sendKeys("sumit.rusia3@gmail.com");
		Pass.sendKeys("@854Sumit");
		Day.selectByValue("30");
		Month.selectByValue("1");
		Year.selectByValue("1992");
		
		
		String strGender = "Male";
		
		//input[@value='1']
		//input[@value='2']
		//input[@value='-1']
		
		//label[text()='Male']/following-sibling::input
		//label[text()='Female']/following-sibling::input
		//label[text()='Custom']/following-sibling::input
		
		String genXpath = "//label[text()='" + strGender + "']/following-sibling::input";
		
		WebElement gen = driver.findElement(By.xpath(genXpath));
		gen.click();
		
        List<WebElement> Months = driver.findElements(By.xpath("//select[@title='Month']/option"));
		
		for(WebElement elm : Months) {
			
			System.out.println(elm.getText());
		}
		
		WebElement CurrentMonth = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
		System.out.println(CurrentMonth.getText());
		

	}

}
