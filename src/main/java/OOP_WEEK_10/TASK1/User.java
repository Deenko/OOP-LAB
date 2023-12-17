package OOP_WEEK_10.TASK1;

@UserPermission(value = 1)
public class User {
    private String username;
    public User(String username){
        this.username = username;
    }


    @Override
    public String toString() {
        return this.username;
    }
}
