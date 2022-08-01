package org.example;
//import static org.junit.Assert.assertTrue;
//import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
//import java.time.Duration;
/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //Object WebDriverManager = new Object();
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        //WebElement searchBox = driver.findElement(By.name("q"));
        //WebElement searchButton = driver.findElement(By.name("btnK"));
        WebElement searchBox= driver.findElement(By.cssSelector("[name='q']"));
        WebElement searchButton = driver.findElement(By.cssSelector("[name='btnK']"));
        searchBox.sendKeys("Selenium");
        searchButton.click();
    }
}



