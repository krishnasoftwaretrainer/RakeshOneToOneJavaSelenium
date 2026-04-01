package polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MOR_TestClass
{
    public static void main(String[] args)
    {
        MOR_RBI_Parent p = new MOR_RBI_Parent();
        p.loan();

        MOR_SBI_Child1 c1 = new MOR_SBI_Child1();
        c1.loan();

        MOR_HDFC_Child2 c2 = new MOR_HDFC_Child2();
        c2.loan();

        // Dynamic Polymorphism
        MOR_RBI_Parent p1 = new MOR_SBI_Child1();
        p1.loan();

        MOR_RBI_Parent p2 = new MOR_HDFC_Child2();
        p2.loan();

        /*
        WebDriver driver = new ChromeDriver();

        WebDriver driver1= new EdgeDriver();

        WebDriver driver2 = new FirefoxDriver();
        */

    }
}
