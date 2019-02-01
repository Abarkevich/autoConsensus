package createAndSendSingleDemoTest;

import com.codeborne.selenide.Condition;
import consensus.components.Initializer;
import core.BaseTest;
import core.utilities.Sleeper;
import core.utilities.UploadUtils;
import org.testng.annotations.Test;

import static consensus.components.Initializer.loginPage;

public class createAndSendSingleDemoTest  extends BaseTest {

    private String demoName = "SS AB SNGL 15 06 AUTOMATED #3";
    private String pathToVideo = "C:\\Users\\user\\Pictures\\videos\\2mb0013.mp4";
    private String pathToDocSNGL = "C:\\Users\\user\\Pictures\\documents\\doc.doc";
    private String orgName = "SpiralScout";
    private String recEmail = "barkevichanna@gmail.com";
    private String firstRecName = "FRecipient1";
    private String lastRecName = "LRecipient1";
    private String titleRec = "Rec_QA1";

    @Test
    public void createAndSendSingleDemoTest (){
        loginPage.login("anna.barkevich@spiralscout.com", "Password_001");
        Initializer.leftMenuMain.CREATE_DEMO_BTN.waitUntil(Condition.visible, 10000);
        Initializer.leftMenuMain.CREATE_DEMO_BTN.click();
        Initializer.createSingleDemo.SINGLE_VIDEO_DEMO_BTN.shouldBe(Condition.visible);
        Initializer.createSingleDemo.SINGLE_VIDEO_DEMO_BTN.click();
        Initializer.createSingleDemo.TITLE_DEMO.waitUntil(Condition.visible, 10000);
        Initializer.createSingleDemo.TITLE_DEMO.sendKeys(demoName);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.PHONE_INPUT.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.VIDEO_SELECT_FILE_BTN.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.VIDEO_SELECT_FILE_BTN.click();
        Sleeper.sleepInMillis(1);
        UploadUtils.selectAndUpload(pathToVideo);
        Initializer.createSingleDemo.DOWNLOAD_VIDEO_BTN.waitUntil(Condition.visible, 40000);
        Initializer.createSingleDemo.SELECT_INTRO_DOC_FILE_BTN.click();
        Sleeper.sleepInMillis(1);
        UploadUtils.selectAndUpload(pathToDocSNGL);
        Initializer.createSingleDemo.Edit_BTN.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.LOGOANDFAVICON_PAGE.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.CTA_PAGE.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.OFFER_PAGE.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.CHOOSE_THEME_PAGE.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.FLAT_DESIGN_BTN.click();
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.PREVIEW_WATCH_TEST_PAGE.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.SendSingleDemo_BTN.click();
        Initializer.sendDemo.SendDemoViaCreatedDemo(orgName, recEmail, firstRecName, lastRecName, titleRec);
        Initializer.trackDemosSentPage.findSendFirstTimeDemoByName(demoName);


    }
}
