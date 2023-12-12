package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetAllDoctorsByClinicsInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/clinics/fd9d3738-3bcf-4693-9079-57ad3b375af5/doct0rs";

    @Step("I set GET all doctors by clinics invalid endpoint")
    public String setGetAllDoctorsByClinicsInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all doctors by clinics invalid endpoint")
    public void sendGetRequestAllDoctorsByClinicsInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetAllDoctorsByClinicsInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get all doctors by clinics invalid endpoint")
    public void resCode400GetAllDoctorsByClinicsInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
