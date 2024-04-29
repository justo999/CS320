package contactservice;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        this.contactID = contactID;
        this.firstName = validateLength(firstName, 10);
        this.lastName = validateLength(lastName, 10);
        this.phone = validatePhone(phone);
        this.address = validateLength(address, 30);
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Method to validate phone number length and format
    private String validatePhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits.");
        }
        return phone;
    }

    // Method to validate and truncate string length
    private String validateLength(String value, int maxLength) {
        if (value == null || value.length() > maxLength) {
            throw new IllegalArgumentException("Length of value cannot exceed " + maxLength + " characters.");
        }
        return value;
    }

    // Methods to update contact fields
    public void setFirstName(String firstName) {
        this.firstName = validateLength(firstName, 10);
    }

    public void setLastName(String lastName) {
        this.lastName = validateLength(lastName, 10);
    }

    public void setPhone(String phone) {
        this.phone = validatePhone(phone);
    }

    public void setAddress(String address) {
        this.address = validateLength(address, 30);
    }
}

