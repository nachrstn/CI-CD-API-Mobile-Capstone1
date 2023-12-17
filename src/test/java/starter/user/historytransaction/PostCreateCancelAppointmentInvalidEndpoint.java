package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateCancelAppointmentInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/transactions/357ba23b-436d-43ee-8769-78008f4e4491/canc3l";

    @Step("I set POST create cancel appointment invalid endpoint")
    public String setPostCreateCancelAppointmentInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request create cancel appointment invalid endpoint")
    public void sendPostRequestCreateCancelAppointmentInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Aaa");
        requestBody.put("bank", "BJB");
        requestBody.put("account_number", "123456789");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostCreateCancelAppointmentInvalidEndpoint());
    }

    @Step("I receive response code 404 create cancel appointment invalid endpoint")
    public void resCode404PostCreateCancelAppointmentInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}








