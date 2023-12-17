package starter.user.chabotAI;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAIChatbotBySessionID {
    protected static String url = "https://dev.reprohealth.my.id/chatbot/users-health-recommendation/session/bb2cd685-9caa-4327-b759-6a9033c1443f";

    @Step("I set GET endpoint AI chatbot by session ID")
    public String setGetEndpointAIChatbotBySessionID(){
        return url;
    }

    @Step("I send GET HTTP request AI chatbot by session ID")
    public void sendGetRequestAIChatbotBySessionID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .when()
                .get(setGetEndpointAIChatbotBySessionID());
    }

    @Step("I receive response code 200 for get AI chatbot by session ID")
    public void resCode200GetAIChatbotBySessionID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
