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
    PostRegisterInvalidMethod PostRegisterInvalidMethod;
    @Steps
    PostRegisterInvalidPayload PostRegisterInvalidPayload;

    @Given("I set POST Register invalid endpoint")
    public void setPostRegisterInvalidEndpoint(){
        PostRegisterInvalidEndpoint.setPostRegisterInvalidEndpoint();
    }
    @When("I send POST HTTP request Register invalid endpoint")
    public void sendPostHttpRequestRegisterInvalidEndpoint(){
        PostRegisterInvalidEndpoint.sendPostHttpRequestRegisterInvalidEndpoint();
    }
    @Then("I receive response code 404 for Register")
    public void responseCode404RegisterInvalidEndpoint(){
        PostRegisterInvalidEndpoint.responseCode404RegisterInvalidEndpoint();
    }

    @Given("I set POST Register invalid method")
    public void setPostRegisterInvalidMethod(){
        PostRegisterInvalidMethod.setPostRegisterInvalidMethod();
    }
    @When("I send POST HTTP request Register invalid method")
    public void sendPostHttpRequestRegisterInvalidMethod(){
        PostRegisterInvalidMethod.sendPostHttpRequestRegisterInvalidMethod();
    }
    @Then("I receive response code 405 for Register invalid method")
    public void responseCode405RegisterInvalidMethod(){
        PostRegisterInvalidMethod.responseCode405RegisterInvalidMethod();
    }

    @Given("I set POST Register invalid payload")
    public void setPostRegisterInvalidPayload(){
        PostRegisterInvalidPayload.setPostRegisterInvalidPayload();
    }
    @When("I send POST HTTP request Register invalid payload")
    public void sendPostHttpRequestRegisterInvalidPayload(){
        PostRegisterInvalidPayload.sendPostHttpRequestRegisterInvalidPayload();
    }
    @Then("I receive response code 400 for Register invalid payload")
    public void responseCode400RegisterInvalidPayload(){
        PostRegisterInvalidPayload.responseCode400RegisterInvalidPayload();
    }
}
