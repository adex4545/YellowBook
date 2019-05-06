

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class Fish {

    public  static void main(String[] args){

         System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Drivers\\geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.get("http://automationpractice.com");

          driver.findElement(By.id("email")).sendKeys("radiobutton456@gmail.com");
          driver.findElement(By.id("passwd")).sendKeys("Ball3333");
          driver.findElement(By.id("SubmitLogin")).click();

         // driver.findElement(By.xpath("//*[@id='search_query_top']")).click();

     }

}

