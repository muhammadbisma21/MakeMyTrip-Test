package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage{
    public LandingPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
        super(driver, explicitWait);
        PageFactory.initElements(driver.get(), this);
    }

    //pilih penerbangan Asal
    @FindBy(xpath = "//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']")
    WebElement btnFrom;

    @FindBy(xpath = "//li[.='Bangkok, Thailand BangkokBKK']")
    WebElement searchFrom;


    //pilih penerbangan tujuan
    @FindBy(xpath = "//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']")
    WebElement btnTo;

    @FindBy(xpath = "//li[.='Mumbai, India Chhatrapati Shivaji International AirportBOM']")
    WebElement searchTo;

//    //Pilih tanggal penerbangan
    @FindBy(css = "[aria-label='Sun Dec 31 2023']")
    WebElement selectDate;

    //Klik Search
    @FindBy(xpath = "//a[.='Search']")
    WebElement btnSearch;

    public void search(){
    clickAndWait(btnFrom);
    clickAndWait(searchFrom);
    clickAndWait(btnTo);
    clickAndWait(searchTo);
    clickAndWait(selectDate);
    clickAndWait(btnSearch);
    }
}
