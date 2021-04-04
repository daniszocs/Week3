package org.example;

public class App {
    public static void main(String[] args) {
        //       Phone phone= new Samsung(); // shouldn't compile. commented so that compilation is possible.

        // * - create at least 2 phone brands with 2 models for each
        Phone phone = new SamsungGalaxy6();
        Phone phone2 = new SamsungS10();
        Phone phone3 = new HuaweiP30Lite();
        Phone phone4 = new HuaweiP40();

        // * All phones offer the following behavior:
        // * - you can create new contacts
        // * - create 2 new contacts
        phone.addContact("1", "0770 070 707", "George", "Dumitrescu");
        phone.addContact("2", "0755 555 555", "Radu", "Costantinescu");
        // * - you can see existing contacts
        phone.listContacts();

        // * - you can send a text message
        // send a message to the first contact from the previous listed
        phone.sendMessage(phone.Contacts.get(0).getPhone_number(), "Hello George :)");
        // send a message to the second contact from the previous listed
        phone.sendMessage(phone.Contacts.get(1).getPhone_number(), "Hey Radu");
        // send more messages
        phone.sendMessage("0755 555 555", "Am ceva sa iti povestesc.");
        phone.sendMessage("0770 070 707", "Stii masina aia de colectie ce am vazut-o cand am trecut prin Oradea? Sa stii ca am cumparat-o.Ce parere ai?");
        phone.sendMessage("0770 070 707", "Am facut o investitie buna?");
        // * - you can see all messages for a specific contact
        phone.listMessages(phone.Contacts.get(0).getPhone_number());


        // * - you can make a call
        phone.call("0733 333 333");
        // * - make a call to the second contact
        phone.call(phone.Contacts.get(1).getPhone_number());
        // * - you can see all calls history
        phone.viewHistory();


        System.out.println("------------------------------------------------");
        //* - properties which cannot change: battery life (in number of hours)
        System.out.println("Battery life: " + phone.getBatteryLife() + " h");
        // * - properties that are instance specific: imei
        phone.setIMEI("123456789012345");
        System.out.println("IMEI:" + phone.getIMEI());
        // * - properties that are configurable: color, material
        phone.setColor("Blue");
        System.out.println("Phone is " + phone.getColor());
    }
}


