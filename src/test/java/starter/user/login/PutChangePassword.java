package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutChangePassword {
    protected static String url = "https://dev.reprohealth.my.id/users/change-password";

    @Step("I set PUT endpoint change password ")
    public String setPutEndpointChangePassword(){
        return url;
    }

    @Step("I send PUT HTTP request change password")
    public void sendPutRequestChangePassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "Aaa111222");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutEndpointChangePassword());
    }

    @Step("I receive response code 200 change password")
    public void resCode200PutChangePassword(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
