package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.historytransaction.*;

public class HistoryTransactionsNegativeSteps {

    @Steps
    GetAllTransactionsInvalidEndpoint GetAllTransactionsInvalidEndpoint;
    @Steps
    PostCreateNewPaymentInvalidEndpoint PostCreateNewPaymentInvalidEndpoint;
    @Steps
    PostCreateRefundForPatientInvalidEndpoint PostCreateRefundForPatientInvalidEndpoint;
    @Steps
    PostCreateCancelAppointmentInvalidEndpoint PostCreateCancelAppointmentInvalidEndpoint;
    @Steps
    PutRescheduleApmtByIDPatientInvalidEndpoint PutRescheduleApmtByIDPatientInvalidEndpoint;



    @Given("I set GET all transactions invalid endpoint")
    public void setGetEndpointAllTransactions(){
        GetAllTransactionsInvalidEndpoint.setGetAllTransactionsInvalidEndpoint();
    }
    @When("I send GET HTTP request all transactions invalid endpoint")
    public void sendGetRequestAllTransactions(){
        GetAllTransactionsInvalidEndpoint.sendGetRequestAllTransactionsInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all transactions invalid endpoint")
    public void resCode200GetAllTransactions(){
        GetAllTransactionsInvalidEndpoint.resCode404GetAllTransactionsInvalidEndpoint();
    }


    @Given("I set POST create new payment invalid endpoint")
    public void setPostEndpointCreateNewPayment(){
        PostCreateNewPaymentInvalidEndpoint.setPostCreateNewPaymentInvalidEndpoint();
    }
    @When("I send POST HTTP request create new payment invalid endpoint")
    public void sendPostRequestCreateNewPayment(){
        PostCreateNewPaymentInvalidEndpoint.sendPostRequestCreateNewPaymentInvalidEndpoint();
    }
    @Then("I receive response code 404 create new payment invalid endpoint")
    public void resCode200PostCreateNewPayment(){
        PostCreateNewPaymentInvalidEndpoint.resCode404PostCreateNewPaymentInvalidEndpoint();
    }

    @Given("I set POST create refund for patient invalid endpoint")
    public void setPostEndpointCreateRefundForPatient(){
        PostCreateRefundForPatientInvalidEndpoint.setPostCreateRefundForPatientInvalidEndpoint();
    }
    @When("I send POST HTTP request create refund for patient invalid endpoint")
    public void sendPostRequestCreateRefundForPatient(){
        PostCreateRefundForPatientInvalidEndpoint.sendPostRequestCreateRefundForPatientInvalidEndpoint();
    }
    @Then("I receive response code 404 create refund for patient invalid endpoint")
    public void resCode200PostCreateRefundForPatient(){
        PostCreateRefundForPatientInvalidEndpoint.resCode404PostCreateRefundForPatientInvalidEndpoint();
    }





    @Given("I set POST create cancel appointment invalid endpoint")
    public void setPostEndpointCreateCancelAppointment(){
        PostCreateCancelAppointmentInvalidEndpoint.setPostCreateCancelAppointmentInvalidEndpoint();
    }
    @When("I send POST HTTP request create cancel appointment invalid endpoint")
    public void sendPostRequestCreateCancelAppointment(){
        PostCreateCancelAppointmentInvalidEndpoint.sendPostRequestCreateCancelAppointmentInvalidEndpoint();
    }
    @Then("I receive response code 404 create cancel appointment invalid endpoint")
    public void resCode200PostCreateCancelAppointment(){
        PostCreateCancelAppointmentInvalidEndpoint.resCode404PostCreateCancelAppointmentInvalidEndpoint();
    }




    @Given("I set PUT reschedule appointment by ID patient invalid endpoint")
    public void setPutRescheduleApmtByIDPatientInvalidEndpoint(){
        PutRescheduleApmtByIDPatientInvalidEndpoint.setPutRescheduleApmtByIDPatientInvalidEndpoint();
    }
    @When("I send PUT HTTP request reschedule appointment by ID patient invalid endpoint")
    public void sendPutRequestRescheduleApmtByIDPatientInvalidEndpoint(){
        PutRescheduleApmtByIDPatientInvalidEndpoint.sendPutRequestRescheduleApmtByIDPatientInvalidEndpoint();
    }
    @Then("I receive response code 404 reschedule appointment by ID patient invalid endpoint")
    public void resCode404PutRescheduleApmtByIDPatientInvalidEndpoint(){
        PutRescheduleApmtByIDPatientInvalidEndpoint.resCode404PutRescheduleApmtByIDPatientInvalidEndpoint();
    }

}
