package utilities;

import baseSetup.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CommonUtils {

    public CommonUtils() {
        driver = BaseClass.getDriver();
    }

    public static WebDriver driver;

    public WebElement getElement(By selector) {
        try {
            return driver.findElement(selector);
        } catch (Exception e) {
            System.out.println(String.format("Element %s does not exist", selector));
        }
        return null;
    }

    public List<WebElement> getElements(By Selector) {
        try {
            return driver.findElements(Selector);
        } catch (Exception e) {
            throw new NoSuchElementException(String.format("Element %s did not display", Selector.toString()));
        }
    }

}
