package PageActions;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.nonRunnable.BaseClass;

import PageObjects.LoginPage;


public class LoginPageActions extends BaseClass {
	private LoginPage lp;
	
	//public static final Logger logger =LogManager.getLogger(BaseClass.class);
	 public LoginPageActions(WebDriver driver) {
		 this.lp=new LoginPage(driver);
		 
	 }
	public void enterUsername(String name) {
		logger.info("In enterUserName");
		enterText(lp.getUsername(), name);
		logger.info("User entered the UserName");

	}
	public void enterPassword(String password) {
		enterText(lp.getPassword(), password);
		logger.info("User entered the Password");

	}
	public void ClickOnLoginBtn() {
		clickOnElement(lp.getLoginBtn());
		logger.info("User successfully logged in");
	}
	
}
