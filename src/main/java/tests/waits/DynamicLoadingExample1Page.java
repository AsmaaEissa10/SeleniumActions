package tests.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }

    // Implicit Wait
    public void clickStartExplicitWaits(){
        driver.findElement(startButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    // Explicit Wait
    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndicator)));
    }
  //  Fluent Wait
  public void clickStartFluentWaits (){
      driver.findElement(startButton).click();
      FluentWait wait = new FluentWait(driver)
              .withTimeout(Duration.ofSeconds(5))
              .pollingEvery(Duration.ofSeconds(1));

      wait.until(ExpectedConditions.invisibilityOf(
              driver.findElement(loadingIndicator)));
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }
}
