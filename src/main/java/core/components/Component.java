package core.components;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.codeborne.selenide.Condition.text;
import static org.testng.Assert.assertTrue;

public abstract class Component implements Fillable {
    protected final Logger LOG = Logger.getLogger(this.getClass().getName());

    protected SelenideElement loadIndicator;
    protected List<WebElement> loadIndicatorList = new ArrayList<>();


    protected static List<Field> getAllFields(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));
        if (type.getSuperclass() != null) {
            getAllFields(fields, type.getSuperclass());
        }
        return fields;
    }

    @Override
    public Fillable fill(Map<String, String> testData) {
        List<Field> fields = getAllFields(new LinkedList<Field>(), this.getClass());
        for (Field field : fields) {
            if (field.isAnnotationPresent(Fill.class)) {
                String fieldName = field.getName();
                if (testData.containsKey(fieldName)) {
                    try {
                        SelenideElement element = (SelenideElement) field.get(this);
                        if(fieldName.contains("INPUT")){
                            element.setValue(testData.get(fieldName));
                        }else if(fieldName.contains("BTN")){
                            element.click();
                        }else if(fieldName.contains("TEXT")){
                            element.shouldHave(text(testData.get(fieldName)));
                        }else if(fieldName.contains("CHECK")){
                            if (element.isSelected() != Boolean.valueOf(testData.get(fieldName)))
                                element.setSelected(Boolean.valueOf(testData.get(fieldName)));
                        }
                        else if(fieldName.contains("SELECT")){
                            element.selectOptionContainingText(testData.get(fieldName));
                        }else{
                            element.val(testData.get(fieldName));
                        }
                    } catch (IllegalAccessException | ClassCastException e) {
                        LOG.log(Level.WARNING, "Exception occurred when accessing the field {0} because of: {1}", new Object[]{fieldName, e.getStackTrace()});
                    }
                }
            }
        }
        return this;
    }

    public void waitUntilLoaded() {
         waitUntilLoaded(120000);
    }

    public void waitUntilLoaded(int waitInMillis) {
        if (loadIndicator != null) {
            loadIndicatorList.add(loadIndicator);
        }
        if (!loadIndicatorList.isEmpty()) {
            WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), waitInMillis / 1000, 1000);
            assertTrue(wait.until(ExpectedConditions.visibilityOfAllElements(loadIndicatorList)).size() >= loadIndicatorList.size(),
                    this.getClass().getSimpleName() + " page was not loaded within 120 seconds");
        } else {
            LOG.log(Level.WARNING, "Load indicator list is empty for component " + this.getClass().getSimpleName() + ". There's nothing to wait until loaded");
        }
    }
}