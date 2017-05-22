package support;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;


public class Base {

	public static WebDriver driver=null;
	
	@Before
	public void BeforeTest(){
		 System.setProperty("webdriver.chrome.driver","chromedriver");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-fullscreen");
		 driver = new ChromeDriver(options);
		 driver.get("https://www.valtech.com/"); 
		 WaitFor(true);
	}
	
	  @After
	public void AfterTest()
	{
		driver.quit();
	}
	
	
	
public void WaitFor(boolean pageload){
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	public void WaitFor(WebElement element){
		
		WebDriverWait wait = new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.visibilityOf(element)); 
	}
}
	
