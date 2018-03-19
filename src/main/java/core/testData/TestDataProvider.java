package core.testData;


import core.Configurator;
import core.constants.ConfigProperties;
import core.exception.AutomationFrameworkException;
import core.utilities.Strings;

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TestDataProvider {

    public static Map<String, Object> getTestData(String filePath) {
        return TestDataAdapter.convertToMap(filePath);
    }

    public static Map<String, Object> getTestDataForCurrentDomain(String filePathRelativeToDomainTestDataRoot) {
        String testDataFolderPath = getTestDataFolderPathForCurrentDomain();
        filePathRelativeToDomainTestDataRoot = Strings.replaceSeparatorsToSystem(filePathRelativeToDomainTestDataRoot);
        filePathRelativeToDomainTestDataRoot = filePathRelativeToDomainTestDataRoot.startsWith(File.separator) ?
                filePathRelativeToDomainTestDataRoot :
                File.separator + filePathRelativeToDomainTestDataRoot;
        return getTestData(testDataFolderPath + filePathRelativeToDomainTestDataRoot);
    }

    public static Map<String, Object> getTestDataForClass() {
        return getTestData(getFilePathBasedOnStackTrace());
    }

    private static String getFilePathBasedOnStackTrace() {
        String testDataFolderPath = getTestDataFolderPathForCurrentDomain();
        StackTraceElement callingClassElement = Thread.currentThread().getStackTrace()[3];
        String[] pathElementsToFileInsideTestDataFolder = callingClassElement.getClassName().split("\\.");
        String pathToFileInsideTestDataFolderForCurrentDomain = Arrays.stream(pathElementsToFileInsideTestDataFolder).collect(Collectors.joining(File.separator));
        return testDataFolderPath + File.separator + pathToFileInsideTestDataFolderForCurrentDomain + ".json";
    }

    private static String getTestDataFolderPathForCurrentDomain() {
        String testDataFolderPath = Strings.replaceSeparatorsToSystem(Configurator.getProperty(ConfigProperties.TEST_DATA_FOLDER));
        if (testDataFolderPath == null)
            throw new AutomationFrameworkException("Test data path is not defined. Please set it via 'test.data' system property");
        return testDataFolderPath;
    }
}
