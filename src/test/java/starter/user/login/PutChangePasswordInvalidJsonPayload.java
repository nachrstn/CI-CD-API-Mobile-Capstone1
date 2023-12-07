package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutChangePasswordInvalidJsonPayload {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set PUT change password invalid json payload")
    public String setPutChangePasswordInvalidJsonPayload(){
        return url;
    }

    @Step("I send PUT HTTP request change password invalid json payload")
    public void sendPutRequestChangePasswordInvalidJsonPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "davin11@gmail.com");
        requestBody.put("password", 1234567);

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiZGF2aW4iLCJyb2xlIjoidXNlciIsInVzZXJfaWQiOiI2ODBhZjU4Yi04NzFmLTQ4NDUtYTFiZC03MmZjYzFhZjkzMTAifQ.J1ommGCOfzb4SkdnBtlcYOiXP0Fkjl-Flnqsw3JK8Lo")
                .body(requestBody.toJSONString())
                .put(setPutChangePasswordInvalidJsonPayload());
    }

    @Step("I receive response code 400 change password invalid json payload")
    public void resCode400ChangePasswordInvalidJsonPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
