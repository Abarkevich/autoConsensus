package consensus.components.leftMenuSales;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LeftMenuSales extends Component {
    public static final SelenideElement SEND_DEMO_LEFT_MENU_BTN = $(By.xpath("//a[@id='btn-send-a-demo']"));
    public static final SelenideElement TRACK_DEMOS_SEND_BTN = $(By.xpath("//a[@id='btn-track-demos-sent']"));
    public static final SelenideElement SALES_DEMOLYTICS_BTN = $(By.xpath("//a[@id='btn-sales-demolytics']"));
    public static final SelenideElement REP_DEMOLYTICS_BTN = $(By.xpath("//a[@id='btn-rep-demolytics']"));
}
