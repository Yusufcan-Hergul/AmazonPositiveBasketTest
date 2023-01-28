package Pages;

import Utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingPage {

    public ShopingPage(){PageFactory.initElements(DriverManager.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal'][1]")
    public WebElement SelectFirstProduct;

    @FindBy(xpath = "//span[@id='acrCustomerReviewText'][1]")
    public WebElement RecommentButton;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement AddBasket;

    @FindBy(xpath = "//a[@href=\"/gp/cart/view.html?ref_=sw_gtc\"]")
    public WebElement ClickBasket;

    @FindBy(xpath = "//img[@alt=\"Lenovo Tab M10 HD Tablet 3.Nesil, 10.1'' WUXGA, Unisoc T610, 1.8 GHz, 3GB RAM, 32GB, Fırtına Gri, ZAAE0015TR, Yeni bir sekmede açılır\"]")
    public WebElement VerifyProductInBasket;
}
