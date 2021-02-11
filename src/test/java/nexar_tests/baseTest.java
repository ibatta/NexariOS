package nexar_tests;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.ios.IOSDriver;

public class baseTest {
	public static IOSDriver<? extends MobileElement> driver;
	
	  public static DesiredCapabilities getCapabilities() {
		    DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		    capabilities.setCapability(MobileCapabilityType.UDID, "00008020-000A150C3C84003A");
		    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Ideveloper’s iPhone");
		    capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "mobi.nexar.Nexar");
		    return capabilities;
		  }
	  
}
