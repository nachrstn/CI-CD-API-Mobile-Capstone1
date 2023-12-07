package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewPatientInvalidJsonPayload {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set POST create new patient invalid json payload")
    public String setPostCreateNewPatientInvalidJsonPayload(){
        return url;
    }

    @Step("I send POST HTTP request create new patient invalid json payload")
    public void sendPOSTRequestCreateNewPatientInvalidJsonPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", 123123);

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostCreateNewPatientInvalidJsonPayload());
    }

    @Step("I receive response code 400 create new patient invalid json payload")
    public void resCode400CreateNewPatientInvalidJsonPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }
}


