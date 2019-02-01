package consensus.components.createAdvancedDemo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import consensus.components.Initializer;
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
    public static final SelenideElement ListDemoADVAnswer1 = $(By.xpath("//div[@id='answerdemo1_chzn']"));
    public static final SelenideElement DropDownAdvAnswer1 = $(By.xpath("//div[@class='chzn-drop']//ul[@class='chzn-results'][1]"));
    public static final SelenideElement SelectDemoFAnswer2 = $(By.xpath("//div[@id='answerdemo2_chzn']"));
    public static final SelenideElement DropDownAdvAnswer2 = $(By.xpath("//div[@id='answerdemo2_chzn']//ul[@class='chzn-results']"));
    public static final SelenideElement PreviewADV_Page = $(By.xpath("//h3[contains(text(), 'Preview')]"));
    public static final SelenideElement AdvSaveExit_BTN = $(By.xpath("//div[@class='pull-left']//a[@class='btn']"));


    public static final SelenideElement ADD_NEW_ANSWER_FOR_ADV_DEMO_BTN = $(By.xpath("//a[@id='add-answer']"));
    public static final SelenideElement DELETE_ANSWER_FROM_ADV_DEMO_BTN = $(By.xpath("//input[@id='idanswer3']"));
    public static final SelenideElement ADV_CONTINUE_BTN = $(By.xpath("//a[@id='continue']"));
    public static final SelenideElement ADV_LOGO_BTN = $(By.xpath("//input[@id='logo_dav']"));
    public static final SelenideElement ADV_FAVICON_BTN = $(By.xpath("//input[@id='favicon_dav']"));
    public static final SelenideElement ADV_WATCH_TEST_DEMO = $(By.xpath("//a[@id='watch-demo']"));


    public void selectDemoFor1AnswerADV(String demoName) {
        Initializer.createAdvancedDemo.ListDemoADVAnswer1.click();
        Initializer.createAdvancedDemo.DropDownAdvAnswer1.shouldBe(Condition.visible);
        Initializer.createAdvancedDemo.DropDownAdvAnswer1.findElement(By.xpath(".//li[contains(.,'" + demoName + "')]")).click();
    }

    public void selectDemoFor2AnswerADV(String demoName) {
        Initializer.createAdvancedDemo.SelectDemoFAnswer2.click();
        Initializer.createAdvancedDemo.DropDownAdvAnswer2.shouldBe(Condition.visible);
        Initializer.createAdvancedDemo.DropDownAdvAnswer2.findElement(By.xpath(".//li[contains(.,'" + demoName + "')]")).click();
    }


}
