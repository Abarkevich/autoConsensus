package core.exception;

public class AutomationFrameworkException extends RuntimeException {

    public AutomationFrameworkException() {
        super();
    }

    public AutomationFrameworkException(String message) {
        super(message);
    }

    public AutomationFrameworkException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutomationFrameworkException(Throwable cause) {
        super(cause);
    }
}
