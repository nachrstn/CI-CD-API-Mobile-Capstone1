package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllClinics {
    protected static String url = "https://dev.reprohealth.my.id/clinics";

    @Step("I set GET endpoint all clinics ")
    public String setGetEndpointAllClinics(){
        return url;
    }

    @Step("I send GET HTTP request all clinics")
    public void sendGetRequestAllClinics(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetEndpointAllClinics());
    }

    @Step("I receive response code 200 for get all clinics")
    public void resCode200GetAllClinics(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
