/*
 * Jacob Rethmeier
 * 1/26/2025
 * CS 320
 * Contact class is used to create and store information
 */

package Contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	private static AtomicLong idGenerator = new AtomicLong();

	// CONSTRUCTOR
    /*
     * The constructor initializes the contact object with the provided first name, 
     * last name, phone number, and address. It also generates a unique ID for the 
    * contactID field.
     *
     * First name and last name are validated to ensure they are not null or empty. 
     * If either is null or blank, the field is set to "NULL" as a placeholder to 
     * maintain data integrity. Additionally, if the first or last name exceeds 10 
    * characters, it is truncated to the first 10 characters.
    *
     * The phone number field is checked to ensure it is exactly 10 characters long. 
     * If it does not meet this condition, it is replaced with the placeholder 
     * '0000000000'.
    *
     * The address field is treated similarly to the first and last names. If it is 
    * null or empty, it is set to "NULL". If it exceeds 30 characters, it will only 
      accept the first 30 characters.
    */
	public Contact(String firstName, String lastName, String number, String address) {

		// CONTACTID
		// Contact ID is generated when the constructor is called. It is set as a final variable and has
		// no other getter or setter so there should be no way to change it.
		// The idGenerator is static to prevent duplicates across all contacts.
		this.contactID = String.valueOf(idGenerator.getAndIncrement());

		// FIRSTNAME
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		// First name can't be longer than 10 characters, if it is only use first 10.
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}

		// Last Name
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
		
		// Number
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.number = "5555555555";
		} else {
			this.number = number;
		}
		
		// Address
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}

	// Getters
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNumber() {
		return number;
	}

	public String getAddress() {
		return address;
	}

    // Setters
	/*
	 * The setters have same rules as the constructor
	 */
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";

		// First name can't be longer than 10 characters, if it is only use first 10.
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
	}

	public void setNumber(String number) {
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.number = "0000000000";
		} else {
			this.number = number;
		}
	}

	public void setAddress(String address) {
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}
}