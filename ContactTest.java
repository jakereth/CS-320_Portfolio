/*
 * Jacob Rethmeier
 * 1/26/2025
 * CS 320
 * Contact class is used to create and store information
 */

package Test;

import org.junit.jupiter.api.Test;

import Contact.Contact;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    /*
     * These tests verify the behavior of the Contact class. The first five tests
     * ensure that fields adhere to size constraints (10 characters for first and 
     * last names, exactly 10 characters for phone numbers, and 30 characters for addresses). 
     * The remaining four tests confirm that none of the fields, except ContactID, 
     * are assigned null values. 
     *
     * ContactID is not explicitly tested for null because it is always automatically 
     * generated. Similarly, tests for preventing updates to ContactID are not included 
     * because there is no functionality allowing updates to that field.
     */
    
    @Test
    @DisplayName("Ensure Contact ID does not exceed 10 characters")
    void testContactIDWithMoreThanTenCharacters() {
        Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", "Address");
        if (contact.getContactID().length() > 10) {
            fail("Contact ID exceeds 10 characters.");
        }
    }

    @Test
    @DisplayName("Ensure Contact First Name does not exceed 10 characters")
    void testContactFirstNameWithMoreThanTenCharacters() {
        Contact contact = new Contact("OllyOllyOxenFree", "LastName", "PhoneNumbr", "Address");
        if (contact.getFirstName().length() > 10) {
            fail("First Name exceeds 10 characters.");
        }
    }

    @Test
    @DisplayName("Ensure Contact Last Name does not exceed 10 characters")
    void testContactLastNameWithMoreThanTenCharacters() {
        Contact contact = new Contact("FirstName", "OllyOllyOxenFree", "PhoneNumbr", "Address");
        if (contact.getLastName().length() > 10) {
            fail("Last Name exceeds 10 characters.");
        }
    }

    @Test
    @DisplayName("Ensure Contact phone number is exactly 10 characters")
    void testContactNumberWithMoreThanTenCharacters() {
        Contact contact = new Contact("FirstName", "LastName", "55555555555", "Address");
        if (contact.getNumber().length() != 10) {
            fail("Phone number is not exactly 10 characters.");
        }
    }

    @Test
    @DisplayName("Ensure Contact address does not exceed 30 characters")
    void testContactAddressWithMoreThanThirtyCharacters() {
        Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr",
                "123456789 is nine characters long" + "123456789 is another nine characters long");
        if (contact.getAddress().length() > 30) {
            fail("Address exceeds 30 characters.");
        }
    }

    @Test
    @DisplayName("Ensure Contact First Name is not null")
    void testContactFirstNameNotNull() {
        Contact contact = new Contact(null, "LastName", "PhoneNumbr", "Address");
        assertNotNull(contact.getFirstName(), "First name is null.");
    }

    @Test
    @DisplayName("Ensure Contact Last Name is not null")
    void testContactLastNameNotNull() {
        Contact contact = new Contact("FirstName", null, "PhoneNumbr", "Address");
        assertNotNull(contact.getLastName(), "Last name is null.");
    }

    @Test
    @DisplayName("Ensure Contact Phone Number is not null")
    void testContactPhoneNotNull() {
        Contact contact = new Contact("FirstName", "LastName", null, "Address");
        assertNotNull(contact.getNumber(), "Phone number is null.");
    }

    @Test
    @DisplayName("Ensure Contact Address is not null")
    void testContactAddressNotNull() {
        Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", null);
        assertNotNull(contact.getAddress(), "Address is null.");
    }
}