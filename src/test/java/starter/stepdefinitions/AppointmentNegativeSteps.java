package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.appointment.*;

public class AppointmentNegativeSteps {

    @Steps
    GetAllSpecialistInvalidEndpoint GetAllSpecialistInvalidEndpoint;
    @Steps
    GetAllSpecialistInvalidMethod GetAllSpecialistInvalidMethod;
    @Steps
    GetAllClinicsInvalidEndpoint GetAllClinicsInvalidEndpoint;
    @Steps
    GetAllClinicsInvalidMethod GetAllClinicsInvalidMethod;
    @Steps
    GetAllDoctorsBySpecialistsInvalidEndpoint GetAllDoctorsBySpecialistsInvalidEndpoint;
    @Steps
    GetAllDoctorsBySpecialistsInvalidMethod GetAllDoctorsBySpecialistsInvalidMethod;
    @Steps
    GetAllDoctorsByClinicsInvalidEndpoint GetAllDoctorsByClinicsInvalidEndpoint;
    @Steps
    GetAllDoctorsByClinicsInvalidMethod GetAllDoctorsByClinicsInvalidMethod;
    @Steps
    GetAllDoctorsInvalidEndpoint GetAllDoctorsInvalidEndpoint;
    @Steps
    GetAllDoctorsInvalidMethod GetAllDoctorsInvalidMethod;
    @Steps
    GetSearchDoctorsInvalidEndpoint GetSearchDoctorsInvalidEndpoint;
    @Steps
    GetSearchDoctorsInvalidMethod GetSearchDoctorsInvalidMethod;
    @Steps
    GetDoctorByIDInvalidEndpoint GetDoctorByIDInvalidEndpoint;
    @Steps
    GetDoctorByIDInvalidMethod GetDoctorByIDInvalidMethod;
    @Steps
    PostCreateNewClinicsInvalidEndpoint PostCreateNewClinicsInvalidEndpoint;
    @Steps
    PostCreateNewClinicsInvalidMethod PostCreateNewClinicsInvalidMethod;
    @Steps
    PostCreateNewClinicsInvalidJsonPayload PostCreateNewClinicsInvalidJsonPayload;
    @Steps
    PostCreateNewConsultationInvalidEndpoint PostCreateNewConsultationInvalidEndpoint;
    @Steps
    PostCreateNewConsultationInvalidMethod PostCreateNewConsultationInvalidMethod;
    @Steps
    PostCreateNewConsultationInvalidJsonPayload PostCreateNewConsultationInvalidJsonPayload;





