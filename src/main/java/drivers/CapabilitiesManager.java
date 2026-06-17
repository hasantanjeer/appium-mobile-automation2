package drivers;

import io.appium.java_client.android.options.UiAutomator2Options;
import utils.ConfigReader;

public class CapabilitiesManager {

    public static UiAutomator2Options getOptions() {

        UiAutomator2Options options =
                new UiAutomator2Options();

        options.setPlatformName(
                ConfigReader.get("platformName"));

        options.setDeviceName(
                ConfigReader.get("deviceName"));

        options.setAutomationName(
                ConfigReader.get("automationName"));

        options.setApp(
                ConfigReader.get("app"));

        return options;
    }
}