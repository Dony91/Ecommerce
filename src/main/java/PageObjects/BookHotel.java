package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel extends BasePage {

	public BookHotel(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement lastName;

    @FindBy(id = "address")
    private WebElement address;

    @FindBy(id = "cc_num")
    private WebElement creditCardNumber;

    @FindBy(id = "cc_type")
    private WebElement creditCardType;

    @FindBy(id = "cc_exp_month")
    private WebElement expiryMonth;

    @FindBy(id = "cc_exp_year")
    private WebElement expiryYear;

    @FindBy(id = "cc_cvv")
    private WebElement cvvNumber;

    @FindBy(id = "book_now")
    private WebElement bookNowButton;
    @FindBy(id = "logout")
    private WebElement logoutButton;
    @FindBy(xpath = "//a[@href='index.php']")
    private WebElement GoHomeButton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	public WebElement getlogoutButton() {
		return logoutButton;
	}
	public WebElement getGoHomeButton() {
		return GoHomeButton;
	}
    

}
