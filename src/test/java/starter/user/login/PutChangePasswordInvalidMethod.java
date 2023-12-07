package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutChangePasswordInvalidMethod {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set PUT change password invalid method")
    public String setPutChangePasswordInvalidMethod(){
        return url;
    }

    @Step("I send PUT HTTP request change password invalid method")
    public void sendPutRequestChangePasswordInvalidMethod(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setPutChangePasswordInvalidMethod());
    }

    @Step("I receive response code 405 change password invalid method")
    public void resCode405PutChangePasswordInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }
}

