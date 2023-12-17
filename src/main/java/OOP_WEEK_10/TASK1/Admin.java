package OOP_WEEK_10.TASK1;
@UserPermission(value = 2)
public class Admin {
    private String username;

    public Admin(String username){
        this.username = username;
    }

    @Override
    public String toString() {
        return this.username;
    }
}
