package se.kth.ict.nextgenpos.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Logs the exception to a file.
 */
public class FileLogger implements Logger {
    private static final String FILE_NAME = "log.txt";
    private PrintWriter logFile;
    private DateFormat dateFormat;

    public FileLogger() {
        try {
            this.logFile = new PrintWriter(new FileWriter(FILE_NAME), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
    }
    
     /**
     * Writes the specified exception to a log file.
     * @param exception The specified exception
     */
    @Override
    public void logException(Exception exception) {
        StringBuilder logSB = new StringBuilder();
        logSB.append(this.dateFormat.format(new Date()));
        logSB.append(", Error Message: ");
        logSB.append(exception.getMessage());
        this.logFile.println(logSB);
        exception.printStackTrace(this.logFile);
    }
    
}
