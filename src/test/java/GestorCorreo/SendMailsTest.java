package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class SendMailsTest {
    MailManager aplicacion = new MailManager();
    User lau = aplicacion.createNewUser("Lautaro", "Vegano", "lauvega");
    User felix = aplicacion.createNewUser("Felix", "Toledo", "felixt");
    User pedro = aplicacion.createNewUser("Pedro", "Rosales", "pedro@gmail.com");

    @Test
    public void create_app_create_user_send_mail(){
    ArrayList<String> para = new ArrayList<>();
    para.add("felixt@femail.ctes");
    para.add("pedro@gmail.com");

    lau.createMessage(aplicacion, "Que onda mi hermano", "Buennos dias, quiero pregunntarte como estas", para);
    assertEquals(1, lau.getOutbox().size());
    assertEquals(1, felix.getInbox().size());
    assertEquals(1, pedro.getInbox().size());
}

    //Test que verifica que si el mail no es valido, no mande nada.
    @Test (expected = IllegalArgumentException.class)
    public void invalid_mail_to_send(){
        felix.createMessage(aplicacion, "Mi asunto", "Mi mensaje", "noexisto");
    }

    //Test que verifica que si el mail no existe, no mande nada.
    @Test (expected = IllegalAccessError.class)
    public void no_mail_exist(){
        felix.createMessage(aplicacion, "Felix", "Mensaje", "noexisto@gmail.com");
        int bandejaFelix = felix.getOutbox().size();
        assertEquals(0, bandejaFelix);
    }
}
