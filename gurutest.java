import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class gurutest {
public static void main(String[] args)throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\kisha\\OneDrive\\Desktop\\selenium\\geckodriver-v0.34.0-win32\\geckodriver.exe");
         FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
    WebDriver driver = new FirefoxDriver(options);
    driver.get("https://www.demo.guru99.com/V4/");
    Thread.sleep(3000);
    driver.findElement(By.name("uid")).sendKeys("mngr552478");
    Thread.sleep(2000);
    driver.findElement(By.name("password")).sendKeys("nAqAnez");
    Thread.sleep(3000);
    driver.findElement((By.name("btnLogin"))).click();
    Thread.sleep(10000);
    driver.close();
}
}
