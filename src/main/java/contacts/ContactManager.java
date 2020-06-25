package contacts;


import java.util.Objects;

public class ContactManager {

    String firstName;
    String phoneNr;

    public ContactManager(String firstName, String phoneNr){
        this.firstName = firstName;
        this.phoneNr = phoneNr;
    }

    public static boolean same(String firstName, String phoneNr) {
        return Objects.equals(firstName, phoneNr);
    }

    public String toString() {
        return "Contact{"+firstName+", "+phoneNr+"}";
    }

    public boolean equals(Object obj) {
        if( ! (obj instanceof ContactManager))
            return false;
        ContactManager c = (ContactManager) obj;
        return same(c.firstName, this.firstName) && same(c.phoneNr, this.phoneNr);
    }


    public String getName() {
        return firstName;
    }

    public String setName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public String setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
        return phoneNr;
    }

//    public void viewContacts() {
//        System.out.println(this.getName());
//        System.out.println(this.getPhoneNr());
//    }
//
//    public static ContactManager createContact(String firstName, String phoneNr) {
//        return new ContactManager(firstName, phoneNr);
//    }
//
//    ArrayList<String> contactList = new ArrayList<String>();
//
//    public ArrayList<String> getContactList() {
//        return contactList;
//    }
//
//    public void storeContacts(String names) {
//        contactList.add(names);
//    }
//
//    public void printContactList() {
//        System.out.println("You have " + contactList.size() + " Contacts in your list.");
//        for(int i = 0; i < contactList.size(); i++) {
//            System.out.println(i + " - " + contactList.get(i));
//        }
//    }


}
