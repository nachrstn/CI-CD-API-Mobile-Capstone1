package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutSendOTPUnregisteredEmail {
    protected static String url = "https://dev.reprohealth.my.id/users/send-otp";

    @Step("I set PUT Send OTP unregistered email")
    public String setPutSendOTPUnregisteredEmail(){
        return url;
    }

    @Step("I send PUT HTTP request Send OTP unregistered email")
    public void sendPutRequestSendOTPUnregisteredEmail(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "kkk@gmail.com");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .put(setPutSendOTPUnregisteredEmail());
    }

    @Step("I receive response code 400 Send OTP unregistered email")
    public void resCode400PutSendOTPUnregisteredEmail(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
