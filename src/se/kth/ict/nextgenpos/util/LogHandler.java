package se.kth.ict.nextgenpos.util;

import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Writes information about exceptions to a log file
 */
public class LogHandler {
    private static final String FILE_NAME = "log.txt";
    private PrintWriter logFile;
    private DateFormat dateFormat;

    public LogHandler() throws IOException{
        this.logFile = new PrintWriter(new FileWriter(FILE_NAME), true);
        this.dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
    }
    
    /**
     * Writes the specified exception to a log file.
     * @param exception The specified exception
     */
    public void logException(Exception exception) {
        StringBuilder logSB = new StringBuilder();
        logSB.append(this.dateFormat.format(new Date()));
        logSB.append(", Error Message: ");
        logSB.append(exception.getMessage());
        this.logFile.println(logSB);
        exception.printStackTrace(this.logFile);
    }
}
