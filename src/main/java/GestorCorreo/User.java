package GestorCorreo;

public class User {
    private String name;
    private String surname;
    private String mailAdress;

    public User(String name, String surname, String mailAdress){
        this.name = name;
        this.surname = surname;
        this.mailAdress = mailAdress + "@femail.ctes";
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMailAdress(){
        return mailAdress;
    }
}
