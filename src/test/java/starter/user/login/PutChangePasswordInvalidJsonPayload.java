package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutChangePasswordInvalidJsonPayload {
    protected String url = "https://dev.reprohealth.my.id/users/changePassword";

    @Step("I set PUT change password invalid json payload")
    public String setPutChangePasswordInvalidJsonPayload(){
        return url;
    }

    @Step("I send PUT HTTP request change password invalid json payload")
    public void sendPutRequestChangePasswordInvalidJsonPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aaa@gmail.com");
        requestBody.put("password", "Aaa111222");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .body(requestBody.toJSONString())
                .put(setPutChangePasswordInvalidJsonPayload());
    }

    @Step("I receive response code 400 change password invalid json payload")
    public void resCode400ChangePasswordInvalidJsonPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
