package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutUpdatePatientProfile {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set PUT endpoint update patient profile ")
    public String setPutEndpointUpdatePatientProfile(){
        return url;
    }

    @Step("I send PUT HTTP request update patient profile")
    public void sendPutRequestUpdatePatientProfile(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setPutEndpointUpdatePatientProfile());
    }

    @Step("I receive response code 200 update patient profile")
    public void resCode200PutUpdatePatientProfile(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

