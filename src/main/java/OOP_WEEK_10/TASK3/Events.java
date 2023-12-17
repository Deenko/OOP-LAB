package OOP_WEEK_10.TASK3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Events {
    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final int NUM_RECORDS = 1000000;


    public  void generateEventsFile(String filename, int numRecords){

        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            Random random = new Random();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


            for (int i = 0; i < numRecords ; i++){
                String time = simpleDateFormat.format(new Date(System.currentTimeMillis() - random.nextInt(100000000)));
                String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
                int userID = random.nextInt(1000);

                writer.write("Date: " + time + " Event type: " + eventType + " User ID:" + userID);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public void readEventsFile(String filename){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            for (int i = 0; i < 5; i++){
                System.out.println(bufferedReader.readLine());
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
