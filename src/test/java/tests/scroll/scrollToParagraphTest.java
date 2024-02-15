package tests.scroll;

import tests.base.BaseTests;
import org.testng.annotations.Test;

public class scrollToParagraphTest extends BaseTests {
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
