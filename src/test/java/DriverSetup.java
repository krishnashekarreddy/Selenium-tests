import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        System.out.println(projectPath);

        WebDriver driver = null;
        if (driver == null) {
            if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver");
            } else {
                System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            }
            driver = new ChromeDriver();
            driver.get("https://www.accedo.tv");
            String pageTitle = driver.getTitle();
            System.out.println(pageTitle);
            Assert.assertEquals(pageTitle,"Accedo - Transforming Experiences with Ground-breaking Video Services");
            driver.close();
        }
    }
}