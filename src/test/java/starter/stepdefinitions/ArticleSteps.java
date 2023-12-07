package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.article.*;

public class ArticleSteps {

    @Steps
    GetAllArticles GetAllArticles;
    @Steps
    GetArticleByID GetArticleByID;



    @Given("I set GET endpoint all articles")
    public void setGetEndpointAllArticles(){
        GetAllArticles.setGetEndpointAllArticles();
    }
    @When("I send GET HTTP request all articles")
    public void sendGetRequestAllArticles(){
        GetAllArticles.sendGetRequestAllArticles();
    }
    @Then("I receive response code 200 for get all articles")
    public void resCode200GetAllArticles(){
        GetAllArticles.resCode200GetAllArticles();
    }


    @Given("I set GET endpoint article by ID")
    public void setGetEndpointArticleByID(){
        GetArticleByID.setGetEndpointArticleByID();
    }
    @When("I send GET HTTP request article by ID")
    public void sendGetRequestArticleByID(){
        GetArticleByID.sendGetRequestArticleByID();
    }
    @Then("I receive response code 200 for get article by ID")
    public void resCode200GetArticleByID(){
        GetArticleByID.resCode200GetArticleByID();
    }

}
