package starter.user.article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetArticleByIDInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/art1cles/0f068f7e-de24-446e-b3a6-0a53b9784b82";

    @Step("I set GET article by ID invalid endpoint")
    public String setGetArticleByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request article by ID invalid endpoint")
    public void sendGetRequestArticleByIDInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetArticleByIDInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get article by ID invalid endpoint")
    public void resCode404GetArticleByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

