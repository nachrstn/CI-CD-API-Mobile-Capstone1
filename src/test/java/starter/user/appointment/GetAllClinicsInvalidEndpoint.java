package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetAllClinicsInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/clin1cs";

    @Step("I set GET all clinics invalid endpoint")
    public String setGetAllClinicsInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all clinics invalid endpoint")
    public void sendGetRequestAllClinicsInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetAllClinicsInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get all clinics invalid endpoint")
    public void resCode400GetAllClinicsInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
