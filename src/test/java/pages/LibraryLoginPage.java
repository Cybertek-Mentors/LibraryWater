package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "#inputEmail")
    public WebElement emailInputBox;

    @FindBy(css = "#inputPassword")
    public WebElement passwordInputBox;

    @FindBy(css = "button[type='submit']")
    public WebElement signInButton;

    public void loginLibrary(String email, String password){
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        signInButton.click();
    }
}


