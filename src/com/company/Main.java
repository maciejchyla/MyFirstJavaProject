package com.company;

public class Main {

    public static void main(String[] args) {
        ContactsManager myContactManager = new ContactsManager();
        Contact contact1 = new Contact();
        contact1.name = "Jan Kowalski";
        contact1.email = "jankowalski@gmail.com";
        contact1.phoneNumber = "123456789";
        myContactManager.addContact(contact1);
        Contact contact2 = new Contact();
        contact2.name = "Maciej Chyła";
        contact2.email = "keicam18@poczta.fm";
        contact2.phoneNumber = "987456321";
        myContactManager.addContact(contact2);
        Contact contact3 = new Contact();
        contact3.name = "Nowak";
        contact3.email = "nowak@gmial.com";
        contact3.phoneNumber = "500500500";
        myContactManager.addContact(contact3);

        Contact foundContact = myContactManager.searchContact("Maciej Chyła");
        System.out.println(foundContact.name + " phone number: " + foundContact.phoneNumber);
    }
}
