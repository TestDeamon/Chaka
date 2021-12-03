package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    private WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterLoginDetails(String email, String password){
        driver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[1]/label/input")).sendKeys(email);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[2]/label/input")).sendKeys(password);
    }
    public Landingpage clickLogin(){
        driver.findElement(By.xpath("/html/body/div[1]/main/div/form/div[4]/div[1]/button")).click();
        return new Landingpage(driver);
    }
}
//driver.findElement(By.xpath(""));