package OOP_WEEK_10.TASK3;

public class Main {
    public static void main(String[] args) {
        String filename = "students.csv";

        Events events = new Events();

        events.generateEventsFile("Events!", 130);

        events.readEventsFile("Events!");
    }
}
