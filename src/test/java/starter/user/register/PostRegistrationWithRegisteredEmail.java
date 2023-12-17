package starter.user.register;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostRegistrationWithRegisteredEmail {
    protected static String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set POST registration with registered email")
    public String setPostRegistrationWithRegisteredEmail(){
        return url;
    }

    @Step("I send POST HTTP request registration with registered email")
    public void sendPostRequestRegistrationWithRegisteredEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aaa@gmail.com");
        requestBody.put("name", "Aaa");
        requestBody.put("password", "Aaa111222");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostRegistrationWithRegisteredEmail());
    }

    @Step("I receive response code 400 registration with registered email")
    public void resCode400PostRegistrationWithRegisteredEmail(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
