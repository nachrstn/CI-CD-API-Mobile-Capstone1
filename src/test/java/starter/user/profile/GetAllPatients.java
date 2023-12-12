package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllPatients {
    protected static String url = "https://dev.reprohealth.my.id/patients";

    @Step("I set GET endpoint all patients")
    public String setGetEndpointAllPatients(){
        return url;
    }

    @Step("I send GET HTTP request all patients")
    public void sendGetRequestAllPatients(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetEndpointAllPatients());
    }

    @Step("I receive response code 200 for get all patients")
    public void resCode200GetAllPatients(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

