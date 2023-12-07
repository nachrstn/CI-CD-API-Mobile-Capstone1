package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteForumInvalidMethod {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set DELETE forum invalid method")
    public String setDeleteForumInvalidMethod(){
        return url;
    }

    @Step("I send DELETE HTTP request forum invalid method")
    public void sendDeleteRequestForumInvalidMethod(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .put(setDeleteForumInvalidMethod());
    }

    @Step("I receive response code 405 forum invalid method")
    public void resCode405DeleteForumInvalidMethod(){
        restAssuredThat(response -> response.statusCode(405));
    }
}


