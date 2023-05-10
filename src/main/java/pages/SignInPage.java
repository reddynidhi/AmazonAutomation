package pages;

import org.openqa.selenium.By;
import utilities.CommonUtils;
import utilities.Data;
public class SignInPage {

    CommonUtils util = new CommonUtils();
    Data data = new Data();
    By SignInButton = By.xpath("//a[@id='nav-link-accountList']");
    By LoginId = By.xpath("//input[@id='ap_email']");
    By Continue = By.xpath("//input[@id='continue']");
    By Password = By.xpath("//input[@id='ap_password']");
    By SignIn = By.xpath("//input[@id='signInSubmit']");

    String userId = "userId";
    String password = "Password";

    public void login(){
        util.getElement(SignInButton).click();
        util.getElement(LoginId).sendKeys(userId);
        util.getElement(Continue).click();
        util.getElement(Password).sendKeys(password);
        util.getElement(SignIn).click();
    }
}
