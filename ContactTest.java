package contactservice;

//ContactTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

 @Test
 public void testCreateContact() {
     Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
     assertNotNull(contact);
     assertEquals("1234567890", contact.getContactID());
     assertEquals("John", contact.getFirstName());
     assertEquals("Doe", contact.getLastName());
     assertEquals("1234567890", contact.getPhone());
     assertEquals("123 Main St", contact.getAddress());
 }
}


