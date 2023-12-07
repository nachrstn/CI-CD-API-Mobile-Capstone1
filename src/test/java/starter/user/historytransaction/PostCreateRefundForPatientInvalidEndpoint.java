package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateRefundForPatientInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set POST create refund for patient invalid endpoint")
    public String setPostCreateRefundForPatientInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request create refund for patient invalid endpoint")
    public void sendPostRequestCreateRefundForPatientInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .post(setPostCreateRefundForPatientInvalidEndpoint());
    }

    @Step("I receive response code 404 create refund for patient invalid endpoint")
    public void resCode404PostCreateRefundForPatientInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}



