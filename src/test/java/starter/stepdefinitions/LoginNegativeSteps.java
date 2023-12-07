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
    PostLoginInvalidMethod PostLoginInvalidMethod;
    @Steps
    PostLoginInvalidPayload PostLoginInvalidPayload;
    @Steps
    PutChangePasswordInvalidEndpoint PutChangePasswordInvalidEndpoint;
    @Steps
    PutChangePasswordInvalidMethod PutChangePasswordInvalidMethod;
    @Steps
    PutChangePasswordInvalidJsonPayload PutChangePasswordInvalidJsonPayload;


    @Given("I set POST Login invalid endpoint")
    public void setPostLoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.setPostLoginInvalidEndpoint();
    }
    @When("I send POST HTTP request Login invalid endpoint")
    public void sendPostHttpRequestLoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.sendPostHttpRequestLoginInvalidEndpoint();
    }
    @Then("I receive response code 404 for Login invalid endpoint")
    public void responseCode404LoginInvalidEndpoint(){
        PostLoginInvalidEndpoint.responseCode404LoginInvalidEndpoint();
    }


    @Given("I set POST Login invalid method")
    public void setPostLoginInvalidMethod(){
        PostLoginInvalidMethod.setPostLoginInvalidMethod();
    }
    @When("I send POST HTTP request Login invalid method")
    public void sendPostHttpRequestLoginInvalidMethod(){
        PostLoginInvalidMethod.sendPostHttpRequestLoginInvalidMethod();
    }
    @Then("I receive response code 405 for Login invalid method")
    public void responseCode405LoginInvalidMethod(){
        PostLoginInvalidMethod.responseCode405LoginInvalidMethod();
    }


    @Given("I set POST Login invalid payload")
    public void setPostLoginInvalidPayload(){
        PostLoginInvalidPayload.setPostLoginInvalidPayload();
    }
    @When("I send POST HTTP request Login invalid payload")
    public void sendPostHttpRequestLoginInvalidPayload(){
        PostLoginInvalidPayload.sendPostHttpRequestLoginInvalidPayload();
    }
    @Then("I receive response code 400 for Login invalid payload")
    public void responseCode400LoginInvalidPayload(){
        PostLoginInvalidPayload.responseCode400LoginInvalidPayload();
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

    @Given("I set PUT change password invalid method")
    public void setPutMethodChangePassword(){
        PutChangePasswordInvalidMethod.setPutChangePasswordInvalidMethod();
    }
    @When("I send PUT HTTP request change password invalid method")
    public void sendPutRequestChangePasswordInvalidMethod(){
        PutChangePasswordInvalidMethod.sendPutRequestChangePasswordInvalidMethod();
    }
    @Then("I receive response code 405 change password invalid method")
    public void resCode405PutChangePasswordInvalidMethod(){
        PutChangePasswordInvalidMethod.resCode405PutChangePasswordInvalidMethod();
    }

    @Given("I set PUT change password invalid json payload")
    public void setPutChangePasswordInvalidJsonPayload(){
        PutChangePasswordInvalidJsonPayload.setPutChangePasswordInvalidJsonPayload();
    }
    @When("I send PUT HTTP request change password invalid json payload")
    public void sendPUTRequestChangePasswordInvalidJsonPayload(){
        PutChangePasswordInvalidJsonPayload.sendPutRequestChangePasswordInvalidJsonPayload();
    }
    @Then("I receive response code 400 change password invalid json payload")
    public void resCode400ChangePasswordInvalidJsonPayload(){
        PutChangePasswordInvalidJsonPayload.resCode400ChangePasswordInvalidJsonPayload();
    }


}
