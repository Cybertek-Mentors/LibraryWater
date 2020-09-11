package stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.BooksPage;
import utilities.Driver;

public class Navigate {


    @When("the user navigates to {string} page")
    public void the_user_navigates_to_page(String string) throws InterruptedException {
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.elementToBeClickable(Driver.get().findElement(By.xpath("(//span[.='Books']"))));

        //Driver.get().findElement(By.xpath("//span[.='Books']")).click();
        Thread.sleep(5000);
        new BooksPage().navigateToMenu("Books");
        Assert.assertEquals("http://library2.cybertekschool.com/#books", Driver.get().getCurrentUrl());
    }

}
