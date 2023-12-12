package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteForumInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/f0rums/ed1d73ee-b890-45e8-9298-21411185a33e";

    @Step("I set DELETE forum invalid endpoint")
    public String setDeleteForumInvalidEndpoint(){
        return url;
    }

    @Step("I send DELETE HTTP request forum invalid endpoint")
    public void sendDeleteRequestForumInvalidEndpoint(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .delete(setDeleteForumInvalidEndpoint());
    }

    @Step("I receive response code 400 forum invalid endpoint")
    public void resCode400DeleteForumInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

