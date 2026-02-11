import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginToNdosiWebSite {

    WebDriver driver;

    @Test
    public void loginWithValidDetails(){

        driver = new EdgeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        driver.findElement(By.id("login-email")).sendKeys("khuli@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("1234567890@");
        driver.findElement(By.id("login-submit")).click();

        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[4]/div[1]/div[1]/h3")).isDisplayed();

    }

}
