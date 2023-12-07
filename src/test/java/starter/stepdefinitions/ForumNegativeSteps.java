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
    GetAllForumInvalidMethod GetAllForumInvalidMethod;
    @Steps
    GetForumByPatientIDInvalidEndpoint GetForumByPatientIDInvalidEndpoint;
    @Steps
    GetForumByPatientIDInvalidMethod GetForumByPatientIDInvalidMethod;
    @Steps
    GetSearchForumInvalidEndpoint GetSearchForumInvalidEndpoint;
    @Steps
    GetSearchForumInvalidMethod GetSearchForumInvalidMethod;
    @Steps
    GetSearchForumInvalidSearchKeyword GetSearchForumInvalidSearchKeyword;
    @Steps
    PostCreateNewForumInvalidEndpoint PostCreateNewForumInvalidEndpoint;
    @Steps
    PostCreateNewForumInvalidMethod PostCreateNewForumInvalidMethod;
    @Steps
    PostCreateNewForumInvalidJsonPayload PostCreateNewForumInvalidJsonPayload;
    @Steps
    DeleteForumInvalidEndpoint DeleteForumInvalidEndpoint;
    @Steps
    DeleteForumInvalidMethod DeleteForumInvalidMethod;






    @Given("I set GET all forum invalid endpoint")
    public void setGetEndpointAllForum(){
        GetAllForumInvalidEndpoint.setGetAllForumInvalidEndpoint();
    }
    @When("I send GET HTTP request all forum invalid endpoint")
    public void sendGetRequestAllForum(){
        GetAllForumInvalidEndpoint.sendGetRequestAllForumInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get all forum invalid endpoint")
    public void resCode200GetAllForum(){
        GetAllForumInvalidEndpoint.resCode404GetAllForumInvalidEndpoint();
    }

    @Given("I set GET all forum invalid method")
    public void setGetMethodAllForum(){
        GetAllForumInvalidMethod.setGetAllForumInvalidMethod();
    }
    @When("I send GET HTTP request all forum invalid method")
    public void sendGetRequestAllForumInvalidMethod(){
        GetAllForumInvalidMethod.sendGetRequestAllForumInvalidMethod();
    }
    @Then("I receive response code 405 for Get all forum invalid method")
    public void resCode405GetAllForumInvalidMethod(){
        GetAllForumInvalidMethod.resCode405GetAllForumInvalidMethod();
    }




    @Given("I set GET forum by Patient id invalid endpoint")
    public void setGetEndpointForumByPatientID(){
        GetForumByPatientIDInvalidEndpoint.setGetForumByPatientIDInvalidEndpoint();
    }
    @When("I send GET HTTP request forum by Patient id invalid endpoint")
    public void sendGetRequestForumByPatientID(){
        GetForumByPatientIDInvalidEndpoint.sendGetRequestForumByPatientIDInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get forum by Patient id invalid endpoint")
    public void resCode200GetForumByPatientID(){
        GetForumByPatientIDInvalidEndpoint.resCode404GetForumByPatientIDInvalidEndpoint();
    }

    @Given("I set GET forum by Patient id invalid method")
    public void setGetMethodForumByPatientID(){
        GetForumByPatientIDInvalidMethod.setGetForumByPatientIDInvalidMethod();
    }
    @When("I send GET HTTP request forum by Patient id invalid method")
    public void sendGetRequestForumByPatientIDInvalidMethod(){
        GetForumByPatientIDInvalidMethod.sendGetRequestForumByPatientIDInvalidMethod();
    }
    @Then("I receive response code 405 for Get forum by Patient id invalid method")
    public void resCode405GetForumByPatientIDInvalidMethod(){
        GetForumByPatientIDInvalidMethod.resCode405GetForumByPatientIDInvalidMethod();
    }



    @Given("I set GET search forum invalid endpoint")
    public void setGetEndpointSearchForum(){
        GetSearchForumInvalidEndpoint.setGetSearchForumInvalidEndpoint();
    }
    @When("I send GET HTTP request search forum invalid endpoint")
    public void sendGetRequestSearchForum(){
        GetSearchForumInvalidEndpoint.sendGetRequestSearchForumInvalidEndpoint();
    }
    @Then("I receive response code 404 for Get search forum invalid endpoint")
    public void resCode200GetSearchForum(){
        GetSearchForumInvalidEndpoint.resCode404GetSearchForumInvalidEndpoint();
    }

    @Given("I set GET search forum invalid method")
    public void setGetMethodSearchForum(){
        GetSearchForumInvalidMethod.setGetSearchForumInvalidMethod();
    }
    @When("I send GET HTTP request search forum invalid method")
    public void sendGetRequestSearchForumInvalidMethod(){
        GetSearchForumInvalidMethod.sendGetRequestSearchForumInvalidMethod();
    }
    @Then("I receive response code 405 for Get search forum invalid method")
    public void resCode405GetSearchForumInvalidMethod(){
        GetSearchForumInvalidMethod.resCode405GetSearchForumInvalidMethod();
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
    public void resCode200PostCreateNewForum(){
        PostCreateNewForumInvalidEndpoint.resCode404PostCreateNewForumInvalidEndpoint();
    }

    @Given("I set POST create new forum invalid method")
    public void setPostMethodCreateNewForum(){
        PostCreateNewForumInvalidMethod.setPostCreateNewForumInvalidMethod();
    }
    @When("I send POST HTTP request create new forum invalid method")
    public void sendPostRequestCreateNewForumInvalidMethod(){
        PostCreateNewForumInvalidMethod.sendPostRequestCreateNewForumInvalidMethod();
    }
    @Then("I receive response code 405 create new forum invalid method")
    public void resCode405PostCreateNewForumInvalidMethod(){
        PostCreateNewForumInvalidMethod.resCode405PostCreateNewForumInvalidMethod();
    }

    @Given("I set POST create new forum invalid json payload")
    public void setPostCreateNewForumInvalidJsonPayload(){
        PostCreateNewForumInvalidJsonPayload.setPostCreateNewForumInvalidJsonPayload();
    }
    @When("I send POST HTTP request create new forum invalid json payload")
    public void sendPOSTRequestCreateNewForumInvalidJsonPayload(){
        PostCreateNewForumInvalidJsonPayload.sendPOSTRequestCreateNewForumInvalidJsonPayload();
    }
    @Then("I receive response code 400 create new forum invalid json payload")
    public void resCode400CreateNewForumInvalidJsonPayload(){
        PostCreateNewForumInvalidJsonPayload.resCode400CreateNewForumInvalidJsonPayload();
    }



    @Given("I set DELETE forum invalid endpoint")
    public void setDeleteEndpointForum(){
        DeleteForumInvalidEndpoint.setDeleteForumInvalidEndpoint();
    }
    @When("I send DELETE HTTP request forum invalid endpoint")
    public void sendDeleteRequestForum(){
        DeleteForumInvalidEndpoint.sendDeleteRequestForumInvalidEndpoint();
    }
    @Then("I receive response code 404 forum invalid endpoint")
    public void resCode200DeleteForum(){
        DeleteForumInvalidEndpoint.resCode404DeleteForumInvalidEndpoint();
    }

    @Given("I set DELETE forum invalid method")
    public void setDeleteMethodForum(){
        DeleteForumInvalidMethod.setDeleteForumInvalidMethod();
    }
    @When("I send DELETE HTTP request forum invalid method")
    public void sendDeleteRequestForumInvalidMethod(){
        DeleteForumInvalidMethod.sendDeleteRequestForumInvalidMethod();
    }
    @Then("I receive response code 405 forum invalid method")
    public void resCode405DeleteForumInvalidMethod(){
        DeleteForumInvalidMethod.resCode405DeleteForumInvalidMethod();
    }







}
