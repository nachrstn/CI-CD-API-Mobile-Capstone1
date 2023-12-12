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
    GetAllClinicsInvalidEndpoint GetAllClinicsInvalidEndpoint;
    @Steps
    GetAllDoctorsBySpecialistsInvalidEndpoint GetAllDoctorsBySpecialistsInvalidEndpoint;
    @Steps
    GetAllDoctorsByClinicsInvalidEndpoint GetAllDoctorsByClinicsInvalidEndpoint;
    @Steps
    GetAllDoctorsInvalidEndpoint GetAllDoctorsInvalidEndpoint;
    @Steps
    GetSearchDoctorsInvalidEndpoint GetSearchDoctorsInvalidEndpoint;
    @Steps
    GetDoctorByIDInvalidEndpoint GetDoctorByIDInvalidEndpoint;
    @Steps
    PostCreateNewClinicsInvalidEndpoint PostCreateNewClinicsInvalidEndpoint;
    @Steps
    PostCreateNewConsultationInvalidEndpoint PostCreateNewConsultationInvalidEndpoint;





    @Given("I set GET all specialist invalid endpoint")
    public void setGetAllSpecialistInvalidEndpoint(){
        GetAllSpecialistInvalidEndpoint.setGetAllSpecialistInvalidEndpoint();
    }
    @When("I send GET HTTP request all specialist invalid endpoint")
    public void sendGetRequestAllSpecialistInvalidEndpoint(){
        GetAllSpecialistInvalidEndpoint.sendGetRequestAllSpecialistInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get all specialist invalid endpoint")
    public void resCode400GetAllSpecialistInvalidEndpoint(){
        GetAllSpecialistInvalidEndpoint.resCode400GetAllSpecialistInvalidEndpoint();
    }





    @Given("I set GET all clinics invalid endpoint")
    public void setGetAllClinicsInvalidEndpoint(){
        GetAllClinicsInvalidEndpoint.setGetAllClinicsInvalidEndpoint();
    }
    @When("I send GET HTTP request all clinics invalid endpoint")
    public void sendGetRequestAllClinicsInvalidEndpoint(){
        GetAllClinicsInvalidEndpoint.sendGetRequestAllClinicsInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get all clinics invalid endpoint")
    public void resCode400GetAllClinicsInvalidEndpoint(){
        GetAllClinicsInvalidEndpoint.resCode400GetAllClinicsInvalidEndpoint();
    }





    @Given("I set GET all doctors by specialists invalid endpoint")
    public void setGetAllDoctorsBySpecialistsInvalidEndpoint(){
        GetAllDoctorsBySpecialistsInvalidEndpoint.setGetAllDoctorsBySpecialistsInvalidEndpoint();
    }
    @When("I send GET HTTP request all doctors by specialists invalid endpoint")
    public void sendGetRequestAllDoctorsBySpecialistsInvalidEndpoint(){
        GetAllDoctorsBySpecialistsInvalidEndpoint.sendGetRequestAllDoctorsBySpecialistsInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get all doctors by specialists invalid endpoint")
    public void resCode400GetAllDoctorsBySpecialistsInvalidEndpoint(){
        GetAllDoctorsBySpecialistsInvalidEndpoint.resCode400GetAllDoctorsBySpecialistsInvalidEndpoint();
    }





    @Given("I set GET all doctors by clinics invalid endpoint")
    public void setGetAllDoctorsByClinicsInvalidEndpoint(){
        GetAllDoctorsByClinicsInvalidEndpoint.setGetAllDoctorsByClinicsInvalidEndpoint();
    }
    @When("I send GET HTTP request all doctors by clinics invalid endpoint")
    public void sendGetRequestAllDoctorsByClinicsInvalidEndpoint(){
        GetAllDoctorsByClinicsInvalidEndpoint.sendGetRequestAllDoctorsByClinicsInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get all doctors by clinics invalid endpoint")
    public void resCode400GetAllDoctorsByClinicsInvalidEndpoint(){
        GetAllDoctorsByClinicsInvalidEndpoint.resCode400GetAllDoctorsByClinicsInvalidEndpoint();
    }





    @Given("I set GET all doctors invalid endpoint")
    public void setGetAllDoctorsInvalidEndpoint(){
        GetAllDoctorsInvalidEndpoint.setGetAllDoctorsInvalidEndpoint();
    }
    @When("I send GET HTTP request all doctors invalid endpoint")
    public void sendGetRequestAllDoctorsInvalidEndpoint(){
        GetAllDoctorsInvalidEndpoint.sendGetRequestAllDoctorsInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get all doctors invalid endpoint")
    public void resCode400GetAllDoctorsInvalidEndpoint(){
        GetAllDoctorsInvalidEndpoint.resCode400GetAllDoctorsInvalidEndpoint();
    }





    @Given("I set GET search doctors invalid endpoint")
    public void setGetSearchDoctorsInvalidEndpoint(){
        GetSearchDoctorsInvalidEndpoint.setGetSearchDoctorsInvalidEndpoint();
    }
    @When("I send GET HTTP request search doctors invalid endpoint")
    public void sendGetRequestSearchDoctorsInvalidEndpoint(){
        GetSearchDoctorsInvalidEndpoint.sendGetRequestSearchDoctorsInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get search doctors invalid endpoint")
    public void resCode400GetSearchDoctorsInvalidEndpoint(){
        GetSearchDoctorsInvalidEndpoint.resCode400GetSearchDoctorsInvalidEndpoint();
    }



    @Given("I set GET doctor by ID invalid endpoint")
    public void setGetDoctorByIDInvalidEndpoint(){
        GetDoctorByIDInvalidEndpoint.setGetDoctorByIDInvalidEndpoint();
    }
    @When("I send GET HTTP request doctor by ID invalid endpoint")
    public void sendGetRequestDoctorByIDInvalidEndpoint(){
        GetDoctorByIDInvalidEndpoint.sendGetRequestDoctorByIDInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get doctor by ID invalid endpoint")
    public void resCode400GetDoctorByIDInvalidEndpoint(){
        GetDoctorByIDInvalidEndpoint.resCode400GetDoctorByIDInvalidEndpoint();
    }






    @Given("I set POST create new clinics invalid endpoint")
    public void setPostEndpointCreateNewClinics(){
        PostCreateNewClinicsInvalidEndpoint.setPostCreateNewClinicsInvalidEndpoint();
    }
    @When("I send POST HTTP request create new clinics invalid endpoint")
    public void sendPostRequestCreateNewClinics(){
        PostCreateNewClinicsInvalidEndpoint.sendPostRequestCreateNewClinicsInvalidEndpoint();
    }
    @Then("I receive response code 400 create new clinics invalid endpoint")
    public void resCode400PostCreateNewClinics(){
        PostCreateNewClinicsInvalidEndpoint.resCode400PostCreateNewClinicsInvalidEndpoint();
    }








    @Given("I set POST create new consultation invalid endpoint")
    public void setPostCreateNewConsultationInvalidEndpoint(){
        PostCreateNewConsultationInvalidEndpoint.setPostCreateNewConsultationInvalidEndpoint();
    }
    @When("I send POST HTTP request create new consultation invalid endpoint")
    public void sendPostRequestCreateNewConsultationInvalidEndpoint(){
        PostCreateNewConsultationInvalidEndpoint.sendPostRequestCreateNewConsultationInvalidEndpoint();
    }
    @Then("I receive response code 404 create new consultation invalid endpoint")
    public void resCode404PostCreateNewConsultationInvalidEndpoint(){
        PostCreateNewConsultationInvalidEndpoint.resCode404PostCreateNewConsultationInvalidEndpoint();
    }





}

