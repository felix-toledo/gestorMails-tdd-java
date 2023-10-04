package GestorCorreo;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void check_instance_of_app() {
        MailManager femailcom = new MailManager();
        assertTrue(femailcom instanceof MailManager);
    }


}
