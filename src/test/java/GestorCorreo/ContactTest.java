package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {
    @Test
    public void check_creation_of_contact(){
        Contact contacto = new Contact("Felix", "Toledo", "felix@gmail.com");
        assertEquals("Felix", contacto.getName());
        assertEquals("Toledo", contacto.getSurname());
        assertEquals("felix@gmail.com", contacto.getMailAdress());
    }

    @Test
    public void contact_functions_test(){
        Contact contacto = new Contact("Felix", "Toledo", "felix@gmail.com");
        contacto.setName("Felixito");
        contacto.setSurname("Perez");
        contacto.setMailAdress("felixperez@gmail.com");

        String hasToBeName = "Felixito";
        String hasToBeSurname = "Perez";
        String hasToBeMailAdress = "felixperez@gmail.com";

        assertEquals(hasToBeName, contacto.getName());
        assertEquals(hasToBeSurname, contacto.getSurname());
        assertEquals(hasToBeMailAdress, contacto.getMailAdress());
    }
}
