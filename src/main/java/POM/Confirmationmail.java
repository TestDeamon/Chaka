package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmationmail {
    private WebDriver driver;

    public Confirmationmail(WebDriver driver) {
        this.driver = driver;
    }
    public Loginpage continueToPage(){
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/a")).click();
        return new Loginpage(driver);
    }
}
