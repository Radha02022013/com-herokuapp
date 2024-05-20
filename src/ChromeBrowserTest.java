import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {
        //set up Chrome browser
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL
        driver.get(baseUrl);
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of the page
        System.out.println("The title of the page : " + driver.getTitle());
        //Print the current URL
        System.out.println("The current URL : " + driver.getCurrentUrl());
        //Print the page source.
        System.out.println("The source : " + driver.getPageSource());
        //Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        // Click on Login Button.
driver.findElement(By.className("radius")).click();
      //  Print the current url.
        System.out.println("The current URL : " + driver.getCurrentUrl());
        //Refresh the page.
        driver.navigate().refresh();
        //Close the browser
        driver.quit();

    }
}
