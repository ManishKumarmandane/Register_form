package Registor_Login_form;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

import static org.openqa.selenium.By.className;

public class Register_form extends Untils_Function
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("bm0369@gmail.com");
        driver.findElement(className("password")).sendKeys("Manish369");
        Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(1200);
        js.executeScript("window,scrollBy(0,1000)");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
       Thread.sleep(1200);
        // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       //WebElement news = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[1]/strong"));
       //js.executeScript("arguments[0].scrollIntoView();",news);


        // driver.manage().window().getPosition();

        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.findElement(By.name("Gender")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Manish");
        driver.findElement(By.id("LastName")).sendKeys("Mandane");
        WebElement Day=driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month=driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year=driver.findElement(By.name("DateOfBirthYear"));
        SelectDayMonthYear(Day,"20");
        SelectDayMonthYear(Month,"May");
        SelectDayMonthYear(Year,"2017");
        driver.findElement(By.id("Email")).sendKeys("bm0369@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Warehouse");
        //boolean Checkbox;
        driver.findElement(By.name("Newsletter")).sendKeys("Newsletter");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("Manish369");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Manish369");

        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
        Thread.sleep(1000);
       // driver.manage().getCookies().clear();
    }
}
