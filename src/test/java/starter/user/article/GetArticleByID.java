package starter.user.article;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetArticleByID {
    protected static String url = "https://dev.reprohealth.my.id/articles/0ab056c2-e702-43c7-9d58-0dcd2284f51b";

    @Step("I set GET endpoint article by ID")
    public String setGetEndpointArticleByID(){
        return url;
    }

    @Step("I send GET HTTP request article by ID")
    public void sendGetRequestArticleByID(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .get(setGetEndpointArticleByID());
    }

    @Step("I receive response code 200 for get article by ID")
    public void resCode200GetArticleByID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

