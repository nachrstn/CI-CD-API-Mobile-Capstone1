package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.chabotAI.*;

public class ChatbotAISteps {
    @Steps
    GetAIChatbotByUserID GetAIChatbotByUserID;
    @Steps
    GetAIChatbotBySessionID GetAIChatbotBySessionID;
    @Steps
    PostCreateUserChatbot PostCreateUserChatbot;




    @Given("I set GET endpoint AI chatbot by user ID")
    public void setGetEndpointAIChatbotByUserID() {
        GetAIChatbotByUserID.setGetEndpointAIChatbotByUserID();
    }

    @When("I send GET HTTP request AI chatbot by user ID")
    public void sendGetRequestAIChatbotByUserID() {
        GetAIChatbotByUserID.sendGetRequestAIChatbotByUserID();
    }

    @Then("I receive response code 200 for get AI chatbot by user ID")
    public void resCode200GetAIChatbotByUserID() {
        GetAIChatbotByUserID.resCode200GetAIChatbotByUserID();
    }



    @Given("I set GET endpoint AI chatbot by session ID")
    public void setGetEndpointAIChatbotBySessionID(){
        GetAIChatbotBySessionID.setGetEndpointAIChatbotBySessionID();
    }
    @When("I send GET HTTP request AI chatbot by session ID")
    public void sendGetRequestAIChatbotBySessionID(){
        GetAIChatbotBySessionID.sendGetRequestAIChatbotBySessionID();
    }
    @Then("I receive response code 200 for get AI chatbot by session ID")
    public void resCode200GetAIChatbotBySessionID(){
        GetAIChatbotBySessionID.resCode200GetAIChatbotBySessionID();
    }



    @Given("I set POST Create user chatbot")
    public void setPOSTCreateUserChatbot(){
        PostCreateUserChatbot.setPOSTCreateUserChatbot();
    }
    @When("I send POST HTTP request Create user chatbot")
    public void sendPostRequestCreateUserChatbot(){
        PostCreateUserChatbot.sendPostRequestCreateUserChatbot();
    }
    @Then("I receive response code 200 Create user chatbot")
    public void resCode200PostCreateUserChatbot(){
        PostCreateUserChatbot.resCode200PostCreateUserChatbot();
    }

}