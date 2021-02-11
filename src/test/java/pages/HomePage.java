package pages;

import org.openqa.selenium.By;

import Utils.GeneratedUtils;
import io.appium.java_client.MobileBy;
import nexar_tests.baseTest;

public class HomePage {

	public static void byPass() {
		//Click 'Maybe Later'
	    try {
	    	System.out.println("passing addDashcam modal");
			GeneratedUtils.sleep(500);
			By element = MobileBy.iOSNsPredicateString(selectors.HomePage.byPass);
			baseTest.driver.findElement(element).click();
		} catch (Exception e) {
			System.out.println("addDashcam modal is not existed");
		}
	}

	public static void navigateToMyProfile() {
		// 3. Click 'XCUIELEMENTTYPEBUTTON' my profile
		try {
			System.out.println("Navigating to my profile");
		    GeneratedUtils.sleep(500);
		    By element = By.xpath(selectors.HomePage.myProfile);
		    baseTest.driver.findElement(element).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
