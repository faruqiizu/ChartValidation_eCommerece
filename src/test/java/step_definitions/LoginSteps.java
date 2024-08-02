package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    LoginPage loginPage = new LoginPage(driver);

    @Given("User open the website")
    public void userOpenTheWebsite() throws InterruptedException {
        loginPage.clickButtonLoginMasuk();
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.emailDisplayed());
    }

    @When("User input {string} as a email {string} as a password")
    public void userInputAsAEmailAsAPassword(String email, String password) throws InterruptedException {
        loginPage.setEmail(email);
        driverWait.until(ExpectedConditions.elementToBeClickable(LoginPage.buttonSelanjutnya));
        loginPage.clickButtonSelanjutnya();
        driverWait.until(ExpectedConditions.elementToBeClickable(LoginPage.password));
        loginPage.setPassword(password);
        Thread.sleep(2000);
    }

    @Then("User click button Masuk")
    public void userClickButtonMasuk() throws InterruptedException {
//        Thread.sleep(5000);
        driverWait.until(ExpectedConditions.elementToBeClickable(LoginPage.buttonLogin));
        loginPage.clickButtonLogin();
    }

    @And("User already on home page")
    public void userAlreadyOnHomePage() throws InterruptedException {
        Thread.sleep(3000);
        driverWait.until(ExpectedConditions.elementToBeClickable(LoginPage.logoTokpedDashboardePage));
        Assert.assertTrue(loginPage.setLogoTokpedDashboardPage());
        Thread.sleep(3000);
        driverWait.until(ExpectedConditions.elementToBeClickable(LoginPage.searchBarDashboard));
        Assert.assertTrue(loginPage.setSearchBarDashboard());
    }

    @When("User search for {string}")
    public void userSearchFor(String arg0) {
    }

    @And("User add {string} to cart")
    public void userAddToCart(String arg0) {
    }

    @Then("User should see {string} in the cart")
    public void userShouldSeeInTheCart(String arg0) {
    }

    @When("User proceeds to checkout")
    public void userProceedsToCheckout() {
    }

    @Then("User should see {string} in the checkout page")
    public void userShouldSeeInTheCheckoutPage(String arg0) {
    }

    @When("User completes checkout")
    public void userCompletesCheckout() {
    }

    @And("User clicks logout button")
    public void userClicksLogoutButton() {
    }

    @Then("User should be redirected to login page")
    public void userShouldBeRedirectedToLoginPage() {
    }
}
