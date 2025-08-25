package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotel extends BasePage{

	public SearchHotel(WebDriver driver) {
		super(driver);
		
	}
	 @FindBy(id = "location")
	    private WebElement locationSelect;

	    @FindBy(id = "hotels")
	    private WebElement hotelsSelect;

	    @FindBy(id = "room_type")
	    private WebElement roomTypeSelect;

	    @FindBy(id = "room_nos")
	    private WebElement roomNosSelect;

	    @FindBy(name = "datepick_in")
	    private WebElement checkInDate;

	    @FindBy(name = "datepick_out")
	    private WebElement checkOutDate;

	    @FindBy(id = "adult_room")
	    private WebElement adultsSelect;

	    @FindBy(id = "child_room")
	    private WebElement childrenSelect;

	    @FindBy(id = "Submit")
	    private WebElement submitBtn;

	    @FindBy(id = "radiobutton_0")
	    private WebElement radioBtn;

	    @FindBy(id = "continue")
	    private WebElement continueBtn;

		public WebElement getLocationSelect() {
			return locationSelect;
		}

		public WebElement getHotelsSelect() {
			return hotelsSelect;
		}

		public WebElement getRoomTypeSelect() {
			return roomTypeSelect;
		}

		public WebElement getRoomNosSelect() {
			return roomNosSelect;
		}

		public WebElement getCheckInDate() {
			return checkInDate;
		}

		public WebElement getCheckOutDate() {
			return checkOutDate;
		}

		public WebElement getAdultsSelect() {
			return adultsSelect;
		}

		public WebElement getChildrenSelect() {
			return childrenSelect;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}

		public WebElement getRadioBtn() {
			return radioBtn;
		}

		public WebElement getContinueBtn() {
			return continueBtn;
		}


}
