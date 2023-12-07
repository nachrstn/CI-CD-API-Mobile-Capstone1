package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.forum.*;

public class ForumSteps {
    @Steps
    GetAllForum GetAllForum;
    @Steps
    GetForumByPatientID GetForumByPatientID;
    @Steps
    GetSearchForum GetSearchForum;
    @Steps
    PostCreateNewForum PostCreateNewForum;
    @Steps
    DeleteForum DeleteForum;






    @Given("I set GET endpoint all forum")
    public void setGetEndpointAllForum(){
        GetAllForum.setGetEndpointAllForum();
    }
    @When("I send GET HTTP request all forum")
    public void sendGetRequestAllForum(){
        GetAllForum.sendGetRequestAllForum();
    }
    @Then("I receive response code 200 for get all forum")
    public void resCode200GetAllForum(){
        GetAllForum.resCode200GetAllForum();
    }



    @Given("I set GET endpoint forum by Patient id")
    public void setGetEndpointForumByPatientID(){
        GetForumByPatientID.setGetEndpointForumByPatientID();
    }
    @When("I send GET HTTP request forum by Patient id")
    public void sendGetRequestForumByPatientID(){
        GetForumByPatientID.sendGetRequestForumByPatientID();
    }
    @Then("I receive response code 200 for get forum by Patient id")
    public void resCode200GetForumByPatientID(){
        GetForumByPatientID.resCode200GetForumByPatientID();
    }



    @Given("I set GET endpoint search forum")
    public void setGetEndpointSearchForum(){
        GetSearchForum.setGetEndpointSearchForum();
    }
    @When("I send GET HTTP request search forum")
    public void sendGetRequestSearchForum(){
        GetSearchForum.sendGetRequestSearchForum();
    }
    @Then("I receive response code 200 for get search forum")
    public void resCode200GetSearchForum(){
        GetSearchForum.resCode200GetSearchForum();
    }



    @Given("I set POST endpoint create new forum")
    public void setPostEndpointCreateNewForum(){
        PostCreateNewForum.setPostEndpointCreateNewForum();
    }
    @When("I send POST HTTP request create new forum")
    public void sendPostRequestCreateNewForum(){
        PostCreateNewForum.sendPostRequestCreateNewForum();
    }
    @Then("I receive response code 200 create new forum")
    public void resCode200PostCreateNewForum(){
        PostCreateNewForum.resCode200PostCreateNewForum();
    }



    @Given("I set DELETE endpoint forum")
    public void setDeleteEndpointForum(){
        DeleteForum.setDeleteEndpointForum();
    }
    @When("I send DELETE HTTP request forum")
    public void sendDeleteRequestForum(){
        DeleteForum.sendDeleteRequestForum();
    }
    @Then("I receive response code 200 forum")
    public void resCode200DeleteForum(){
        DeleteForum.resCode200DeleteForum();
    }



}
