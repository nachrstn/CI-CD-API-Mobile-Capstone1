package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletePatientByID {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set DELETE endpoint patient by id ")
    public String setDeleteEndpointPatientByID(){
        return url;
    }

    @Step("I send DELETE HTTP request patient by id")
    public void sendDeleteRequestPatientByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .delete(setDeleteEndpointPatientByID());
    }

    @Step("I receive response code 200 patient by id")
    public void resCode200DeletePatientByID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

