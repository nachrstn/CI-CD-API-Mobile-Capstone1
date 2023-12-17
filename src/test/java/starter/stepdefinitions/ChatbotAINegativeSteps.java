package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.chabotAI.*;
public class ChatbotAINegativeSteps {

    @Steps
    GetAIChatbotByUserIDInvalidEndpoint GetAIChatbotByUserIDInvalidEndpoint;
    @Steps
    GetAIChatbotBySessionIDInvalidEndpoint GetAIChatbotBySessionIDInvalidEndpoint;
    @Steps
    PostCreateUserChatbotInvalidEndpoint PostCreateUserChatbotInvalidEndpoint;



    @Given("I set GET AI chatbot by user ID invalid endpoint")
    public void setGetEndpointAIChatbotByUserID(){
        GetAIChatbotByUserIDInvalidEndpoint.setGetAIChatbotByUserIDInvalidEndpoint();
    }
    @When("I send GET HTTP request AI chatbot by user ID invalid endpoint")
    public void sendGetRequestAIChatbotByUserID(){
        GetAIChatbotByUserIDInvalidEndpoint.sendGetRequestAIChatbotByUserIDInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get AI chatbot by user ID invalid endpoint")
    public void resCode200GetAIChatbotByUserID(){
        GetAIChatbotByUserIDInvalidEndpoint.resCode404GetAIChatbotByUserIDInvalidEndpoint();
    }

    @Given("I set GET AI chatbot by session ID invalid endpoint")
    public void setGetEndpointAIChatbotBySessionID(){
        GetAIChatbotBySessionIDInvalidEndpoint.setGetAIChatbotBySessionIDInvalidEndpoint();
    }
    @When("I send GET HTTP request AI chatbot by session ID invalid endpoint")
    public void sendGetRequestAIChatbotBySessionID(){
        GetAIChatbotBySessionIDInvalidEndpoint.sendGetRequestAIChatbotBySessionIDInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get AI chatbot by session ID invalid endpoint")
    public void resCode200GetAIChatbotBySessionID(){
        GetAIChatbotBySessionIDInvalidEndpoint.resCode404GetAIChatbotBySessionIDInvalidEndpoint();
    }



    @Given("I set POST Create user chatbot invalid endpoint")
    public void setPostCreateUserChatbotInvalidEndpoint(){
        PostCreateUserChatbotInvalidEndpoint.setPostCreateUserChatbotInvalidEndpoint();
    }
    @When("I send POST HTTP request Create user chatbot invalid endpoint")
    public void sendPostRequestCreateUserChatbotInvalidEndpoint(){
        PostCreateUserChatbotInvalidEndpoint.sendPostRequestCreateUserChatbotInvalidEndpoint();
    }
    @Then("I receive response code 404 Create user chatbot invalid endpoint")
    public void resCode404PostCreateUserChatbotInvalidEndpoint(){
        PostCreateUserChatbotInvalidEndpoint.resCode404PostCreateUserChatbotInvalidEndpoint();
    }


}
