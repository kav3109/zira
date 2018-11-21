package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.ID, using = "input-email")
    public WebElement inputEmail;

    @FindBy(how = How.ID, using = "input-password")
    public WebElement inputPassword;

    @FindBy(how = How.CLASS_NAME, using = "arrow-to-right")
    public WebElement btnLogin;

    public void setInputEmail() {
        inputEmail.sendKeys(Constants.LOGIN);
    }

    public void setInputPassword() {
        inputPassword.sendKeys(Constants.PASSWORD);
    }

    public void clickOnBtnLogin() {
        btnLogin.click();
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }
}
