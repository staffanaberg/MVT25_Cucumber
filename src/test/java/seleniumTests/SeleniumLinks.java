package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class SeleniumLinks {

    @Test
    public void testBooks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("regnjacka");
        element.submit();

        WebElement link = driver.findElement(By.cssSelector("[href='https://www.naturkompaniet.se/klader/jackor/skaljackor-regnjackor/regnjackor/']"));
        link.click();

        //data-testid='result-extras-url-link'
        String actual = driver.getTitle();
        String expected = "Regnjackor | Köp online | Naturkompaniet";
        System.out.println(actual);
        assertEquals(expected, actual);
        driver.close();

    }

    @Test
    public void edgeBooks() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://duckduckgo.com/");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("regnjacka");
        element.submit();

        WebElement link = driver.findElement(By.cssSelector("[href='https://www.naturkompaniet.se/klader/jackor/skaljackor-regnjackor/regnjackor/']"));
        link.click();

        //data-testid='result-extras-url-link'
        String actual = driver.getTitle();
        String expected = "Regnjackor | Köp online | Naturkompaniet";
        System.out.println(actual);
        assertEquals(expected, actual);
        driver.close();

    }

    @Test
    public void firefoxBooks() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://duckduckgo.com/");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("regnjacka");
        element.submit();

        Thread.sleep(2000);

        WebElement link = driver.findElement(By.cssSelector("[href='https://www.naturkompaniet.se/klader/jackor/skaljackor-regnjackor/regnjackor/']"));
        //[href='https://www.naturkompaniet.se/klader/jackor/skaljackor-regnjackor/regnjackor/']
        //[href='https://www.naturkompaniet.se/klader/jackor/skaljackor-regnjackor/regnjackor/']

        link.click();

        //data-testid='result-extras-url-link'
        String actual = driver.getTitle();
        String expected = "Regnjackor | Köp online | Naturkompaniet";
        System.out.println(actual);
        assertEquals(expected, actual);
        driver.close();

    }


}
