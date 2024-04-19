package pages.scroll;

import pages.base.BaseTests;
import org.testng.annotations.Test;

public class scrollToParagraphTest extends BaseTests {
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
