package consensus.components.marketingDemolytics;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MarketingDemolytics extends Component {
    public static final SelenideElement SELECT_MARKETING_DEMO_BTN = $(By.xpath("//a[@class='chzn-single']"));

}
