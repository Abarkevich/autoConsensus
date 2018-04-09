package consensus.components.createSingleDemo;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateSingleDemo extends Component {
    public static final SelenideElement SINGLE_VIDEO_DEMO_BTN = $(By.xpath("//a[contains(.,'Single Video Demo')]"));
    public static final SelenideElement TITLE_DEMO = $(By.xpath("//input[@name='title_dem']"));
    public static final SelenideElement DEMO_VISIBILITY_ME_BTN = $(By.xpath("//input[@id='personal-option-me']"));
    public static final SelenideElement DEMO_VISIBILITY_EVERYONE_BTN = $(By.xpath("//input[@id='personal-option-everyone']"));
    public static final SelenideElement CONTINUE_BTN = $(By.xpath("//a[contains(.,'Continue ')]"));
    public static final SelenideElement PHONE_BTN = $(By.xpath("//input[@id='phone_dem']"));
    public static final SelenideElement LIVE_CHAT_LINK_BTN = $(By.xpath("//input[@id='livechatlink_dem']"));
    public static final SelenideElement VIDEO_SELECT_FILE_BTN = $(By.xpath("//div[@id='intro-video']//input[@type='file']"));
    public static final SelenideElement VIDEO_RECORD_BTN = $(By.xpath("//a[contains(.,'Record')]"));
    public static final SelenideElement VIDEO_BROWSE_RECORDING_BTN = $(By.xpath("//div[@id='intro-video'] //span[@class='pd-with-icon']"));
    public static final SelenideElement SELECT_INTRO_DOC_FILE_BTN = $(By.xpath("//input[@id='fileintroupload']"));
    public static final SelenideElement LOGO_BTN = $(By.xpath("//input[@id='logoimage_dem']"));
    public static final SelenideElement FAVICON_BTN = $(By.xpath("//input[@id='favicon_dem']"));
    public static final SelenideElement START_FREE_TRIAL_BTN = $(By.xpath("//input[@id='step7_checkbox_start_a_trial']"));
    public static final SelenideElement CONTACT_ME_BTN = $(By.xpath("//input[@id='step7_checkbox_slaesperson']"));
    public static final SelenideElement BUY_NOW_BTN = $(By.xpath("//input[@id='step7_checkbox_purchase']"));
    public static final SelenideElement CUSTOM_BTN = $(By.xpath("//input[@id='step7_checkbox_custombutton']"));
    public static final SelenideElement SIGN_UP_DROPDOWN_LIST_BTN = $(By.xpath("//select[@id='step7_conversionscreenoptions_dem']']")); //selectOptionByValue or selectOption
    public static final SelenideElement SHAREDEMO_BTN = $(By.xpath("//select[@id='share-popup']")); //selectOptionByValue or selectOption
    public static final SelenideElement TransparentFlatDesign_BTN = $(By.xpath("//div[@id='uniform-choosetheme2']"));
    public static final SelenideElement UPLOADBACKGROUNDIMAGE_BTN = $(By.xpath("//input[@id='backgroundtheme_dem']"));
    public static final SelenideElement FLAT_DESIGN_BTN = $(By.xpath("//input[@id='choosetheme1']"));
    public static final SelenideElement WATCH_DEMO_BTN = $(By.xpath("//a[contains(.,'Watch the Demo')]"));
    public static final SelenideElement FINISHED_BTN = $(By.xpath("//a{contains(.,'Finished!')}"));
    public static final SelenideElement SEND_DEMO_BTN = $(By.xpath("//a[contains('Send Demo')]"));
}
