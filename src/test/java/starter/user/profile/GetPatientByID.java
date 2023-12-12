package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetPatientByID {
    protected static String url = "https://dev.reprohealth.my.id/patients/6a28df99-3093-4b94-9450-be13ace313b9";

    @Step("I set GET endpoint patient by id")
    public String setGetEndpointPatientByID(){
        return url;
    }

    @Step("I send GET HTTP request patient by id")
    public void sendGetRequestPatientByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetEndpointPatientByID());
    }

    @Step("I receive response code 200 for get patient by id")
    public void resCode200GetPatientByID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
