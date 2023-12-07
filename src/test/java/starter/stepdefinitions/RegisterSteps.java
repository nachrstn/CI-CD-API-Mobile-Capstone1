package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.register.*;

public class RegisterSteps {
    @Steps
    PostRegister PostRegister;

    @Given("I set POST endpoints Register")
    public void setPostRegisterEndpoint(){
        PostRegister.setPostRegisterEndpoint();
    }
    @When("I send POST HTTP request Register")
    public void sendPostHttpRequestRegisterEndpoint(){
        PostRegister.sendPostHttpRequestRegisterEndpoint();
    }
    @Then("I receive response code 201 Register")
    public void responseCode201RegisterEndpoint(){
        PostRegister.responseCode201RegisterEndpoint();
    }
    @And("I receive valid data for Register")
    public void receiveValidDataForRegister(){
        PostRegister.receiveValidDataForRegister();
    }
}
