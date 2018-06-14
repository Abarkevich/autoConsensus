package consensus.components.sendDemo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import consensus.components.Initializer;
import core.components.Component;
import core.utilities.Sleeper;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SendDemo extends Component {

    public static final SelenideElement TitleSendDemoPage = $(By.xpath("//h3[contains(text(), 'Send a Demo')]"));
    public static final SelenideElement FieldOrganizationInput = $(By.xpath("//input[@id='s1_organization']"));
    public static final SelenideElement FieldRecipientEmailInput = $(By.xpath("//input[@id='s1_mail']"));
    public static final SelenideElement FieldFirsNameInput = $(By.xpath("//input[@id='s1_fname']"));
    public static final SelenideElement FieldLastNameInput = $(By.xpath("//input[@id='s1_lname']"));
    public static final SelenideElement FieldTitleNameInput = $(By.xpath("//input[@id='s1_title']"));
    public static final SelenideElement ADD_NEW_RECIPIENT_BTN = $(By.xpath("//button[@class='btn primary new_recipient']")); //уточнить у Димы: если добавить +1 реципиент, то появляется 2-я кнопка ADD и тогда локатор становится не уникальным
    public static final SelenideElement DELETE_NEW_RECIPIENT_BTN = $(By.xpath("//button[@id='2_delete']"));
    public static final SelenideElement DropDownListDemoBTN = $(By.xpath("//a[@class='chzn-single']"));
    public static final SelenideElement DemoFromDropDownLInput = $(By.xpath("//div[@class='demo-dropdown']//div[@class='chzn-search']"));
    public static final SelenideElement CreateSalesLinkBTN = $(By.xpath("//input[@id='get_thelink']"));
    public static final SelenideElement GetSalesLinkBTN = $(By.xpath("//a[@id='btn_getlink']"));
    public static final SelenideElement GetSalesLinkPopUP = $(By.xpath("//div[@id ='dch_got_link']"));
    public static final SelenideElement SalesLinkInput = $(By.xpath("//input[@id='link_input']"));
    public static final SelenideElement GetSalesLinkPopUPCloseBTN = $(By.xpath("//button[@id='dch_close_got_link']"));


    public void SendDemoViaCreatedDemo(String organizationName, String recipientEmail, String firstName, String lastName, String titleName) {
        Initializer.sendDemo.TitleSendDemoPage.shouldBe(Condition.visible);
        Initializer.sendDemo.FieldOrganizationInput.sendKeys(organizationName);
        Initializer.sendDemo.FieldRecipientEmailInput.sendKeys(recipientEmail);
        Initializer.sendDemo.FieldFirsNameInput.sendKeys(firstName);
        Initializer.sendDemo.FieldLastNameInput.sendKeys(lastName);
        Initializer.sendDemo.FieldTitleNameInput.sendKeys(titleName);
        Initializer.sendDemo.CreateSalesLinkBTN.parent().click();
        Initializer.sendDemo.GetSalesLinkBTN.click();
        Initializer.sendDemo.GetSalesLinkPopUP.shouldBe(Condition.visible);
        Initializer.sendDemo.SalesLinkInput.getAttribute("value");
        Initializer.sendDemo.GetSalesLinkPopUPCloseBTN.click();
        Sleeper.sleepInSeconds(3);
    }

    public void SendDemo (String organizationName, String recipientEmail, String firstName, String lastName, String titleName, String demoName) {

        Initializer.sendDemo.TitleSendDemoPage.shouldBe(Condition.visible);
        Initializer.sendDemo.FieldOrganizationInput.sendKeys(organizationName);
        Initializer.sendDemo.FieldRecipientEmailInput.sendKeys(recipientEmail);
        Initializer.sendDemo.FieldFirsNameInput.sendKeys(firstName);
        Initializer.sendDemo.FieldLastNameInput.sendKeys(lastName);
        Initializer.sendDemo.FieldTitleNameInput.sendKeys(titleName);
        Initializer.sendDemo.DropDownListDemoBTN.click();
        Initializer.sendDemo.DemoFromDropDownLInput.sendKeys(demoName);
        //SelenideElement elem = $(By.xpath("//div[@class='demo-dropdown' and contains(.,'"+ demoName +"')]"));
        //elem.isSelected();
        Initializer.sendDemo.CreateSalesLinkBTN.parent().click();
        Initializer.sendDemo.GetSalesLinkBTN.click();
        Initializer.sendDemo.GetSalesLinkPopUP.shouldBe(Condition.visible);
        Initializer.sendDemo.SalesLinkInput.getAttribute("value");
        Initializer.sendDemo.GetSalesLinkPopUPCloseBTN.click();
        Sleeper.sleepInSeconds(3);
    }

}
