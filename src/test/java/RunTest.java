import PageObject.Constants;
import PageObject.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTest {
    private WebDriver webDriver;
    private LoginCase loginCase;
//    LoginPage loginPage;


    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(Constants.URLDEV);
        loginCase = new LoginCase(webDriver);
    }

    @Test
    public void test() {
        loginCase.testValidLogin();
}

    @After
    public void tearDown(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}