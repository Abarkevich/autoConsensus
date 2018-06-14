package consensus.components.leftMenuMarketing;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;

import static com.codeborne.selenide.Selenide.$;

public class LeftMenuMarketing extends Component {
    public static final SelenideElement GET_MARKETING_LINK_BTN = $("//a[@id='btn-get-link-for-website']");
    public static final SelenideElement QUALIFIED_LEAD_BTN = $("//a[@id='btn-qualified-leads']");
    public static final SelenideElement MARKETING_DEMOLYTICS_BTN = $("//a[@id='btn-marketing-demolytics']");
}
