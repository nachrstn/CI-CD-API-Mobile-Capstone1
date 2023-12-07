package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllForumInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET all forum invalid endpoint")
    public String setGetAllForumInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all forum invalid endpoint")
    public void sendGetRequestAllForumInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetAllForumInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get all forum invalid endpoint")
    public void resCode404GetAllForumInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

