package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostLoginEmptyPassword {
    protected static String url = "https://dev.reprohealth.my.id/users/login";

    @Step("I set POST login empty password")
    public String setPostLoginEmptyPassword(){
        return url;
    }

    @Step("I send POST HTTP request login empty password")
    public void sendPostRequestLoginEmptyPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "aaa@gmail.com");
        requestBody.put("password", "");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(setPostLoginEmptyPassword());
    }

    @Step("I receive response code 401 login empty password")
    public void resCode401PostLoginEmptyPassword(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
