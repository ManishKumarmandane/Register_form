package Registor_Login_form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class UPLoad_Files
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
        driver.findElement(By.name("upfile")).sendKeys("D:\\May-WEEK_sessionDrop\\May2022BatchSeleniumLearning\\src\\main\\java\\SeleniumSession\\manish.txt");

    }
}
