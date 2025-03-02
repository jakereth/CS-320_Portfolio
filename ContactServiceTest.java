/*
 * Jacob Rethmeier
 * 1/26/2025
 * CS 320
 * Contact class is used to create and store information
 */

package Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import Contact.Contact;
import Contact.ContactService;

import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

    /*
     * These tests validate the functionality of the ContactService class. 
     * Each test creates a new instance of ContactService and performs specific 
     * operations on the list of contacts, such as adding, updating, or deleting.
     * After each operation, assertions are made to ensure the expected outcome matches 
     * the actual result for the relevant fields.
     *
     * Since each contact is assigned a unique contactID during creation, the tests rely on 
     * these IDs to perform updates and validations. The @Order annotation ensures that 
     * the tests run in a specific sequence to maintain consistency in test outcomes.
     *
     * To display the current list of contacts during testing, uncomment the 
     * service.displayContactList(); line before the assertions. This can help 
     * with debugging and verifying the contact details in the console.
     */
    
    @Test
    @DisplayName("Test to update the first name of a contact.")
    @Order(1)
    void testUpdateFirstName() {
        ContactService service = new ContactService();
        service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
        service.updateFirstName("Sven", "9");
        service.displayContactList();
        assertEquals("Sven", service.getContact("9").getFirstName(), "First name was not updated.");
    }

    @Test
    @DisplayName("Test to update the last name of a contact.")
    @Order(2)
    void testUpdateLastName() {
        ContactService service = new ContactService();
        service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
        service.updateLastName("Shirley", "11");
        service.displayContactList();
        assertEquals("Shirley", service.getContact("11").getLastName(), "Last name was not updated.");
    }

    @Test
    @DisplayName("Test to update a contact's phone number.")
    @Order(3)
    void testUpdatePhoneNumber() {
        ContactService service = new ContactService();
        service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
        service.updateNumber("5555550000", "17");
        // service.displayContactList();
        assertEquals("5555550000", service.getContact("17").getNumber(), "Phone number was not updated.");
    }

    @Test
    @DisplayName("Test to update a contact's address.")
    @Order(4)
    void testUpdateAddress() {
        ContactService service = new ContactService();
        service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
        service.updateAddress("555 Nowhere Ave", "15");
        service.displayContactList();
        assertEquals("555 Nowhere Ave", service.getContact("15").getAddress(), "Address was not updated.");
    }

    @Test
    @DisplayName("Test to verify that a contact can be deleted.")
    @Order(5)
    void testDeleteContact() {
        ContactService service = new ContactService();
        service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
        service.deleteContact("17");
        // Ensure that the contact list is empty by comparing it with a new empty list
        ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
        service.displayContactList();
        assertEquals(service.contactList, contactListEmpty, "The contact was not deleted.");
    }

    @Test
    @DisplayName("Test to verify that a contact can be added.")
    @Order(6)
    void testAddContact() {
        ContactService service = new ContactService();
        service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
        service.displayContactList();
        assertNotNull(service.getContact("0"), "Contact was not added correctly.");
    }
}