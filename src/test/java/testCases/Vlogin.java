package testCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectmodel.LoginPageObj;
import Resources.Baseclass;

import Resources.Constant;

public class Vlogin extends Baseclass {
	
	@Test
	public void Vlogin ()throws IOException, InterruptedException {
	LoginPageObj lpo = new LoginPageObj(driver);	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		lpo.enterUsername().sendKeys(Constant.username);
		lpo.enterPassword().sendKeys(Constant.password);
	lpo.clickOnLogin().click();
	Thread.sleep(2000);
	lpo.UseOtpToLogin().click();
	Thread.sleep(2000);
	lpo.SignInWith().click();
	driver.quit();

	}
/*	@DataProvider
	public Object[][] testData() {
		Object[][] data = new Object[2][2];
		data[0][0] = Constant.username;
		data[0][1] = Constant.password;
		data[1][0] = Constant.username2;
		data[1][1]=Constant.password2;
		return data;
}*/
}
