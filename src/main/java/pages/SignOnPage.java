package pages;

import org.openqa.selenium.By;

import env.TestBase;


public class SignOnPage implements TestBase{
	
	By byUserNameSignOn=By.name("userName");
	
	By byPassword=By.name("password");
	
	By signOnButton=By.name("login");
	
	
	public void setUserName(String userName){
		driver.findElement(byUserNameSignOn).sendKeys(userName);
	}
	
	public void setPassword(String password){
		driver.findElement(byPassword).sendKeys(password);
	}
	
	public void clickSignInSubmitButton(){
		driver.findElement(signOnButton).click();
	}
	
	
}
