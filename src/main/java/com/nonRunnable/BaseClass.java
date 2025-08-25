package com.nonRunnable;


import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
	

	public  class BaseClass {
		public static WebDriver driver;
		public static final Logger logger =LogManager.getLogger(BaseClass.class);
		
		public static void BrowserLaunch()
		{

	    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
//			driver.manage().window().maximize();
		}
		
		public static void maximizeWindow() {
			driver.manage().window().maximize();
		}
		
		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		public static void launchApp(String url) {
			driver.get(url);
		}
		
		public static String getTitle() {
			return driver.getTitle();
		}
		
		public static void enterText(WebElement element, String value) {
			element.sendKeys(value);
		}
		
		public static void clickOnElement(WebElement element) {
			element.click();
		}

		public static void clearField(WebElement element) {
			element.clear();
		}
		
		public static void switchToAlert(String action, String value) {
			Alert a = driver.switchTo().alert();
			if(action.equalsIgnoreCase("accept")) {
				a.accept();
			}else if(action.equalsIgnoreCase("dismiss")) {
				a.dismiss();
			}else if(action.equalsIgnoreCase("sendKeys")) {
				a.sendKeys(value);
			}
		}
		
		public static String getTextFromAlert() {
			Alert a = driver.switchTo().alert();
			return a.getText();
		}
		
		public static void lowWait() throws InterruptedException {
			Thread.sleep(1000);
		}
		
		public static void selectAnElement(WebElement element, String selectMethod, String value, int index) {
			Select s = new Select(element);
			if(selectMethod.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);
			}else if (selectMethod.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(value);
			}else if(selectMethod.equalsIgnoreCase("byIndex")) {
				s.selectByIndex(index);
			}
		}
		
//		public static void waitUntilVisibility(WebElement element, int duration) {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
//			wait.until(ExpectedConditions.visibilityOf(element));
//		}
		
		
		
		public static void tearDown() {
			driver.quit();
		}
		

	}