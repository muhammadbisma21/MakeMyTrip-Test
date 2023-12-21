package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

    public BasePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait){
    this.driver =driver;
    this.explicitWait = explicitWait;
    }

    protected final void clickAndWait(WebElement element){
        explicitWait.get().until(ExpectedConditions.elementToBeClickable(element)).click();

    }


    protected final String getText(WebElement element){
        String actualText = explicitWait.get().until(ExpectedConditions.visibilityOf(element)).getText();
        return actualText;

    }


}
