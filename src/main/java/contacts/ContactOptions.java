package contacts;

import java.util.ArrayList;

public class ContactOptions {
    private ArrayList<ContactManager> myContacts;

    public void printContacts() {
        System.out.println("Contact list");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + " ." +
                    this.myContacts.get(i).getName() +
                    " -> " + this.myContacts.get(i).getPhoneNr());
        }
    }
}
