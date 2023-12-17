package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewForum {
    protected static String url = "https://dev.reprohealth.my.id/forums";

    @Step("I set POST endpoint create new forum ")
    public String setPostEndpointCreateNewForum(){
        return url;
    }

    @Step("I send POST HTTP request create new forum")
    public void sendPostRequestCreateNewForum(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("patient_id", "bcd0ef11-33ee-4a6c-9e1a-db95a7926cb6");
        requestBody.put("title", "Lorem Ipsum");
        requestBody.put("content", "Lorem Ipsum");
        requestBody.put("anonymous", true);

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostEndpointCreateNewForum());


    }

    @Step("I receive response code 201 create new forum")
    public void resCode201PostCreateNewForum(){
        restAssuredThat(response -> response.statusCode(201));
    }
}
