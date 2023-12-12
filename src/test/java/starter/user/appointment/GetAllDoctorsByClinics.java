package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetAllDoctorsByClinics {
    protected static String url = "https://dev.reprohealth.my.id/clinics/fd9d3738-3bcf-4693-9079-57ad3b375af5/doctors";

    @Step("I set GET endpoint all doctors by clinics ")
    public String setGetEndpointAllDoctorsByClinics(){
        return url;
    }

    @Step("I send GET HTTP request all doctors by clinics")
    public void sendGetRequestAllDoctorsByClinics(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetEndpointAllDoctorsByClinics());
    }

    @Step("I receive response code 200 for get all doctors by clinics")
    public void resCode200GetAllDoctorsByClinics(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
