package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


	public LoginPage(WebDriver driver) {
        super(driver);
    }


	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement loginBtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	

}
