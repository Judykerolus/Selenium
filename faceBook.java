package homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("David");
        driver.findElement(By.name("lastname")).sendKeys("Adams");
        driver.findElement(By.name("reg_email__")).sendKeys("adams.david@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("adams.david@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("abracadabra");
        driver.findElement(By.name("birthday_month")).sendKeys("Feb");
        driver.findElement(By.name("birthday_day")).sendKeys("23");
        driver.findElement(By.name("birthday_year")).sendKeys("1998");
        driver.findElement(By.name("sex")).click();
        driver.close();
        driver.quit();

    }
}
