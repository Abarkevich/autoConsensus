package consensus.components.createAdvancedDemo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import core.utilities.Sleeper;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CreateAdvancedDemo extends Component {
    public static final SelenideElement CreateADV_BTN = $(By.xpath("//a[@id='btn-advanced-demo']"));
    public static final SelenideElement TitleADVPage = $(By.xpath("//h3[contains(text(), 'What is the Title and Language')]"));
    public static final SelenideElement TitleADV_Input = $(By.xpath("//input[@id='name_dav']"));
    public static final SelenideElement LogoAdvBTN = $(By.xpath("//span[@data-original-title='Logo Upload']//span[@class='btn btn-file btn primary big']"));
    public static final SelenideElement FaviconADV_BTN = $(By.xpath("//div[@class='fileupload fileupload-new']//span[@class='btn btn-file btn primary big']//span[@class='fileupload-new'][2]"));

    public static final SelenideElement ADVANCED_INTRO_RECORD_BTN = $(By.xpath("//div[@id='advanced-intro-video']//div[@class='btn-wizard mgr-05em mgb-05em']"));
    public static final SelenideElement ADVANCED_INTRO_BROWSE_RECORDINGS_BTN = $(By.xpath("//div[@id='advanced-intro-video']//div[@class='btn-wizard mgb-05em manage-button']"));
    public static final SelenideElement ADVANCED_INTRO_VIDEO_DOWNLOAD_BTN = $(By.xpath("//div[@class='video-details']//div[@class='cont-st ico-download pull-right']"));
    public static final SelenideElement ADVANCED_INTRO_VIDEO_DELETE_BTN = $(By.xpath("//div[@class='video-details']//div[@class='uploaded-file mgb-05em']//span[@class='delete-video']"));
    public static final SelenideElement QuestionADVFieldINPUT = $(By.xpath("//input[@id='question_dav']"));
    public static final SelenideElement AnswerADV1_Input = $(By.xpath("//input[@id='answertxt1']"));
    public static final SelenideElement AnswerADV2_Input = $(By.xpath("//input[@id='answertxt2']"));

    public static final SelenideElement ANSWER_1_DEMO_DROPDOWN_LIST_BTN = $(By.xpath("//div[@class='answerdemo-dropdown'][1]"));
    public static final SelenideElement SelectDemoFor1AnswerADV_INPUT = $(By.xpath("//div[@class='chzn-search']//input[1]"));
    public static final SelenideElement ListDemoADVAnswer1 = $(By.xpath("//ul[@class='chzn-results'][1]"));

    public static final SelenideElement ANSWER_2_DEMO_DROPDOWN_LIST_BTN = $(By.xpath("//div[@id='answerdemo2_chzn']"));
    public static final SelenideElement ANSWER_3_DEMO_DROPDOWN_LIST_BTN = $(By.xpath("//div[@id='answerdemo3_chzn']"));
    public static final SelenideElement ADD_NEW_ANSWER_FOR_ADV_DEMO_BTN = $(By.xpath("//a[@id='add-answer']"));
    public static final SelenideElement DELETE_ANSWER_FROM_ADV_DEMO_BTN = $(By.xpath("//input[@id='idanswer3']"));
    public static final SelenideElement ADV_CONTINUE_BTN = $(By.xpath("//a[@id='continue']"));
    public static final SelenideElement ADV_LOGO_BTN = $(By.xpath("//input[@id='logo_dav']"));
    public static final SelenideElement ADV_FAVICON_BTN = $(By.xpath("//input[@id='favicon_dav']"));
    public static final SelenideElement ADV_WATCH_TEST_DEMO = $(By.xpath("//a[@id='watch-demo']"));


    public void selectDemoFor1AnswerADV(String demoName) {
        ANSWER_1_DEMO_DROPDOWN_LIST_BTN.click();
        SelectDemoFor1AnswerADV_INPUT.sendKeys(demoName);
        Sleeper.sleepInSeconds(5);
        ListDemoADVAnswer1.$(By.xpath(".//li[contains(.,'"+ demoName +"')]")).click();



    }
}
