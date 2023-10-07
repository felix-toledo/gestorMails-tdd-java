package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void create_new_user_with_name_surname_mailAdress(){
        User felixtoledo = new User("Felix", "Toledo", "felixtoledoctes");

        String nameOfFelix = felixtoledo.getName();
        String surnameOfFelix = felixtoledo.getSurname();
        String mailOfFelix = felixtoledo.getMailAdress();

        assertEquals("Felix", nameOfFelix);
        assertEquals("Toledo", surnameOfFelix);
        assertEquals("felixtoledoctes@femail.ctes", mailOfFelix);
    }

    @Test
    public void create_new_user_and_check_entry_to_userlist(){
        MailManager femailcom = new MailManager();
        User felixtoledo = femailcom.createNewUser("Felix", "Toledo", "felixtoledoctes");
        
        int usersQuantInList = femailcom.getUserList().size();
        User usuarioFelix = femailcom.getUserList().get(0);
        
        assertEquals(1, usersQuantInList);
        assertEquals(felixtoledo, usuarioFelix);
    }

    @Test
    public void create_new_user_and_give_it_a_personalized_mail_adress(){
        MailManager femailcom = new MailManager();
        User felixtoledo = femailcom.createNewUser("Felix", "Toledo", "felixtoledoctes@gmail.com");
        String mailOfUserInList = femailcom.getUserList().get(0).getMailAdress();
        String mailOfFelix = felixtoledo.getMailAdress();

        assertEquals(mailOfFelix, mailOfUserInList);
    }


}
