package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public class BookManagementPage extends BasePage {

    public BookManagementPage() {PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm  ']")
    public WebElement borrowbookbutton;

    @FindBy ( xpath  = "//a[@class='btn btn-primary btn-sm  ']/../..")
    public WebElement bookrow;


    @FindBy (css = "[name='tbl_books_length']")
    public WebElement recordsDropDown;

    @FindBy(css  = "//a[@class='btn btn-primary btn-sm  ']")
    public WebElement book;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement thebookbarrowedverificiationtext;

    @FindBy(css = ".card-header")
    public WebElement bookList;


    //broowed book infos
    public String borrowedBookData = bookrow.getText();


    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> allRows;

    @FindBy(tagName = "input")
    public WebElement search;

    @FindBy(css = "[href='tpl/add-book.html']")
    public WebElement addBook;

    @FindBy(name = "name")
    public WebElement bookName;

    @FindBy(name = "isbn")
    public WebElement isbn;

    @FindBy(name = "year")
    public WebElement year;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement author;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(id = "book_group_id")
    public WebElement categoryElement;

    @FindBy(id = "book_categories")
    public WebElement mainCategoryElement;

    public WebElement editBook(String book) {
        String xpath = "//td[3][.='" + book + "']/../td/a";
        return Driver.get().findElement(By.xpath(xpath));
    }

    public Select categoryList() {
        return new Select(categoryElement);
    }

    public Select mainCategoryList() {
        return new Select(mainCategoryElement);
    }



    //For showing all books on the page select dropdown list
    public void recordSelector(String value){
        Select select = new Select(recordsDropDown);


        select.selectByValue(value);
    }


}
