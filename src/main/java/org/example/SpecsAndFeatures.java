package org.example;

import java.util.ArrayList;
import java.util.List;

public interface SpecsAndFeatures {
    // * - properties which cannot change: battery life (in number of hours)
    // * - properties that are configurable: color, material
    // * - properties that are instance specific: imei
    int batteryLife = 0;
    String color = "";
    String material = "";
    String IMEI = "";

    void addContact(String s, String phone_number, String first_name, String last_name);

    List<Contact> Contacts = new ArrayList<>();
    void listContacts();

    List<Message> Messages = new ArrayList<>();

    void sendMessage(String phoneNumber, String messageContent) ;

    void listMessages(String phoneNumber);

    void call(String phoneNumber);

    void viewHistory() ;

    void setColor(String color);
    String getColor();

    void setMaterial(String material);
    String getMaterial();

    int getBatteryLife();

    void setIMEI(String IMEI);
    String getIMEI();

}
