package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletePatientByID {
    protected static String url = "https://dev.reprohealth.my.id/patients/5f4d19e6-be16-4550-8238-495fcd8e9c06";

    @Step("I set DELETE endpoint patient by id ")
    public String setDeleteEndpointPatientByID(){
        return url;
    }

    @Step("I send DELETE HTTP request patient by id")
    public void sendDeleteRequestPatientByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .delete(setDeleteEndpointPatientByID());
    }

    @Step("I receive response code 200 patient by id")
    public void resCode200DeletePatientByID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

