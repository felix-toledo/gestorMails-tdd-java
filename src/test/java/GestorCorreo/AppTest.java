package GestorCorreo;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void check_instance_of_app(){
        App femailcom = new App();
        assertTrue(femailcom instanceof App);
    }

}
