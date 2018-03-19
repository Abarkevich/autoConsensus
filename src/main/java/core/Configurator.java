package core;

import com.codeborne.selenide.WebDriverRunner;
import core.constants.ConfigProperties;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Configurator {

    public static final Logger LOG = Logger.getLogger(Configurator.class.getName());
    public static final String DOWNLOADS_FOLDER = System.getProperty("user.dir").concat("/target/downloads");

    public static void configure() {
        loadProperties();
        try {
            LogManager.getLogManager().readConfiguration();
        } catch (IOException e) {
            LOG.log(Level.SEVERE, "Failed to read logging configuration file", e);
        }
    }

    public static void loadProperties() {
        String configFilePath = System.getProperty(ConfigProperties.CONFIG_FILE);
        if (configFilePath == null) {
            configFilePath = "./target/classes/config/config.properties";
        }

        try (FileInputStream in = new FileInputStream(configFilePath)) {
            Properties properties = new Properties();
            properties.load(in);
            for (String key : properties.stringPropertyNames()) {
                if (System.getProperty(key) == null) {
                    System.setProperty(key, properties.getProperty(key));
                }
            }
        } catch (IOException e) {
            LOG.log(Level.SEVERE, "Failed to load a configuration file from path " + configFilePath, e);
        }
    }

    public static boolean isDefined(String propertyName) {
        String value = System.getProperty(propertyName);
        return (value != null) && (value.length() != 0);
    }

    public static String getProperty(String propertyName) {
        return System.getProperty(propertyName);
    }

    public static String getProperty(String propertyName, String defaultValue) {
        return System.getProperty(propertyName, defaultValue);
    }

    public static String setProperty(String propertyName, String newValue) {
        return System.setProperty(propertyName, newValue);
    }

    public static void createProfile() {
        if (Configurator.getProperty("browser").equalsIgnoreCase("ie")) {
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities = DesiredCapabilities.internetExplorer();

            capabilities.setCapability("nativeEvents", false);
            capabilities.setCapability("unexpectedAlertBehaviour", "accept");
            capabilities.setCapability("ignoreProtectedModeSettings", true);
            capabilities.setCapability("disable-popup-blocking", true);
            capabilities.setCapability("enablePersistentHover", true);
            capabilities.setCapability("ignoreZoomSetting", true);
            capabilities.setCapability("validateCookieDocumentType", false);
            capabilities.setCapability("requireWindowFocus", true);
            WebDriverRunner.setWebDriver(new InternetExplorerDriver(capabilities));
        }
    }
}
