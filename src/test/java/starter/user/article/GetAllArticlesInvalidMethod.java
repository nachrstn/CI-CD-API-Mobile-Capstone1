package starter.user.article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllArticlesInvalidMethod {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET all articles invalid method")
    public String setGetAllArticlesInvalidMethod(){
        return url;
    }

    @Step("I send GET HTTP request all articles invalid method")
    public void sendGetRequestAllArticlesInvalidMethod(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setGetAllArticlesInvalidMethod());
    }

    @Step("I receive response code 405 for Get all articles invalid method")
    public void resCode405GetAllArticlesInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
