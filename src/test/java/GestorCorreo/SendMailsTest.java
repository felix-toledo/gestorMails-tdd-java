package GestorCorreo;

import org.junit.Test;
import org.junit.Assert.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SendMailsTest {
@Test
    public void create_app_create_user_send_mail(){
    App aplicacion = new App();
    User lau = aplicacion.createNewUser("Lautaro", "Vegano", "lauvega");
    User felix = aplicacion.createNewUser("Felix", "Toledo", "felixt");
    ArrayList<String> para = new ArrayList<>();
    para.add("felixt@femail.ctes");

    lau.createMessage(aplicacion, "Asunto", "Mensaje", para);
    assertEquals(1, lau.getOutbox().size());
    assertEquals(1, felix.getInbox().size());

}

}
