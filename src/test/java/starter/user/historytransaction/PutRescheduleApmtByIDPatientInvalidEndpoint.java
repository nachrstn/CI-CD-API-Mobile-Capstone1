package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutRescheduleApmtByIDPatientInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/transactions/4043847c-1a6c-41cc-b870-0831fe36f090/reschedul3";

    @Step("I set PUT reschedule appointment by ID patient invalid endpoint")
    public String setPutRescheduleApmtByIDPatientInvalidEndpoint(){
        return url;
    }

    @Step("I send PUT HTTP request reschedule appointment by ID patient invalid endpoint")
    public void sendPutRequestRescheduleApmtByIDPatientInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("date", "2023-02-05T15:04:05Z");
        requestBody.put("session", "siang");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPutRescheduleApmtByIDPatientInvalidEndpoint());
    }

    @Step("I receive response code 404 reschedule appointment by ID patient invalid endpoint")
    public void resCode404PutRescheduleApmtByIDPatientInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
