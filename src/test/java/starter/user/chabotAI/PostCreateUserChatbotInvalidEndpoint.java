package starter.user.chabotAI;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateUserChatbotInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/chatbot/users-health-recommendati0n";

    @Step("I set POST Create user chatbot invalid endpoint")
    public String setPostCreateUserChatbotInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request Create user chatbot invalid endpoint")
    public void sendPostRequestCreateUserChatbotInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "Apa tanda kanker serviks?");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPostCreateUserChatbotInvalidEndpoint());
    }

    @Step("I receive response code 404 Create user chatbot invalid endpoint")
    public void resCode404PostCreateUserChatbotInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
