package GestorCorreo;

public class App {
    MailManager app = new MailManager();

    public User createNewUser(String name, String surname, String mailAdress){
        User user = new User(name, surname, mailAdress);
        app.addUserToList(user);
        return user;
    }

    public MailManager getApp() {
        return app;
    }
}
