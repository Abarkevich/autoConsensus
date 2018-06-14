package core.utilities;

import core.exception.AutomationFrameworkException;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UploadUtils {
    private final static Logger LOG = Logger.getLogger(UploadUtils.class.getName());
    private static Robot robot;

    public static void selectAndUpload(String file) {
        try {
            selectFileAndUpload(file);
        } catch (AWTException e) {
            throw new AutomationFrameworkException(e);
        }
    }

    public static void selectAndCancel(String file) {
        try {
            selectFileAndCancel(file);
        } catch (AWTException e) {
            throw new AutomationFrameworkException(e);
        }
    }

    private static void selectFileAndUpload(String filePath) throws AWTException {
        initRobot();
        selectFile(filePath);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Sleeper.sleepInMillis(500);
    }

    private static void selectFileAndCancel(String filePath) throws AWTException {
        initRobot();
        selectFile(filePath);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Sleeper.sleepInMillis(500);
    }

    private static void selectFile(String filePath) throws AWTException{
        LOG.log(Level.INFO, "Uploading: " + filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(filePath), null);
        Sleeper.sleepInMillis(1000);
        initRobot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Sleeper.sleepInMillis(1000);
    }

    private static void initRobot(){
        if(robot == null){
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }
}
