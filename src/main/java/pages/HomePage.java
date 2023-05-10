package pages;

import org.openqa.selenium.By;
import utilities.CommonUtils;

public class HomePage {
    CommonUtils util = new CommonUtils();
    By SearchBox = By.xpath("//input[@id='twotabsearchtextbox']");
    By SearchButton = By.xpath("//input[@id='nav-search-submit-button']");

    String searchKeyWord = "Socks";


    public void searchProduct(){
        util.getElement(SearchBox).isDisplayed();
        util.getElement(SearchBox).sendKeys(searchKeyWord);
        util.getElement(SearchButton).click();
    }


//    public void signIn(){
//        driver.findElement(SearchBox).sendKeys(searchKeyWord);
//        driver.findElement(SearchButton).click();
//        driver.findElement(SelectSocks).click();
//        driver.findElement(WaitForProductTitle).isDisplayed();
//        driver.findElement(AddToCart).click();
//        driver.findElement(Cart).click();
//        driver.findElement(ProceedToCart).isDisplayed();
//        driver.findElement(ProceedToCart).click();
//        driver.findElement(AddNewAddress).isDisplayed();
//        driver.findElement(FullName).sendKeys(name);
//        driver.findElement(AddressXpath).sendKeys(address);
//        driver.findElement(CityXpath).sendKeys(city);
//        driver.findElement(StateDropdown).click();
//        driver.findElement(SelectStateValue).click();
//        driver.findElement(zipCodeXpath).clear();
//        driver.findElement(zipCodeXpath).sendKeys(zipCode);
//        driver.findElement(UseThisAddressButton).click();
//        System.out.println("Page title -- "+driver.getTitle());
//}

}
