package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewPaymentInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set POST create new payment invalid endpoint")
    public String setPostCreateNewPaymentInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request create new payment invalid endpoint")
    public void sendPostRequestCreateNewPaymentInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .post(setPostCreateNewPaymentInvalidEndpoint());
    }

    @Step("I receive response code 404 create new payment invalid endpoint")
    public void resCode404PostCreateNewPaymentInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

