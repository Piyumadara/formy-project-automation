import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Piyuma\\IdeaProjects\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newWindow = driver.findElement(By.id("new-tab-button"));
        newWindow.click();
        Thread.sleep(3000);

        String originalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles())
        {
            driver.switchTo().window(handle1);
        }
        Thread.sleep(3000);

        driver.switchTo().window(originalHandle);
        Thread.sleep(3000);

        driver.quit();
    }
}
