package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewForumInvalidJsonPayload {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set POST create new forum invalid json payload")
    public String setPostCreateNewForumInvalidJsonPayload(){
        return url;
    }

    @Step("I send POST HTTP request create new forum invalid json payload")
    public void sendPOSTRequestCreateNewForumInvalidJsonPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", 123123);

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostCreateNewForumInvalidJsonPayload());
    }

    @Step("I receive response code 400 create new forum invalid json payload")
    public void resCode400CreateNewForumInvalidJsonPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
