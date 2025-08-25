package PageActions;

import org.openqa.selenium.WebDriver;

import com.nonRunnable.BaseClass;

import PageObjects.BookHotel;

public class BookPageActions extends BaseClass {
	private BookHotel bp;

    public BookPageActions(WebDriver driver) {
    	this.bp=new BookHotel(driver);
	}

	public void enterFirstName(String firstName) {
        enterText(bp.getFirstName(), firstName);
        logger.info("User entered firstname");
    }

    public void enterLastName(String lastName) {
        enterText(bp.getLastName(), lastName);
        logger.info("User entered lastname");
    }

    public void enterBillingAddress(String address) {
        enterText(bp.getAddress(), address);
        logger.info("User entered billing address");
    }

    public void enterCreditCardNumber(String ccNumber) {
        enterText(bp.getCreditCardNumber(), ccNumber);
        logger.info("User entered creditcard number");
    }

    public void selectCreditCardType(String cardType) {
        selectAnElement(bp.getCreditCardType(), "byVisibleText", cardType, 0);
        logger.info("User Selected creditcard type");
    }

    public void selectExpiryMonth(String month) {
        selectAnElement(bp.getExpiryMonth(), "byVisibleText", month, 0);
        logger.info("User Selected expiry month");
    }

    public void selectExpiryYear(String year) {
        selectAnElement(bp.getExpiryYear(), "byVisibleText", year, 0);
        logger.info("User Selected expiry year");
    }

    public void enterCVV(String cvv) {
        enterText(bp.getCvvNumber(), cvv);
        logger.info("User entered Cvv number");
    }

    public void clickBookNow() {
        clickOnElement(bp.getBookNowButton());
        logger.info("User successfully booked a room.");
    }
    public void ClickLogoutButton() {
        clickOnElement(bp.getlogoutButton());
        logger.info("User clicked logout button");
    }
    public void ClickgetGoHomeButton() {
        clickOnElement(bp.getGoHomeButton());
        logger.info("User successfully navigates to homepage");
    }

}
