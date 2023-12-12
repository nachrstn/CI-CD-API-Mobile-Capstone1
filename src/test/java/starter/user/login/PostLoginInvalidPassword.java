package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLoginInvalidPassword {
    protected static String url = "https://dev.reprohealth.my.id/users/login";

    @Step("I set POST login invalid password")
    public String setPostLoginInvalidPassword(){
        return url;
    }

    @Step("I send POST HTTP request login invalid password")
    public void sendPostRequestLoginInvalidPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aaa@gmail.com");
        requestBody.put("password", "Aaa111223");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostLoginInvalidPassword());
    }

    @Step("I receive response code 401 login invalid password")
    public void resCode401PostLoginInvalidPassword(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
