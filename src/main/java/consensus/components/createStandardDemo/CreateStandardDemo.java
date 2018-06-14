package consensus.components.createStandardDemo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import java.nio.channels.SelectionKey;

import static com.codeborne.selenide.Selenide.$;

public class CreateStandardDemo extends Component {
    public static final SelenideElement STANDARD_DEMO_BTN = $(By.xpath("//a[contains(.,'Standard Demo')]"));
    public static final SelenideElement TitleStandardDemoINPUT = $(By.xpath("//input[@id='title_dem']"));
    public static final SelenideElement phoneStandardINPUT = $(By.xpath("//input[@id='phone_dem']"));
    public static final SelenideElement chatLinkStdINPUT = $(By.xpath("//input[@id='livechatlink_dem']"));
    public static final SelenideElement selectVideoFromPCStdIntroBTN = $(By.xpath("//div[@id='intro-video']//div[@class='wistia_button btn-wizard bg-blue mgr-1em mgb-05em']"));
    public static final SelenideElement AddFeatureSTDPage = $(By.xpath("//h3[contains(text(), 'Add Features / Benefits')]"));
    public static final SelenideElement AddNewFeatureBTN = $(By.xpath("//h4[@id='step5_addnewhelp']//a[@class='btn primary']"));
    public static final SelenideElement TitleFeature1STD_Input = $(By.xpath("//textarea[@name='title_fea']"));
    public static final SelenideElement TitleFeature2STD_Input = $(By.xpath("//textarea[@name='title_fea']"));

    public static final SelenideElement Save1featureSTD_BTN = $(By.xpath("//div[@class='portlet-title']//div[@id='step5_btn_save']//i[@class='icon-save']"));
    public static final SelenideElement Save2featureSTD_BTN = $(By.xpath("//div[@class='portlet-title']//div[@id='step5_btn_save']//i[@class='icon-save'][1]"));

    public static final SelenideElement UploadRelatedVideosDocsForFeaturesSTD_Page = $(By.xpath("//h3[contains(text(), 'Upload Related Videos and Documents')]"));
   //public static final SelenideElement DELETE_ADDED_FEATURE_BTN = $(By.xpath("//a[@id='deletefea_step5_0']")); //уточнить у Димы
    public static final SelenideElement LONG_VIDEO_RECORD_BTN = $(By.xpath("//span[@id='longvideo_studio_0']//div[@class='btn-wizard mgr-05em mgb-05em']"));
    public static final SelenideElement LONG_VIDEO_BROWSE_RECORDING_BTN = $(By.xpath("//span[@id='longvideo_studio_0']//div[@class='btn-wizard mgb-05em manage-button']"));
    public static final SelenideElement LONG_VIDEO_DELETE_BTN = $(By.xpath("//span[@id='longvideo_studio_0']//div[@class='uploaded-file mgb-05em']//span[@class='delete-video']"));
    public static final SelenideElement SHORT_VIDEO_RECORD_BTN = $(By.xpath("//span[@id='shortvideo_studio_0']//div[@class='btn-wizard mgr-05em mgb-05em']"));
    public static final SelenideElement SHORT_VIDEO_BROWSE_RECORDING_BTN = $(By.xpath("//span[@id='shortvideo_studio_0']//div[@class='btn-wizard mgb-05em manage-button']"));

