package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetForumByID {
    protected static String url = "https://dev.reprohealth.my.id/forums/e251422b-796c-4d6f-9781-0bef5957791c";

    @Step("I set GET endpoint forum by id")
    public String setGetEndpointForumByID(){
        return url;
    }

    @Step("I send GET HTTP request forum by id")
    public void sendGetRequestForumByID(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetEndpointForumByID());
    }

    @Step("I receive response code 200 for get forum by id")
    public void resCode200GetForumByID(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
