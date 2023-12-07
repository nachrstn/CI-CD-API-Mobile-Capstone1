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
    GetAllPatientsInvalidMethod GetAllPatientsInvalidMethod;
    @Steps
    GetPatientByIDInvalidEndpoint GetPatientByIDInvalidEndpoint;
    @Steps
    GetPatientByIDInvalidMethod GetPatientByIDInvalidMethod;
    @Steps
    PostCreateNewPatientInvalidEndpoint PostCreateNewPatientInvalidEndpoint;
    @Steps
    PostCreateNewPatientInvalidMethod PostCreateNewPatientInvalidMethod;
    @Steps
    PostCreateNewPatientInvalidJsonPayload PostCreateNewPatientInvalidJsonPayload;
    @Steps
    DeletePatientByIDInvalidEndpoint DeletePatientByIDInvalidEndpoint;
    @Steps
    DeletePatientByIDInvalidMethod DeletePatientByIDInvalidMethod;
    @Steps
    PutUpdatePatientProfileInvalidEndpoint PutUpdatePatientProfileInvalidEndpoint;
    @Steps
    PutUpdatePatientProfileInvalidMethod PutUpdatePatientProfileInvalidMethod;
    @Steps
    PutUpdatePatientProfileInvalidJsonPayload PutUpdatePatientProfileInvalidJsonPayload;




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

    @Given("I set GET all patients invalid method")
    public void setGetMethodAllPatients(){
        GetAllPatientsInvalidMethod.setGetAllPatientsInvalidMethod();
    }
    @When("I send GET HTTP request all patients invalid method")
    public void sendGetRequestAllPatientsInvalidMethod(){
        GetAllPatientsInvalidMethod.sendGetRequestAllPatientsInvalidMethod();
    }
    @Then("I receive response code 405 for Get all patients invalid method")
    public void resCode405GetAllPatientsInvalidMethod(){
        GetAllPatientsInvalidMethod.resCode405GetAllPatientsInvalidMethod();
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

    @Given("I set GET patient by id invalid method")
    public void setGetMethodPatientByID(){
        GetPatientByIDInvalidMethod.setGetPatientByIDInvalidMethod();
    }
    @When("I send GET HTTP request patient by id invalid method")
    public void sendGetRequestPatientByIDInvalidMethod(){
        GetPatientByIDInvalidMethod.sendGetRequestPatientByIDInvalidMethod();
    }
    @Then("I receive response code 405 for Get patient by id invalid method")
    public void resCode405GetPatientByIDInvalidMethod(){
        GetPatientByIDInvalidMethod.resCode405GetPatientByIDInvalidMethod();
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

    @Given("I set POST create new patient invalid method")
    public void setPostMethodCreateNewPatient(){
        PostCreateNewPatientInvalidMethod.setPostCreateNewPatientInvalidMethod();
    }
    @When("I send POST HTTP request create new patient invalid method")
    public void sendPostRequestCreateNewPatientInvalidMethod(){
        PostCreateNewPatientInvalidMethod.sendPostRequestCreateNewPatientInvalidMethod();
    }
    @Then("I receive response code 405 create new patient invalid method")
    public void resCode405PostCreateNewPatientInvalidMethod(){
        PostCreateNewPatientInvalidMethod.resCode405PostCreateNewPatientInvalidMethod();
    }

    @Given("I set POST create new patient invalid json payload")
    public void setPostCreateNewPatientInvalidJsonPayload(){
        PostCreateNewPatientInvalidJsonPayload.setPostCreateNewPatientInvalidJsonPayload();
    }
    @When("I send POST HTTP request create new patient invalid json payload")
    public void sendPOSTRequestCreateNewPatientInvalidJsonPayload(){
        PostCreateNewPatientInvalidJsonPayload.sendPOSTRequestCreateNewPatientInvalidJsonPayload();
    }
    @Then("I receive response code 400 create new patient invalid json payload")
    public void resCode400CreateNewPatientInvalidJsonPayload(){
        PostCreateNewPatientInvalidJsonPayload.resCode400CreateNewPatientInvalidJsonPayload();
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

    @Given("I set DELETE patient by id invalid method")
    public void setDeleteMethodPatientByID(){
        DeletePatientByIDInvalidMethod.setDeletePatientByIDInvalidMethod();
    }
    @When("I send DELETE HTTP request patient by id invalid method")
    public void sendDeleteRequestPatientByIDInvalidMethod(){
        DeletePatientByIDInvalidMethod.sendDeleteRequestPatientByIDInvalidMethod();
    }
    @Then("I receive response code 405 patient by id invalid method")
    public void resCode405DeletePatientByIDInvalidMethod(){
        DeletePatientByIDInvalidMethod.resCode405DeletePatientByIDInvalidMethod();
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

    @Given("I set PUT update patient profile invalid method")
    public void setPutMethodUpdatePatientProfile(){
        PutUpdatePatientProfileInvalidMethod.setPutUpdatePatientProfileInvalidMethod();
    }
    @When("I send PUT HTTP request update patient profile invalid method")
    public void sendPutRequestUpdatePatientProfileInvalidMethod(){
        PutUpdatePatientProfileInvalidMethod.sendPutRequestUpdatePatientProfileInvalidMethod();
    }
    @Then("I receive response code 405 update patient profile invalid method")
    public void resCode405PutUpdatePatientProfileInvalidMethod(){
        PutUpdatePatientProfileInvalidMethod.resCode405PutUpdatePatientProfileInvalidMethod();
    }

    @Given("I set PUT update patient profile invalid json payload")
    public void setPutUpdatePatientProfileInvalidJsonPayload(){
        PutUpdatePatientProfileInvalidJsonPayload.setPutUpdatePatientProfileInvalidJsonPayload();
    }
    @When("I send PUT HTTP request update patient profile invalid json payload")
    public void sendPUTRequestUpdatePatientProfileInvalidJsonPayload(){
        PutUpdatePatientProfileInvalidJsonPayload.sendPUTRequestUpdatePatientProfileInvalidJsonPayload();
    }
    @Then("I receive response code 400 update patient profile invalid json payload")
    public void resCode400UpdatePatientProfileInvalidJsonPayload(){
        PutUpdatePatientProfileInvalidJsonPayload.resCode400UpdatePatientProfileInvalidJsonPayload();
    }

}
