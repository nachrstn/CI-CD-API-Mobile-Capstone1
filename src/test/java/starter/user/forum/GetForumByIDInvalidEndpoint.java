package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetForumByIDInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/f0rums/e251422b-796c-4d6f-9781-0bef5957791c";

    @Step("I set GET forum by id invalid endpoint")
    public String setGetForumByIDInvalidEndpoint(){
        return url;
    }

    @Step("I send GET HTTP request forum by id invalid endpoint")
    public void sendGetRequestForumByIDInvalidEndpoint(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetForumByIDInvalidEndpoint());
    }

    @Step("I receive response code 400 for Get forum by id invalid endpoint")
    public void resCode400GetForumByIDInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
