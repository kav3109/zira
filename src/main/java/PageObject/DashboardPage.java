package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "/html/body/app/div/div[3]/div[1]/a[2]")
    public WebElement btnTasks;

    @FindBy(how = How.ID, using = "createTask")
    public WebElement btnCreateTask;

}
