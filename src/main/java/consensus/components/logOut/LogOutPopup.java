package consensus.components.logOut;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogOutPopup extends Component {
    public static final SelenideElement OPEN_LOGOUT_DROPDOWN_BTN = $(By.xpath("//a[@class='dropdown-toggle real-user']"));
    public static final SelenideElement LOGOUT_BTN = $(By.xpath("//a[contains(text(), ' Log Out')]"));
    public static final SelenideElement LOGOUT_DROPDOWN = $(By.xpath("//ul[@class='dropdown-menu']"));

    public void logOut(){
        OPEN_LOGOUT_DROPDOWN_BTN.shouldBe(Condition.visible);
        OPEN_LOGOUT_DROPDOWN_BTN.click();
        LOGOUT_DROPDOWN.shouldBe(Condition.visible);
        LOGOUT_BTN.click();
    }

}
