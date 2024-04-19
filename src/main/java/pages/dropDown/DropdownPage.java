package pages.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropdownPage(WebDriver driver){ this.driver = driver;}

    // the first way
    public Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOption(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

//    the secound way
//    public void getSelectedOption(String option) {
//        selectFromDropDown(option);
//    }
//    public void selectFromDropDown(String option){
//        WebElement element = driver.findElement(dropdown);
//        Select select = new Select(element);
//        select.selectByVisibleText(option);
//    }

    }

