package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewPaymentInvalidJsonPayload {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set POST create new payment invalid json payload")
    public String setPostCreateNewPaymentInvalidJsonPayload(){
        return url;
    }

    @Step("I send POST HTTP request create new payment invalid json payload")
    public void sendPOSTRequestCreateNewPaymentInvalidJsonPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", 123123);

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostCreateNewPaymentInvalidJsonPayload());
    }

    @Step("I receive response code 400 create new payment invalid json payload")
    public void resCode400CreateNewPaymentInvalidJsonPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }
}



