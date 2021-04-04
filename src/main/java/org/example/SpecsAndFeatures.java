package org.example;

import java.util.ArrayList;
import java.util.List;

public interface SpecsAndFeatures {
    String color = "";
    String material = "";
    int batteryLife = 0;
    String IMEI = "";

    public void addContact(String s, String phone_number, String first_name, String last_name);

    List<Contact> Contacts = new ArrayList<>();
    public void listContacts();

    List<Message> Messages = new ArrayList<>();

    public void sendMessage(String phoneNumber, String messageContent) ;

    public void listMessages(String phoneNumber);

    List<PhoneCall> PhoneCalls = new ArrayList<>();

    public void call(String phoneNumber);

    public void viewHistory() ;

    public void setColor(String color);
    public String getColor();

    public void setMaterial(String material);
    public String getMaterial();

    public int getBatteryLife();

    public void setIMEI(String IMEI);
    public String getIMEI();

}
