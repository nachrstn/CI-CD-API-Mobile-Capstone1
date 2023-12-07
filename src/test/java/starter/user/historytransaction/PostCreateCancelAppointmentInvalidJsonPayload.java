package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateCancelAppointmentInvalidJsonPayload {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set POST create cancel appointment invalid json payload")
    public String setPostCreateCancelAppointmentInvalidJsonPayload(){
        return url;
    }

    @Step("I send POST HTTP request create cancel appointment invalid json payload")
    public void sendPOSTRequestCreateCancelAppointmentInvalidJsonPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", 123123);

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostCreateCancelAppointmentInvalidJsonPayload());
    }

    @Step("I receive response code 400 create cancel appointment invalid json payload")
    public void resCode400CreateCancelAppointmentInvalidJsonPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }
}









