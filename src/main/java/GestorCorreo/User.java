package GestorCorreo;

import java.util.ArrayList;

public class User extends SuperPerson{

    private ArrayList<Contact> contactList = new ArrayList<>();
    private Box inbox = new Box();
    private Box outbox = new Box();

    public User(String name, String surname, String mailAdress){
        super(name, surname, mailAdress);
    }

    public Contact addNewContact(String name, String surname, String mailAdress){
        Contact newContact = new Contact(name, surname, mailAdress);
        contactList.add(newContact);
        return newContact;
    }

    public ArrayList<Contact> getContactList(){
        return contactList;
    }

}
