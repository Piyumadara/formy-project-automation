import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Piyuma\\IdeaProjects\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement fName = driver.findElement(By.id("name"));
        //Actions action = new Actions(driver);
        //action.moveToElement(fName);
        fName.sendKeys("Piyuma");
        Thread.sleep(1000);

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2022");
        Thread.sleep(1000);

        driver.quit();
    }
}
