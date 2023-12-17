package starter.user.chabotAI;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateUserChatbot {
    protected static String url = "https://dev.reprohealth.my.id/chatbot/users-health-recommendation";

    @Step("I set POST Create user chatbot ")
    public String setPOSTCreateUserChatbot(){
        return url;
    }

    @Step("I send POST HTTP request Create user chatbot")
    public void sendPostRequestCreateUserChatbot(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("message", "Apa tanda kanker serviks?");

        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .body(requestBody.toJSONString())
                .post(setPOSTCreateUserChatbot());
    }

    @Step("I receive response code 200 Create user chatbot")
    public void resCode200PostCreateUserChatbot(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
