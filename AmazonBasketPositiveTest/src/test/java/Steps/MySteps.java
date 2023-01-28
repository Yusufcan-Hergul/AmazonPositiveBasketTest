package Steps;

import Pages.HomePage;
import Pages.ShopingPage;
import Utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MySteps {

    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
    HomePage Hpage= new HomePage();
    ShopingPage Spage= new ShopingPage();

    @Given("User open web.")
    public void userOpenWeb() {
        driver.get("https://www.amazon.com.tr/ref=nav_logo");

    }

    @When("Verify open the web.")
    public void verifyOpenTheWeb() {
        Hpage.acceptCokies.click();
        Assert.assertTrue(Hpage.VerifyWeb.isDisplayed());
    }

    @And("Click hamburger menu.")
    public void clickHamburgerMenu() {
        Hpage.hamburgerMenu.click();
    }

    @And("Click computers.")
    public void clickComputers() {
        Hpage.computerFeature.click();
    }

    @And("Click tablets.")
    public void clickTablets() {
        wait.until(ExpectedConditions.elementToBeClickable(Hpage.TabletsFeature));
        Hpage.TabletsFeature.click();
    }

    @And("Select android eleven.")
    public void selectAndroidEleven() {
        wait.until(ExpectedConditions.elementToBeClickable(Hpage.selectAndroidEleven));
        Hpage.selectAndroidEleven.click();
    }

    @And("Click the first product.")
    public void clickTheFirstProduct() {
        Spage.SelectFirstProduct.click();
    }

    @And("Click product recommends.")
    public void clickProductRecommends() throws InterruptedException {
        Spage.RecommentButton.click();
        Thread.sleep(5000L);
    }

    @And("Add product in the basket.")
    public void addProductInTheBasket() {
            Spage.AddBasket.click();
    }

    @And("Click basket.")
    public void clickBasket() {
        wait.until(ExpectedConditions.elementToBeClickable(Spage.ClickBasket));
        Spage.ClickBasket.click();
    }

    @And("Verify product in the basket")
    public void verifyProductInTheBasket() {
        Assert.assertTrue(Spage.VerifyProductInBasket.isDisplayed());
    }
}
