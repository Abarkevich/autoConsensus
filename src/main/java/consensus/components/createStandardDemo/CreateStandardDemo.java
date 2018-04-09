package consensus.components.createStandardDemo;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateStandardDemo extends Component {
    public static final SelenideElement STANDARD_DEMO_BTN = $(By.xpath("//a[contains(.,'Standard Demo')]"));
    public static final SelenideElement ADD_NEW_BTN = $(By.xpath("//a[contains(.,'Add new')]"));
    public static final SelenideElement SAVE_ADDED_NEW_FEATURE_BTN = $(By.xpath("//div[@class='tab-pane active']//div[@id='step5_btn_save']")); //  будет находить элемент в фиче, которая открыта
    public static final SelenideElement DELETE_ADDED_FEATURE_BTN = $(By.xpath("//a[@id='deletefea_step5_0']")); //уточнить у Димы
    public static final SelenideElement LONG_VIDEO_SELECT_FILE_BTN = $(By.xpath("//span[@id='longvideo_studio_0']//div[@class='wistia_button btn-wizard bg-blue mgr-1em mgb-05em']"));
    public static final SelenideElement LONG_VIDEO_RECORD_BTN = $(By.xpath("//span[@id='longvideo_studio_0']//div[@class='btn-wizard mgr-05em mgb-05em']"));
    public static final SelenideElement LONG_VIDEO_BROWSE_RECORDING_BTN = $(By.xpath("//span[@id='longvideo_studio_0']//div[@class='btn-wizard mgb-05em manage-button']"));
    public static final SelenideElement LONG_VIDEO_DOWNLOAD_BTN = $(By.xpath("//span[@id='longvideo_studio_0']//a[@title='Download Video']"));
    public static final SelenideElement LONG_VIDEO_DELETE_BTN = $(By.xpath("//span[@id='longvideo_studio_0']//div[@class='uploaded-file mgb-05em']//span[@class='delete-video']"));
    public static final SelenideElement SHORT_VIDEO_SELECT_FILE_BTN = $(By.xpath("//span[@id='shortvideo_studio_0']//div[@class='wistia_button btn-wizard bg-blue mgr-1em mgb-05em']"));
    public static final SelenideElement SHORT_VIDEO_RECORD_BTN = $(By.xpath("//span[@id='shortvideo_studio_0']//div[@class='btn-wizard mgr-05em mgb-05em']"));
    public static final SelenideElement SHORT_VIDEO_BROWSE_RECORDING_BTN = $(By.xpath("//span[@id='shortvideo_studio_0']//div[@class='btn-wizard mgb-05em manage-button']"));
    public static final SelenideElement SHORT_VIDEO_DOWNLOAD_BTN = $(By.xpath("//span[@id='shortvideo_studio_0']//a[@class='download-video']"));
    public static final SelenideElement SHORT_VIDEO_DELETE_BTN = $(By.xpath("//span[@id='shortvideo_studio_0']//div[@class='uploaded-file mgb-05em']//span[@class='delete-video']"));
    public static final SelenideElement ADD_OBJECTIONS_BTN = $(By.xpath("//div[@id='step_9_thisformerror']"));
    public static final SelenideElement SAVE_ADDED_OBJECTION_BTN =$(By.xpath("//div[@id='step9_btn_save']"));
}