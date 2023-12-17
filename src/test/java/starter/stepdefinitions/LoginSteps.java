package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.login.*;

public class LoginSteps {
    @Steps
    PostLogin PostLogin;
    @Steps
    PutChangePassword PutChangePassword;
    @Steps
    PutSendOTP PutSendOTP;
    @Steps
    PutSendOTPUnregisteredEmail PutSendOTPUnregisteredEmail;




    @Given("I set POST endpoints Login")
    public void setPostLoginEndpoint(){
        PostLogin.setPostLoginEndpoint();
    }
    @When("I send POST HTTP request Login")
    public void sendPostHttpRequestLoginEndpoint(){
        PostLogin.sendPostHttpRequestLoginEndpoint();
    }
    @Then("I receive response code 200 Login")
    public void responseCode200LoginEndpoint(){
        PostLogin.responseCode200LoginEndpoint();
    }


    @Given("I set PUT endpoint change password")
    public void setPutEndpointChangePassword(){
        PutChangePassword.setPutEndpointChangePassword();
    }
    @When("I send PUT HTTP request change password")
    public void sendPutRequestChangePassword(){
        PutChangePassword.sendPutRequestChangePassword();
    }
    @Then("I receive response code 200 change password")
    public void resCode200PutChangePassword(){
        PutChangePassword.resCode200PutChangePassword();
    }

    @Given("I set PUT Send OTP")
    public void setPUTSendOTP(){
        PutSendOTP.setPUTSendOTP();
    }
    @When("I send PUT HTTP request Send OTP")
    public void sendPutRequestSendOTP(){
        PutSendOTP.sendPutRequestSendOTP();
    }
    @Then("I receive response code 200 Send OTP")
    public void resCode200PutSendOTP(){
        PutSendOTP.resCode200PutSendOTP();
    }

    @Given("I set PUT Send OTP unregistered email")
    public void setPutSendOTPUnregisteredEmail(){
        PutSendOTPUnregisteredEmail.setPutSendOTPUnregisteredEmail();
    }
    @When("I send PUT HTTP request Send OTP unregistered email")
    public void sendPutRequestSendOTPUnregisteredEmail(){
        PutSendOTPUnregisteredEmail.sendPutRequestSendOTPUnregisteredEmail();
    }
    @Then("I receive response code 400 Send OTP unregistered email")
    public void resCode400PutSendOTPUnregisteredEmail(){
        PutSendOTPUnregisteredEmail.resCode400PutSendOTPUnregisteredEmail();
    }

}
