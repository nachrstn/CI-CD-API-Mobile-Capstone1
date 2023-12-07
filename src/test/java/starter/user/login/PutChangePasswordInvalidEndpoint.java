package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutChangePasswordInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set PUT change password invalid endpoint")
    public String setPutChangePasswordInvalidEndpoint(){
        return url;
    }

    @Step("I send PUT HTTP request change password invalid endpoint")
    public void sendPutRequestChangePasswordInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setPutChangePasswordInvalidEndpoint());
    }

    @Step("I receive response code 404 change password invalid endpoint")
    public void resCode404PutChangePasswordInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

