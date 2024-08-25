// A SCREENCAPTURE OF THE TEST RESULTS IN IN THE ZIP FOLDER.

public class Contact { 

    private final String contactId; 
    private String firstName;
    private String lastName;
    private String phoneNumber; 
    private String address; 

    public Contact (String contactId, String firstName, String lastName, String phoneNumber, String address) {
        
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("invalid contact Id: ");
        }

        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Enter a valid name: ");
        }

        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Enter a valid last name: ");
        }

        if (phoneNumber == null || phoneNumber.length() != 10) {
            throw new IllegalArgumentException("Enter phone number including area code: ");
        }

        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Enter a valid address: ");
        }
        
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        
        //setContactId(Id);
        //setFirstName(fName);
        //setLastName(lName);
        //setPhoneNumber(number);
        //setAddress(homeAddress);

    }
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    } 

    public String getAddress() {
        return address;
    }

    //public void setContactId(String Id) {
        //this.contactId = Id;
    //}

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public void setAddress(String homeAddress) {
        this.address = homeAddress;
    }
    
    
}
