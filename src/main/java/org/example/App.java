package org.example;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
//        Phone phone= new Samsung(); // shouldn't compile
        Phone phone = new SamsungGalaxy6();
        phone.setIMEI("123456789012345");
        System.out.println("IMEI:" + phone.getIMEI());

        phone.addContact("1", "0770 070 707", "George", "Dumitrescu");
        phone.addContact("2", "0755 555 555", "Radu", "Costantinescu");
        phone.listContacts();

        phone.call("0733 333 333");

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendMessage(phone.Contacts.get(0).getPhone_number(), "Hello George :)");
        // send a message to the second contact from the previous listed
        phone.sendMessage(phone.Contacts.get(1).getPhone_number(), "Hey Radu");
        phone.sendMessage(phone.Contacts.get(1).getPhone_number(), "Am ceva sa iti povestesc.");
        phone.sendMessage(phone.Contacts.get(0).getPhone_number(), "Stii masina aia de colectie ce am vazut-o cand am trecut prin Oradea? Sa stii ca am cumparat-o.Ce parere ai?");
        phone.sendMessage(phone.Contacts.get(0).getPhone_number(), "Am facut o investitie buna?");
        phone.listMessages("0770 070 707");


        phone.call("0770 070 707");
        phone.viewHistory();
        System.out.println("Battery life: " + phone.getBatteryLife() + " h.");
    }
}


/**
 * Week3
 *
 * Java OOP
 * NOTE:
 * Homework must be posted on GitHub and the commit id shoud be submitted.
 *
 * Requirements
 *
 * All phones offer the following behavior:
 * - you can create new contacts
 * - you can see existing contacts
 * - you can send a text message
 * - you can see all messages for a specific contact
 * - you can make a call
 * - you can see all calls history
 *
 *
 * Implement a phone hierarchy where:
 * - A phone can be of certain manufacters and it can have a specific model (Phone - Samsung - SamsungGalaxyS6)
 * - properties wich cannot change: battery life (in number of hours)
 * - properties that are configurable: color, material
 * - properties that are instance specific: imei
 *
 * Behavior:
 *  - a message can have maximum 500 chars
 *  - every time a message is send an hour is taken from the battery life
 *  - every time a call is made two hours are taken from the battery life
 *
 * API:
 *   Phone phone= new Samsung(); // shouldn't compile
 *        Phone phone = new SamsungGalaxy6();
 *
 *        phone.addContact("1", "phone number", "fist name", "last name");
 *        phone.addContact("2", "phone number", "fist name", "last name");
 *        phone.listContacts();
 *
 *        // send a message to the first contact from the previous listed
 *         // max number of characters - 100
 *        phone.sendMessage("phone number", "message content");
 *        phone.listMessages("phone number");
 *
 *         // send a message to the second contact from the previous listed
 *        phone.call("phone number");
 *        phone.viewHistory();
 *
 * Tasks:
 * - implement the classes, abstract classes and interfaces according to the given information
 * - create at least 2 phone brands with 2 models for each
 * - create 2 new contacts
 * - send a message to the first contact
 * - make a call to the second contact
 */
