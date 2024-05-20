import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
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
public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        //using Scanner Declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter broswer name : ");
        String browser = scanner.nextLine();
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }


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

