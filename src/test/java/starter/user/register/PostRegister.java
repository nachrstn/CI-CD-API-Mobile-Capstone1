package starter.user.register;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostRegister {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set POST endpoints Register")
    public String setPostRegisterEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Register")
    public void sendPostHttpRequestRegisterEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "new3@gmail.com");
        requestBody.put("name", "new");
        requestBody.put("password", "123123");


        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostRegisterEndpoint());
    }

    @Step("I receive response code 201 Register")
    public void responseCode201RegisterEndpoint(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for Register")
    public void receiveValidDataForRegister(){
        restAssuredThat(response -> response.body("response.name", equalTo("new")));
    }
}
