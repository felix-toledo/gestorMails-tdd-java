package GestorCorreo;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class BoxTest {
     @Test
     public void creation_of_box(){
          Box bandeja = new Box();
          ArrayList<String> hola = new ArrayList<>();
          Mail mail = new Mail("Hola", "Felix", "Como", hola);
          Mail mail2 = new Mail("Hola2", "Felix2", "Como2", hola);

          bandeja.add(mail);
          bandeja.add(mail2);

          Mail deberiaSer2 = bandeja.get(1);

          assertEquals(mail2, deberiaSer2);
          assertEquals(2, bandeja.size());
     }
}
