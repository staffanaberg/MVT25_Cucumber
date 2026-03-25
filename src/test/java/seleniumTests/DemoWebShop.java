package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DemoWebShop {

    @Test
    public void firefoxBooks() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demowebshop.tricentis.com/");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("computer");
        element.submit();

        WebElement link = driver.findElement(By.cssSelector("[href='/build-your-cheap-own-computer']"));

        link.click();

        String actual = driver.getTitle();
        String expected = "Demo Web Shop. Build your own cheap computer";

        assertEquals(expected, actual);
        driver.close();


    }

}
