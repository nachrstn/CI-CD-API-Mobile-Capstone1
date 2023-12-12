package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetPatientByIDInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/pat1ents/6a28df99-3093-4b94-9450-be13ace313b9";

    @Step("I set GET patient by id invalid endpoint")
    public String setGetPatientByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request patient by id invalid endpoint")
    public void sendGetRequestPatientByIDInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetPatientByIDInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get patient by id invalid endpoint")
    public void resCode404GetPatientByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

