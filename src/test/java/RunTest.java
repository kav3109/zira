import PageObject.Constants;
import PageObject.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTest {
    WebDriver webDriver;
    LoginPage loginPage;

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(Constants.URL);
        loginPage = new LoginPage(webDriver);
    }

    @Test
    public void test() {
        loginPage.setInputEmail();
        loginPage.setInputPassword();
        loginPage.clickOnBtnLogin();
    }

    @After
    public void tearDown(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}