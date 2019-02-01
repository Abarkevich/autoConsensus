package createMarketingDemoTest;

import com.codeborne.selenide.Condition;
import core.BaseTest;
import core.utilities.Sleeper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static consensus.components.Initializer.createMarketingDemo;
import static consensus.components.Initializer.leftMenuMain;
import static consensus.components.Initializer.loginPage;

public class CreateMarketingDemoTest extends BaseTest {

private String demoNameMarketing = "AB single 10 05 new";


    @Test
    public void createMarketingDemo(){
        loginPage.login("anna.barkevich@spiralscout.com", "Password_001");
        leftMenuMain.CREATE_DEMO_BTN.waitUntil(Condition.visible, 10000);
        leftMenuMain.MARKETING_ACCELERATOR_BTN.click();
        createMarketingDemo.GetLinkForWebSiteBTN.click();
        createMarketingDemo.GetDemoLink_PopUP.shouldBe(Condition.visible);
        createMarketingDemo.SELECT_DEMO_MARKETING_FIELD.click();
        createMarketingDemo.SELECT_DEMO_MARKETING_DROPDOWN_POPUP.shouldBe(Condition.visible);
        createMarketingDemo.SELECT_DEMO_MARKETING_DROPDOWN_POPUP.findElement(By.xpath(".//li[contains(.,'"+ demoNameMarketing +"')]")).click();
        //дописать тест, шаг копирования маркетинг линки
    }
}
