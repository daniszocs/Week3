package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Phone phone= new Samsung(); // shouldn't compile
        Phone phone = new SamsungGalaxy6();

        phone.setIMEI("123456789012345");
        System.out.println(phone.IMEI);

        phone.addContact("1", "phone number", "fist name", "last name");
        phone.addContact("2", "phone number", "fist name", "last name");
        phone.listContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
//        phone.sendMessage("phone number", "message content");
//        phone.listMessages("phone number");

        // send a message to the second contact from the previous listed
//        phone.call("phone number");
//        phone.viewHistory();
    }
}
