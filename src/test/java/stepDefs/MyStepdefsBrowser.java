package stepDefs;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.AssertJUnit.assertEquals;

public class MyStepdefsBrowser {

    private WebDriver driver;

    @Given("I am using {string} browser")
    public void iAmUsingBrowser(String browser) throws InterruptedException {

        if(browser.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            driver = new EdgeDriver();
        } else {
            driver = new FirefoxDriver();
        }


    }

    @Given("I have searched for {string}")
    public void iHaveSearchedForA(String text) {
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys(text);
        element.submit();
    }

    @When("I click on {string} page")
    public void iClickOnAComputerPage(String linkText) {
        WebElement link = driver.findElement(By.cssSelector("[href='" + linkText +"']"));

        link.click();
    }

    @Then("I open the page {string}")
    public void iOpenThePage(String expected) throws InterruptedException {
        String actual = driver.getTitle();
        //String expected = "Demo Web Shop. Build your own cheap computer";

        assertEquals(expected, actual);

        Thread.sleep(3000);
        driver.close();
    }

    @And("I have navigated to {string}")
    public void iHaveNavigatedToPage(String page) throws InterruptedException {
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
    }


}
