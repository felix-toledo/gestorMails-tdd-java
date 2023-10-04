package GestorCorreo;

import org.junit.Test;
import org.junit.Assert.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SendMailsTest {
@Test
    public void create_app_create_user_send_mail(){
    MailManager aplicacion = new MailManager();
    User lau = aplicacion.createNewUser("Lautaro", "Vegano", "lauvega");
    User felix = aplicacion.createNewUser("Felix", "Toledo", "felixt");
    User pedro = aplicacion.createNewUser("Pedro", "Rosales", "pedro@gmail.com");
    ArrayList<String> para = new ArrayList<>();
    para.add("felixt@femail.ctes");
    para.add("pedro@gmail.com");

    lau.createMessage(aplicacion, "Que onda mi hermano", "Buennos dias, quiero pregunntarte como estas", para);
    assertEquals(1, lau.getOutbox().size());
    assertEquals(1, felix.getInbox().size());
    assertEquals(1, pedro.getInbox().size());
}

}
