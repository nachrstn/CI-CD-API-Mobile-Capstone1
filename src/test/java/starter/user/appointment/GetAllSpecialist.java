package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllSpecialist {
    protected static String url = "https://dev.reprohealth.my.id/specialists";

    @Step("I set GET endpoint all specialist ")
    public String setGetEndpointAllSpecialist(){
        return url;
    }

    @Step("I send GET HTTP request all specialist")
    public void sendGetHttpRequestAllSpecialist(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetEndpointAllSpecialist());
    }

    @Step("I receive response code 200 for get all specialist")
    public void responseCode200ForGetAllSpecialist(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
