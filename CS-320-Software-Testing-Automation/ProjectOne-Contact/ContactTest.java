package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testContactCreationSuccess() {
        Contact c = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street");
        assertEquals("1234567890", c.getContactId());
        assertEquals("John", c.getFirstName());
        assertEquals("Doe", c.getLastName());
        assertEquals("1234567890", c.getPhone());
        assertEquals("123 Main Street", c.getAddress());
    }

    @Test
    void testInvalidContactIdNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact(null, "John", "Doe", "1234567890", "123 Main Street"));
    }

    @Test
    void testInvalidContactIdTooLong() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Main Street"));
    }

    @Test
    void testInvalidFirstNameNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("123", null, "Doe", "1234567890", "123 Main Street"));
    }

    @Test
    void testInvalidFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("123", "ThisIsTooLong", "Doe", "1234567890", "123 Main Street"));
    }

    @Test
    void testInvalidLastNameNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("123", "John", null, "1234567890", "123 Main Street"));
    }

    @Test
    void testInvalidLastNameTooLong() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("123", "John", "ThisIsTooLong", "1234567890", "123 Main Street"));
    }

    @Test
    void testInvalidPhoneNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("123", "John", "Doe", null, "123 Main Street"));
    }

    @Test
    void testInvalidPhoneNot10Digits() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("123", "John", "Doe", "12345", "123 Main Street"));
    }

    @Test
    void testInvalidAddressNull() {
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("123", "John", "Doe", "1234567890", null));
    }

    @Test
    void testInvalidAddressTooLong() {
        String longAddress = "1234567890123456789012345678901"; // 31 chars
        assertThrows(IllegalArgumentException.class,
                () -> new Contact("123", "John", "Doe", "1234567890", longAddress));
    }

    @Test
    void testSettersValidUpdates() {
        Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
        c.setFirstName("Jane");
        c.setLastName("Smith");
        c.setPhone("0987654321");
        c.setAddress("456 New Address");

        assertEquals("Jane", c.getFirstName());
        assertEquals("Smith", c.getLastName());
        assertEquals("0987654321", c.getPhone());
        assertEquals("456 New Address", c.getAddress());
    }

    @Test
    void testSetterInvalidFirstName() {
        Contact c = new Contact("123", "John", "Doe", "1234567890", "123 Main Street");
        assertThrows(IllegalArgumentException.class, () -> c.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> c.setFirstName("ThisIsTooLong"));
    }
}
