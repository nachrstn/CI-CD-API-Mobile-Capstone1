package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSearchForumInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET search forum invalid endpoint")
    public String setGetSearchForumInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request search forum invalid endpoint")
    public void sendGetRequestSearchForumInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetSearchForumInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get search forum invalid endpoint")
    public void resCode404GetSearchForumInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
