package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllTransactions {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET endpoint all transactions")
    public String setGetEndpointAllTransactions(){
        return url;
    }

    @Step("I send GET HTTP request all transactions")
    public void sendGetRequestAllTransactions(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetEndpointAllTransactions());
    }

    @Step("I receive response code 200 for get all transactions")
    public void resCode200GetAllTransactions(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
