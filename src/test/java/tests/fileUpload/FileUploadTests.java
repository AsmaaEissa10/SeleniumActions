package tests.fileUpload;

import tests.base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\Asmaa\\seleniumActionsProject\\1\\SeleniumActions\\resources\\ISTQB_CTFL_Syllabus-v4.0-1.pdf");
        Assert.assertEquals(uploadPage.getUploadFiles(),"ISTQB_CTFL_Syllabus-v4.0-1.pdf", "upload failed");
    }
}
