package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeletePatientByIDInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set DELETE patient by id invalid endpoint")
    public String setDeletePatientByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send DELETE HTTP request patient by id invalid endpoint")
    public void sendDeleteRequestPatientByIDInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .delete(setDeletePatientByIDInvalidEndpoint());
    }

    @Step("I receive response code 404 patient by id invalid endpoint")
    public void resCode404DeletePatientByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}


