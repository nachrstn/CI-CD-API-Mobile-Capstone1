package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSearchDoctors {
    protected static String url = "https://dev.reprohealth.my.id/doctors/?name=Andi";

    @Step("I set GET endpoint search doctors ")
    public String setGetEndpointSearchDoctors(){
        return url;
    }

    @Step("I send GET HTTP request search doctors")
    public void sendGetRequestSearchDoctors(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetEndpointSearchDoctors());
    }

    @Step("I receive response code 200 for get search doctors")
    public void resCode200GetSearchDoctors(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
