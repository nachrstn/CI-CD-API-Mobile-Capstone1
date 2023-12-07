package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDoctorByID {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET endpoint doctor by ID ")
    public String setGetEndpointDoctorByID(){
        return url;
    }

    @Step("I send GET HTTP request doctor by ID")
    public void sendGetRequestDoctorByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetEndpointDoctorByID());
    }

    @Step("I receive response code 200 for get doctor by ID")
    public void resCode200GetDoctorByID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
