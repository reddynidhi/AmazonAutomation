package testCases;

import baseSetup.BaseClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SignInPage;
import utilities.CommonUtils;

public class TestScripts {

    BaseClass baseClass = new BaseClass();
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    CheckoutPage checkout = new CheckoutPage();

    String filepath = System.getProperty("user.dir")+"/src/main/java/config/config.properties";

    @Test (enabled = false)
    public void testProperty(){
        String filepath = System.getProperty("user.dir")+"/src/main/java/config/config.properties";
        baseClass.initializeProperties(filepath);
        baseClass.readProperty("applicationUrl");

    }

    @Test
    public void buySocks(){
        baseClass.launchBrowser();
        signInPage.login();
        homePage.searchProduct();
        productDetailsPage.addProductToCart();
        checkout.checkoutProduct();
    }


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite execution");
        baseClass.initializeProperties(filepath);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        CommonUtils.driver.close();
        CommonUtils.driver.quit();
    }


}
