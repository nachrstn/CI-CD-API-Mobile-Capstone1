package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllDoctors {
    protected static String url = "https://dev.reprohealth.my.id/doctors";

    @Step("I set GET endpoint all doctors ")
    public String setGetEndpointAllDoctors(){
        return url;
    }

    @Step("I send GET HTTP request all doctors")
    public void sendGetRequestAllDoctors(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetEndpointAllDoctors());
    }

    @Step("I receive response code 200 for get all doctors")
    public void resCode200GetAllDoctors(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
