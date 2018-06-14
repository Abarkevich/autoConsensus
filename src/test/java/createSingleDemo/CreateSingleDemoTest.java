package createSingleDemo;

import com.codeborne.selenide.Condition;
import consensus.components.Initializer;
import core.BaseTest;
import core.utilities.Sleeper;
import core.utilities.UploadUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CreateSingleDemoTest extends BaseTest {

    private String demoName = "SS AB SNGL 02 06 AUTOMATED #1 Helix";
    private String pathToVideo = "C:\\Users\\user\\Pictures\\videos\\2mb0013.mp4";
    private String pathToDocSNGL = "C:\\Users\\user\\Pictures\\documents\\doc.doc";

     @Test
    public void createSingleDemoTest() {
        Initializer.loginPage.login("anna.barkevich@spiralscout.com", "Password_001");
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
        Initializer.createSingleDemo.ALL_FINISHED_PAGE.waitUntil(Condition.visible, 5000);
        Sleeper.sleepInSeconds(1);
        Initializer.createSingleDemo.FINISHED_BTN.click();
        Initializer.manageDemos.MANAGE_DEMOS_PAGE.waitUntil(Condition.visible, 10000);
        Initializer.manageDemos.SEARCH_SINGLE_INPUT.waitUntil(Condition.visible, 10000);
        Initializer.manageDemos.findAndDeleteSingleDemo(demoName);

    }

    @AfterTest
    public void after() {
        Initializer.logOutPopup.logOut();
    }
}
