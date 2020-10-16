import static utils.WebDriverSupliter.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Authentication {


    /*Se inicia sesión en la aplicación*/
    public static void login(String email, String password) {

        driver.get(AuthenticationElement.URL);
        AuthenticationElement.EMAIL.sendKeys(email);
        AuthenticationElement.PASSWORD.sendKeys(password);
        AuthenticationElement.SUBMIT_LOGIN.click();
    }
}
