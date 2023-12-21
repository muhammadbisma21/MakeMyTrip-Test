package Test;

import Page.LandingPage;
import Page.SchedulePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtractTest extends BaseWebTest{

    @Test
    public void successExtract(){
        LandingPage landingPage = new LandingPage(driver, explicitWait);
        SchedulePage schedulePage = new SchedulePage(driver, explicitWait);
        landingPage.search();
        schedulePage.setGetPrice();
        String txtExpPrice = "₹ 12,575\n" +
                "per adult";
        Assert.assertEquals(txtExpPrice, schedulePage.setGetPrice());

    }

}
