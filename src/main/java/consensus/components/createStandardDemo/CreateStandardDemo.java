package consensus.components.createStandardDemo;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateStandardDemo extends Component {
    public static final SelenideElement STANDARD_DEMO_BTN = $(By.xpath("//a[contains(.,'Standard Demo')]"));
    public static final SelenideElement ADD_NEW_BTN = $(By.xpath("//a[contains(.,'Add new')]"));
    public static final SelenideElement SAVE_ADDED_NEW_FEATURE_BTN = $(By.xpath("//div[@class='tab-pane active']//div[@id='step5_btn_save']")); //  будет находить элемент в фиче, которая открыта
    public static final SelenideElement LONG_VIDEO_SELECT_FILE_BTN = $();//дописать локатор
    public static final SelenideElement LONG_VIDEO_RECORD_BTN = $(By.xpath("//a[contains(.,'Record')]"));



}
