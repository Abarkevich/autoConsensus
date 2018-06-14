package createStandardDemoTest;

import com.codeborne.selenide.Condition;
import com.sun.org.apache.xml.internal.security.Init;
import consensus.components.Initializer;
import consensus.components.errorHandler.ErrorHandler;
import core.BaseTest;
import core.utilities.Sleeper;
import core.utilities.UploadUtils;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;

import static consensus.components.Initializer.createStandardDemo;
import static consensus.components.Initializer.leftMenuMain;
import static consensus.components.Initializer.loginPage;

public class CreateStandardDemoTest extends BaseTest {

    private String demoNameStd = "SS AB STD 06 06 AUTOMATED #1 Helix";
    private String phoneStd = "abc5678901234";
    private String chatLinkStd = "https://www.tut.by/";
    private String pathToVideoStdIntro = "C:\\Users\\user\\Pictures\\videos\\2mb0013.mp4";
    private String pathToDocIntroSTD = "C:\\Users\\user\\Pictures\\documents\\doc.doc";
    private String name1featureSTD = "1 feature";
    private String name2featureSTD = "2 feature";
    private String pathTolong1VideoSTD = "C:\\Users\\user\\Pictures\\videos\\2mb0145.mp4";
    private String pathToShortVideoSTD = "C:\\Users\\user\\Pictures\\videos\\2mb0013.mp4";
    private String pathToDocFor1FeatureSTD = "C:\\Users\\user\\Pictures\\documents\\dot.dot";
    private String pathToDocFor2FeatureSTD = "C:\\Users\\user\\Pictures\\documents\\pdf1.pdf";


    @Test
    public void createStandardDemo() {
        loginPage.login("anna.barkevich@spiralscout.com", "Password_001");
        leftMenuMain.CREATE_DEMO_BTN.waitUntil(Condition.visible, 10000);
        leftMenuMain.CREATE_DEMO_BTN.click();
        createStandardDemo.STANDARD_DEMO_BTN.shouldBe(Condition.visible);
        createStandardDemo.STANDARD_DEMO_BTN.click();
        createStandardDemo.TitleStandardDemoINPUT.waitUntil(Condition.visible, 10000);
        createStandardDemo.TitleStandardDemoINPUT.sendKeys(demoNameStd);
        Initializer.createSingleDemo.clickContinue();
        createStandardDemo.phoneStandardINPUT.shouldBe(Condition.visible);
        createStandardDemo.phoneStandardINPUT.sendKeys(phoneStd);
        createStandardDemo.chatLinkStdINPUT.sendKeys(chatLinkStd);
        Initializer.createSingleDemo.clickContinue();
        createStandardDemo.selectVideoFromPCStdIntroBTN.waitUntil(Condition.visible, 10000);
        createStandardDemo.selectVideoFromPCStdIntroBTN.click();
        Sleeper.sleepInMillis(1);
        UploadUtils.selectAndUpload(pathToVideoStdIntro);
        Initializer.createSingleDemo.DOWNLOAD_VIDEO_BTN.waitUntil(Condition.visible, 80000);
        Initializer.createSingleDemo.SELECT_INTRO_DOC_FILE_BTN.click();
        Sleeper.sleepInMillis(1);
        UploadUtils.selectAndUpload(pathToDocIntroSTD);
        Initializer.createSingleDemo.Edit_BTN.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createSingleDemo.LOGOANDFAVICON_PAGE.waitUntil(Condition.visible, 5000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createStandardDemo.AddFeatureSTDPage.waitUntil(Condition.visible, 5000);
        Initializer.createStandardDemo.AddNewFeatureBTN.click(); //добавление 1й фичи
        Initializer.createStandardDemo.TitleFeature1STD_Input.shouldBe(Condition.visible);
        Initializer.createStandardDemo.TitleFeature1STD_Input.sendKeys(name1featureSTD);
        Initializer.createStandardDemo.Save1featureSTD_BTN.click();
        Sleeper.sleepInSeconds(2);
        Initializer.createStandardDemo.AddNewFeatureBTN.click();// добавление 2й фичи
        Initializer.createStandardDemo.TitleFeature2STD_Input.shouldBe(Condition.visible);
        Initializer.createStandardDemo.TitleFeature2STD_Input.sendKeys(name2featureSTD);
        Initializer.createStandardDemo.Save2featureSTD_BTN.click();
        Sleeper.sleepInSeconds(2);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createStandardDemo.UploadRelatedVideosDocsForFeaturesSTD_Page.waitUntil(Condition.visible, 5000);
        Sleeper.sleepInSeconds(1);
        Initializer.createStandardDemo.selectLongVideoSTDByFeatureName(name1featureSTD);
        UploadUtils.selectAndUpload(pathTolong1VideoSTD);
        Initializer.createStandardDemo.waitDownloadVideoSTDByFeatureName(name1featureSTD);
        Initializer.createStandardDemo.selectShortVideoSTDByFeatureName(name1featureSTD);
        UploadUtils.selectAndUpload(pathToShortVideoSTD);
        Sleeper.sleepInSeconds(2);
        Initializer.createStandardDemo.waitDownloadShortVideoSTDByfeature(name1featureSTD);
        Initializer.createStandardDemo.selectF1DocSTDByFeatureName(name1featureSTD);
        UploadUtils.selectAndUpload(pathToDocFor1FeatureSTD);
        Sleeper.sleepInSeconds(2);
        Initializer.createStandardDemo.selectLongVideoSTDByFeatureName(name2featureSTD);
        UploadUtils.selectAndUpload(pathTolong1VideoSTD);
        Initializer.createStandardDemo.waitDownloadVideoSTDByFeatureName(name2featureSTD);
        Sleeper.sleepInSeconds(3);
        Initializer.createStandardDemo.selectShortVideoFor2FSTDByFeatureName(name2featureSTD);
        UploadUtils.selectAndUpload(pathToShortVideoSTD);
        Sleeper.sleepInSeconds(2);
        Initializer.createStandardDemo.waitDownloadShort2VideoSTDByfeature(name2featureSTD);
        Initializer.createStandardDemo.SelectF2DocSTDByFeatureName(name2featureSTD);
        UploadUtils.selectAndUpload(pathToDocFor2FeatureSTD);
        Initializer.createStandardDemo.waitEditBTNShort2VideoSTDByfeature(name2featureSTD);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createStandardDemo.CTO_STDpage.waitUntil(Condition.visible, 3000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createStandardDemo.OfferSTDpage.waitUntil(Condition.visible, 3000);
        Initializer.createSingleDemo.clickContinue();
        Initializer.createStandardDemo.ObjectionsSTDpage.waitUntil(Condition.visible, 3000);
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
        Initializer.manageDemos.SearchStandardDemoInput.waitUntil(Condition.visible, 10000);
        Initializer.manageDemos.findAndDeleteSTDemo(demoNameStd);


    }

    @AfterTest
    public void after() {
        Initializer.logOutPopup.logOut();
    }
}
