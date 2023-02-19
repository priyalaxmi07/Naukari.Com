package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObj {

	private static final By tryforFree = null;

	public WebDriver driver;
	public By Register=By.xpath("//a[@href='https://www.naukri.com/registration/createAccount?othersrcp=22636']");
	private By username = By.xpath("//input[@id='usernameField']");
	private By password = By.xpath("//input[@id='passwordField']");
	private By login = By.xpath("//button[@type='submit'][1]");
	private By UseOItpToLogin = By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold otpButton textTransform']");
	public By SignInWithGoogle=By.xpath("//a[@class='socialbtn google']")	;
	
	public LoginPageObj(WebDriver driver2){
		this.driver= driver2;
	}
	public WebElement enterUsername() {
		return driver.findElement(username);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
	public WebElement UseOtpToLogin() {
		return driver.findElement(UseOItpToLogin);
	}
	public WebElement SignInWith() {
		return driver.findElement(SignInWithGoogle);}
	public WebElement clickOnSignup() {
		// TODO Auto-generated method stub
		return (WebElement) driver.manage();
	
	}
	public WebElement clickOnRegister() {
		return driver.findElement(Register);
	}
	//public WebElement clickOntryforFree() {
	//	return driver.findElement(tryforFree);
	//}
}
