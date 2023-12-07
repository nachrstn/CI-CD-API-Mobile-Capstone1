package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewPatientInvalidMethod {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set POST create new patient invalid method")
    public String setPostCreateNewPatientInvalidMethod(){
        return url;
    }

    @Step("I send POST HTTP request create new patient invalid method")
    public void sendPostRequestCreateNewPatientInvalidMethod(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setPostCreateNewPatientInvalidMethod());
    }

    @Step("I receive response code 405 create new patient invalid method")
    public void resCode405PostCreateNewPatientInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }
}


