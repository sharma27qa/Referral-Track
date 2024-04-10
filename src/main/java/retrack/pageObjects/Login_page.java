package retrack.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	WebDriver driver;
	public Login_page (WebDriver driver){
		// initialization
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	//creating objects using page object factory 
	@FindBy(name ="Email")
	WebElement Email_fld;
	
	@FindBy(name ="Password")
	WebElement Password_fld;
	
	@FindBy(className ="Submit")
	WebElement submit_btn;
	
	@FindBy(linkText = "ForgotPassword")
	WebElement ForgotPass_btn;
	
	@FindBy(xpath="CreateAccount")
	WebElement createNew_btn;
	
	@FindBy(xpath="FirstName")
	WebElement frstname_fld;
	
	@FindBy(linkText= "MiddleName")
	WebElement midname_fld;
	
	@FindBy(linkText= "LastName")
	WebElement lstname_fld;
	

 public void loginApplication(String email, String password) {
	 Email_fld.sendKeys("eamil");
	 Password_fld.sendKeys("password");
	 submit_btn.click();
 }
  public void goTo() {
	  
  }
}
