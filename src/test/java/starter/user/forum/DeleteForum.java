package starter.user.forum;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteForum {
    protected static String url = "https://dev.reprohealth.my.id/forums/0b103112-eb92-4efd-a838-0f982c2c35e3";

    @Step("I set DELETE endpoint forum ")
    public String setDeleteEndpointForum(){
        return url;
    }

    @Step("I send DELETE HTTP request forum")
    public void sendDeleteRequestForum(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .delete(setDeleteEndpointForum());
    }

    @Step("I receive response code 200 forum")
    public void resCode200DeleteForum(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

