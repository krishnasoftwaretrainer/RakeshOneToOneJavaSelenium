import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.System.exit;

public class WebTable
{
    public  static  void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        /*
        driver.get("https://demoqa.com/webtables");
        List<WebElement> allrows =driver.findElements(By.xpath("//table[@class='-striped -highlight table table-striped table-bordered table-hover']//tbody/tr"));
        System.out.println("Total number of rows in the table is: "+allrows.size());
        for (WebElement row:allrows)
        {

            System.out.println(row.getText());
        }   */

        driver.get("https://testautomationpractice.blogspot.com/");
        // 1. Locate the table itself
        //WebElement table = driver.findElement(By.name("BookTable"));
        WebElement table = driver.findElement(By.xpath("//h2[text()=\"Static Web Table\"]"));
// 2. Scroll the table into view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", table);

        List<WebElement> allrows =driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tbody//td"));
        //JavascriptExecutor js=(JavascriptExecutor) driver;
       // js.executeScript("arguments[0].scrollIntoView(true)",allrows.get(0));
        System.out.println("Total number of rows in the table is: "+allrows.size());
        for (WebElement row:allrows)
        {

            System.out.println(row.getText());
        }
    }

}
