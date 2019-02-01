package createSingleDemo;

import com.codeborne.selenide.Condition;
import consensus.components.Initializer;
import core.BaseTest;
import core.utilities.Sleeper;
import core.utilities.UploadUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CreateSingleDemoTest extends BaseTest {

    private String demoName = "SS AB SNGL 11 09 AUTOMATED #1 NEW";
    private String pathToVideo = "E:\\Test Data For Automation (DONT DELETE)\\TestVideos\\mp4\\SampleVideo_360x240_5mb.mp4";
    private String pathToDocSNGL = "E:\\Test Data For Automation (DONT DELETE)\\TestDocuments\\csv\\SampleCSVFile_11kb.csv";

    @Test (groups = {"test"}, priority = 0)
    public void createSingleDemoTest() {
        Initializer.loginPage.login("anna.barkevich@spiralscout.com", "Password_001");
        Initializer.leftMenuMain.CREATE_DEMO_BTN.click();
        Initializer.createSingleDemo.SINGLE_VIDEO_DEMO_BTN.click();
        Initializer.createSingleDemo.TITLE_DEMO.sendKeys(demoName);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.PHONE_INPUT.shouldBe(Condition.visible);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.VIDEO_SELECT_FILE_BTN.click();
        Sleeper.sleepInMillis(1);
        UploadUtils.selectAndUpload(pathToVideo);
        Initializer.createSingleDemo.DOWNLOAD_VIDEO_BTN.waitUntil(Condition.visible, 40000);
        Initializer.createSingleDemo.SELECT_INTRO_DOC_FILE_BTN.click();
        Sleeper.sleepInMillis(1);
        UploadUtils.selectAndUpload(pathToDocSNGL);
        Initializer.createSingleDemo.Edit_BTN.shouldBe(Condition.visible);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.LOGOANDFAVICON_PAGE.shouldBe(Condition.visible);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.CTA_PAGE.shouldBe(Condition.visible);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.OFFER_PAGE.shouldBe(Condition.visible);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.CHOOSE_THEME_PAGE.shouldBe(Condition.visible);
        Initializer.createSingleDemo.FLAT_DESIGN_BTN.click();
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.PREVIEW_WATCH_TEST_PAGE.shouldBe(Condition.visible);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.ALL_FINISHED_PAGE.shouldBe(Condition.visible);
        Sleeper.sleepInSeconds(1);
        Initializer.createSingleDemo.FINISHED_BTN.click();
        Initializer.manageDemos.MANAGE_DEMOS_PAGE.waitUntil(Condition.visible,40000);
       // Initializer.manageDemos.MANAGE_DEMOS_PAGE.click();
        //Initializer.manageDemos.SEARCH_SINGLE_INPUT.shouldBe(Condition.visible);
        //Initializer.manageDemos.findAndDeleteSingleDemo(demoName);
        Initializer.logOutPopup.logOut();
    }
}
