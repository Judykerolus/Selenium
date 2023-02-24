package homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.manage().window().maximize();
            driver.findElement(By.id("customer.firstName")).sendKeys("David");
            driver.findElement(By.id("customer.lastName")).sendKeys("Adams");
            driver.findElement(By.name("customer.address.street")).sendKeys("123 Adams Street");
            driver.findElement(By.name("customer.address.city")).sendKeys("Henrico");
            driver.findElement(By.name("customer.address.zipCode")).sendKeys("23233");
            driver.findElement(By.name("customer.ssn")).sendKeys("635026323");
            driver.findElement(By.id("customer.username")).sendKeys("David23");
            driver.findElement(By.id("customer.password")).sendKeys("abracadabra");
            driver.findElement(By.name("repeatedPassword")).sendKeys("abracadabra");
            driver.findElement(By.className("button")).click();
            driver.quit();
    }
}
