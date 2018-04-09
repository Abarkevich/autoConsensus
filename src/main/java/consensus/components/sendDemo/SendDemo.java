package consensus.components.sendDemo;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;

import static com.codeborne.selenide.Selenide.$;

public class SendDemo extends Component {
    public static final SelenideElement SEND_DEMO_BTN = $("//a[@id='btn-send-a-demo']");

}
