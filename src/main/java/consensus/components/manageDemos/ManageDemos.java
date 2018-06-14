package consensus.components.manageDemos;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ManageDemos extends Component {
    public static final SelenideElement MANAGE_DEMOS_PAGE = $(By.xpath("//h3[contains(., 'Manage Demos')]"));
    public static final SelenideElement MANAGE_DEMOS_PREVIEW_BTN = $(By.xpath("//a[contains(text(), 'Preview')]"));
    public static final SelenideElement MANAGE_DEMOS_COPY_BTN = $(By.xpath("//a[contains(text(), 'Copy')]"));
    public static final SelenideElement MANAGE_DEMOS_SEND_BTN = $(By.xpath("//a[contains(text(), 'Send Demo')]"));
    public static final SelenideElement MANAGE_DEMOS_EDIT_BTN = $(By.xpath("//a[contains(text(), 'Edit')]"));
    public static final SelenideElement MANAGE_DEMOS_ARCHIEVE_BTN = $(By.xpath("//a[contains(text(), 'Archive')]"));
    public static final SelenideElement MANAGE_DEMOS_DELETE_BTN = $(By.xpath("//a[contains(text(), 'Delete')]"));
    public static final SelenideElement SEARCH_SINGLE_INPUT = $(By.xpath("//div[@id='table_single_filter']//label[contains(text(), 'Search:')]//input"));
    public static final SelenideElement TABLE_SINGLE_INFO = $(By.xpath("//table[@aria-describedby='table_single_info']"));
    public static final SelenideElement ALERT_DELETE_SINGLE = $(By.id("single-demo-alert-box"));

    public static final SelenideElement SearchStandardDemoInput = $(By.xpath("//div[@class='portlet-body']//div[@id='table_demos_wrapper']//label[contains(text(), 'Search:')]//input"));
    public static final SelenideElement TableStandardInfo = $(By.xpath("//table[@aria-describedby='table_demos_info']"));
    public static final SelenideElement AlertDeleteStandardDemo = $(By.xpath("//div[@id='standard-demo-alert-box']"));

    public void findSingleInfoDemo (String demoName){
        SEARCH_SINGLE_INPUT.shouldBe(Condition.visible);
        SEARCH_SINGLE_INPUT.sendKeys(demoName);
        TABLE_SINGLE_INFO.$(By.xpath(".//tbody/tr")).shouldHave(text(demoName));
    }

    public void findStandardInfoDemo(String demoName){
        SearchStandardDemoInput.shouldBe(Condition.visible);
        SearchStandardDemoInput.sendKeys(demoName);
        TableStandardInfo.$(By.xpath(".//tbody/tr")).shouldHave(text(demoName));
    }

    public void findAndDeleteSingleDemo (String demoName){
        findSingleInfoDemo(demoName);
        TABLE_SINGLE_INFO.$(By.xpath(".//tr[1][contains(.,'"+ demoName +"')]//span[@class='controls-active']//a[contains(text(), 'Delete')]")).click();
        ALERT_DELETE_SINGLE.shouldBe(visible);
        ALERT_DELETE_SINGLE.$(By.xpath(".//div[@class='btn primary mini confirm-delete-demo']")).click();
        TABLE_SINGLE_INFO.$(By.xpath(".//tbody/tr")).shouldHave(text("No matching records found"));
    }

    public  void findAndDeleteSTDemo (String demoName){
        findStandardInfoDemo(demoName);
        TableStandardInfo.$(By.xpath(".//tr[1][contains(.,'"+ demoName +"')]//span[@class='controls-active']//a[contains(text(), 'Delete')]")).click();
        AlertDeleteStandardDemo.shouldBe(visible);
        AlertDeleteStandardDemo.$(By.xpath(".//div[@class='btn primary mini confirm-delete-demo']")).click();
        TableStandardInfo.$(By.xpath(".//tbody/tr")).shouldHave(text("No matching records found"));
    }

}

