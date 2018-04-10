package consensus.components.sendDemo;

import com.codeborne.selenide.SelenideElement;
import core.components.Component;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SendDemo extends Component {
    public static final SelenideElement SEND_DEMO_LEFT_MENU_BTN = $(By.xpath("//a[@id='btn-send-a-demo']"));
    public static final SelenideElement ORGANIZATION_FIELD = $(By.xpath("//input[@id='s1_organization']"));
    public static final SelenideElement RECIPIENT_MAIL_FIELD = $(By.xpath("//input[@id='s1_mail']"));
    public static final SelenideElement RECIPIENT_FIRST_NAME_FIELD = $(By.xpath("//input[@id='s1_fname']"));
    public static final SelenideElement RECIPIENT_LAST_NAME_FIELD = $(By.xpath("//input[@id='s1_lname']"));
    public static final SelenideElement RECIPIENT_TITLE_FIELD = $(By.xpath("//input[@id='s1_title']"));
    public static final SelenideElement ADD_NEW_RECIPIENT_BTN = $(By.xpath("//button[@class='btn primary new_recipient']")); //уточнить у Димы: кесли добавить +1 реципиент, то появляется 2-я кнопка ADD и тогда локатор становится не уникальным



}
