package GestorCorreo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ContactTest {
    @Test
    public void check_creation_of_contact(){
        Contact contacto = new Contact("Felix", "Toledo", "felix@gmail.com");
        assertEquals("Felix", contacto.getName());
        assertEquals("Toledo", contacto.getSurname());
        assertEquals("felix@gmail.com", contacto.getMailAdress());
    }


}
