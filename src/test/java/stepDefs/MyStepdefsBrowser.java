package stepDefs;

import io.cucumber.java.PendingException;
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
    public void iAmUsingBrowser(String browser) {

        if(browser.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("Edge")) {
            driver = new EdgeDriver();
        } else {
            driver = new FirefoxDriver();
        }

        driver.get("https://demowebshop.tricentis.com/");

    }

    @Given("I have searched for a {string}")
    public void iHaveSearchedForA(String text) {
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys(text);
        element.submit();
    }

    @When("I click on a computer page")
    public void iClickOnAComputerPage() {
        WebElement link = driver.findElement(By.cssSelector("[href='/build-your-cheap-own-computer']"));

        link.click();
    }

    @Then("I open the page {string}")
    public void iOpenThePage(String expected) {
        String actual = driver.getTitle();
        //String expected = "Demo Web Shop. Build your own cheap computer";

        assertEquals(expected, actual);
        driver.close();
    }
}
