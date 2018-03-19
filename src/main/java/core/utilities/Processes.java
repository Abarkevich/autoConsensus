package core.utilities;

import org.apache.commons.exec.*;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Processes {
    private static final Logger LOG = Logger.getLogger(Processes.class.getName());

    public static ArrayList<String> getProcessesList() {
        ArrayList<String> processes = new ArrayList<>();
        Runtime runtime = Runtime.getRuntime();
        String cmds[] = {"cmd", "/c", "tasklist"};
        try {
            Process proc = runtime.exec(cmds);
            InputStream inputstream = proc.getInputStream();
            InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
            BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
            String line;
            while ((line = bufferedreader.readLine()) != null) {
                processes.add(line.split(" ")[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return processes;
    }

    public static void killProcess(String processName) {
        try {
            Process p = Runtime.getRuntime().exec("taskkill /F /IM " + processName + " /t");
            p.waitFor();
            System.out.println("Process " + processName + " has been stopped successfully");
        } catch (Exception e) {
            System.out.println("Can't stop " + processName + " process");
        }
    }

    public static void execAndWaitForExit(String cmd, long timeout) {
        CommandLine commandLine = CommandLine.parse(cmd);
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        execAndWaitForExit(defaultExecutor, commandLine, timeout);
    }

    public static void execAndWaitForExit(String[] cmdArray, File dir, long timeout) {
        CommandLine commandLine = new CommandLine(cmdArray[0]);
        for (int i = 1; i < cmdArray.length; i++) {
            commandLine.addArgument(cmdArray[i], false);
        }
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        defaultExecutor.setWorkingDirectory(dir);
        execAndWaitForExit(defaultExecutor, commandLine, timeout);
    }

    private static void execAndWaitForExit(DefaultExecutor defaultExecutor, CommandLine commandLine, long timeout) {
        PumpStreamHandler streamHandler = new PumpStreamHandler(new LogOutputStream() {
            @Override
            protected void processLine(String s, int i) {
                LOG.info(s);
            }
        });
        ExecuteWatchdog executeWatchdog = new ExecuteWatchdog(timeout);
        defaultExecutor.setStreamHandler(streamHandler);
        defaultExecutor.setWatchdog(executeWatchdog);
        LOG.log(Level.INFO, "Executing: {0} with timeout {1} ms", new Object[]{commandLine.toString(), timeout});
        try {
            defaultExecutor.execute(commandLine);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LOG.log(Level.INFO, "Executing of '{0}' finished", commandLine.toString());
    }
}
