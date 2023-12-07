package starter.user.article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllArticles {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET endpoint all articles")
    public String setGetEndpointAllArticles(){
        return url;
    }

    @Step("I send GET HTTP request all articles")
    public void sendGetRequestAllArticles(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetEndpointAllArticles());
    }

    @Step("I receive response code 200 for get all articles")
    public void resCode200GetAllArticles(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

