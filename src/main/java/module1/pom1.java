package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 
{
	@FindBy(xpath = "//a[text()='Create new account']") private WebElement create_new;

	public pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void new_acc()
	{
		create_new.click();
		
	}

}
