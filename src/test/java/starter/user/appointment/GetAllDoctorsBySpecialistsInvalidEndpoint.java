package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllDoctorsBySpecialistsInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET all doctors by specialists invalid endpoint")
    public String setGetAllDoctorsBySpecialistsInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all doctors by specialists invalid endpoint")
    public void sendGetRequestAllDoctorsBySpecialistsInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetAllDoctorsBySpecialistsInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get all doctors by specialists invalid endpoint")
    public void resCode404GetAllDoctorsBySpecialistsInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
