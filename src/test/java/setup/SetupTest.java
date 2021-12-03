package setup;
import POM.Loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetupTest {
    private WebDriver driver;
    protected Loginpage loginpage;

    @BeforeTest
    public void setup() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://chaka.ng/");
        Thread.sleep(3000);


        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/ul/li[1]/a")).click();
        System.out.println("click login btn");
        loginpage = new Loginpage(driver);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
