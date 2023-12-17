package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateCancelAppointment {
    protected static String url = "https://dev.reprohealth.my.id/transactions/c38882d0-c838-463d-a77e-e0d5cd6403b2/cancel";

    @Step("I set POST endpoint create cancel appointment ")
    public String setPostEndpointCreateCancelAppointment(){
        return url;
    }

    @Step("I send POST HTTP request create cancel appointment")
    public void sendPostRequestCreateCancelAppointment(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Aaa");
        requestBody.put("bank", "BJB");
        requestBody.put("account_number", "123456789");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostEndpointCreateCancelAppointment());
    }

    @Step("I receive response code 201 create cancel appointment")
    public void resCode201PostCreateCancelAppointment(){
        restAssuredThat(response -> response.statusCode(201));
    }
}