    public static final SelenideElement EditDoc1FeatureBTN = $(By.xpath("//li[@id='step6fea_0']//div[@class='documents-uploads-wrapper']//span[contains(text(), 'Edit')]"));
    //public static final SelenideElement EDIT_ATTACHED_DOCUMENTS_BTN = $(By.xpath("//spain[contains(text(), 'Edit')]"));
    //public static final SelenideElement DELETE_ATTACHED_DOCS_BTN = $(By.xpath(""));
    public static final SelenideElement SHORT_VIDEO_DELETE_BTN = $(By.xpath("//span[@id='shortvideo_studio_0']//div[@class='uploaded-file mgb-05em']//span[@class='delete-video']"));
    public static final SelenideElement CTO_STDpage = $(By.xpath("//h3[contains(text(), 'Call to Action Options')]"));
    public static final SelenideElement ADD_OBJECTIONS_BTN = $(By.xpath("//div[@id='step_9_thisformerror']"));
    public static final SelenideElement SAVE_ADDED_OBJECTION_BTN =$(By.xpath("//div[@id='step9_btn_save']"));
    public static final SelenideElement OfferSTDpage = $(By.xpath("//h3[contains(text(), 'Define Your Hook / Offer (Optional)')]"));
    public static final SelenideElement ObjectionsSTDpage = $(By.xpath("//h3[contains(text(), 'List Common Objections (Optional)')]"));


    public void selectLongVideoSTDByFeatureName(String featureName){
        SelenideElement elem = $(By.xpath("//div[@class='feature-block' and contains(.,'"+ featureName +"')]//span[contains(@id, 'longvideo_studio')]//div[@class='wistia_button btn-wizard bg-blue mgr-1em mgb-05em']"));
        elem.click();
    }

    public void waitDownloadVideoSTDByFeatureName(String featureName){
        SelenideElement elem = $(By.xpath("//div[@class='feature-block' and contains(.,'"+ featureName +"')]//span[contains(@id, 'longvideo_studio')]//div[@class='cont-st ico-download pull-right']"));
        elem.waitUntil(Condition.visible, 40000);
    }

    public void selectShortVideoSTDByFeatureName(String featureName) {
        SelenideElement elem = $(By.xpath("//div[@class='feature-block' and contains(.,'"+ featureName +"')]//span[@id='shortvideo_studio_0']//div[@class='wistia_button btn-wizard bg-blue mgr-1em mgb-05em']"));
        elem.click();
    }

    public void waitDownloadShortVideoSTDByfeature(String featureName){
        SelenideElement elem = $(By.xpath("//div[@class='feature-block' and contains(.,'"+ featureName +"')]//span[@id='shortvideo_studio_0']//div[@class='cont-st ico-download pull-right']"));
        elem.waitUntil(Condition.visible, 30000);
    }

    public void selectF1DocSTDByFeatureName (String featureName){
        SelenideElement elem = $(By.xpath("//div[@class='feature-block' and contains(.,'"+ featureName +"')]//li[@id='step6fea_0']//div[@class='documents-uploads-wrapper']//div[@class='upload-new-doc']"));
        elem.click();
    }

    public void selectShortVideoFor2FSTDByFeatureName(String featureName) {
        SelenideElement elem = $(By.xpath("//div[@class='feature-block' and contains(.,'"+ featureName +"')]//span[@id='shortvideo_studio_1']//div[@class='wistia_button btn-wizard bg-blue mgr-1em mgb-05em']"));
        elem.click();
    }

    public void waitDownloadShort2VideoSTDByfeature(String featureName){
        SelenideElement elem = $(By.xpath("//div[@class='feature-block' and contains(.,'"+ featureName +"')]//span[@id='shortvideo_studio_1']//div[@class='cont-st ico-download pull-right']"));
        elem.waitUntil(Condition.visible, 30000);
    }

    public void SelectF2DocSTDByFeatureName (String featureName) {
        SelenideElement elem = $(By.xpath("//div[@class='feature-block' and contains(.,'"+ featureName +"')]//li[@id='step6fea_1']//div[@class='documents-uploads-wrapper']//div[@class='upload-new-doc']"));
        elem.click();
    }

    public void waitEditBTNShort2VideoSTDByfeature(String featureName){
        SelenideElement elem = $(By.xpath("//div[@class='feature-block' and contains(.,'"+ featureName +"')]//li[@id='step6fea_1']//div[@class='documents-uploads-wrapper']//span[@class='cont-st documents-upload-button upload wstd btn btn-file mini addvideo_buttons fileupload-exists float-right']"));
        elem.waitUntil(Condition.visible, 30000);
    }




}