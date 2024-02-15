package tests.alerts;

import tests.base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {
    @Test(priority = 1)
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        Assert.assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Results text incorrect");
    }
    @Test(priority = 2)
        public void testGetTextFromAlert(){

            var alertsPage = homePage.clickJavaScriptAlerts();
            alertsPage.triggerConfirm();

            String text = alertsPage.alert_getText();
            alertsPage.alert_clickToDismiss();

            Assert.assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }
    @Test(priority = 3)
    public void testSetInputInAlert(){

        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();

        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();

        Assert.assertEquals(alertsPage.getResult(), "You entered: " + text, "Results text incorrect");
    }
}
