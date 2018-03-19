package core.utilities;

public class Sleeper {
    public static void sleepInSeconds(long timeoutInSeconds) {
        sleepInMillis(timeoutInSeconds * 1000);
    }

    public static void sleepInMillis(long timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
