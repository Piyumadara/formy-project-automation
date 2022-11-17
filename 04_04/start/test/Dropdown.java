import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Piyuma\\IdeaProjects\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");
        Thread.sleep(3000);

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();
        Thread.sleep(3000);

        WebElement firstItem = driver.findElement(By.id("autocomplete"));
        firstItem.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
