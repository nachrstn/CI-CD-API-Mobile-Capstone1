package starter.user.article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetArticleByIDInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET article by ID invalid endpoint")
    public String setGetArticleByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request article by ID invalid endpoint")
    public void sendGetRequestArticleByIDInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetArticleByIDInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get article by ID invalid endpoint")
    public void resCode404GetArticleByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

