package core.reporting;

import org.testng.Reporter;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestNGReportHandler extends Handler {
    public final static Logger LOG = Logger.getLogger(TestNGReportHandler.class.getName());

    private void configure() {
        setFormatter(new SimpleFormatter());
    }

    public TestNGReportHandler() {
        configure();
    }

    @Override
    public void publish(LogRecord record) {
        if (!isLoggable(record)) {
            return;
        }
        String msg = getFormatter().format(record).trim();
        Reporter.log(msg);
    }

    @Override
    public void flush() { // nothing to flush, no buffer
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        boolean isLoggable = super.isLoggable(record);
        if (isLoggable) {
            String message = record.getMessage();
            if (message.startsWith("Inbound") || message.startsWith("Outbound")) {
                isLoggable = false;
            }
        }
        return isLoggable;
    }

    @Override
    public void close() throws SecurityException { // nothing to close, no resources obtained
    }
}
