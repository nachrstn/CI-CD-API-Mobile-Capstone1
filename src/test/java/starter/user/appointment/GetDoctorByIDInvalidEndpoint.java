package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDoctorByIDInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/doct0rs/f7613c10-29fd-4b82-bfea-1649ae41af98";

    @Step("I set GET doctor by ID invalid endpoint")
    public String setGetDoctorByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request doctor by ID invalid endpoint")
    public void sendGetRequestDoctorByIDInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetDoctorByIDInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get doctor by ID invalid endpoint")
    public void resCode400GetDoctorByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
