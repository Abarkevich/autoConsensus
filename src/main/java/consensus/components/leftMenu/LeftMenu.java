package consensus.components.leftMenu;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LeftMenu extends Component {
    public static final SelenideElement CREATE_DEMO_BTN = $(By.xpath("//*[@id='btn-demo-tab']"));
    public static final SelenideElement SALES_ACCELERATOR_BTN = $(By.xpath("//*[@id='btn-sales-tab']"));
    public static final SelenideElement MARKETING_ACCELERATOR_BTN = $(By.id("btn-marketing-acceleration-tab"));
    public static final SelenideElement CHANNEL_ACCELERATOR_BTN = $(By.id("btn-channel-tab"));
    public static final SelenideElement ADMIN_BTN = $(By.id("btn-admin-tab"));

}
