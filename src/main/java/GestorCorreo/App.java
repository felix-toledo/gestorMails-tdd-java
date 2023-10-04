package GestorCorreo;

public class App {
    MailManager mailManager = new MailManager();

    public User createNewUser(String name, String surname, String mailAdress){
        User user = new User(name, surname, mailAdress);
        mailManager.addUserToList(user);
        return user;
    }

    public MailManager getApp() {
        return mailManager;
    }
}
