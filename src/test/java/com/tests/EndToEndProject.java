package com.tests;

import com.nonRunnable.BaseClass;
import PageActions.BookPageActions;
import PageActions.LoginPageActions;
import PageActions.SearchPageActions;


public class EndToEndProject extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		BrowserLaunch();
		launchApp("https://adactinhotelapp.com/");
		maximizeWindow();
		implicitWait();
		lowWait();
//		------1.Login Page-----
		LoginPageActions lpa = new LoginPageActions(driver);
		lpa.enterUsername("Dony12sl");
		lpa.enterPassword("Dony1234@");
		lpa.ClickOnLoginBtn();
//		 -----2.Search Hotel------
		SearchPageActions spa=new SearchPageActions(driver);
		spa.selectLocation("byVisibleText", "Melbourne", 0);
		spa.selectHotel("byVisibleText", "Hotel Sunshine", 0);
		spa.selectRoomType("byVisibleText", "Double", 0);
		spa.selectNumberOfRooms("byVisibleText", "4 - Four", 0);
		spa.enterCheckInDate("17/07/2025");
		spa.enterCheckInDate("20/07/2025");
		spa.selectAdults("byVisibleText", "3 - Three", 0);
		spa.selectChildren("byVisibleText", "2 - Two", 0);
		spa.clickSearchButton();
		spa.clickRadioButton();
		spa.clickContinueButton();

//     -----3.Book Hotel------
		BookPageActions bpa=new BookPageActions(driver);
		bpa.enterFirstName("Dony");
		bpa.enterLastName("SL");
		bpa.enterBillingAddress("Kanyakumari");
		bpa.enterCreditCardNumber("677667777776662111");
		bpa.selectCreditCardType("Master Card");
		bpa.selectExpiryMonth("May");
		bpa.selectExpiryYear("2026");
		bpa.enterCVV("3456");
		bpa.clickBookNow();
		bpa.ClickLogoutButton();
		bpa.ClickgetGoHomeButton();
	  
	}

}
