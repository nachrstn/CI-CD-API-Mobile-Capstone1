package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllDoctorsBySpecialistsInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/specialists/0a8f12c6-1244-43e6-a704-126b173a8732/doct0rs";

    @Step("I set GET all doctors by specialists invalid endpoint")
    public String setGetAllDoctorsBySpecialistsInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all doctors by specialists invalid endpoint")
    public void sendGetRequestAllDoctorsBySpecialistsInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetAllDoctorsBySpecialistsInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get all doctors by specialists invalid endpoint")
    public void resCode400GetAllDoctorsBySpecialistsInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
