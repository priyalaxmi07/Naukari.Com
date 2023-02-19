package testCases;

import java.io.IOException;
import java.lang.constant.Constable;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import PageObjectmodel.LoginPageObj;
import PageObjectmodel.SignupObj;
import Resources.Baseclass;
import Resources.Constant;

public class Signup  extends Baseclass{
private static final String child_fream = null;

@Test
	public void Signup() throws IOException, InterruptedException{
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
 
      Thread.sleep(2000);
	   so.clickOnresume().click();
	   Thread.sleep(2000);
	   driver.switchTo().window(child_fream);
	   so.clickOnregister().click();
	//  so.clickOntitle().click();
	  
	//  so.clickOnstart().click();
	
}
	  
	  }
 

