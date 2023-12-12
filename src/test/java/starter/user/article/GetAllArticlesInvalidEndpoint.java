package starter.user.article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllArticlesInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/art1cles";

    @Step("I set GET all articles invalid endpoint")
    public String setGetAllArticlesInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all articles invalid endpoint")
    public void sendGetRequestAllArticlesInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetAllArticlesInvalidEndpoint());
    }

    @Step("I receive response code 404 for Get all articles invalid endpoint")
    public void resCode404GetAllArticlesInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

