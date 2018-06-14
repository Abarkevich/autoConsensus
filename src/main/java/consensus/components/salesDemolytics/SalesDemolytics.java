package consensus.components.salesDemolytics;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SalesDemolytics extends Component {
    public static final SelenideElement SALES_SELECT_DEMO_DROPDOWN = $(By.xpath("//div[@id='analyticsListMulti_chzn']"));
    public static final SelenideElement RUN_DEMOLYTICS_BTN = $(By.xpath("//button[contains(text(), 'Run demolytics')]"));
}
