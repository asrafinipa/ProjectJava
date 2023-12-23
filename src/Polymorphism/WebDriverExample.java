package Polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverExample {

    public static void main(String[] args) throws InterruptedException {



       WebDriver[] arr = {new ChromeDriver(), new EdgeDriver()};


        for (int i = 0; i < arr.length; i++) {

            WebDriver webDriver = arr[i];
            Thread.sleep(2000);
            webDriver.navigate().to("https://www.instagram.com/" );
            Thread.sleep(2000);
            webDriver.navigate().to("https://www.amazon.com/");
            webDriver.navigate().back();

            webDriver.quit();
        }


    }


}
