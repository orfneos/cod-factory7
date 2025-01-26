package src.gr.aueb.cf.ch18.mobilecontacts.model;

import java.util.Objects;

public class MobileContact extends AbstractEntity{
    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContact() {
    }

    public MobileContact(String firstname, String phoneNumber, String lastname) {
        this.firstname = firstname;
        this.phoneNumber = phoneNumber;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Firstname: " + firstname + ", Lastname: " + lastname + ", Phone Number: " + phoneNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof MobileContact that)) return false;
        return Objects.equals(getFirstname(), that.getFirstname()) && Objects.equals(getLastname(), that.getLastname()) && Objects.equals(getPhoneNumber(), that.getPhoneNumber());
    }

    // In Java 17 το παρακάτω κάνει δύο πράγματα
    // Έλεγχο αν είναι instanceof και αν ναι μετά κάνει
    // typecast (όπως κάναμε πριν την Java 17 με τον παραπάνω κώδικα)
    // if (!(other instanceof MobileContact that)) return false;

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getPhoneNumber());
    }
}
