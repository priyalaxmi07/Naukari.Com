package testCases;
import java.io.IOException;


import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectmodel.LoginPageObj;
import PageObjectmodel.SignupObj;
import Resources.Baseclass;
import Resources.Constant;

public class Signup  extends Baseclass{


@Test
	public void Signup() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  LoginPageObj  spo=new LoginPageObj(driver);
	 spo.clickOnRegister().click();
	  SignupObj so=new SignupObj(driver);
	  so.enterfullname().sendKeys(Constant.fullname);
	  Thread.sleep(2000);
	  so.enteremail().sendKeys(Constant.email1);
	  Thread.sleep(2000);
	  so.enterpassword().sendKeys(Constant.password);
     so.enterphone().sendKeys(Constant.phone);
     so.Clickonstatus().click();
   
	
}
	  
	  }
 