    @Given("I set GET all specialist invalid endpoint")
    public void setGetEndpointAllSpecialist(){
        GetAllSpecialistInvalidEndpoint.setGetAllSpecialistInvalidEndpoint();
    }
    @When("I send GET HTTP request all specialist invalid endpoint")
    public void sendGetRequestAllSpecialist(){
        GetAllSpecialistInvalidEndpoint.sendGetRequestAllSpecialistInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all specialist invalid endpoint")
    public void resCode200GetAllSpecialist(){
        GetAllSpecialistInvalidEndpoint.resCode404GetAllSpecialistInvalidEndpoint();
    }

    @Given("I set GET all specialist invalid method")
    public void setGetMethodAllSpecialist(){
        GetAllSpecialistInvalidMethod.setGetAllSpecialistInvalidMethod();
    }
    @When("I send GET HTTP request all specialist invalid method")
    public void sendGetRequestAllSpecialistInvalidMethod(){
        GetAllSpecialistInvalidMethod.sendGetRequestAllSpecialistInvalidMethod();
    }
    @Then("I receive response code 405 for Get all specialist invalid method")
    public void resCode405GetAllSpecialistInvalidMethod(){
        GetAllSpecialistInvalidMethod.resCode405GetAllSpecialistInvalidMethod();
    }



    @Given("I set GET all clinics invalid endpoint")
    public void setGetEndpointAllClinics(){
        GetAllClinicsInvalidEndpoint.setGetAllClinicsInvalidEndpoint();
    }
    @When("I send GET HTTP request all clinics invalid endpoint")
    public void sendGetRequestAllClinics(){
        GetAllClinicsInvalidEndpoint.sendGetRequestAllClinicsInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all clinics invalid endpoint")
    public void resCode200GetAllClinics(){
        GetAllClinicsInvalidEndpoint.resCode404GetAllClinicsInvalidEndpoint();
    }

    @Given("I set GET all clinics invalid method")
    public void setGetMethodAllClinics(){
        GetAllClinicsInvalidMethod.setGetAllClinicsInvalidMethod();
    }
    @When("I send GET HTTP request all clinics invalid method")
    public void sendGetRequestAllClinicsInvalidMethod(){
        GetAllClinicsInvalidMethod.sendGetRequestAllClinicsInvalidMethod();
    }
    @Then("I receive response code 405 for Get all clinics invalid method")
    public void resCode405GetAllClinicsInvalidMethod(){
        GetAllClinicsInvalidMethod.resCode405GetAllClinicsInvalidMethod();
    }



    @Given("I set GET all doctors by specialists invalid endpoint")
    public void setGetEndpointAllDoctorsBySpecialists(){
        GetAllDoctorsBySpecialistsInvalidEndpoint.setGetAllDoctorsBySpecialistsInvalidEndpoint();
    }
    @When("I send GET HTTP request all doctors by specialists invalid endpoint")
    public void sendGetRequestAllDoctorsBySpecialists(){
        GetAllDoctorsBySpecialistsInvalidEndpoint.sendGetRequestAllDoctorsBySpecialistsInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all doctors by specialists invalid endpoint")
    public void resCode200GetAllDoctorsBySpecialists(){
        GetAllDoctorsBySpecialistsInvalidEndpoint.resCode404GetAllDoctorsBySpecialistsInvalidEndpoint();
    }

    @Given("I set GET all doctors by specialists invalid method")
    public void setGetMethodAllDoctorsBySpecialists(){
        GetAllDoctorsBySpecialistsInvalidMethod.setGetAllDoctorsBySpecialistsInvalidMethod();
    }
    @When("I send GET HTTP request all doctors by specialists invalid method")
    public void sendGetRequestAllDoctorsBySpecialistsInvalidMethod(){
        GetAllDoctorsBySpecialistsInvalidMethod.sendGetRequestAllDoctorsBySpecialistsInvalidMethod();
    }
    @Then("I receive response code 405 for Get all doctors by specialists invalid method")
    public void resCode405GetAllDoctorsBySpecialistsInvalidMethod(){
        GetAllDoctorsBySpecialistsInvalidMethod.resCode405GetAllDoctorsBySpecialistsInvalidMethod();
    }



    @Given("I set GET all doctors by clinics invalid endpoint")
    public void setGetEndpointAllDoctorsByClinics(){
        GetAllDoctorsByClinicsInvalidEndpoint.setGetAllDoctorsByClinicsInvalidEndpoint();
    }
    @When("I send GET HTTP request all doctors by clinics invalid endpoint")
    public void sendGetRequestAllDoctorsByClinics(){
        GetAllDoctorsByClinicsInvalidEndpoint.sendGetRequestAllDoctorsByClinicsInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all doctors by clinics invalid endpoint")
    public void resCode200GetAllDoctorsByClinics(){
        GetAllDoctorsByClinicsInvalidEndpoint.resCode404GetAllDoctorsByClinicsInvalidEndpoint();
    }

    @Given("I set GET all doctors by clinics invalid method")
    public void setGetMethodAllDoctorsByClinics(){
        GetAllDoctorsByClinicsInvalidMethod.setGetAllDoctorsByClinicsInvalidMethod();
    }
    @When("I send GET HTTP request all doctors by clinics invalid method")
    public void sendGetRequestAllDoctorsByClinicsInvalidMethod(){
        GetAllDoctorsByClinicsInvalidMethod.sendGetRequestAllDoctorsByClinicsInvalidMethod();
    }
    @Then("I receive response code 405 for Get all doctors by clinics invalid method")
    public void resCode405GetAllDoctorsByClinicsInvalidMethod(){
        GetAllDoctorsByClinicsInvalidMethod.resCode405GetAllDoctorsByClinicsInvalidMethod();
    }



    @Given("I set GET all doctors invalid endpoint")
    public void setGetEndpointAllDoctors(){
        GetAllDoctorsInvalidEndpoint.setGetAllDoctorsInvalidEndpoint();
    }
    @When("I send GET HTTP request all doctors invalid endpoint")
    public void sendGetRequestAllDoctors(){
        GetAllDoctorsInvalidEndpoint.sendGetRequestAllDoctorsInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all doctors invalid endpoint")
    public void resCode200GetAllDoctors(){
        GetAllDoctorsInvalidEndpoint.resCode404GetAllDoctorsInvalidEndpoint();
    }

    @Given("I set GET all doctors invalid method")
    public void setGetMethodAllDoctors(){
        GetAllDoctorsInvalidMethod.setGetAllDoctorsInvalidMethod();
    }
    @When("I send GET HTTP request all doctors invalid method")
    public void sendGetRequestAllDoctorsInvalidMethod(){
        GetAllDoctorsInvalidMethod.sendGetRequestAllDoctorsInvalidMethod();
    }
    @Then("I receive response code 405 for Get all doctors invalid method")
    public void resCode405GetAllDoctorsInvalidMethod(){
        GetAllDoctorsInvalidMethod.resCode405GetAllDoctorsInvalidMethod();
    }



    @Given("I set GET search doctors invalid endpoint")
    public void setGetEndpointSearchDoctors(){
        GetSearchDoctorsInvalidEndpoint.setGetSearchDoctorsInvalidEndpoint();
    }
    @When("I send GET HTTP request search doctors invalid endpoint")
    public void sendGetRequestSearchDoctors(){
        GetSearchDoctorsInvalidEndpoint.sendGetRequestSearchDoctorsInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get search doctors invalid endpoint")
    public void resCode200GetSearchDoctors(){
        GetSearchDoctorsInvalidEndpoint.resCode404GetSearchDoctorsInvalidEndpoint();
    }

    @Given("I set GET search doctors invalid method")
    public void setGetMethodSearchDoctors(){
        GetSearchDoctorsInvalidMethod.setGetSearchDoctorsInvalidMethod();
    }
    @When("I send GET HTTP request search doctors invalid method")
    public void sendGetRequestSearchDoctorsInvalidMethod(){
        GetSearchDoctorsInvalidMethod.sendGetRequestSearchDoctorsInvalidMethod();
    }
    @Then("I receive response code 405 for Get search doctors invalid method")
    public void resCode405GetSearchDoctorsInvalidMethod(){
        GetSearchDoctorsInvalidMethod.resCode405GetSearchDoctorsInvalidMethod();
    }

    @Given("I set GET doctor by ID invalid endpoint")
    public void setGetEndpointDoctorByID(){
        GetDoctorByIDInvalidEndpoint.setGetDoctorByIDInvalidEndpoint();
    }
    @When("I send GET HTTP request doctor by ID invalid endpoint")
    public void sendGetRequestDoctorByID(){
        GetDoctorByIDInvalidEndpoint.sendGetRequestDoctorByIDInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get doctor by ID invalid endpoint")
    public void resCode200GetDoctorByID(){
        GetDoctorByIDInvalidEndpoint.resCode404GetDoctorByIDInvalidEndpoint();
    }

    @Given("I set GET doctor by ID invalid method")
    public void setGetMethodDoctorByID(){
        GetDoctorByIDInvalidMethod.setGetDoctorByIDInvalidMethod();
    }
    @When("I send GET HTTP request doctor by ID invalid method")
    public void sendGetRequestDoctorByIDInvalidMethod(){
        GetDoctorByIDInvalidMethod.sendGetRequestDoctorByIDInvalidMethod();
    }
    @Then("I receive response code 405 for Get doctor by ID invalid method")
    public void resCode405GetDoctorByIDInvalidMethod(){
        GetDoctorByIDInvalidMethod.resCode405GetDoctorByIDInvalidMethod();
    }




    @Given("I set POST create new clinics invalid endpoint")
    public void setPostEndpointCreateNewClinics(){
        PostCreateNewClinicsInvalidEndpoint.setPostCreateNewClinicsInvalidEndpoint();
    }
    @When("I send POST HTTP request create new clinics invalid endpoint")
    public void sendPostRequestCreateNewClinics(){
        PostCreateNewClinicsInvalidEndpoint.sendPostRequestCreateNewClinicsInvalidEndpoint();
    }
    @Then("I receive response code 404 create new clinics invalid endpoint")
    public void resCode200PostCreateNewClinics(){
        PostCreateNewClinicsInvalidEndpoint.resCode404PostCreateNewClinicsInvalidEndpoint();
    }

    @Given("I set POST create new clinics invalid method")
    public void setPostMethodCreateNewClinics(){
        PostCreateNewClinicsInvalidMethod.setPostCreateNewClinicsInvalidMethod();
    }
    @When("I send POST HTTP request create new clinics invalid method")
    public void sendPostRequestCreateNewClinicsInvalidMethod(){
        PostCreateNewClinicsInvalidMethod.sendPostRequestCreateNewClinicsInvalidMethod();
    }
    @Then("I receive response code 405 create new clinics invalid method")
    public void resCode405PostCreateNewClinicsInvalidMethod(){
        PostCreateNewClinicsInvalidMethod.resCode405PostCreateNewClinicsInvalidMethod();
    }

    @Given("I set POST create new clinics invalid json payload")
    public void setPostCreateNewClinicsInvalidJsonPayload(){
        PostCreateNewClinicsInvalidJsonPayload.setPostCreateNewClinicsInvalidJsonPayload();
    }
    @When("I send POST HTTP request create new clinics invalid json payload")
    public void sendPOSTRequestCreateNewClinicsInvalidJsonPayload(){
        PostCreateNewClinicsInvalidJsonPayload.sendPOSTRequestCreateNewClinicsInvalidJsonPayload();
    }
    @Then("I receive response code 400 create new clinics invalid json payload")
    public void resCode400CreateNewClinicsInvalidJsonPayload(){
        PostCreateNewClinicsInvalidJsonPayload.resCode400CreateNewClinicsInvalidJsonPayload();
    }




    @Given("I set POST create new consultation invalid endpoint")
    public void setPostEndpointCreateNewConsultation(){
        PostCreateNewConsultationInvalidEndpoint.setPostCreateNewConsultationInvalidEndpoint();
    }
    @When("I send POST HTTP request create new consultation invalid endpoint")
    public void sendPostRequestCreateNewConsultation(){
        PostCreateNewConsultationInvalidEndpoint.sendPostRequestCreateNewConsultationInvalidEndpoint();
    }
    @Then("I receive response code 404 create new consultation invalid endpoint")
    public void resCode200PostCreateNewConsultation(){
        PostCreateNewConsultationInvalidEndpoint.resCode404PostCreateNewConsultationInvalidEndpoint();
    }

    @Given("I set POST create new consultation invalid method")
    public void setPostMethodCreateNewConsultation(){
        PostCreateNewConsultationInvalidMethod.setPostCreateNewConsultationInvalidMethod();
    }
    @When("I send POST HTTP request create new consultation invalid method")
    public void sendPostRequestCreateNewConsultationInvalidMethod(){
        PostCreateNewConsultationInvalidMethod.sendPostRequestCreateNewConsultationInvalidMethod();
    }
    @Then("I receive response code 405 create new consultation invalid method")
    public void resCode405PostCreateNewConsultationInvalidMethod(){
        PostCreateNewConsultationInvalidMethod.resCode405PostCreateNewConsultationInvalidMethod();
    }

    @Given("I set POST create new consultation invalid json payload")
    public void setPostCreateNewConsultationInvalidJsonPayload(){
        PostCreateNewConsultationInvalidJsonPayload.setPostCreateNewConsultationInvalidJsonPayload();
    }
    @When("I send POST HTTP request create new consultation invalid json payload")
    public void sendPOSTRequestCreateNewConsultationInvalidJsonPayload(){
        PostCreateNewConsultationInvalidJsonPayload.sendPOSTRequestCreateNewConsultationInvalidJsonPayload();
    }
    @Then("I receive response code 400 create new consultation invalid json payload")
    public void resCode400CreateNewConsultationInvalidJsonPayload(){
        PostCreateNewConsultationInvalidJsonPayload.resCode400CreateNewConsultationInvalidJsonPayload();
    }

}

