package pages.dropDown;

import pages.base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

//    the first way
     @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();

        String option = "Option 2";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOption();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");
    }

//    the second way
//   @Test
//       public void testSelectionOption(){
//       var dropDownPage = homePage.clickDropDown();
//       String option = "Option 2";
//       dropDownPage.getSelectedOption(option);
//   }

}

