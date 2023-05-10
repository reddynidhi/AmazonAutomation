package pages;

import org.openqa.selenium.By;
import utilities.CommonUtils;

public class CheckoutPage {

    CommonUtils util = new CommonUtils();
    By AddNewAddress = By.xpath("//h2[text()='Add a new address']");
    By FullName = By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']");
    By AddressXpath = By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']");
    By Address2 = By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']");
    By CityXpath = By.xpath("//input[@id='address-ui-widgets-enterAddressCity']");
    By zipCodeXpath = By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']");
    By StateDropdown = By.xpath("//span[text()='Select']");
    By SelectStateValue = By.xpath("//a[text()='Nebraska']");
    By UseThisAddressButton = By.xpath("//span[@id='address-ui-widgets-form-submit-button']");

    String name = "First Last";
    String address = "6001 Dodge St";
    String city = "Omaha";
    String zipCode = "68182";

    public void checkoutProduct(){
        if(util.getElements(AddNewAddress).size()>0) {
            //driver.findElement(AddNewAddress).isDisplayed();
            util.getElement(FullName).sendKeys(name);
            util.getElement(AddressXpath).sendKeys(address);
            util.getElement(CityXpath).sendKeys(city);
            util.getElement(StateDropdown).click();
            util.getElement(SelectStateValue).click();
            util.getElement(zipCodeXpath).clear();
            util.getElement(zipCodeXpath).sendKeys(zipCode);
            util.getElement(UseThisAddressButton).click();
        }
        else {
            System.out.println("Address already Exists, please proceed to payment");
        }
    }
}
