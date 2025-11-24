package co.com.autoex.QA.tasks;

import co.com.autoex.QA.interactions.EnterThe;
import co.com.autoex.QA.models.ProductData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


import static co.com.autoex.QA.userinterfaces.SearchProductUI.SEARCH_PRODUCT;

public class SearchProductNamed implements Task {

    private final ProductData productName;


    public SearchProductNamed(ProductData productName) {
        this.productName = productName;
    }


    public static SearchProductNamed with(String productName) {
        ProductData data = new ProductData(productName);
        return Tasks.instrumented(SearchProductNamed.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                EnterThe.text(productName.getProductName(),SEARCH_PRODUCT));

 ;   }
}
