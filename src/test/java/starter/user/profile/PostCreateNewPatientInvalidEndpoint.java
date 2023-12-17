package starter.user.profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateNewPatientInvalidEndpoint {
    protected static String url = "https://dev.reprohealth.my.id/pat1ents";

    @Step("I set POST create new patient invalid endpoint")
    public String setPostCreateNewPatientInvalidEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request create new patient invalid endpoint")
    public void sendPostRequestCreateNewPatientInvalidEndpoint(){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("name", "Komang Ayu")
                .multiPart("telephone_number", "081234678910")
                .multiPart("image", new File("src/test/resources/foto/image1.jpg"), "image/jpeg")
                .multiPart("date_of_birth", "2006-01-02T15:04:05Z")
                .multiPart("relation", "Pasangan")
                .multiPart("weight", "70.5")
                .multiPart("height", "170.65")
                .multiPart("name", "Aaa")
                .multiPart("telephone_number", "66457478837263")
                .multiPart("name", "Aaa")
                .multiPart("telephone_number", "66457478837263")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .when()
                .post(setPostCreateNewPatientInvalidEndpoint());
    }

    @Step("I receive response code 404 create new patient invalid endpoint")
    public void resCode404PostCreateNewPatientInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
