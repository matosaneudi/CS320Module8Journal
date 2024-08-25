import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;


// A SCREENCAPTURE OF THE TEST RESULTS IN IN THE ZIP FOLDER.

public class ContactServiceTest {
  
  private ContactService service;

  @Before
  public void setUp() {
    service = new ContactService();
  }
  
  @Test
  public void testAddContact() {
    service.addContact("Aneudi", "Matos", "6035557878", "123 Tu corazon bb");
    List<Contact> contacts = service.getContactList();
    assertEquals(1, contacts.size());
    Contact contact = contacts.get(0);
    assertEquals("Aneudi", contact.getFirstName());
    assertEquals("Matos", contact.getLastName());
    assertEquals("6035557878", contact.getPhoneNumber());
    assertEquals("123 Tu corazon bb", contact.getAddress());
  }
  
  @Test
  public void testEditFirstName() {
    service.addContact("Aneudi", "Matos", "6035557878", "123 Tu corazon bb");
    String contactId = service.getContactList().get(0).getContactId();
    service.editFirstName(contactId, "Juan");
    assertEquals("Juan", service.getContactList().get(0).getFirstName());
    }
    
  @Test
  public void testEditLastName() {
    service.addContact("Aneudi", "Matos", "6035557878", "123 Tu corazon bb");
    String contactId = service.getContactList().get(0).getContactId();
    service.editLastName(contactId, "Gomez");
    assertEquals("Gomez", service.getContactList().get(0).getLastName());
  }

  @Test
  public void testEditPhoneNumber() {
    service.addContact("Aneudi", "Matos", "6035557878", "123 Tu corazon bb");
    String contactId = service.getContactList().get(0).getContactId();
    service.editNumber(contactId, "6035559999");
    assertEquals("6035559999", service.getContactList().get(0).getPhoneNumber());
  }

  @Test
  public void testEditAddress() {
    service.addContact("Aneudi", "Matos", "6035557878", "123 Tu corazon bb");
    String contactId = service.getContactList().get(0).getContactId();
    service.editAddress(contactId, "456 New Address");
    assertEquals("456 New Address", service.getContactList().get(0).getAddress());
  }

  @Test
  public void testDeleteContact() {
    service.addContact("Aneudi", "Matos", "6035557878", "123 Tu corazon bb");
    String contactId = service.getContactList().get(0).getContactId();
    service.deleteContact(contactId);
    assertEquals(0, service.getContactList().size());
  }
}

    
