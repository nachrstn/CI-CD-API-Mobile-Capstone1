package starter.user.notification;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetNotificationsInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/notificati0ns/patients/bcd0ef11-33ee-4a6c-9e1a-db95a7926cb6";

    @Step("I set GET notifications invalid endpoint")
    public String setGetNotificationsInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request notifications invalid endpoint")
    public void sendGetRequestNotificationsInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetNotificationsInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get notifications invalid endpoint")
    public void resCode404GetNotificationsInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

