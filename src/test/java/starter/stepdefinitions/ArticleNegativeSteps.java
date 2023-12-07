package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.article.*;

public class ArticleNegativeSteps {

    @Steps
    GetAllArticlesInvalidMethod GetAllArticlesInvalidMethod;
    @Steps
    GetAllArticlesInvalidEndpoint GetAllArticlesInvalidEndpoint;
    @Steps
    GetArticleByIDInvalidEndpoint GetArticleByIDInvalidEndpoint;
    @Steps
    GetArticleByIDInvalidMethod GetArticleByIDInvalidMethod;



    @Given("I set GET all articles invalid method")
    public void setGetMethodAllArticles(){
        GetAllArticlesInvalidMethod.setGetAllArticlesInvalidMethod();
    }
    @When("I send GET HTTP request all articles invalid method")
    public void sendGetRequestAllArticlesInvalidMethod(){
        GetAllArticlesInvalidMethod.sendGetRequestAllArticlesInvalidMethod();
    }
    @Then("I receive response code 405 for Get all articles invalid method")
    public void resCode405GetAllArticlesInvalidMethod(){
        GetAllArticlesInvalidMethod.resCode405GetAllArticlesInvalidMethod();
    }

    @Given("I set GET all articles invalid endpoint")
    public void setGetEndpointAllArticles(){
        GetAllArticlesInvalidEndpoint.setGetAllArticlesInvalidEndpoint();
    }
    @When("I send GET HTTP request all articles invalid endpoint")
    public void sendGetRequestAllArticles(){
        GetAllArticlesInvalidEndpoint.sendGetRequestAllArticlesInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all articles invalid endpoint")
    public void resCode200GetAllArticles(){
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

    @Given("I set GET article by ID invalid method")
    public void setGetMethodArticleByID(){
        GetArticleByIDInvalidMethod.setGetArticleByIDInvalidMethod();
    }
    @When("I send GET HTTP request article by ID invalid method")
    public void sendGetRequestArticleByIDInvalidMethod(){
        GetArticleByIDInvalidMethod.sendGetRequestArticleByIDInvalidMethod();
    }
    @Then("I receive response code 405 for Get article by ID invalid method")
    public void resCode405GetArticleByIDInvalidMethod(){
        GetArticleByIDInvalidMethod.resCode405GetArticleByIDInvalidMethod();
    }



}
