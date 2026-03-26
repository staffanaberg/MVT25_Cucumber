package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Petstore {
    @Test
    public void firefoxBooks() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.petshop.co.uk/");
        click(driver, By.cssSelector(".CybotCookiebotDialogBodyButton"));
        click(driver, By.cssSelector("#home-page > div > div.home-container > div:nth-child(3) > aside > div > div.bx-viewport > ul > li:nth-child(8) > div > h4 > a"));
        click(driver, By.cssSelector(".close > svg > path"));


    }

    private static void sendKeys(WebDriver driver, By by, String text) {
        WebElement search = driver.findElement(by);
        search.sendKeys(text);
    }

    private static void click(WebDriver driver, By by) {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }

}
