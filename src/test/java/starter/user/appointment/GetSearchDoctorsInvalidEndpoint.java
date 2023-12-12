package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSearchDoctorsInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/doct0rs/?name=Andi";

    @Step("I set GET search doctors invalid endpoint")
    public String setGetSearchDoctorsInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request search doctors invalid endpoint")
    public void sendGetRequestSearchDoctorsInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetSearchDoctorsInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get search doctors invalid endpoint")
    public void resCode400GetSearchDoctorsInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
