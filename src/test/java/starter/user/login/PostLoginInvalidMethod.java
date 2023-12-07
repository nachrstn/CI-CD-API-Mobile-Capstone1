package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLoginInvalidMethod {
    protected String url = "https://dev.reprohealth.my.id/users/login";

    @Step("I set POST Login invalid method")
    public String setPostLoginInvalidMethod(){
        return url;
    }

    @Step("I send POST HTTP request Login invalid method")
    public void sendPostHttpRequestLoginInvalidMethod(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "davin2@gmail.com");
        requestBody.put("password", "123456");

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .put(setPostLoginInvalidMethod());
    }

    @Step("I receive response code 405 for Login invalid method")
    public void responseCode405LoginInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }

}

