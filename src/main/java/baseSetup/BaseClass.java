package baseSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    static File file;
    static Properties properties;
    static FileInputStream fileInputStream;
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if ( driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void initializeProperties(String filePath) {
        file = new File(filePath);
        try {
            fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found " +e.getMessage());
        } catch (IOException e) {
            System.out.println("Properties file not found " +e.getMessage());
        }
    }

    public static String readProperty (String property){
        return properties.getProperty(property);
    }

    public static void launchBrowser() {
        //Get Chrome
        //System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
        getDriver().get(readProperty("applicationUrl"));
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    }

}
