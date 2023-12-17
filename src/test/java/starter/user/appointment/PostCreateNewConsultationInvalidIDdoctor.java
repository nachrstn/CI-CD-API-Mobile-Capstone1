package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewConsultationInvalidIDdoctor {
    protected static String url = "https://dev.reprohealth.my.id/consultations";

    @Step("I set POST create new consultation invalid ID doctor")
    public String setPostCreateNewConsultationInvalidIDdoctor(){
        return url;
    }

    @Step("I send POST HTTP request create new consultation invalid ID doctor")
    public void sendPostRequestCreateNewConsultationInvalidIDdoctor(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("patient_id", "bcd0ef11-33ee-4a6c-9e1a-db95a7926cb6");
        requestBody.put("doctor_id", "76fbad9e-5c8f-4490-b7aa-8ffbcb4a3aaa");
        requestBody.put("date", "2023-12-06");
        requestBody.put("session", "pagi");
        requestBody.put("payment_method", "manual_transfer");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostCreateNewConsultationInvalidIDdoctor());
    }

    @Step("I receive response code 400 create new consultation invalid ID doctor")
    public void resCode400PostCreateNewConsultationInvalidIDdoctor(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
