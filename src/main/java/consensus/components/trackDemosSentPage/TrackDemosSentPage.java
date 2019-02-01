package consensus.components.trackDemosSentPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import consensus.components.Initializer;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TrackDemosSentPage extends Component {

    public static final SelenideElement SearchSendDemo_Input = $(By.xpath("//div[@id='table_sent_demos_filter']//input[@class='form-control input-sm']"));
    public static final SelenideElement TABLE_SendDemp_INFO = $(By.xpath("//table[@aria-describedby='table_sent_demos_info']"));

    public void findSendFirstTimeDemoByName(String demoName) {
        Initializer.leftMenuSales.TRACK_DEMOS_SEND_BTN.click();
        Initializer.trackDemosSentPage.SearchSendDemo_Input.shouldBe(Condition.visible);
        Initializer.trackDemosSentPage.SearchSendDemo_Input.sendKeys(demoName);
        TABLE_SendDemp_INFO.$(By.xpath(".//tbody/tr")).shouldHave(text(demoName));

    }

   // public void

}
