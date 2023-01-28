package Pages;

import Utils.DriverManager;
import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(DriverManager.getDriver(),this);}

    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    public WebElement acceptCokies;

    @FindBy(xpath = "//a[@aria-label='Amazon.com.tr']")
    public WebElement VerifyWeb;

    @FindBy(xpath = "//span[@class='hm-icon-label']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//div[text()='Bilgisayar']")
    public WebElement computerFeature;

    @FindBy(xpath = "//a[@href='/gp/browse.html?node=12601907031&ref_=nav_em_co_tablets_0_2_5_4']")
    public WebElement TabletsFeature;

    @FindBy(xpath = "//span[text()='Android 11']")
    public WebElement selectAndroidEleven;


}
