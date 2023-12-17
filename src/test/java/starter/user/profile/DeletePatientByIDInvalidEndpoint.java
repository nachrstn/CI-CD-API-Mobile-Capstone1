package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletePatientByIDInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/pat1ents/5f4d19e6-be16-4550-8238-495fcd8e9c06";

    @Step("I set DELETE patient by id invalid endpoint")
    public String setDeletePatientByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send DELETE HTTP request patient by id invalid endpoint")
    public void sendDeleteRequestPatientByIDInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .delete(setDeletePatientByIDInvalidEndpoint());
    }

    @Step("I receive response code 404 patient by id invalid endpoint")
    public void resCode404DeletePatientByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}


