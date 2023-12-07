package starter.user.notification;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetNotificationsInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET notifications invalid endpoint")
    public String setGetNotificationsInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request notifications invalid endpoint")
    public void sendGetRequestNotificationsInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetNotificationsInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get notifications invalid endpoint")
    public void resCode404GetNotificationsInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

