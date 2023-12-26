package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2
{
	@FindBy(xpath = "//input[@name='firstname']") private WebElement first_na;
	@FindBy(xpath = "//input[@name='lastname']") private WebElement last_na;
	@FindBy(xpath = "//input[@name='reg_email__']") private WebElement email;
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']") private WebElement email2;
	@FindBy(xpath = "//input[@name='reg_passwd__']") private WebElement pass;
	@FindBy(xpath = "//label[text()='Female']") private WebElement fem;
	@FindBy(xpath = "//label[text()='Male']") private WebElement mal;
	@FindBy(xpath = "//label[text()='Custom']") private WebElement cust;
	@FindBy(xpath = "(//button[text()='Sign Up'])[1]") private WebElement sign;
	
	public pom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void first_name(String name)
	{
		first_na.sendKeys(name);
		
	}
	
	public void last_name(String last) 
	{
		last_na.sendKeys(last);
		
	}
	
	public void email_ad(String ema) 
	{
	    email.sendKeys(ema);
	}
	
	public void email_con(String ema2) 
	{
		email2.sendKeys(ema2);
		
	}
	
	public void password(String pas)
	{
		pass.sendKeys(pas);
		
	}
	
	public void femalebutton() 
	{
		
			fem.click();
		
		
	}
	
	public void malebutton() 
	{
			mal.click();
		
	}
	
	public void custombutton() 
	{
		
			cust.click();
		
	}
	
	public void sign_button() 
	{
		sign.click();
	}
}
