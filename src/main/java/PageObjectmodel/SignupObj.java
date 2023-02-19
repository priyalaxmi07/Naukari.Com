package PageObjectmodel;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SignupObj {
	
	
	
	
	public WebDriver driver;
	public By Register=By.xpath("//a[@href='https://www.naukri.com/registration/createAccount?othersrcp=22636']");
	  private By fullname=By.xpath("//input[@class='formInput __input'][1]");
	  private By email=By.xpath("//input[@id='email']");
	  private By password=By.xpath("//input[@id='password']");
	  private By phone=By.xpath("//input[@id='mobile']");
	//  private By status=By.xpath("//div[@class='focusable optionWrap selected ']");
     private By resume= By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']");
	private By registerNow=By.xpath("//button[@type='submit']");
	  public  SignupObj(WebDriver driver2) {
	    this.driver=driver2;
	}
	public WebElement enterfullname() {
	    return driver.findElement(fullname);  }
	  public WebElement enterpassword() {
	    return driver.findElement(password)
	;}
	  public WebElement enteremail() {
	    return driver.findElement(email)
	;  }
	
	  public WebElement enterphone() {
	return driver.findElement(phone)
	;  }
	 public WebElement clickOnstart() {
    return driver.findElement(password)
	;  }

	public WebElement clickOntitle() {
		return driver.findElement(fullname);

	}
	public WebElement clickOnresume() {
		
		return driver.findElement(resume);
	}
	public WebElement clickOnregister() {
		
		return driver.findElement(Register);
	}
	public By getRegisterNow() {
		return registerNow;
	}
	public void setRegisterNow(By registerNow) {
		this.registerNow = registerNow;
	}


	}

		  
		  
		
