package starter.user.article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllArticles {
    protected static String url = "https://dev.reprohealth.my.id/articles";

    @Step("I set GET endpoint all articles")
    public String setGetEndpointAllArticles(){
        return url;
    }

    @Step("I send GET HTTP request all articles")
    public void sendGetRequestAllArticles(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetEndpointAllArticles());
    }

    @Step("I receive response code 200 for get all articles")
    public void resCode200GetAllArticles(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

