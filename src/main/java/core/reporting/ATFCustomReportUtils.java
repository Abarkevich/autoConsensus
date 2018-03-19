package core.reporting;

import core.Configurator;
import core.constants.ConfigProperties;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ATFCustomReportUtils {
    private final Logger LOG = Logger.getLogger(this.getClass().getName());

    public boolean isLocalRun() {
        return Boolean.valueOf(Configurator.getProperty(ConfigProperties.LOCAL_RUN));
    }

    public String getCmdLogFileName() {
        if (!isLocalRun()) {
            try {
                return "testLogger_" + InetAddress.getLocalHost().getHostName() + ".txt";
            } catch (UnknownHostException e) {
                LOG.log(Level.WARNING, "Exception occurred during obtaining a host machine name", e);
            }
        }
        return "";
    }
}
