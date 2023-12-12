package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllPatientsInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/pat1ents";

    @Step("I set GET all patients invalid endpoint")
    public String setGetAllPatientsInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all patients invalid endpoint")
    public void sendGetRequestAllPatientsInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetAllPatientsInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get all patients invalid endpoint")
    public void resCode404GetAllPatientsInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}


