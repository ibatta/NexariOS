package nexar_tests;

import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.ios.IOSDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import pages.myProfile;

import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Utils.GeneratedUtils;

/**
 * Project: Nexar
 * Test: Change Name POC
 * Generated by: Ibrahem batta (ibatta@us.itgsoftware.com)
 * Generated on Thu Feb 11 12:46:25 GMT 2021.
 */
@DisplayName("Change Name POC")
public class ChangeNameTest_Poc extends baseTest implements ExceptionsReporter {

	public static String newUsername; 
	
  @BeforeAll
  static void setup() throws Exception {
    driver = new IOSDriver<>("PVY_A4fC8gitPK0GDQ_1ItEceSwYUULpW4V-Y4LyORY1", baseTest.getCapabilities(), "Ibrahem batta");
    newUsername = RandomStringUtils.randomAlphanumeric(5);;
  }

  @DisplayName("Change Name POC")
  @Test
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);

    // 1. Launch the app
    GeneratedUtils.sleep(500);
    driver.launchApp();
    
    // 2. remove add dash-cam screen
    pages.HomePage.byPass(); 

    // 3. Navigate to my profile
    pages.HomePage.navigateToMyProfile();

    // 4. Click 'user information'
    myProfile.clickUserInformation();

	// 5. do 'Edit'
    myProfile.editMyinformation(newUsername);

    // 6. validation
    myProfile.updateLastNameValidtion(newUsername);

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

}