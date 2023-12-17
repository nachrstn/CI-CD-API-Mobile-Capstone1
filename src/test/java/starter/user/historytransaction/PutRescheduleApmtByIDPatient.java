package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutRescheduleApmtByIDPatient {
    protected static String url = "https://dev.reprohealth.my.id/transactions/c38882d0-c838-463d-a77e-e0d5cd6403b2/reschedule";

    @Step("I set PUT reschedule appointment by ID patient ")
    public String setPUTRescheduleApmtByIDPatient(){
        return url;
    }

    @Step("I send PUT HTTP request reschedule appointment by ID patient")
    public void sendPutRequestRescheduleApmtByIDPatient(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("date", "2023-02-05T15:04:05Z");
        requestBody.put("session", "siang");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .put(setPUTRescheduleApmtByIDPatient());
    }

    @Step("I receive response code 200 reschedule appointment by ID patient")
    public void resCode200PutRescheduleApmtByIDPatient(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
