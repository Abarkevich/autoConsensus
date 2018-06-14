package consensus.components.qualifiedLeadMarketing;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class QualifiedLeadMarketing extends Component {
    public static final SelenideElement QUALIFIED_MARKETING_SELECT_DEMO_DROPDOWN = $(By.xpath("//div[@id='demolist_chzn']"));
}
