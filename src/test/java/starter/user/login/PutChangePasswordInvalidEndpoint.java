package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutChangePasswordInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/users/change-passw0rd";

    @Step("I set PUT change password invalid endpoint")
    public String setPutChangePasswordInvalidEndpoint(){
        return url;
    }

    @Step("I send PUT HTTP request change password invalid endpoint")
    public void sendPutRequestChangePasswordInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("password", "Aaa111222");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutChangePasswordInvalidEndpoint());
    }

    @Step("I receive response code 404 change password invalid endpoint")
    public void resCode404PutChangePasswordInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

