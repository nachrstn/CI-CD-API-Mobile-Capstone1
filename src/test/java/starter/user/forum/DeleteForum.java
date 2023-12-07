package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteForum {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set DELETE endpoint forum ")
    public String setDeleteEndpointForum(){
        return url;
    }

    @Step("I send DELETE HTTP request forum")
    public void sendDeleteRequestForum(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .delete(setDeleteEndpointForum());
    }

    @Step("I receive response code 200 forum")
    public void resCode200DeleteForum(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

