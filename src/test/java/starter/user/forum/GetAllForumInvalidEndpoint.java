package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllForumInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/f0rums";

    @Step("I set GET all forum invalid endpoint")
    public String setGetAllForumInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request all forum invalid endpoint")
    public void sendGetRequestAllForumInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetAllForumInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get all forum invalid endpoint")
    public void resCode400GetAllForumInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }
}

