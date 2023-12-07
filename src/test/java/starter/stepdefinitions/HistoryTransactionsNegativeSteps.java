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
    GetAllTransactionsInvalidMethod GetAllTransactionsInvalidMethod;
    @Steps
    PostCreateNewPaymentInvalidEndpoint PostCreateNewPaymentInvalidEndpoint;
    @Steps
    PostCreateNewPaymentInvalidMethod PostCreateNewPaymentInvalidMethod;
    @Steps
    PostCreateNewPaymentInvalidJsonPayload PostCreateNewPaymentInvalidJsonPayload;
    @Steps
    PostCreateRefundForPatientInvalidEndpoint PostCreateRefundForPatientInvalidEndpoint;
    @Steps
    PostCreateRefundForPatientInvalidMethod PostCreateRefundForPatientInvalidMethod;
    @Steps
    PostCreateRefundForPatientInvalidJsonPayload PostCreateRefundForPatientInvalidJsonPayload;
    @Steps
    PostCreateCancelAppointmentInvalidEndpoint PostCreateCancelAppointmentInvalidEndpoint;
    @Steps
    PostCreateCancelAppointmentInvalidMethod PostCreateCancelAppointmentInvalidMethod;
    @Steps
    PostCreateCancelAppointmentInvalidJsonPayload PostCreateCancelAppointmentInvalidJsonPayload;



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

    @Given("I set GET all transactions invalid method")
    public void setGetMethodAllTransactions(){
        GetAllTransactionsInvalidMethod.setGetAllTransactionsInvalidMethod();
    }
    @When("I send GET HTTP request all transactions invalid method")
    public void sendGetRequestAllTransactionsInvalidMethod(){
        GetAllTransactionsInvalidMethod.sendGetRequestAllTransactionsInvalidMethod();
    }
    @Then("I receive response code 405 for Get all transactions invalid method")
    public void resCode405GetAllTransactionsInvalidMethod(){
        GetAllTransactionsInvalidMethod.resCode405GetAllTransactionsInvalidMethod();
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

    @Given("I set POST create new payment invalid method")
    public void setPostMethodCreateNewPayment(){
        PostCreateNewPaymentInvalidMethod.setPostCreateNewPaymentInvalidMethod();
    }
    @When("I send POST HTTP request create new payment invalid method")
    public void sendPostRequestCreateNewPaymentInvalidMethod(){
        PostCreateNewPaymentInvalidMethod.sendPostRequestCreateNewPaymentInvalidMethod();
    }
    @Then("I receive response code 405 create new payment invalid method")
    public void resCode405PostCreateNewPaymentInvalidMethod(){
        PostCreateNewPaymentInvalidMethod.resCode405PostCreateNewPaymentInvalidMethod();
    }

    @Given("I set POST create new payment invalid json payload")
    public void setPostCreateNewPaymentInvalidJsonPayload(){
        PostCreateNewPaymentInvalidJsonPayload.setPostCreateNewPaymentInvalidJsonPayload();
    }
    @When("I send POST HTTP request create new payment invalid json payload")
    public void sendPOSTRequestCreateNewPaymentInvalidJsonPayload(){
        PostCreateNewPaymentInvalidJsonPayload.sendPOSTRequestCreateNewPaymentInvalidJsonPayload();
    }
    @Then("I receive response code 400 create new payment invalid json payload")
    public void resCode400CreateNewPaymentInvalidJsonPayload(){
        PostCreateNewPaymentInvalidJsonPayload.resCode400CreateNewPaymentInvalidJsonPayload();
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

    @Given("I set POST create refund for patient invalid method")
    public void setPostMethodCreateRefundForPatient(){
        PostCreateRefundForPatientInvalidMethod.setPostCreateRefundForPatientInvalidMethod();
    }
    @When("I send POST HTTP request create refund for patient invalid method")
    public void sendPostRequestCreateRefundForPatientInvalidMethod(){
        PostCreateRefundForPatientInvalidMethod.sendPostRequestCreateRefundForPatientInvalidMethod();
    }
    @Then("I receive response code 405 create refund for patient invalid method")
    public void resCode405PostCreateRefundForPatientInvalidMethod(){
        PostCreateRefundForPatientInvalidMethod.resCode405PostCreateRefundForPatientInvalidMethod();
    }

    @Given("I set POST create refund for patient invalid json payload")
    public void setPostCreateRefundForPatientInvalidJsonPayload(){
        PostCreateRefundForPatientInvalidJsonPayload.setPostCreateRefundForPatientInvalidJsonPayload();
    }
    @When("I send POST HTTP request create refund for patient invalid json payload")
    public void sendPOSTRequestCreateRefundForPatientInvalidJsonPayload(){
        PostCreateRefundForPatientInvalidJsonPayload.sendPOSTRequestCreateRefundForPatientInvalidJsonPayload();
    }
    @Then("I receive response code 400 create refund for patient invalid json payload")
    public void resCode400CreateRefundForPatientInvalidJsonPayload(){
        PostCreateRefundForPatientInvalidJsonPayload.resCode400CreateRefundForPatientInvalidJsonPayload();
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

    @Given("I set POST create cancel appointment invalid method")
    public void setPostMethodCreateCancelAppointment(){
        PostCreateCancelAppointmentInvalidMethod.setPostCreateCancelAppointmentInvalidMethod();
    }
    @When("I send POST HTTP request create cancel appointment invalid method")
    public void sendPostRequestCreateCancelAppointmentInvalidMethod(){
        PostCreateCancelAppointmentInvalidMethod.sendPostRequestCreateCancelAppointmentInvalidMethod();
    }
    @Then("I receive response code 405 create cancel appointment invalid method")
    public void resCode405PostCreateCancelAppointmentInvalidMethod(){
        PostCreateCancelAppointmentInvalidMethod.resCode405PostCreateCancelAppointmentInvalidMethod();
    }

    @Given("I set POST create cancel appointment invalid json payload")
    public void setPostCreateCancelAppointmentInvalidJsonPayload(){
        PostCreateCancelAppointmentInvalidJsonPayload.setPostCreateCancelAppointmentInvalidJsonPayload();
    }
    @When("I send POST HTTP request create cancel appointment invalid json payload")
    public void sendPOSTRequestCreateCancelAppointmentInvalidJsonPayload(){
        PostCreateCancelAppointmentInvalidJsonPayload.sendPOSTRequestCreateCancelAppointmentInvalidJsonPayload();
    }
    @Then("I receive response code 400 create cancel appointment invalid json payload")
    public void resCode400CreateCancelAppointmentInvalidJsonPayload(){
        PostCreateCancelAppointmentInvalidJsonPayload.resCode400CreateCancelAppointmentInvalidJsonPayload();
    }

}
