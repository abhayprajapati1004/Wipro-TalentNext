import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList1 {
    private Map<String, Integer> contacts;

    public ContactList1() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, int phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public boolean checkKey(String name) {
        return contacts.containsKey(name);
    }

    public boolean checkValue(int phoneNumber) {
        return contacts.containsValue(phoneNumber);
    }

    public void iterateContacts() {
        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ContactList1 contactList = new ContactList1();
        contactList.addContact("John Doe", 1234567890);
        System.out.println("Does 'John Doe' exist? " + contactList.checkKey("John Doe"));
        System.out.println("Does phone number 1234567890 exist? " + contactList.checkValue(1234567890));
        contactList.iterateContacts();
    }
}