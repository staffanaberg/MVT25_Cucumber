package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;

public class MyStepdefsLinks {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Given("I have navigated to Webshop")
    public void iHaveNavigatedToWebshop() throws InterruptedException {
        driver.get("https://demowebshop.tricentis.com/");
    }

    @When("I click on {string}")
    public void iClickOn(String linkText) throws InterruptedException {
        WebElement element = driver.findElement(By.linkText(linkText));
        element.click();
    }

    @Then("I am on the page {string}")
    public void iAmOnThePage(String expected) throws InterruptedException {
        String actual = driver.getTitle();

        assertEquals(expected, actual);

    }
}
