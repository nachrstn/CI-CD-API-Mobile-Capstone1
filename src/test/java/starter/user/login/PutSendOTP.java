package starter.user.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutSendOTP {
    protected static String url = "https://dev.reprohealth.my.id/users/send-otp";

    @Step("I set PUT Send OTP ")
    public String setPUTSendOTP(){
        return url;
    }

    @Step("I send PUT HTTP request Send OTP")
    public void sendPutRequestSendOTP(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "mariachristinahartono@gmail.com");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .put(setPUTSendOTP());
    }

    @Step("I receive response code 200 Send OTP")
    public void resCode200PutSendOTP(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
