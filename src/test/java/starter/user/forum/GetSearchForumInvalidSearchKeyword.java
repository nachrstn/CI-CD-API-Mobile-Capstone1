package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSearchForumInvalidSearchKeyword {
    protected String url = "https://dev.reprohealth.my.id/users/signup";

    @Step("I set GET search forum invalid search keyword")
    public String setGetSearchForumInvalidSearchKeyword(){
        return url;
    }

    @Step("I send GET HTTP request search forum invalid search keyword")
    public void sendGETRequestSearchForumInvalidSearchKeyword(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setGetSearchForumInvalidSearchKeyword());
    }

    @Step("I receive response code 400 for search forum invalid search keyword")
    public void resCode400SearchForumInvalidSearchKeyword(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
