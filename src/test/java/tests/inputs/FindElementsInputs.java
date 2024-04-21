package tests.inputs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsInputs {
    WebDriver driver;
@Test
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        // To find title of website
         System.out.println(driver.getTitle());

        // To find numbers of elements which have tag name "a"
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links);
        System.out.println(links.size());

        // the first way
        WebElement inputsLinks = driver.findElement(By.linkText("Inputs"));
        inputsLinks.click();

        // the second way
        // driver.findElement(By.linkText("Inputs")).click();








}
}
