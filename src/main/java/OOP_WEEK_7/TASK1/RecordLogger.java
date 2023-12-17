package OOP_WEEK_7.TASK1;

import OOP_WEEK_7.TASK1.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public record RecordLogger(String name) implements Logger {

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    static String time = simpleDateFormat.format(new Date(System.currentTimeMillis()));

    @Override
    public void logMessage(String message) {

        System.out.println(name + " sent the message: " + message + " --- TIME : " + time);
    }
}
