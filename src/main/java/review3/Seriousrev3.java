package review3;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seriousrev3 {

	private static final String WebElement = null;
	WebDriver driver;

//	dynamic webelement example: //article[@class='cd cd--card cd--article cd--idx-0 cd--small cd--vertical cd--has-media cd--media__image cd--has-banner']//descendant::div[4]
	@Before
	public void learn() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

@Test
public void logintest() {
	
//	storing Webelement
//	type name=value : which create a variable and it can be reused
	
	WebElement USER_NAME_ELEMENT=driver.findElement(By.xpath("//*[@id=\"username\"]"));
	 USER_NAME_ELEMENT.clear();
		USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
		 
 WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 PASSWORD_ELEMENT.sendKeys("abc123");
		 
		 WebElement SIGNIN_BUTTON_ELEMENT= driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		  SIGNIN_BUTTON_ELEMENT.click();
	
		  WebElement DASHBOARD_HEADER_ELEMENT =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
		  DASHBOARD_HEADER_ELEMENT.click();
	
//		  ASSERTIONS : used to automatically display something when there is some exception
		  Assert.assertTrue("Dashboard not found", DASHBOARD_HEADER_ELEMENT.isDisplayed());
	
	
//	or storing by class
	
//	By USER_NAME_FIELD=By.xpath("//*[@id=\"username\"]");
//	driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
	
//	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("demo@techfios.com");
	
	
}

}