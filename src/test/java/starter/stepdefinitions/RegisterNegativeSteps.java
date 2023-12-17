package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.register.*;

public class RegisterNegativeSteps {
    @Steps
    PostRegisterInvalidEndpoint PostRegisterInvalidEndpoint;
    @Steps
    PostRegistrationWithRegisteredEmail PostRegistrationWithRegisteredEmail;


    @Given("I set POST Register invalid endpoint")
    public void setPostRegisterInvalidEndpoint(){
        PostRegisterInvalidEndpoint.setPostRegisterInvalidEndpoint();
    }
    @When("I send POST HTTP request Register invalid endpoint")
    public void sendPostHttpRequestRegisterInvalidEndpoint(){
        PostRegisterInvalidEndpoint.sendPostHttpRequestRegisterInvalidEndpoint();
    }
    @Then("I receive response code 400 for Register")
    public void responseCode400RegisterInvalidEndpoint(){
        PostRegisterInvalidEndpoint.responseCode400RegisterInvalidEndpoint();
    }

    @Given("I set POST registration with registered email")
    public void setPostRegistrationWithRegisteredEmail (){
        PostRegistrationWithRegisteredEmail.setPostRegistrationWithRegisteredEmail();
    }
    @When("I send POST HTTP request registration with registered email")
    public void sendPostRequestRegistrationWithRegisteredEmail(){
        PostRegistrationWithRegisteredEmail.sendPostRequestRegistrationWithRegisteredEmail();
    }
    @Then("I receive response code 400 registration with registered email")
    public void resCode400PostRegistrationWithRegisteredEmail(){
        PostRegistrationWithRegisteredEmail.resCode400PostRegistrationWithRegisteredEmail();
    }


}
