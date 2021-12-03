package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signuppage {
    private WebDriver driver;
    public Signuppage(WebDriver driver){this.driver = driver;}
    public void enterDetails(String email, String pwd){
        driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div[2]/div/div[1]/div/form/div[1]/input")).sendKeys(email);
        driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div[2]/div/div[1]/div/form/div[2]/input")).sendKeys(pwd);
    }
    public Confirmationmail clickSignup(){
        driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/div[2]/div/div[1]/div/form/div[3]/button")).click();
        return new Confirmationmail(driver);
    }
}
