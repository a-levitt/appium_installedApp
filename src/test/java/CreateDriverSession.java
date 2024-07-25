import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
    public static void main(String[] args) throws MalformedURLException {

        /*String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator +
                "main" + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";*/

        UiAutomator2Options options = new UiAutomator2Options().
             //   setAutomationName("UiAutomator2").
             //   setPlatformName("Android").
                setUdid("*****").
                setAppPackage("io.appium.android.apis").
                setAppActivity(".accessibility.CustomViewAccessibilityActivity");

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new AndroidDriver(url, options);
    }
}
