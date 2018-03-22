package consensus.components.createSingleDemo;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateSingleDemo extends Component {
    public static final SelenideElement SINGLE_VIDEO_DEMO = $(By.id("btn-single-video-demo"));
    public static final SelenideElement TITLE_DEMO = $(By.id("title_dem"));
    public static final SelenideElement CONTINUE_BTN = $(By.id("btn-continue"));
    public static final SelenideElement VIDEO_SELECT_FILE_BTN = $();

}
