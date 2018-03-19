package core.testData;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.exception.AutomationFrameworkException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestDataAdapter {

    public static Map<String, Object> convertToMap(String pathToFile) {
        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader(pathToFile));
            ObjectMapper mapper = new ObjectMapper();
            return new ObjectMapper().convertValue(mapper.readTree(file), TreeMap.class);
        } catch (IOException e) {
            throw new AutomationFrameworkException("Cannot find or read file by provided path: " + pathToFile, e);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
