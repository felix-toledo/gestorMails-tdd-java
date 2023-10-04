package GestorCorreo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MailManager {
    private ArrayList<User> userList = new ArrayList<>();

    public MailManager() {
    }

    public void addUserToList(User newUser) {
        userList.add(newUser);
    }

    public void sendMessages(User from, Mail mail){
        List<User> matchingUsers = userList.stream()
                .filter(user -> user.getMailAdress().equals(mail.getPara().get(0)))
                .collect(Collectors.toList());
        Mail cloneMail = new Mail(mail.getAsunto(), mail.getMensaje(), mail.getPara());
        User receptor = matchingUsers.get(0);
        receptor.addMailToInbox(cloneMail);
        from.addMailToOutbox(mail);
    }
    //TEST PURPOSE
    public ArrayList<User> getUserList() {
        return userList;
    }

}
