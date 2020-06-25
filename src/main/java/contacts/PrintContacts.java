package contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintContacts {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ContactManager
                c1 = new ContactManager("Simona", "3712022222"),
                c2 = new ContactManager("Mike Tyson", "3712255555"),
                c3 = new ContactManager("Dima", "+371544444"),
                c4 = new ContactManager("Konstantin", "");



        List<Object> lstObject = new ArrayList<>();
        lstObject.add(c1);
        lstObject.add(c2);
        lstObject.add(c3);
        lstObject.add(c4);

        for (Object obj : lstObject) {
            if (obj.getClass() == String.class) {
                System.out.println("I found a contact :- " + obj);
            }
            if (obj.getClass() == ContactManager.class) {
                ContactManager contactManager = (ContactManager) obj;
                System.out.println("Name : " + contactManager.getName() +"."+ " Number : " + contactManager.getPhoneNr());
            }


        }
    }
}
