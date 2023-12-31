package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.historytransaction.*;

public class HistoryTransactionsSteps {
    @Steps
    GetAllTransactions GetAllTransactions;
    @Steps
    PostCreateNewPayment PostCreateNewPayment;
    @Steps
    PostCreateRefundForPatient PostCreateRefundForPatient;
    @Steps
    PostCreateCancelAppointment PostCreateCancelAppointment;
    @Steps
    PutRescheduleApmtByIDPatient PutRescheduleApmtByIDPatient;


    @Given("I set GET endpoint all transactions")
    public void setGetEndpointAllTransactions(){
        GetAllTransactions.setGetEndpointAllTransactions();
    }
    @When("I send GET HTTP request all transactions")
    public void sendGetRequestAllTransactions(){
        GetAllTransactions.sendGetRequestAllTransactions();
    }
    @Then("I receive response code 200 for get all transactions")
    public void resCode200GetAllTransactions(){
        GetAllTransactions.resCode200GetAllTransactions();
    }



    @Given("I set POST endpoint create new payment")
    public void setPostEndpointCreateNewPayment(){
        PostCreateNewPayment.setPostEndpointCreateNewPayment();
    }
    @When("I send POST HTTP request create new payment")
    public void sendPostRequestCreateNewPayment(){
        PostCreateNewPayment.sendPostRequestCreateNewPayment();
    }
    @Then("I receive response code 201 create new payment")
    public void resCode201PostCreateNewPayment(){
        PostCreateNewPayment.resCode201PostCreateNewPayment();
    }



    @Given("I set POST endpoint create refund for patient")
    public void setPostEndpointCreateRefundForPatient(){
        PostCreateRefundForPatient.setPostEndpointCreateRefundForPatient();
    }
    @When("I send POST HTTP request create refund for patient")
    public void sendPostRequestCreateRefundForPatient(){
        PostCreateRefundForPatient.sendPostRequestCreateRefundForPatient();
    }
    @Then("I receive response code 200 create refund for patient")
    public void resCode200PostCreateRefundForPatient(){
        PostCreateRefundForPatient.resCode200PostCreateRefundForPatient();
    }



    @Given("I set POST endpoint create cancel appointment")
    public void setPostEndpointCreateCancelAppointment(){
        PostCreateCancelAppointment.setPostEndpointCreateCancelAppointment();
    }
    @When("I send POST HTTP request create cancel appointment")
    public void sendPostRequestCreateCancelAppointment(){
        PostCreateCancelAppointment.sendPostRequestCreateCancelAppointment();
    }
    @Then("I receive response code 201 create cancel appointment")
    public void resCode201PostCreateCancelAppointment(){
        PostCreateCancelAppointment.resCode201PostCreateCancelAppointment();
    }



    @Given("I set PUT reschedule appointment by ID patient")
    public void setPUTRescheduleApmtByIDPatient(){
        PutRescheduleApmtByIDPatient.setPUTRescheduleApmtByIDPatient();
    }
    @When("I send PUT HTTP request reschedule appointment by ID patient")
    public void sendPutRequestRescheduleApmtByIDPatient(){
        PutRescheduleApmtByIDPatient.sendPutRequestRescheduleApmtByIDPatient();
    }
    @Then("I receive response code 200 reschedule appointment by ID patient")
    public void resCode200PutRescheduleApmtByIDPatient(){
        PutRescheduleApmtByIDPatient.resCode200PutRescheduleApmtByIDPatient();
    }

}
