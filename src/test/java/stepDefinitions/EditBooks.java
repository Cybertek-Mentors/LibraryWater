package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.BooksPage;
import utilities.Driver;

public class EditBooks {



    @When("the user selects the first book in the list")
    public void the_user_selects_the_first_book_in_the_list() throws InterruptedException {
        Thread.sleep(2000);
     //Driver.get().findElement(By.xpath("(//tbody//tr//td//a)[1]")).clear();
     Driver.get().findElement(By.xpath("(//tbody//tr//td//a)[1]")).click();
    }

    @When("the user fills in the fields as Book Name: {string},  ISBN:{string}, Year: {string}")
    public void the_user_fills_in_the_fields_as_Book_Name_ISBN_Year(String name, String isnb, String year) {
        BooksPage books = new BooksPage();

        books.bookName.clear();
        books.bookName.sendKeys(name);
        books.Year.clear();
        books.Year.sendKeys(year);
        books.ISBN.clear();
        books.ISBN.sendKeys(isnb.toString());
    }



//    @When("the user fills in the fields as Book Name: {string},  ISBN:{string}, Year\"{int}\", Author:\"Anyone\", Book Catagory:\"Essay\"")
//    public void the_user_fills_in_the_fields_as_Book_Name_ISBN_Year_Author_Anyone_Book_Catagory_Essay(String name, String author, Integer isnb) {
//       BooksPage books = new BooksPage();
//
//       books.bookName.clear();
//       books.bookName.sendKeys(name);
//        books.Author.clear();
//       books.Author.sendKeys(author);
//       books.ISBN.clear();
//       books.ISBN.sendKeys(isnb.toString());
//    }
    @When("the user clicks on Save Changes button")
    public void the_user_clicks_on_Save_Changes_button() throws InterruptedException {
        Thread.sleep(2000);
        new BooksPage().clickSaveChangesBtn();

    }


//    @Then("the field should be updated to Book Name: {string},  ISBN:{string}, Year\"{int}\", Author:\"Anyone\", Book Catagory:\"Essay\"")
//    public void the_field_should_be_updated_to_Book_Name_ISBN_Year_Author_Anyone_Book_Catagory_Essay(String name, String author, Integer isnb) {
//        BooksPage booksPage = new BooksPage();
//        Assert.assertEquals(booksPage.actualName.getText(), name);
//        Assert.assertEquals(booksPage.actualAuthor.getText(), author);
//        Assert.assertEquals(booksPage.actualIsnb.getText(),isnb);
//
//    }

    @Then("the field should be updated to Book Name: {string},  ISBN:{string}, Year: {string}")
    public void the_field_should_be_updated_to_Book_Name_ISBN_Year(String name, String isnb, String year) {
        BooksPage booksPage = new BooksPage();
        Assert.assertEquals(booksPage.actualName.getText(), name);
        Assert.assertEquals(booksPage.actualyear.getText(), year);
        Assert.assertEquals(booksPage.actualIsnb.getText(),isnb);
    }


}
