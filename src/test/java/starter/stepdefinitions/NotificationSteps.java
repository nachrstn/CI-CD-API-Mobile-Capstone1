package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.notification.*;

public class NotificationSteps {

    @Steps
    GetNotifications GetNotifications;


    @Given("I set GET endpoint notifications")
    public void setGetEndpointNotifications(){
        GetNotifications.setGetEndpointNotifications();
    }
    @When("I send GET HTTP request notifications")
    public void sendGetRequestNotifications(){
        GetNotifications.sendGetRequestNotifications();
    }
    @Then("I receive response code 200 for get notifications")
    public void resCode200GetNotifications(){
        GetNotifications.resCode200GetNotifications();
    }



}
