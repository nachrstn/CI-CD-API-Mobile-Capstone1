package starter.user.chabotAI;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAIChatbotBySessionIDInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/chatbot/users-health-recommendati0n/session/bb2cd685-9caa-4327-b759-6a9033c1443f";

    @Step("I set GET AI chatbot by session ID invalid endpoint")
    public String setGetAIChatbotBySessionIDInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request AI chatbot by session ID invalid endpoint")
    public void sendGetRequestAIChatbotBySessionIDInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .when()
                .get(setGetAIChatbotBySessionIDInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get AI chatbot by session ID invalid endpoint")
    public void resCode404GetAIChatbotBySessionIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
