package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.login.*;

public class LoginNegativeSteps {
    @Steps
    PostLoginInvalidEndpoint PostLoginInvalidEndpoint;
    @Steps
    PostLoginInvalidPassword PostLoginInvalidPassword;
    @Steps
    PostLoginInvalidEmail PostLoginInvalidEmail;
    @Steps
    PostLoginEmptyPassword PostLoginEmptyPassword;
    @Steps
    PostLoginEmptyEmail PostLoginEmptyEmail;
    @Steps
    PutChangePasswordInvalidEndpoint PutChangePasswordInvalidEndpoint;


    @Given("I set POST Login invalid endpoint")
    public void setPostLoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.setPostLoginInvalidEndpoint();
    }
    @When("I send POST HTTP request Login invalid endpoint")
    public void sendPostHttpRequestLoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.sendPostHttpRequestLoginInvalidEndpoint();
    }
    @Then("I receive response code 400 for Login invalid endpoint")
    public void responseCode400LoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.responseCode400LoginInvalidEndpoint();
    }

    @Given("I set POST login invalid password")
    public void setPostLoginInvalidPassword(){
        PostLoginInvalidPassword.setPostLoginInvalidPassword();
    }
    @When("I send POST HTTP request login invalid password")
    public void sendPostRequestLoginInvalidPassword(){
        PostLoginInvalidPassword.sendPostRequestLoginInvalidPassword();
    }
    @Then("I receive response code 401 login invalid password")
    public void resCode401PostLoginInvalidPassword(){
        PostLoginInvalidPassword.resCode401PostLoginInvalidPassword();
    }

    @Given("I set POST login invalid email")
    public void setPostLoginInvalidEmail(){
        PostLoginInvalidEmail.setPostLoginInvalidEmail();
    }
    @When("I send POST HTTP request login invalid email")
    public void sendPOSTRequestLoginInvalidEmail(){
        PostLoginInvalidEmail.sendPOSTRequestLoginInvalidEmail();
    }
    @Then("I receive response code 401 login invalid email")
    public void resCode401LoginInvalidEmail(){
        PostLoginInvalidEmail.resCode401LoginInvalidEmail();
    }


    @Given("I set POST login empty password")
    public void setPostLoginEmptyPassword(){
        PostLoginEmptyPassword.setPostLoginEmptyPassword();
    }
    @When("I send POST HTTP request login empty password")
    public void sendPostRequestLoginEmptyPassword(){
        PostLoginEmptyPassword.sendPostRequestLoginEmptyPassword();
    }
    @Then("I receive response code 401 login empty password")
    public void resCode401PostLoginEmptyPassword(){
        PostLoginEmptyPassword.resCode401PostLoginEmptyPassword();
    }

    @Given("I set POST login empty email")
    public void setPostLoginEmptyEmail(){
        PostLoginEmptyEmail.setPostLoginEmptyEmail();
    }
    @When("I send POST HTTP request login empty email")
    public void sendPOSTRequestLoginEmptyEmail(){
        PostLoginEmptyEmail.sendPOSTRequestLoginEmptyEmail();
    }
    @Then("I receive response code 401 login empty email")
    public void resCode401LoginEmptyEmail(){
        PostLoginEmptyEmail.resCode401LoginEmptyEmail();
    }




    @Given("I set PUT change password invalid endpoint")
    public void setPutEndpointChangePassword(){
        PutChangePasswordInvalidEndpoint.setPutChangePasswordInvalidEndpoint();
    }
    @When("I send PUT HTTP request change password invalid endpoint")
    public void sendPutRequestChangePassword(){
        PutChangePasswordInvalidEndpoint.sendPutRequestChangePasswordInvalidEndpoint();
    }
    @Then("I receive response code 404 change password invalid endpoint")
    public void resCode200PutChangePassword(){
        PutChangePasswordInvalidEndpoint.resCode404PutChangePasswordInvalidEndpoint();
    }





}
