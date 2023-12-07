package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.notification.*;

public class NotificationNegativeSteps {

    @Steps
    GetNotificationsInvalidEndpoint GetNotificationsInvalidEndpoint;
    @Steps
    GetNotificationsInvalidMethod GetNotificationsInvalidMethod;


    @Given("I set GET notifications invalid endpoint")
    public void setGetEndpointNotifications(){
        GetNotificationsInvalidEndpoint.setGetNotificationsInvalidEndpoint();
    }
    @When("I send GET HTTP request notifications invalid endpoint")
    public void sendGetRequestNotifications(){
        GetNotificationsInvalidEndpoint.sendGetRequestNotificationsInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get notifications invalid endpoint")
    public void resCode200GetNotifications(){
        GetNotificationsInvalidEndpoint.resCode404GetNotificationsInvalidEndpoint();
    }

    @Given("I set GET notifications invalid method")
    public void setGetMethodNotifications(){
        GetNotificationsInvalidMethod.setGetNotificationsInvalidMethod();
    }
    @When("I send GET HTTP request notifications invalid method")
    public void sendGetRequestNotificationsInvalidMethod(){
        GetNotificationsInvalidMethod.sendGetRequestNotificationsInvalidMethod();
    }
    @Then("I receive response code 405 for Get notifications invalid method")
    public void resCode405GetNotificationsInvalidMethod(){
        GetNotificationsInvalidMethod.resCode405GetNotificationsInvalidMethod();
    }

    


}
