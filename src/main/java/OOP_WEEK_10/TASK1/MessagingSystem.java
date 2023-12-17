package OOP_WEEK_10.TASK1;

public class MessagingSystem {

    @CanSendMessage
    @RequiresPermission(2)
    public void sendMessage(Admin admin, String message){
        System.out.println("Admin " + admin + " has sent the message : " + message);
    }


    public void sendMessage(User user, String message){
        System.out.println("Restricted!");
    }
}
