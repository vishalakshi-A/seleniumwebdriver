package org.example;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICanWin {
    @Test
    public void iCanWin() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pastebin.com/");
        String title = driver.getTitle();
        System.out.println(title);
        //WebElement paste = driver.findElement(By.cssSelector("[name='q']"));
        WebElement newPaste= driver.findElement(By.id("postform-text"));
        newPaste.sendKeys("Hello from WebDriver");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,350)", "");
        WebElement pasteExpiration=driver.findElement(By.id("select2-postform-expiration-container"));
        //WebElement pasteExpiration=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/form/div[5]/div[1]/div[2]/div/span/span[1]/span/span[2]"));
        pasteExpiration.click();
        //Select pasteExpirationTime= new Select(pasteExpiration);
        //pasteExpirationTime.selectByValue("10 Minutes");
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[3]")).click();
        WebElement pasteExpirationTime= driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[3]"));
        pasteExpirationTime.click();

        //driver.findElement(By.id("postform-name")).sendKeys("helloweb");
        javascriptExecutor.executeScript("window.scrollBy(350,500)", "");
        WebElement pasteName = driver.findElement(By.id("postform-name"));
        pasteName.sendKeys("hello web");

        javascriptExecutor.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.tagName("button")).submit();


        driver.close();
        driver.quit();

    }

}
