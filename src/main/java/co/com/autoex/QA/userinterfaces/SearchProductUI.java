package co.com.autoex.QA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchProductUI extends PageObject {
    public static final Target SEARCH_PRODUCT = Target.the("Search product")
            .locatedBy("//*[@id='search_product']");

    public static final Target BUTTON_SEARCH = Target.the("Button search")
            .locatedBy("//*[@id='submit_search']");
}
