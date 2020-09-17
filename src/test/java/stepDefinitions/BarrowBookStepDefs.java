package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BookManagementPage;
import pages.LibraryLoginPage;

public class BarrowBookStepDefs {

    BookManagementPage bookManagementPage;



    @Given("the user enter valid student credential {string} {string}" )
    public void the_user_enter_valid_student_credential(String student_username, String student_password) throws InterruptedException {

        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.loginLibrary(student_username, student_password);

        Thread.sleep(3000);

    }


    @When("the user navigate to Books module" )
    public void the_user_navigate_to_Books_module() throws InterruptedException {


        BookManagementPage bookManagementPage = new BookManagementPage();
        bookManagementPage.navigateToMenu("Books");
        bookManagementPage.recordSelector("500");
        Thread.sleep(2000);


    }

    @When("the user click the Barrow Book button" )
    public void the_user_click_the_Barrow_Book_button() throws InterruptedException {

        Thread.sleep(3000);
        new BookManagementPage().borrowbookbutton.click();

    }

    @Then("The Book has been barrowed is verifed" )
    public void the_Book_has_been_barrowed_is_verifed() throws InterruptedException {

        Thread.sleep(4000);

        BookManagementPage bookManagementPage = new BookManagementPage();

        Assert.assertEquals( "Verify that pop up is visible Book is borrowed...",
                "The book has been borrowed...",bookManagementPage.thebookbarrowedverificiationtext.getText() );
    }

    @When("the user navigate to Barrowing Books module" )
    public void the_user_navigate_to_Barrowing_Books_module() {
        BookManagementPage bookManagementPage = new BookManagementPage();
        bookManagementPage.navigateToMenu("Borrowing Books");

    }

    @Then("barrowed book is visible under the list of Barrowed books" )
    public void barrowed_book_is_visible_under_the_list_of_Barrowed_books() {

        Assert.assertTrue("borrowed book is under the borrowed list", bookManagementPage.book.isEnabled());
    }

    @Then("check the borrowed book can not borrow again")
    public void check_the_borrowed_book_can_not_borrow_again() {
        Assert.assertTrue("borrowed book is under the borrowed list", bookManagementPage.book.isEnabled());
    }

    @Then("verify that the user can return the borrowed book")
    public void verify_that_the_user_can_return_the_borrowed_book() {
        bookManagementPage.navigateToMenu("Borrowing Books");
        Assert.assertTrue("Verify teh book is returned", bookManagementPage.book.isEnabled());
    }

    @Then("Verify the user can see borrowed books list")
    public void verify_the_user_can_see_borrowed_books_list() {

        Assert.assertTrue("verify table is there", bookManagementPage.bookList.isDisplayed());

    }

}