package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.profile.*;

public class ProfileNegativeSteps {


    @Steps
    GetAllPatientsInvalidEndpoint GetAllPatientsInvalidEndpoint;
    @Steps
    GetPatientByIDInvalidEndpoint GetPatientByIDInvalidEndpoint;
    @Steps
    PostCreateNewPatientInvalidEndpoint PostCreateNewPatientInvalidEndpoint;
    @Steps
    PostCreatePatientOnlyDateOfBirth PostCreatePatientOnlyDateOfBirth;
    @Steps
    DeletePatientByIDInvalidEndpoint DeletePatientByIDInvalidEndpoint;
    @Steps
    PutUpdatePatientProfileInvalidEndpoint PutUpdatePatientProfileInvalidEndpoint;




    @Given("I set GET all patients invalid endpoint")
    public void setGetEndpointAllPatients(){
        GetAllPatientsInvalidEndpoint.setGetAllPatientsInvalidEndpoint();
    }
    @When("I send GET HTTP request all patients invalid endpoint")
    public void sendGetRequestAllPatients(){
        GetAllPatientsInvalidEndpoint.sendGetRequestAllPatientsInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all patients invalid endpoint")
    public void resCode200GetAllPatients(){
        GetAllPatientsInvalidEndpoint.resCode404GetAllPatientsInvalidEndpoint();
    }



    @Given("I set GET patient by id invalid endpoint")
    public void setGetEndpointPatientByID(){
        GetPatientByIDInvalidEndpoint.setGetPatientByIDInvalidEndpoint();
    }
    @When("I send GET HTTP request patient by id invalid endpoint")
    public void sendGetRequestPatientByID(){
        GetPatientByIDInvalidEndpoint.sendGetRequestPatientByIDInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get patient by id invalid endpoint")
    public void resCode200GetPatientByID(){
        GetPatientByIDInvalidEndpoint.resCode404GetPatientByIDInvalidEndpoint();
    }




    @Given("I set POST create new patient invalid endpoint")
    public void setPostEndpointCreateNewPatient(){
        PostCreateNewPatientInvalidEndpoint.setPostCreateNewPatientInvalidEndpoint();
    }
    @When("I send POST HTTP request create new patient invalid endpoint")
    public void sendPostRequestCreateNewPatient(){
        PostCreateNewPatientInvalidEndpoint.sendPostRequestCreateNewPatientInvalidEndpoint();
    }
    @Then("I receive response code 404 create new patient invalid endpoint")
    public void resCode200PostCreateNewPatient(){
        PostCreateNewPatientInvalidEndpoint.resCode404PostCreateNewPatientInvalidEndpoint();
    }

    @Given("I set POST create new patient with blank body exclude date of birth")
    public void setPostCreatePatientOnlyDateOfBirth(){
        PostCreatePatientOnlyDateOfBirth.setPostCreatePatientOnlyDateOfBirth();
    }
    @When("I send POST HTTP request create new patient with blank body exclude date of birth")
    public void sendPOSTRequestCreatePatientOnlyDateOfBirth(){
        PostCreatePatientOnlyDateOfBirth.sendPOSTRequestCreatePatientOnlyDateOfBirth();
    }
    @Then("I receive response code 400 create new patient with blank body exclude date of birth")
    public void resCode400CreatePatientOnlyDateOfBirth(){
        PostCreatePatientOnlyDateOfBirth.resCode400CreatePatientOnlyDateOfBirth();
    }


    @Given("I set DELETE patient by id invalid endpoint")
    public void setDeleteEndpointPatientByID(){
        DeletePatientByIDInvalidEndpoint.setDeletePatientByIDInvalidEndpoint();
    }
    @When("I send DELETE HTTP request patient by id invalid endpoint")
    public void sendDeleteRequestPatientByID(){
        DeletePatientByIDInvalidEndpoint.sendDeleteRequestPatientByIDInvalidEndpoint();
    }
    @Then("I receive response code 404 patient by id invalid endpoint")
    public void resCode200DeletePatientByID(){
        DeletePatientByIDInvalidEndpoint.resCode404DeletePatientByIDInvalidEndpoint();
    }


    @Given("I set PUT update patient profile invalid endpoint")
    public void setPutEndpointUpdatePatientProfile(){
        PutUpdatePatientProfileInvalidEndpoint.setPutUpdatePatientProfileInvalidEndpoint();
    }
    @When("I send PUT HTTP request update patient profile invalid endpoint")
    public void sendPutRequestUpdatePatientProfile(){
        PutUpdatePatientProfileInvalidEndpoint.sendPutRequestUpdatePatientProfileInvalidEndpoint();
    }
    @Then("I receive response code 404 update patient profile invalid endpoint")
    public void resCode200PutUpdatePatientProfile(){
        PutUpdatePatientProfileInvalidEndpoint.resCode404PutUpdatePatientProfileInvalidEndpoint();
    }


}
