package starter.user.article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetArticleByID {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set GET endpoint article by ID")
    public String setGetEndpointArticleByID(){
        return url;
    }

    @Step("I send GET HTTP request article by ID")
    public void sendGetRequestArticleByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .get(setGetEndpointArticleByID());
    }

    @Step("I receive response code 200 for get article by ID")
    public void resCode200GetArticleByID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

