package consensus.components.createAdvancedDemo;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateAdvancedDemo extends Component {
    public static final SelenideElement ADVANCED_INTRO_SELECT_FILE_FROM_PC_BTN = $(By.xpath("//div[@id='advanced-intro-video']//div[@class='wistia_button btn-wizard bg-blue mgr-1em mgb-05em']"));
    public static final SelenideElement ADVANCED_INTRO_RECORD_BTN = $(By.xpath("//div[@id='advanced-intro-video']//div[@class='btn-wizard mgr-05em mgb-05em']"));
    public static final SelenideElement ADVANCED_INTRO_BROWSE_RECORDINGS_BTN = $(By.xpath("//div[@id='advanced-intro-video']//div[@class='btn-wizard mgb-05em manage-button']"));
    public static final SelenideElement ADVANCED_INTRO_VIDEO_DOWNLOAD_BTN = $(By.xpath("//div[@class='video-details']//div[@class='cont-st ico-download pull-right']"));
    public static final SelenideElement ADVANCED_INTRO_VIDEO_DELETE_BTN = $(By.xpath("//div[@class='video-details']//div[@class='uploaded-file mgb-05em']//span[@class='delete-video']"));
    public static final SelenideElement QUESTION_ADV_FIELD = $(By.xpath("//input[@id='question_dav']"));
    public static final SelenideElement ANSWER_1_DEMO_DROPDOWN_LIST_BTN = $(By.xpath("//div[@id='answerdemo1_chzn']"));
    public static final SelenideElement ANSWER_2_DEMO_DROPDOWN_LIST_BTN = $(By.xpath("//div[@id='answerdemo2_chzn']"));
    public static final SelenideElement ANSWER_3_DEMO_DROPDOWN_LIST_BTN = $(By.xpath("//div[@id='answerdemo3_chzn']"));
    public static final SelenideElement ADD_NEW_ANSWER_FOR_ADV_DEMO_BTN = $(By.xpath("//a[@id='add-answer']"));
    public static final SelenideElement DELETE_ANSWER_FROM_ADV_DEMO_BTN = $(By.xpath("//input[@id='idanswer3']"));
}
