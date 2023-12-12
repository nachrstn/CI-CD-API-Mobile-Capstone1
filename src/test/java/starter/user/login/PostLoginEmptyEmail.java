package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLoginEmptyEmail {
    protected String url = "https://dev.reprohealth.my.id/users/login";

    @Step("I set POST login empty email")
    public String setPostLoginEmptyEmail(){
        return url;
    }

    @Step("I send POST HTTP request login empty email")
    public void sendPOSTRequestLoginEmptyEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "Aaa111222");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostLoginEmptyEmail());
    }

    @Step("I receive response code 401 login empty email")
    public void resCode401LoginEmptyEmail(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
