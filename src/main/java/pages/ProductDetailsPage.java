package pages;

import org.openqa.selenium.By;
import utilities.CommonUtils;

import static baseSetup.BaseClass.driver;

public class ProductDetailsPage {

    CommonUtils util = new CommonUtils();
    By SelectSocks = By.xpath("//span[text()='10 Pairs Ankle Socks No Show Sock Low-Cut Athletic Men Women Cotton Socks']");
    By AddToCart = By.xpath("//input[@id='add-to-cart-button']");
    By Cart = By.xpath("//span[@id='nav-cart-count']");
    By WaitForProductTitle = By.xpath("//span[@id='productTitle']");
    By ProceedToCart = By.xpath("//input[@data-feature-id='proceed-to-checkout-action']");

    public void addProductToCart(){
        util.getElement(SelectSocks).click();
        driver.findElement(WaitForProductTitle).isDisplayed();
        util.getElement(AddToCart).click();
        util.getElement(Cart).click();
        driver.findElement(ProceedToCart).isDisplayed();
        util.getElement(ProceedToCart).click();
    }
}
