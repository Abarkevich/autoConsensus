package consensus.components.createMarketingDemo;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateMarketingDemo extends Component {
    public static final SelenideElement GetLinkForWebSiteBTN = $(By.xpath("//span[contains(text(), 'Get Link for Website')]"));
    public static final SelenideElement GetDemoLink_PopUP = $(By.xpath("//h3[contains(text(), 'Get Demo Link')]"));
    public static final SelenideElement SELECT_DEMO_MARKETING_FIELD = $(By.id("select_demo_chzn"));
    public static final SelenideElement SELECT_DEMO_MARKETING_DROPDOWN_POPUP = $(By.xpath("//ul[@class='chzn-results']"));
    public static final SelenideElement COPY_MARKETING_DEMO_BTN = $(By.xpath("//div[@id='link_share_demo']"));
    public static final SelenideElement CLOSE_POPUP_MARKETING_BTN = $(By.xpath("//button[@id='dch_close_lb_sent_mail']"));

}
