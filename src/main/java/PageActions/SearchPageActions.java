package PageActions;

import org.openqa.selenium.WebDriver;

import com.nonRunnable.BaseClass;

import PageObjects.SearchHotel;

public class SearchPageActions  extends BaseClass {
private SearchHotel sh;
	
	public SearchPageActions(WebDriver driver) {
		this.sh=new SearchHotel(driver);
	}
	public void selectLocation(String location,String value, int index) {
		selectAnElement(sh.getLocationSelect(), location, value, index);
		logger.info("User Selected Location");
    }

    public void selectHotel(String hotel,String value, int index) {
    	selectAnElement(sh.getHotelsSelect(), hotel, value, index);
    	logger.info("User Selected Hotel");
    }

    public void selectRoomType(String roomType,String value, int index) {
    	selectAnElement(sh.getRoomTypeSelect(), roomType, value,index);
    	logger.info("User Selected RoomType");
    }

    public void selectNumberOfRooms(String roomCount,String value, int index) {
    	selectAnElement(sh.getRoomNosSelect(), roomCount, value,index);
    	logger.info("User Selected Number of Rooms");
    }
   
    public void enterCheckInDate(String date) {
        enterText(sh.getCheckInDate(), date);
        logger.info("User Selected Checkin Date");
    }

    public void enterCheckOutDate(String date) {
        enterText(sh.getCheckOutDate(), date);
        logger.info("User Selected Checkout date");
    }

    public void selectAdults(String adults,String value, int index) {
    	selectAnElement(sh.getAdultsSelect(), adults, value, index);
    	logger.info("User Selected Adults");
    }

    public void selectChildren(String children,String value, int index) {
    	selectAnElement(sh.getChildrenSelect(), children, value, index);
    	logger.info("User Selected Children");
    }

    public void clickSearchButton() {
        clickOnElement(sh.getSubmitBtn());
        logger.info("User successfully move to nextpage");
    }
    public void clickRadioButton() {
    	 clickOnElement(sh.getRadioBtn());
    	 logger.info("User clicked radiobutton");
    
    }
    public void clickContinueButton() {
    clickOnElement(sh.getContinueBtn());
    logger.info("User clicked continue button");
    }



}
