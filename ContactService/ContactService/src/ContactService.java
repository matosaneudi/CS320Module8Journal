// A SCREENCAPTURE OF THE TEST RESULTS IN IN THE ZIP FOLDER.

import java.util.ArrayList;
//import java.util.Scanner;
import java.util.List;


public class ContactService {
  
  private int currentId = 0;
  
  private final ArrayList<Contact> contactList = new ArrayList<Contact>();
  
  public synchronized void addContact(String firstName, String lastName, String phoneNumber, String address ) {
    
    String id = Integer.toString(currentId);
    
    Contact newContact = new Contact(id, firstName, lastName, phoneNumber, address);
    contactList.add(newContact);

    currentId ++;
  }

  public void editFirstName(String contactId, String firstName) {
    for (Contact iter : contactList) {
      if (iter.getContactId().equals(contactId)) {
        iter.setFirstName(firstName);
      }
    }
  }

  public void editLastName(String contactId, String lastName) {
    for (Contact iter : contactList) {
      if (iter.getContactId().equals(contactId)) {
        iter.setLastName(lastName);
      }
    }
  }
  
  public void editNumber(String contactId, String phoneNumber) {
    for (Contact iter : contactList) {
      if (iter.getContactId().equals(contactId)) {
        iter.setPhoneNumber(phoneNumber);
      }
    }
  }

  public void editAddress(String contactId, String address) {
    for (Contact iter : contactList) {
      if (iter.getContactId().equals(contactId)) {
        iter.setAddress(address);
      }
    }
  }

  public void deleteContact(String contactId) {
    contactList.removeIf(contact -> contact.getContactId().equals(contactId));
  }
  
  public synchronized List<Contact> getContactList() {
    return new ArrayList<>(contactList);
  }


  //contact service should update contact with a uniqueID 
  



  //delete contacts per ID 



  //update name, last name, number, address
  
}