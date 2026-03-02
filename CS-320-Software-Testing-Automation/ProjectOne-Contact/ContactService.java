package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

  private final List<Contact> contacts = new ArrayList<>();

  // Add a contact with a unique ID
  public void addContact(Contact contact) {
    if (contact == null) {
      throw new IllegalArgumentException("Contact cannot be null");
    }

    String id = contact.getContactId();
    if (id == null) {
      throw new IllegalArgumentException("Contact ID cannot be null");
    }

    if (findContactById(id) != null) {
      throw new IllegalArgumentException("Contact ID already exists: " + id);
    }

    contacts.add(contact);
  }

  // Delete a contact by contact ID
  public void deleteContact(String contactId) {
    Contact existing = findRequiredContact(contactId);
    contacts.remove(existing);
  }

  // Update contact fields by contact ID (Project One requirement)
  public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
    Contact existing = findRequiredContact(contactId);

    // Only update a field if a value was provided
    if (firstName != null) {
      existing.setFirstName(firstName);
    }

    if (lastName != null) {
      existing.setLastName(lastName);
    }

    if (phone != null) {
      existing.setPhone(phone);
    }

    if (address != null) {
      existing.setAddress(address);
    }
  }

  // Update individual fields by contact ID
  public void updateFirstName(String contactId, String firstName) {
    Contact existing = findRequiredContact(contactId);
    existing.setFirstName(firstName);
  }

  public void updateLastName(String contactId, String lastName) {
    Contact existing = findRequiredContact(contactId);
    existing.setLastName(lastName);
  }

  public void updatePhone(String contactId, String phone) {
    Contact existing = findRequiredContact(contactId);
    existing.setPhone(phone);
  }

  public void updateAddress(String contactId, String address) {
    Contact existing = findRequiredContact(contactId);
    existing.setAddress(address);
  }

  // Helper method to retrieve a contact by ID.
  // This is mainly used to support unit testing and validation.
  public Contact getContact(String contactId) {
    return findRequiredContact(contactId);
  }

  private Contact findRequiredContact(String contactId) {
    if (contactId == null) {
      throw new IllegalArgumentException("Contact ID cannot be null");
    }

    Contact existing = findContactById(contactId);
    if (existing == null) {
      throw new IllegalArgumentException("Contact ID not found: " + contactId);
    }

    return existing;
  }

  private Contact findContactById(String contactId) {
    for (Contact c : contacts) {
      if (c.getContactId().equals(contactId)) {
        return c;
      }
    }
    return null;
  }
}
