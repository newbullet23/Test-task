import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\IdeaProjects\\Test123Project\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mail.ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id=\"mailbox:login-input\"]")).sendKeys("testpost233");
        driver.findElement(By.xpath("//input[@class=\"o-control\"]")).submit();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id=\"mailbox:password-input\"]")).sendKeys("Ntcnjdsqgfhjkm123");
        WebElement button = driver.findElement(By.xpath("//input[@class=\"o-control\"]"));
        button.submit();
        driver.findElement(By.xpath("//a[contains(@class, 'compose-button compose-button_white')]")).click();
        driver.findElement(By.xpath("//input[contains(@tabindex,'100')]")).sendKeys("idedov@at-consulting.ru");
        driver.findElement(By.xpath("//input[contains(@name,'Subject')]")).sendKeys("Test task");
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("https://github.com/newbullet23/Test-task.git");
        driver.findElement(By.xpath("//span[contains(@class,'button2_primary')]")).click();
        driver.quit();
    }
}
