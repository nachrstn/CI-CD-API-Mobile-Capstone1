package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDoctorByID {
    protected static String url = "https://dev.reprohealth.my.id/doctors/f7613c10-29fd-4b82-bfea-1649ae41af98";

    @Step("I set GET endpoint doctor by ID ")
    public String setGetEndpointDoctorByID(){
        return url;
    }

    @Step("I send GET HTTP request doctor by ID")
    public void sendGetRequestDoctorByID(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetEndpointDoctorByID());
    }

    @Step("I receive response code 200 for get doctor by ID")
    public void resCode200GetDoctorByID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
