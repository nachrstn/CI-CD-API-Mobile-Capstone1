package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewPaymentInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/transactions/357ba23b-436d-43ee-8769-78008f4e4491/p4yments";

    @Step("I set POST create new payment invalid endpoint")
    public String setPostCreateNewPaymentInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request create new payment invalid endpoint")
    public void sendPostRequestCreateNewPaymentInvalidEndpoint(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", "Aaa")
                .multiPart("account_number", "66457478837263")
                .multiPart("image", new File("src/test/resources/foto/image1.jpg"), "image/jpeg")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .post(setPostCreateNewPaymentInvalidEndpoint());
    }

    @Step("I receive response code 404 create new payment invalid endpoint")
    public void resCode404PostCreateNewPaymentInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}

