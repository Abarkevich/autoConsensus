package core.utilities;

import java.io.File;

public class Strings {
    public static String replaceSeparatorsToSystem(String path) {
        return path.replace('/', File.separatorChar).replace('\\', File.separatorChar);
    }
}
