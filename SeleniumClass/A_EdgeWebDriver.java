package SeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class A_EdgeWebDriver {

    public static void main(String[] args) {

       System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");

        WebDriver driver1=new EdgeDriver();

        driver1.get("https://demo.nopcommerce.com/");
    }
}
