package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLoginInvalidEndpoint {
    protected String url = "https://dev.reprohealth.my.id/users/l0gin";

    @Step("I set POST Login invalid endpoint")
    public String setPostLoginInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Login invalid endpoint")
    public void sendPostHttpRequestLoginInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aaa@gmail.com");
        requestBody.put("password", "Aaa111222");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostLoginInvalidEndpoint());
    }

    @Step("I receive response code 400 for Login invalid endpoint")
    public void responseCode400LoginInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }

}
