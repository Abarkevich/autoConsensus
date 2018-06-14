package consensus.components.loginPage;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends Component{

    public static final SelenideElement USERNAME = $(By.id("email"));
    public static final SelenideElement PASSWORD = $(By.name("password"));
    public static final SelenideElement LOGIN_BTN = $(By.xpath("//button[@type='submit']"));


    public LoginPage(){
        super();
        loadIndicator = USERNAME;
    }


    public void login(String username, String password){
        open("https://helix.goconsensus.com/app/"); // https://www.goconsensus.com/app ПРОД ЛИНК
        waitUntilLoaded();
        USERNAME.sendKeys(username);
        PASSWORD.sendKeys(password);
        LOGIN_BTN.click();
    }
}
