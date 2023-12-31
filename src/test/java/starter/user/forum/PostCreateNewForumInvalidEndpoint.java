package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewForumInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/f0rums";

    @Step("I set POST create new forum invalid endpoint")
    public String setPostCreateNewForumInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request create new forum invalid endpoint")
    public void sendPostRequestCreateNewForumInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("patient_id", "bcd0ef11-33ee-4a6c-9e1a-db95a7926cb6");
        requestBody.put("title", "Lorem Ipsum");
        requestBody.put("content", "Lorem Ipsum");
        requestBody.put("anonymous", true);

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostCreateNewForumInvalidEndpoint());
    }

    @Step("I receive response code 404 create new forum invalid endpoint")
    public void resCode404PostCreateNewForumInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
