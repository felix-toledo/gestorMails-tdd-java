package GestorCorreo;
import java.util.ArrayList;

public class MailManager {
    private ArrayList<User> userList = new ArrayList<>();

    public MailManager() {
    }

    public void addUserToList(User newUser) {
        userList.add(newUser);
    }

    //TEST PURPOSE
    public ArrayList<User> getUserList() {
        return userList;
    }

}
