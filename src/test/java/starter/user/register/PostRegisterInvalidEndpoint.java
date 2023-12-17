package starter.user.register;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostRegisterInvalidEndpoint {
    protected String url = "https://dev.reprohealth.my.id/users/s1gnup";

    @Step("I set POST Register invalid endpoint")
    public String setPostRegisterInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Register invalid endpoint")
    public void sendPostHttpRequestRegisterInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "eee1@gmail.com");
        requestBody.put("password", "Eee111222");
        requestBody.put("name", "Eee");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostRegisterInvalidEndpoint());
    }

    @Step("I receive response code 400 for Register")
    public void responseCode400RegisterInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }


}
