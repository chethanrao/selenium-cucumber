package pages;


import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import env.TestBase;

public class RegisterPage implements TestBase{
	
        By byFirstName=By.name("firstName");
		
	     By byLastName=By.name("lastName");
		
	     By byPhone=By.name("phone");
		
	     By byEmail=By.id("userName");
		
		By byAddress1=By.name("address1");
		
		 By byCity=By.name("city");

		By byState=By.name("state");
		
		By byCountry=By.name("country");


		By byPostalCode=By.name("postalCode");
		
		By byUserName=By.id("email");
		
		By byPassword=By.name("password");
		
		By byConfirmPassword=By.name("confirmPassword");
		
		By byRegister=By.name("register");

		By isRegistrationSigon=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]");

		
		public void setFirstName(String firstName){	
			System.out.println("driver:"+driver);
			
			System.out.println("by first name:"+byFirstName);

			
			driver.findElement(byFirstName).sendKeys(firstName);
		}
		
		
		public void setLastName(String lastName){	
			driver.findElement(byLastName).sendKeys(lastName);
		}
		
		public void setPhone(String phone){	
			driver.findElement(byPhone).sendKeys(phone);
		}
		
		
		public void setEmail(String email){	
			driver.findElement(byEmail).sendKeys(email);
		}
		
		
		public void setAddress1(String address1){	
			driver.findElement(byAddress1).sendKeys(address1);
		}
		
		public void setCity(String city){	
			driver.findElement(byCity).sendKeys(city);
		}
		
		public void setState(String state){	
			driver.findElement(byState).sendKeys(state);
		}
	
		
		public void setPostalCode(String postalCode){	
			driver.findElement(byPostalCode).sendKeys(postalCode);
		}
		
		public void setCountry(String country){	
			WebElement element=driver.findElement(byCountry);
			
			Select select=new Select(element);
			
			select.selectByVisibleText(country);
		}
		
		
		public void setUserName(String userName){	
			driver.findElement(byUserName).sendKeys(userName);
		}
		
		
		public void setPassword(String password){	
			driver.findElement(byPassword).sendKeys(password);
		}
		
		
		public void setConfirmPassword(String confirmPassword){	
			driver.findElement(byConfirmPassword).sendKeys(confirmPassword);
		}
		
		public void clickOnSubmit(){
			driver.findElement(byRegister).click();
		}
		
		
		public void isRegistrationSuccessful(){
			
			Assert.assertTrue("The registration was not successful",driver.findElement(isRegistrationSigon).isDisplayed());
			
		}
}