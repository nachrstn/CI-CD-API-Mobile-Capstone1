package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllTransactions {
    protected static String url = "https://dev.reprohealth.my.id/transactions/patients/6a28df99-3093-4b94-9450-be13ace313b9";

    @Step("I set GET endpoint all transactions")
    public String setGetEndpointAllTransactions(){
        return url;
    }

    @Step("I send GET HTTP request all transactions")
    public void sendGetRequestAllTransactions(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetEndpointAllTransactions());
    }

    @Step("I receive response code 200 for get all transactions")
    public void resCode200GetAllTransactions(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
