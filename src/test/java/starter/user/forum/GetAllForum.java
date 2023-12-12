package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllForum {
    protected static String url = "https://dev.reprohealth.my.id/forums";

    @Step("I set GET endpoint all forum ")
    public String setGetEndpointAllForum(){
        return url;
    }

    @Step("I send GET HTTP request all forum")
    public void sendGetRequestAllForum(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetEndpointAllForum());
    }

    @Step("I receive response code 200 for get all forum")
    public void resCode200GetAllForum(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
