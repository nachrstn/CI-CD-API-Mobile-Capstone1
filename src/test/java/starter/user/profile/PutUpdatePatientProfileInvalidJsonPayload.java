package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutUpdatePatientProfileInvalidJsonPayload {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set PUT update patient profile invalid json payload")
    public String setPutUpdatePatientProfileInvalidJsonPayload(){
        return url;
    }

    @Step("I send PUT HTTP request update patient profile invalid json payload")
    public void sendPUTRequestUpdatePatientProfileInvalidJsonPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", 123123);

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .put(setPutUpdatePatientProfileInvalidJsonPayload());
    }

    @Step("I receive response code 400 update patient profile invalid json payload")
    public void resCode400UpdatePatientProfileInvalidJsonPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
