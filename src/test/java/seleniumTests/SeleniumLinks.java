package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SeleniumLinks {

    @Test
    public void testBooks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        WebElement element = driver.findElement(By.linkText("Books"));
        element.click();
        String actual = driver.getTitle();
        String expected = "Demo Web Shop. Books";

        assertEquals(expected, actual);
        driver.close();

    }

}
