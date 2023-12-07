package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.appointment.*;

public class AppointmentSteps {
    @Steps
    GetAllSpecialist GetAllSpecialist;
    @Steps
    GetAllClinics GetAllClinics;
    @Steps
    GetAllDoctorsBySpecialists GetAllDoctorsBySpecialists;
    @Steps
    GetAllDoctorsByClinics GetAllDoctorsByClinics;
    @Steps
    GetAllDoctors GetAllDoctors;
    @Steps
    GetSearchDoctors GetSearchDoctors;
    @Steps
    GetDoctorByID GetDoctorByID;
    @Steps
    PostCreateNewClinics PostCreateNewClinics;
    @Steps
    PostCreateNewConsultation PostCreateNewConsultation;



    @Given("I set GET endpoint all specialist")
    public void setGetEndpointAllSpecialist(){
        GetAllSpecialist.setGetEndpointAllSpecialist();
    }
    @When("I send GET HTTP request all specialist")
    public void sendGetHttpRequestAllSpecialist(){
        GetAllSpecialist.sendGetHttpRequestAllSpecialist();
    }
    @Then("I receive response code 200 for get all specialist")
    public void responseCode200ForGetAllSpecialist(){
        GetAllSpecialist.responseCode200ForGetAllSpecialist();
    }


    @Given("I set GET endpoint all clinics")
    public void setGetEndpointAllClinics(){
        GetAllClinics.setGetEndpointAllClinics();
    }
    @When("I send GET HTTP request all clinics")
    public void sendGetRequestAllClinics(){
        GetAllClinics.sendGetRequestAllClinics();
    }
    @Then("I receive response code 200 for get all clinics")
    public void resCode200GetAllClinics(){
        GetAllClinics.resCode200GetAllClinics();
    }



    @Given("I set GET endpoint all doctors by specialists")
    public void setGetEndpointAllDoctorsBySpecialists(){
        GetAllDoctorsBySpecialists.setGetEndpointAllDoctorsBySpecialists();
    }
    @When("I send GET HTTP request all doctors by specialists")
    public void sendGetRequestAllDoctorsBySpecialists(){
        GetAllDoctorsBySpecialists.sendGetRequestAllDoctorsBySpecialists();
    }
    @Then("I receive response code 200 for get all doctors by specialists")
    public void resCode200GetAllDoctorsBySpecialists(){
        GetAllDoctorsBySpecialists.resCode200GetAllDoctorsBySpecialists();
    }



    @Given("I set GET endpoint all doctors by clinics")
    public void setGetEndpointAllDoctorsByClinics(){
        GetAllDoctorsByClinics.setGetEndpointAllDoctorsByClinics();
    }
    @When("I send GET HTTP request all doctors by clinics")
    public void sendGetRequestAllDoctorsByClinics(){
        GetAllDoctorsByClinics.sendGetRequestAllDoctorsByClinics();
    }
    @Then("I receive response code 200 for get all doctors by clinics")
    public void resCode200GetAllDoctorsByClinics(){
        GetAllDoctorsByClinics.resCode200GetAllDoctorsByClinics();
    }



    @Given("I set GET endpoint all doctors")
    public void setGetEndpointAllDoctors(){
        GetAllDoctors.setGetEndpointAllDoctors();
    }
    @When("I send GET HTTP request all doctors")
    public void sendGetRequestAllDoctors(){
        GetAllDoctors.sendGetRequestAllDoctors();
    }
    @Then("I receive response code 200 for get all doctors")
    public void resCode200GetAllDoctors(){
        GetAllDoctors.resCode200GetAllDoctors();
    }



    @Given("I set GET endpoint search doctors")
    public void setGetEndpointSearchDoctors(){
        GetSearchDoctors.setGetEndpointSearchDoctors();
    }
    @When("I send GET HTTP request search doctors")
    public void sendGetRequestSearchDoctors(){
        GetSearchDoctors.sendGetRequestSearchDoctors();
    }
    @Then("I receive response code 200 for get search doctors")
    public void resCode200GetSearchDoctors(){
        GetSearchDoctors.resCode200GetSearchDoctors();
    }

    @Given("I set GET endpoint doctor by ID")
    public void setGetEndpointDoctorByID(){
        GetDoctorByID.setGetEndpointDoctorByID();
    }
    @When("I send GET HTTP request doctor by ID")
    public void sendGetRequestDoctorByID(){
        GetDoctorByID.sendGetRequestDoctorByID();
    }
    @Then("I receive response code 200 for get doctor by ID")
    public void resCode200GetDoctorByID(){
        GetDoctorByID.resCode200GetDoctorByID();
    }



    @Given("I set POST endpoint create new clinics")
    public void setPostEndpointCreateNewClinics(){
        PostCreateNewClinics.setPostEndpointCreateNewClinics();
    }
    @When("I send POST HTTP request create new clinics")
    public void sendPostRequestCreateNewClinics(){
        PostCreateNewClinics.sendPostRequestCreateNewClinics();
    }
    @Then("I receive response code 200 create new clinics")
    public void resCode200PostCreateNewClinics(){
        PostCreateNewClinics.resCode200PostCreateNewClinics();
    }


    @Given("I set POST endpoint create new consultation")
    public void setPostEndpointCreateNewConsultation(){
        PostCreateNewConsultation.setPostEndpointCreateNewConsultation();
    }
    @When("I send POST HTTP request create new consultation")
    public void sendPostRequestCreateNewConsultation(){
        PostCreateNewConsultation.sendPostRequestCreateNewConsultation();
    }
    @Then("I receive response code 200 create new consultation")
    public void resCode200PostCreateNewConsultation(){
        PostCreateNewConsultation.resCode200PostCreateNewConsultation();
    }

}
