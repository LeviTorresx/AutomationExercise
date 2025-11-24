package co.com.autoex.QA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ProductsPageUI extends PageObject {
    public static final Target PRODUCTS = Target.the("Products")
            .locatedBy("//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a");
    }