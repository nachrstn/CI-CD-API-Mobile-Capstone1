package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllSpecialistInvalidMethod {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET all specialist invalid method")
    public String setGetAllSpecialistInvalidMethod(){
        return url;
    }

    @Step("I send GET HTTP request all specialist invalid method")
    public void sendGetRequestAllSpecialistInvalidMethod(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setGetAllSpecialistInvalidMethod());
    }

    @Step("I receive response code 405 for Get all specialist invalid method")
    public void resCode405GetAllSpecialistInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }

}



