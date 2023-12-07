package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletePatientByIDInvalidMethod {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set DELETE patient by id invalid method")
    public String setDeletePatientByIDInvalidMethod(){
        return url;
    }

    @Step("I send DELETE HTTP request patient by id invalid method")
    public void sendDeleteRequestPatientByIDInvalidMethod(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setDeletePatientByIDInvalidMethod());
    }

    @Step("I receive response code 405 patient by id invalid method")
    public void resCode405DeletePatientByIDInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }
}


