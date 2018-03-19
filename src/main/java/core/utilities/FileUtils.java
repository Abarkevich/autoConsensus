package core.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtils {
    public static void createFolder(String path) {
        try {
            new File(path).mkdirs();
        } catch (SecurityException e) {
            throw new SecurityException("Folder cannot be created: permission denied or provided path is not correct", e.getCause());
        }
    }

    public static void clearFolder(String pathToFolder) {
        try {
            File directory = new File(pathToFolder);
            if (directory.exists() && directory.isDirectory()) {
                org.apache.commons.io.FileUtils.cleanDirectory(directory);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getListOfAllFilesFromDirectory(String directoryPath, ArrayList<File> files) {
        File dir = new File(directoryPath);
        File[] filesArray = dir.listFiles();

        for (File file : filesArray) {
            if (file.isFile()) {
                files.add(file);
            } else if (file.isDirectory()) {
                getListOfAllFilesFromDirectory(file.getAbsolutePath(), files);
            }
        }
    }
}
