package base;

import drivers.CapabilitiesManager;
import drivers.DriverManager;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

import java.net.URL;

public class BaseTest {

    @BeforeMethod
    public void setUp() throws Exception {

        AndroidDriver driver =
                new AndroidDriver(
                        new URL(
                                ConfigReader.get("appiumServer")),
                        CapabilitiesManager.getOptions());

        DriverManager.setDriver(driver);
    }

    @AfterMethod
    public void tearDown() {

        DriverManager.quitDriver();
    }
}