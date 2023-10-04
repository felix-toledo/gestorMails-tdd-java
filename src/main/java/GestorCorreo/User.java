package GestorCorreo;

import GestorCorreo.Interfaces.IAdressable;
import GestorCorreo.Interfaces.INameable;
import GestorCorreo.Interfaces.ISurnameable;

import java.util.ArrayList;

public class User implements INameable, ISurnameable, IAdressable {

    private ArrayList<Contact> contactList = new ArrayList<>();
    private Box inbox = new Box();
    private Box outbox = new Box();

    private Person persona = new Person("", "", "");

    public User(String name, String surname, String mailAdress){
        persona.setName(name);
        persona.setSurname(surname);
        persona.setMailAdress(mailAdress);
    }

    public Contact addNewContact(String name, String surname, String mailAdress){
        Contact newContact = new Contact(name, surname, mailAdress);
        contactList.add(newContact);
        return newContact;
    }

    public ArrayList<Contact> getContactList(){
        return contactList;
    }

    public Void setMailAdress(String mailAdress) {
        persona.setMailAdress(mailAdress);
        return null;
    }

    public String getMailAdress() {
        return persona.getMailAdress();
    }

    public Void setName(String name) {
        persona.setName(name);
        return null;
    }

    public String getName() {
        return persona.getName();
    }

    public Void setSurname(String surname) {
        persona.setSurname(surname);
        return null;
    }

    public String getSurname() {
        return persona.getSurname();
    }

    public void createMessage(MailManager aplicacion, String asunto, String mensaje, ArrayList<String> para) {
        Mail mail = new Mail(asunto, mensaje, para);
        aplicacion.sendMessages(this, mail);
    }

    public void addMailToInbox(Mail mail){
        Mail newMail = new Mail(mail.getAsunto(), mail.getMensaje(), mail.getPara());
        inbox.add(newMail);
    }

    public void addMailToOutbox(Mail mail){
        outbox.add(mail);
    }

    public Box getOutbox() {
        return outbox;
    }
    public Box getInbox() {
        return inbox;
    }
}
