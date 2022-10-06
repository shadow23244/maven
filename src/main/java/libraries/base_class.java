package libraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class 
{

	public WebDriver driver;
	public void initialize_browser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\evers\\eclipse-workspace\\Facebook\\browser\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(utility_class.propertyfile("URL"));
		
	}
	
}
