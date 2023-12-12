package starter.user.appointment;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllDoctorsBySpecialists {
    protected static String url = "https://dev.reprohealth.my.id/specialists/0a8f12c6-1244-43e6-a704-126b173a8732/doctors";

    @Step("I set GET endpoint all doctors by specialists ")
    public String setGetEndpointAllDoctorsBySpecialists(){
        return url;
    }

    @Step("I send GET HTTP request all doctors by specialists")
    public void sendGetRequestAllDoctorsBySpecialists(){
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .when()
                .get(setGetEndpointAllDoctorsBySpecialists());
    }

    @Step("I receive response code 200 for get all doctors by specialists")
    public void resCode200GetAllDoctorsBySpecialists(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
