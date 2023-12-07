package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class PostCreateNewConsultationInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set POST create new consultation invalid endpoint")
    public String setPostCreateNewConsultationInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request create new consultation invalid endpoint")
    public void sendPostRequestCreateNewConsultationInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .post(setPostCreateNewConsultationInvalidEndpoint());
    }

    @Step("I receive response code 404 create new consultation invalid endpoint")
    public void resCode404PostCreateNewConsultationInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

