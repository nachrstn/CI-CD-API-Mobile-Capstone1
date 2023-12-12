package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.forum.*;

public class ForumNegativeSteps {


    @Steps
    GetAllForumInvalidEndpoint GetAllForumInvalidEndpoint;
    @Steps
    GetForumByIDInvalidEndpoint GetForumByIDInvalidEndpoint;
    @Steps
    GetForumByPatientIDInvalidEndpoint GetForumByPatientIDInvalidEndpoint;
    @Steps
    GetSearchForumInvalidEndpoint GetSearchForumInvalidEndpoint;
    @Steps
    GetSearchForumInvalidSearchKeyword GetSearchForumInvalidSearchKeyword;
    @Steps
    PostCreateNewForumInvalidEndpoint PostCreateNewForumInvalidEndpoint;
    @Steps
    DeleteForumInvalidEndpoint DeleteForumInvalidEndpoint;






    @Given("I set GET all forum invalid endpoint")
    public void setGetEndpointAllForum(){
        GetAllForumInvalidEndpoint.setGetAllForumInvalidEndpoint();
    }
    @When("I send GET HTTP request all forum invalid endpoint")
    public void sendGetRequestAllForum(){
        GetAllForumInvalidEndpoint.sendGetRequestAllForumInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get all forum invalid endpoint")
    public void resCode400GetAllForum(){
        GetAllForumInvalidEndpoint.resCode400GetAllForumInvalidEndpoint();
    }



    @Given("I set GET forum by id invalid endpoint")
    public void setGetEndpointForumByID(){
        GetForumByIDInvalidEndpoint.setGetForumByIDInvalidEndpoint();
    }
    @When("I send GET HTTP request forum by id invalid endpoint")
    public void sendGetRequestForumByID(){
        GetForumByIDInvalidEndpoint.sendGetRequestForumByIDInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get forum by id invalid endpoint")
    public void resCode200GetForumByID(){
        GetForumByIDInvalidEndpoint.resCode400GetForumByIDInvalidEndpoint();
    }




    @Given("I set GET forum by Patient id invalid endpoint")
    public void setGetEndpointForumByPatientID(){
        GetForumByPatientIDInvalidEndpoint.setGetForumByPatientIDInvalidEndpoint();
    }
    @When("I send GET HTTP request forum by Patient id invalid endpoint")
    public void sendGetRequestForumByPatientID(){
        GetForumByPatientIDInvalidEndpoint.sendGetRequestForumByPatientIDInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get forum by Patient id invalid endpoint")
    public void resCode400GetForumByPatientID(){
        GetForumByPatientIDInvalidEndpoint.resCode400GetForumByPatientIDInvalidEndpoint();
    }





    @Given("I set GET search forum invalid endpoint")
    public void setGetEndpointSearchForum(){
        GetSearchForumInvalidEndpoint.setGetSearchForumInvalidEndpoint();
    }
    @When("I send GET HTTP request search forum invalid endpoint")
    public void sendGetRequestSearchForum(){
        GetSearchForumInvalidEndpoint.sendGetRequestSearchForumInvalidEndpoint();
    }
    @Then("I receive response code 400 for Get search forum invalid endpoint")
    public void resCode400GetSearchForum(){
        GetSearchForumInvalidEndpoint.resCode400GetSearchForumInvalidEndpoint();
    }



    @Given("I set GET search forum invalid search keyword")
    public void setGetSearchForumInvalidSearchKeyword(){
        GetSearchForumInvalidSearchKeyword.setGetSearchForumInvalidSearchKeyword();
    }
    @When("I send GET HTTP request search forum invalid search keyword")
    public void sendGETRequestSearchForumInvalidSearchKeyword(){
        GetSearchForumInvalidSearchKeyword.sendGETRequestSearchForumInvalidSearchKeyword();
    }
    @Then("I receive response code 400 for search forum invalid search keyword")
    public void resCode400SearchForumInvalidSearchKeyword(){
        GetSearchForumInvalidSearchKeyword.resCode400SearchForumInvalidSearchKeyword();
    }


    @Given("I set POST create new forum invalid endpoint")
    public void setPostEndpointCreateNewForum(){
        PostCreateNewForumInvalidEndpoint.setPostCreateNewForumInvalidEndpoint();
    }
    @When("I send POST HTTP request create new forum invalid endpoint")
    public void sendPostRequestCreateNewForum(){
        PostCreateNewForumInvalidEndpoint.sendPostRequestCreateNewForumInvalidEndpoint();
    }
    @Then("I receive response code 404 create new forum invalid endpoint")
    public void resCode404PostCreateNewForum(){
        PostCreateNewForumInvalidEndpoint.resCode404PostCreateNewForumInvalidEndpoint();
    }




    @Given("I set DELETE forum invalid endpoint")
    public void setDeleteEndpointForum(){
        DeleteForumInvalidEndpoint.setDeleteForumInvalidEndpoint();
    }
    @When("I send DELETE HTTP request forum invalid endpoint")
    public void sendDeleteRequestForum(){
        DeleteForumInvalidEndpoint.sendDeleteRequestForumInvalidEndpoint();
    }
    @Then("I receive response code 400 forum invalid endpoint")
    public void resCode400DeleteForum(){
        DeleteForumInvalidEndpoint.resCode400DeleteForumInvalidEndpoint();
    }








}
