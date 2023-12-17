package OOP_WEEK_10.TASK1;

public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin("Denis");
        User user = new User("Tarik");

      MessagingSystem messagingSystem = new MessagingSystem();

      messagingSystem.sendMessage(user, "saljem poruku :) ");

      messagingSystem.sendMessage(admin, "poruka !!!!");
    }
}
