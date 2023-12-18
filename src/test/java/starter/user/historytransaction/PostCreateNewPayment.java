package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewPayment {
    protected static String url = "https://dev.reprohealth.my.id/transactions/47cc9bd5-9421-450a-98fc-3ec01e327dc6/payments";

    @Step("I set POST endpoint create new payment ")
    public String setPostEndpointCreateNewPayment(){
        return url;
    }

    @Step("I send POST HTTP request create new payment")
    public void sendPostRequestCreateNewPayment(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", "Aaa")
                .multiPart("account_number", "66457478837263")
                .multiPart("image", new File("src/test/resources/foto/image1.jpg"), "image/jpeg")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .post(setPostEndpointCreateNewPayment());
    }

    @Step("I receive response code 201 create new payment")
    public void resCode201PostCreateNewPayment(){
        restAssuredThat(response -> response.statusCode(201));
    }
}
