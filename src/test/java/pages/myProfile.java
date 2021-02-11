package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import Utils.GeneratedUtils;
import io.appium.java_client.MobileBy;
import nexar_tests.baseTest;

public class myProfile {

	public static void clickUserInformation() {
		// Click 'user information'
		try {
			GeneratedUtils.sleep(500);
			By element = By.xpath(selectors.myProfile.userInformation);
			System.out.println("Clicking on user information");
			baseTest.driver.findElement(element).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickUserName() {
		// Click 'user name'
		try {
			GeneratedUtils.sleep(500);
			By element = MobileBy.iOSNsPredicateString(selectors.myProfile.userName);
			System.out.println("Clicking on user name");
			baseTest.driver.findElement(element).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickUserNameField() {
		try {
			GeneratedUtils.sleep(500);
			By element = By.xpath(selectors.myProfile.userNamefield);
			System.out.println("Clicking on user name field");
			baseTest.driver.findElement(element).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeNewUserName(String newUsername) {
		try {
			// 7. Type 'test' in 'XCUIELEMENTTYPETEXTFIELD3'
			GeneratedUtils.sleep(500);
			By element = By.xpath(selectors.myProfile.userNamefield);
			System.out.println("clearing and writing the new name");
			baseTest.driver.findElement(element).clear();
			baseTest.driver.findElement(element).sendKeys(newUsername);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickKBDDone() {
		// Click 'user information'
		try {
			// 8. Click 'done1'
			GeneratedUtils.sleep(500);
			By element = MobileBy.ByIosClassChain.iOSClassChain(selectors.myProfile.KBDDone);
			System.out.println("Clicking KeyBoard done");
			baseTest.driver.findElement(element).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickDoneandBack() {
		// Click 'user information'
		try {
			// 9. Click 'Done2'
			GeneratedUtils.sleep(500);
			By element = By.xpath(selectors.myProfile.doneForm);
			System.out.println("Clicking update form done");
			baseTest.driver.findElement(element).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void editMyinformation(String newUsername) {
		try {
			System.out.println("updating the user infromation");
			clickUserName();
			clickUserNameField();
			writeNewUserName(newUsername);
			clickKBDDone();
			clickDoneandBack();
			System.out.println("update userinformation done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateLastNameValidtion(String newUsername) {
		try {
			System.out.println("validating user information");
			GeneratedUtils.sleep(500);
			By element = By.xpath(selectors.myProfile.userNamefieldValidation);
			String currentName = baseTest.driver.findElement(element).getText();
			System.out.println("current name is: " + currentName);
			Assertions.assertTrue(currentName.contains(newUsername), "Validtion failed name is: " + currentName);
			System.out.println("validtion success user information");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
