import org.junit.*;
import static org.junit.Assert.*;

// A SCREENCAPTURE OF THE TEST RESULTS IN IN THE ZIP FOLDER.

public class ContactTest{
  
  @Test
  public void testContactCreation() {
    Contact contact = new Contact("1", "Aneudi", "Matos", "6035557878", "123 Tu corazon bb");
    assertEquals("1", contact.getContactId());
    assertEquals("Aneudi", contact.getFirstName());
    assertEquals("Matos", contact.getLastName());
    assertEquals("6035557878", contact.getPhoneNumber());
    assertEquals("123 Tu corazon bb",  contact.getAddress());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testContactIdNull() {
    Contact contact = new Contact(null, "Aneudi", "Matos", "6035557878", "123 Tu corazon bb");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testContactIdLength() {
    Contact contact = new Contact("12345678901" , "Aneudi", "Matos", "6035557878", "123 Tu corazon bb");
  }

    @Test(expected = IllegalArgumentException.class)
  public void testContactFirstNameNull() {
    Contact contact = new Contact("1", null, "Matos", "6035557878", "123 Tu corazon bb");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testContactFirstNameLength() {
    Contact contact = new Contact("1", "012345678912", "Matos", "6035557878", "123 Tu corazon bb");
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testContactLastNameNull() {
    Contact contact = new Contact("1", "Aneudi", null, "6035557878", "123 Tu corazon bb");
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testContactLastNameLenght() {
    Contact contact = new Contact("1", "Aneudi", "012345678910", "6035557878", "123 Tu corazon bb");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testContactPhoneNumberNull() {
    Contact contact = new Contact("1", "Aneudi", "Matos", null, "123 Tu corazon bb");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testContactPhoneNumberLength() {
    Contact contact = new Contact("1", "Aneudi", "Matos", "603555787878", "123 Tu corazon bb");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testContactAddressNull() {
    Contact contact = new Contact("1", "Aneudi", "Matos", "6035557878", null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testContactAddressLength() {
    Contact contact = new Contact("1", "Aneudi", "Matos", "6035557878", "We the People of the United States, in Order to form a more perfect Union, establish Justice, insure domestic Tranquility, provide for the common defence, promote the general Welfare, and secure the Blessings of Liberty to ourselves and our Posterity, do ordain and establish this Constitution for the United States of America.");
  }
}