package signup;

import POM.Confirmationmail;
import POM.Landingpage;
import POM.Loginpage;
import POM.Signuppage;
import org.testng.annotations.Test;
import setup.SetupTest;

public class LoginTest extends SetupTest {
    Signuppage signuppage;
    Confirmationmail confirmationmail;
    Landingpage landingpage;

    String email = "davoriga@mailinator.com";
    String pwd = "Password123";
    @Test
    public void testSignup() throws InterruptedException{
        loginpage.enterLoginDetails("davorigaga@mailinator.com", "PASSWORD1");
        Thread.sleep(2000);
        landingpage = loginpage.clickLogin();
//        signuppage.enterDetails(email, pwd);
//        Confirmationmail confirmationmail = signuppage.clickSignup();
//        Loginpage loginpage = confirmationmail.continueToPage();


    }

}
