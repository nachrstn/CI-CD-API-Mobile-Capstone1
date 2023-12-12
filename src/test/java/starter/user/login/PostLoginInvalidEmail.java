package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLoginInvalidEmail {
    protected String url = "https://dev.reprohealth.my.id/users/login";

    @Step("I set POST login invalid email")
    public String setPostLoginInvalidEmail(){
        return url;
    }

    @Step("I send POST HTTP request login invalid email")
    public void sendPOSTRequestLoginInvalidEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aaaa@gmail.com");
        requestBody.put("password", "Aaa111222");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostLoginInvalidEmail());
    }

    @Step("I receive response code 401 login invalid email")
    public void resCode401LoginInvalidEmail(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
