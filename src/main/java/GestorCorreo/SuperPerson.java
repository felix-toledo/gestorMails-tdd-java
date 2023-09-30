package GestorCorreo;

import GestorCorreo.Interfaces.IAdressable;
import GestorCorreo.Interfaces.INameable;
import GestorCorreo.Interfaces.ISurnameable;

public class SuperPerson implements IAdressable,
                                    ISurnameable,
                                    INameable {
    private String name;
    private String surname;
    private String mailAdress;

    public SuperPerson(String name, String surname, String mailAdress){
        this.name = name;
        this.surname = surname;
        if(mailAdress.contains("@")){
            this.mailAdress = mailAdress;
        } else {
            this.mailAdress = mailAdress + "@femail.ctes";
        }
    }

    public SuperPerson() {
    }

    public Void setName(String name) {
        this.name = name;
        return null;
    }

    public Void setSurname(String surname) {
        this.surname = surname;
        return null;
    }

    public Void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
        return null;
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