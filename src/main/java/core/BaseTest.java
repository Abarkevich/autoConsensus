package core;

import com.codeborne.selenide.WebDriverRunner;
import core.components.Browser;
import core.components.DisableBrowser;
import core.reporting.ATFCustomHTMLReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

@Listeners({ATFCustomHTMLReporter.class})
public class BaseTest {
    protected final Logger LOG = Logger.getLogger(this.getClass().getName());

    static {
        Configurator.configure();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method method) {
        LOG.log(Level.INFO, "===================================================================================================================");
        LOG.log(Level.INFO, "{0}.{1} has started", new Object[]{method.getDeclaringClass().getName(), method.getName()});
        if (!WebDriverRunner.hasWebDriverStarted() & doEnableBrowser(method)) {
            Configurator.createProfile();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult tr, Method method) {
        LOG.log(Level.INFO, "Clearing downloads folder");

        String testStatus = tr.getStatus() == ITestResult.SUCCESS ? "PASSED" :
                tr.getStatus() == ITestResult.FAILURE ? "FAILED" :
                        tr.getStatus() == ITestResult.SKIP ? "SKIPPED" : String.valueOf(tr.getStatus());

        LOG.log(Level.INFO, "{0}.{1} has finished with status \"{2}\"",
                new Object[]{tr.getTestClass().getName(), tr.getName(), testStatus});
        LOG.log(Level.INFO, "===================================================================================================================");
        String screenshot = null;


        int res = tr.getStatus() == ITestResult.SUCCESS ? 1 : tr.getStatus() == ITestResult.FAILURE ? 0 : tr.getStatus() == ITestResult.SKIP ? 2 : 4;
        //if (Boolean.valueOf(Configurator.getProperty(ConfigProperties.REPORT_TO_DB, "false"))) {
        long time = tr.getEndMillis() - tr.getStartMillis();
        if (tr.getStatus() == ITestResult.FAILURE && doEnableBrowser(method)) {
            screenshot = ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BASE64);
            // tr.setAttribute("failure.screenshot.path", screenshot.substring(screenshot.indexOf("screenshots")));
        }

        //}

        if (WebDriverRunner.hasWebDriverStarted() & shouldCloseBrowser(method)) {
            WebDriverRunner.getWebDriver().close();
            WebDriverRunner.getWebDriver().quit();

        }
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        if (WebDriverRunner.hasWebDriverStarted()) WebDriverRunner.closeWebDriver();
    }

    private boolean shouldCloseBrowser(Method method) {
        Class<?> clazz = method.getDeclaringClass();
        if (method.isAnnotationPresent(Browser.class)) { // TODO probably delete the 'close' property as it seems to be redundant, it's enough to check the existence of the annotation to make a decision to close or not
            return method.getAnnotation(Browser.class).close();
        }
        if (clazz.isAnnotationPresent(Browser.class)) {
            return clazz.getAnnotation(Browser.class).close();
        }
        return true;
    }

    private boolean doEnableBrowser(Method method) {
        Class<?> clazz = method.getDeclaringClass();
        if (method.isAnnotationPresent(DisableBrowser.class)) {
            return false;
        }
        if (clazz.isAnnotationPresent(DisableBrowser.class)) {
            return false;
        }
        return true;
    }
}
