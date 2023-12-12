package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetAllSpecialistInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/special1sts";

    @Step("I set GET all specialist invalid endpoint")
    public String setGetAllSpecialistInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all specialist invalid endpoint")
    public void sendGetRequestAllSpecialistInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetAllSpecialistInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get all specialist invalid endpoint")
    public void resCode400GetAllSpecialistInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }

}
