package com.gmailLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPagePageFactory {
	
	
		@FindBy(how=How.XPATH, using="//input[@id='Email']")
		WebElement UserName;
		
		@FindBy(how=How.ID, using="next")
		WebElement UsernameNext;

		@FindBy(how=How.ID, using="Passwd")
		WebElement Password;
		
		@FindBy(how=How.XPATH, using="//input[@id='signIn']")
		WebElement SignIn;

		
		
		public void LoginGmail(String un, String pw){
			
			try {
				if(un!=null && pw!=null){
					
					System.out.println("un is "+un);
				UserName.sendKeys(un);
				UsernameNext.click();
				Password.sendKeys(pw);
				SignIn.click();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		



}
