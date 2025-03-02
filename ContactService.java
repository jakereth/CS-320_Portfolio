/*
 * Jacob Rethmeier
 * 1/26/2025
 * CS 320
 * Contact class is used to create and store information
 */

package Contact;

import java.util.ArrayList;

public class ContactService {
    // Maintains a list of contacts using an ArrayList to store all contact objects.
    public ArrayList<Contact> contactList = new ArrayList<Contact>();

    // Outputs all the contacts in the list to the console for verification or debugging.
    public void displayContactList() {
        for (int counter = 0; counter < contactList.size(); counter++) {
            System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
            System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
            System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
            System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
            System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
        }
    }

    // Creates a new contact object using the given details and adds it to the contact list.
    public void addContact(String firstName, String lastName, String number, String address) {
        Contact contact = new Contact(firstName, lastName, number, address);
        contactList.add(contact);
    }

    // Retrieves a contact based on its unique Contact ID. If no match is found, returns a contact object with default values.
    public Contact getContact(String contactID) {
        Contact contact = new Contact(null, null, null, null);
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contact = contactList.get(counter);
            }
        }
        return contact;
    }

    // Removes a contact from the list using its Contact ID. If no match is found, notifies the user through the console.
    public void deleteContact(String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.remove(counter);
                break;
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }

    // Updates the first name of a contact based on its Contact ID. If no match is found, notifies the user through the console.
    public void updateFirstName(String updatedString, String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.get(counter).setFirstName(updatedString);
                break;
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }

    // Updates the last name of a contact based on its Contact ID. If no match is found, notifies the user through the console.
    public void updateLastName(String updatedString, String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.get(counter).setLastName(updatedString);
                break;
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }

    // Updates the phone number of a contact based on its Contact ID. If no match is found, notifies the user through the console.
    public void updateNumber(String updatedString, String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.get(counter).setNumber(updatedString);
                break;
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }

    // Updates the address of a contact based on its Contact ID. If no match is found, notifies the user through the console.
    public void updateAddress(String updatedString, String contactID) {
        for (int counter = 0; counter < contactList.size(); counter++) {
            if (contactList.get(counter).getContactID().equals(contactID)) {
                contactList.get(counter).setAddress(updatedString);
                break;
            }
            if (counter == contactList.size() - 1) {
                System.out.println("Contact ID: " + contactID + " not found.");
            }
        }
    }
}