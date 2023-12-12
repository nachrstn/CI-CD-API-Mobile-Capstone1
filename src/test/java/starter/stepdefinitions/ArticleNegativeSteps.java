package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.article.*;

public class ArticleNegativeSteps {

    @Steps
    GetAllArticlesInvalidEndpoint GetAllArticlesInvalidEndpoint;
    @Steps
    GetArticleByIDInvalidEndpoint GetArticleByIDInvalidEndpoint;




    @Given("I set GET all articles invalid endpoint")
    public void setGetAllArticlesInvalidEndpoint(){
        GetAllArticlesInvalidEndpoint.setGetAllArticlesInvalidEndpoint();
    }
    @When("I send GET HTTP request all articles invalid endpoint")
    public void sendGetRequestAllArticlesInvalidEndpoint(){
        GetAllArticlesInvalidEndpoint.sendGetRequestAllArticlesInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all articles invalid endpoint")
    public void resCode404GetAllArticlesInvalidEndpoint(){
        GetAllArticlesInvalidEndpoint.resCode404GetAllArticlesInvalidEndpoint();
    }




    @Given("I set GET article by ID invalid endpoint")
    public void setGetEndpointArticleByID(){
        GetArticleByIDInvalidEndpoint.setGetArticleByIDInvalidEndpoint();
    }
    @When("I send GET HTTP request article by ID invalid endpoint")
    public void sendGetRequestArticleByID(){
        GetArticleByIDInvalidEndpoint.sendGetRequestArticleByIDInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get article by ID invalid endpoint")
    public void resCode200GetArticleByID(){
        GetArticleByIDInvalidEndpoint.resCode404GetArticleByIDInvalidEndpoint();
    }





}
