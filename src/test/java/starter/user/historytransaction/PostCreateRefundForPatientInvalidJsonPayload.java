package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateRefundForPatientInvalidJsonPayload {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set POST create refund for patient invalid json payload")
    public String setPostCreateRefundForPatientInvalidJsonPayload(){
        return url;
    }

    @Step("I send POST HTTP request create refund for patient invalid json payload")
    public void sendPOSTRequestCreateRefundForPatientInvalidJsonPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", 123123);

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostCreateRefundForPatientInvalidJsonPayload());
    }

    @Step("I receive response code 400 create refund for patient invalid json payload")
    public void resCode400CreateRefundForPatientInvalidJsonPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
