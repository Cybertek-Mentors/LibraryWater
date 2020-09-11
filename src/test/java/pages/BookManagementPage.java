package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class BookManagementPage extends BasePage {

    public BookManagementPage() {PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//span[text()='Books']")
    public WebElement borrowbook;

    @FindBy (css = "[name='tbl_books_length']")
    public WebElement recordsDropDown;

    @FindBy(css  = "[onclick='Books.borrow_book(237)']")
    public WebElement book;

    @FindBy(xpath = "//div[text()='The book has been borrowed...']")
    public WebElement thebookbarrowedverificiationtext;


    @FindBy(css = ".card-header")
    public WebElement bookList;






    //For showing all books on the page select dropdown list
    public void recordSelector(String value){
        Select select = new Select(recordsDropDown);

        select.selectByValue(value);
    }


}
