package libraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base_class 
{

	public WebDriver driver;
	public void initialize_browser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamle\\git\\maven\\browser\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); // used because newer chrome versions needs this
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(utility_class.propertyfile("URL"));
		
	}
	
}
