package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewForumInvalidIDPatient {
    protected String url = "https://dev.reprohealth.my.id/forums";

    @Step("I set POST create new forum invalid ID patient")
    public String setPostCreateNewForumInvalidIDPatient(){
        return url;
    }

    @Step("I send POST HTTP request create new forum invalid ID patient")
    public void sendPOSTRequestCreateNewForumInvalidIDPatient(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("patient_id", "bcd0ef11-33ee-4a6c-9e1a-db95a7926aaa");
        requestBody.put("title", "Lorem Ipsum");
        requestBody.put("content", "Lorem Ipsum");
        requestBody.put("anonymous", true);

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostCreateNewForumInvalidIDPatient());

    }

    @Step("I receive response code 400 create new forum invalid ID patient")
    public void resCode400CreateNewForumInvalidIDPatient(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
