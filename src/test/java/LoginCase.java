import PageObject.Constants;
import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginCase extends LoginPage{


    public LoginCase(WebDriver driver) {
        super(driver);
    }

    public void testValidLogin() {
        setInputEmail(Constants.LOGIN);
        setInputPassword(Constants.PASSWORD);
        clickOnBtnLogin();
    }
}
