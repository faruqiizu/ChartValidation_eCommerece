package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//input[@id='email-phone']")
    public static WebElement email;
    @FindBy(xpath = "//input[@id='password-input']")
    public static WebElement password;
    @FindBy(xpath = "//button[@class='css-16r70d4']")
    public static WebElement buttonLoginMasuk;
    @FindBy(xpath = "//span[.='Selanjutnya']")
    public static WebElement buttonSelanjutnya;
    @FindBy(xpath = "/html/body/div[6]/div[2]/article/div/div[2]/form/button/span/span")
    public static WebElement buttonLogin;
    @FindBy(xpath = "//div[@class='css-y0w6gg']]")
    private WebElement errorPassword;
    @FindBy(xpath = "//span[@class='css-kz7khl']")
    public static WebElement fontMasuk;
    @FindBy(xpath = "//img[@alt='tokopedia-logo']")
    public static WebElement logoTokpedDashboardePage;
    @FindBy(xpath = "//div[@class='css-v1hkkg e1v32nag0']")
    public static WebElement searchBarDashboard;


    public void setEmail(String usrName) {
        email.sendKeys(usrName);
    }

    public void setPassword(String psword) {
        password.sendKeys(psword);
    }

    public void clickButtonSelanjutnya() {
        buttonSelanjutnya.click();
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }

    public void clickButtonLoginMasuk() {
        buttonLoginMasuk.click();
    }

    public String errorPassword() {
        return errorPassword.getText();
    }

    public boolean emailDisplayed() {
        return email.isDisplayed();
    }

    public boolean passwordDisplayed() {
        return password.isDisplayed();
    }

    public boolean setLogoTokpedDashboardPage() {
       return logoTokpedDashboardePage.isDisplayed();
    }

    public void clickSearchBarDashboard() {
        searchBarDashboard.click();
    }
    public boolean setSearchBarDashboard() {
        return searchBarDashboard.isDisplayed();
    }
}
