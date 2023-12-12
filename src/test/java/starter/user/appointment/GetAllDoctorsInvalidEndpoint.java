package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllDoctorsInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/doct0rs";

    @Step("I set GET all doctors invalid endpoint")
    public String setGetAllDoctorsInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all doctors invalid endpoint")
    public void sendGetRequestAllDoctorsInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetAllDoctorsInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get all doctors invalid endpoint")
    public void resCode400GetAllDoctorsInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }
}

