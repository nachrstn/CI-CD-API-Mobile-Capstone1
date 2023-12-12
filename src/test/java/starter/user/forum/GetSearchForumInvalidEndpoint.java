package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSearchForumInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/f0rums?title=test";

    @Step("I set GET search forum invalid endpoint")
    public String setGetSearchForumInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request search forum invalid endpoint")
    public void sendGetRequestSearchForumInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetSearchForumInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get search forum invalid endpoint")
    public void resCode400GetSearchForumInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
