package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewPaymentInvalidMethod {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set POST create new payment invalid method")
    public String setPostCreateNewPaymentInvalidMethod(){
        return url;
    }

    @Step("I send POST HTTP request create new payment invalid method")
    public void sendPostRequestCreateNewPaymentInvalidMethod(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setPostCreateNewPaymentInvalidMethod());
    }

    @Step("I receive response code 405 create new payment invalid method")
    public void resCode405PostCreateNewPaymentInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }
}



