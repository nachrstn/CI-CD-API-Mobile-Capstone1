package starter.user.historytransaction;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCreateCancelAppointment {
    protected static String url = "https://dev.reprohealth.my.id";

    @Step("I set POST endpoint create cancel appointment ")
    public String setPostEndpointCreateCancelAppointment(){
        return url;
    }

    @Step("I send POST HTTP request create cancel appointment")
    public void sendPostRequestCreateCancelAppointment(){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZWVsc2VAbWFpbC5jb20ifQ.J8OKzFM-6sLno5L32c-jqtJ1FhEX4C3i2E0agKsWvi8")
                .when()
                .post(setPostEndpointCreateCancelAppointment());
    }

    @Step("I receive response code 200 create cancel appointment")
    public void resCode200PostCreateCancelAppointment(){
        restAssuredThat(response -> response.statusCode(200));
    }
}






