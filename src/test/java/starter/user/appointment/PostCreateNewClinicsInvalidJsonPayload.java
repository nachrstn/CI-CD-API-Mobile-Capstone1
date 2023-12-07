package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class PostCreateNewClinicsInvalidJsonPayload {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set POST create new clinics invalid json payload")
    public String setPostCreateNewClinicsInvalidJsonPayload(){
        return url;
    }

    @Step("I send POST HTTP request create new clinics invalid json payload")
    public void sendPOSTRequestCreateNewClinicsInvalidJsonPayload(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "akunbaru@gmail.com");
        requestBody.put("password", 123123);

        SerenityRest.given()
                .body(requestBody.toJSONString())
                .post(setPostCreateNewClinicsInvalidJsonPayload());
    }

    @Step("I receive response code 400 create new clinics invalid json payload")
    public void resCode400CreateNewClinicsInvalidJsonPayload(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
