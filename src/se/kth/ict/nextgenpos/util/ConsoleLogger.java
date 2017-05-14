package se.kth.ict.nextgenpos.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Logs the exception to the console.
 */
public class ConsoleLogger implements Logger {
    private DateFormat dateFormat;

    public ConsoleLogger() {
        this.dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
    }
    
     /**
     * Writes the specified exception to the console.
     * @param exception The specified exception
     */
    @Override
    public void logException(Exception exception) {
        StringBuilder logSB = new StringBuilder();
        logSB.append(this.dateFormat.format(new Date()));
        logSB.append(", Error Message: ");
        logSB.append(exception.getMessage());
        System.out.println(logSB);
        exception.printStackTrace();
    }
}
