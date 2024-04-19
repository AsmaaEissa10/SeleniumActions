package pages.waits;

import pages.base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTest extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStartFluentWaits();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
