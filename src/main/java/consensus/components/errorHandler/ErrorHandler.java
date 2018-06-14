package consensus.components.errorHandler;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import core.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class ErrorHandler extends Component {

    public static final SelenideElement ErrorStdUploadVideoFor1tFeature_page = $(By.xpath("//div[@class='upload-error']//div[@class='dp-inline-block upload-error-wrapper'][1]")); //проверка на появление ошибки
    public static final SelenideElement ErrorStdUploadVideoFor1tFeatureTryAgain_BTN = $(By.xpath("//div[@class='upload-error']//div[@class='btn try-again pull-right'][1]")); //кнопка ичезновения ошибки

    // public boolean errorHandlerCreateSTDUploadVideoFor1feature() {
    //   if (ErrorStdUploadVideoFor1tFeatureTryAgain_BTN.isDisplayed()) {
    // WebDriverRunner.getWebDriver().navigate().refresh();
    //     ErrorStdUploadVideoFor1tFeatureTryAgain_BTN.sendKeys(Keys.F5);
    //   return true;
    //}
    //WebDriverRunner.getWebDriver().navigate().refresh();
    // return false;
//    }

}
