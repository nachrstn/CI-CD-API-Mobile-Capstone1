package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.profile.*;

public class ProfileSteps {
    @Steps
    GetAllPatients GetAllPatients;
    @Steps
    GetPatientByID GetPatientByID;
    @Steps
    PostCreateNewPatient PostCreateNewPatient;
    @Steps
    DeletePatientByID DeletePatientByID;
    @Steps
    PutUpdatePatientProfile PutUpdatePatientProfile;



    @Given("I set GET endpoint all patients")
    public void setGetEndpointAllPatients(){
        GetAllPatients.setGetEndpointAllPatients();
    }
    @When("I send GET HTTP request all patients")
    public void sendGetRequestAllPatients(){
        GetAllPatients.sendGetRequestAllPatients();
    }
    @Then("I receive response code 200 for get all patients")
    public void resCode200GetAllPatients(){
        GetAllPatients.resCode200GetAllPatients();
    }


    @Given("I set GET endpoint patient by id")
    public void setGetEndpointPatientByID(){
        GetPatientByID.setGetEndpointPatientByID();
    }
    @When("I send GET HTTP request patient by id")
    public void sendGetRequestPatientByID(){
        GetPatientByID.sendGetRequestPatientByID();
    }
    @Then("I receive response code 200 for get patient by id")
    public void resCode200GetPatientByID(){
        GetPatientByID.resCode200GetPatientByID();
    }

    @Given("I set POST endpoint create new patient")
    public void setPostEndpointCreateNewPatient(){
        PostCreateNewPatient.setPostEndpointCreateNewPatient();
    }
    @When("I send POST HTTP request create new patient")
    public void sendPostRequestCreateNewPatient(){
        PostCreateNewPatient.sendPostRequestCreateNewPatient();
    }
    @Then("I receive response code 200 create new patient")
    public void resCode200PostCreateNewPatient(){
        PostCreateNewPatient.resCode200PostCreateNewPatient();
    }

    @Given("I set DELETE endpoint patient by id")
    public void setDeleteEndpointPatientByID(){
        DeletePatientByID.setDeleteEndpointPatientByID();
    }
    @When("I send DELETE HTTP request patient by id")
    public void sendDeleteRequestPatientByID(){
        DeletePatientByID.sendDeleteRequestPatientByID();
    }
    @Then("I receive response code 200 patient by id")
    public void resCode200DeletePatientByID(){
        DeletePatientByID.resCode200DeletePatientByID();
    }

    @Given("I set PUT endpoint update patient profile")
    public void setPutEndpointUpdatePatientProfile(){
        PutUpdatePatientProfile.setPutEndpointUpdatePatientProfile();
    }
    @When("I send PUT HTTP request update patient profile")
    public void sendPutRequestUpdatePatientProfile(){
        PutUpdatePatientProfile.sendPutRequestUpdatePatientProfile();
    }
    @Then("I receive response code 200 update patient profile")
    public void resCode200PutUpdatePatientProfile(){
        PutUpdatePatientProfile.resCode200PutUpdatePatientProfile();
    }


}
