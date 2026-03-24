package basicJavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class sele
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        Actions act=new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }

}
