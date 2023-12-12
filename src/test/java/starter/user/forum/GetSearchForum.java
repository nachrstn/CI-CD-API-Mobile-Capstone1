package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSearchForum {
    protected static String url = "https://dev.reprohealth.my.id/forums?title=test";

    @Step("I set GET endpoint search forum")
    public String setGetEndpointSearchForum(){
        return url;
    }

    @Step("I send GET HTTP request search forum")
    public void sendGetRequestSearchForum(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetEndpointSearchForum());
    }

    @Step("I receive response code 200 for get search forum")
    public void resCode200GetSearchForum(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
