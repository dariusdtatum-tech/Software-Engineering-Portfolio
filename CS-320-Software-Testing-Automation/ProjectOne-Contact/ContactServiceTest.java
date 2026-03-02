package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

  private ContactService service;

  @BeforeEach
  void setUp() {
    service = new ContactService();
  }

  @Test
  void testAddContactSuccess() {
    Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
    service.addContact(c);

    Contact saved = service.getContact("123");
    assertEquals("123", saved.getContactId());
    assertEquals("John", saved.getFirstName());
    assertEquals("Doe", saved.getLastName());
    assertEquals("1234567890", saved.getPhone());
    assertEquals("123 Main Street", saved.getAddress());
  }

  @Test
  void testAddContactDuplicateIdThrows() {
    Contact c1 = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
    Contact c2 = new Contact("123", "Jane", "Smith", "0987654321", "456 New Address");

    service.addContact(c1);
    assertThrows(IllegalArgumentException.class, () -> service.addContact(c2));
  }

  @Test
  void testDeleteContactSuccess() {
    Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
    service.addContact(c);

    service.deleteContact("123");

    assertThrows(IllegalArgumentException.class, () -> service.getContact("123"));
  }

  @Test
  void testDeleteContactNonExistentThrows() {
    assertThrows(IllegalArgumentException.class, () -> service.deleteContact("nope"));
  }

  @Test
  void testUpdateFirstNameSuccess() {
    Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
    service.addContact(c);

    service.updateFirstName("123", "Jane");

    assertEquals("Jane", service.getContact("123").getFirstName());
  }

  @Test
  void testUpdateLastNameSuccess() {
    Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
    service.addContact(c);

    service.updateLastName("123", "Smith");

    assertEquals("Smith", service.getContact("123").getLastName());
  }

  @Test
  void testUpdatePhoneSuccess() {
    Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
    service.addContact(c);

    service.updatePhone("123", "0987654321");

    assertEquals("0987654321", service.getContact("123").getPhone());
  }

  @Test
  void testUpdateAddressSuccess() {
    Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
    service.addContact(c);

    service.updateAddress("123", "456 New Address");

    assertEquals("456 New Address", service.getContact("123").getAddress());
  }

  // --- Added tests for updateContact() ---

  @Test
  void testUpdateContactUpdatesProvidedFields() {
    Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
    service.addContact(c);

    // Update only first name and phone (leave last name and address unchanged)
    service.updateContact("123", "Jane", null, "0987654321", null);

    Contact updated = service.getContact("123");
    assertEquals("Jane", updated.getFirstName());
    assertEquals("Doe", updated.getLastName()); // unchanged
    assertEquals("0987654321", updated.getPhone());
    assertEquals("123 Main Street", updated.getAddress()); // unchanged
  }

  @Test
  void testUpdateContactNonExistentThrows() {
    assertThrows(IllegalArgumentException.class,
        () -> service.updateContact("nope", "Jane", "Smith", "0987654321", "456 New Address"));
  }

  @Test
  void testUpdateNonExistentThrows() {
    assertThrows(IllegalArgumentException.class,
        () -> service.updateFirstName("nope", "Jane"));
  }

  @Test
  void testUpdateInvalidDataThrows() {
    Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
    service.addContact(c);

    assertThrows(IllegalArgumentException.class, () -> service.updateFirstName("123", null));
    assertThrows(IllegalArgumentException.class, () -> service.updatePhone("123", "12345"));
    assertThrows(IllegalArgumentException.class, () -> service.updateAddress("123", null));
  }
}
