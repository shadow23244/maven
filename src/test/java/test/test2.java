package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraries.base_class;
import libraries.utility_class;
import module1.pom1;
import module1.pom2;

public class test2  extends base_class
{

	
	
		pom1 a;
		pom2 b;
		int tcid;
		@BeforeClass
		public void openbrowser() throws IOException 
		{
			initialize_browser();
			 a=new pom1(driver);
			 b=new pom2(driver);
		}

		@BeforeMethod
		public void createnewacc() throws EncryptedDocumentException, IOException, InterruptedException
		{
			tcid=101;
			a.new_acc();
			b.first_name(utility_class.gettestdata(1, 0));
			b.last_name(utility_class.gettestdata(1, 1));
			b.email_ad(utility_class.gettestdata(1, 2));
			b.email_con(utility_class.gettestdata(1, 2));
			b.password(utility_class.gettestdata(1, 3));
			WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			
			Select date1 = new Select(date);
			String exp_date= utility_class.gettestdata(1, 4);
			
				date1.selectByVisibleText(exp_date);
			
				Select month1 = new Select(month);
				String exp_month= utility_class.gettestdata(1, 5);
				month1.selectByVisibleText(exp_month);
				
				Select year1 = new Select(year);
				String exp_year = utility_class.gettestdata(1, 6);
				year1.selectByVisibleText(exp_year);
				
				
				String expt_gender = utility_class.gettestdata(1, 7);
				if(expt_gender.equals("Male"))
				{
					b.malebutton();
				}
				else if(expt_gender.equals("Female"))
				{
					b.femalebutton();
				}
				else if(expt_gender.equals("Custom"))
				{
					b.custombutton();
				}
				
				b.sign_button();
			Thread.sleep(3000);
		}
		
		@Test()
		public void verify() throws IOException
		{
			
			
			
		}
		
		@AfterMethod
		public void logout(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
				utility_class.screenshot(driver, tcid);
			}
			
		}
		
		@AfterClass
		public void closebrowser() 
		{
			//driver.quit();
			
		}
	

}
