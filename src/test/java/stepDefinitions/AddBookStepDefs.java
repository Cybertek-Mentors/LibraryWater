package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.AddBookPage;
import utilities.Driver;

public class AddBookStepDefs {
    String bookName = "";
    @Given("the user is on Book Management Page")
    public void the_user_is_on_Book_Management_Page() {
        // Write code here that turns the phrase above into concrete actions
        new AddBookPage().Books.click();
        Assert.assertEquals("http://library2.cybertekschool.com/#books", Driver.get().getCurrentUrl());

    }
    @When("the user clicks on Add Book")
    public void the_user_clicks_on_Add_Book() {
        // Write code here that turns the phrase above into concrete actions
        new AddBookPage().AddBookButton.click();
        Assert.assertTrue(new AddBookPage().popUp.isDisplayed());

    }
    @Then("the user should be able to see Add Book pop-up")
    public void the_user_should_be_able_to_see_Add_Book_pop_up() {


    new AddBookPage().AddBookMenu.click();

    }


}

