package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewPatient {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set POST endpoint create new patient ")
    public String setPostEndpointCreateNewPatient(){
        return url;
    }

    @Step("I send POST HTTP request create new patient")
    public void sendPostRequestCreateNewPatient(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .post(setPostEndpointCreateNewPatient());
    }

    @Step("I receive response code 200 create new patient")
    public void resCode200PostCreateNewPatient(){
        restAssuredThat(response -> response.statusCode(200));
    }
}


