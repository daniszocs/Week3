package org.example;

import java.util.ArrayList;
import java.util.List;

public class Phone{


    String color;
    String material;
    static int batteryLife;
    String IMEI;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material= material;
    }
    public String getMaterial() {
        return material;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
    public String getIMEI() {
        return IMEI;
    }

    List<Contact> Contacts = new ArrayList<>();

    public void addContact(String s, String phone_number, String first_name, String last_name) {
        Contact contact = new Contact();
        contact.setS(s);
        contact.setPhone_number(phone_number);
        contact.setFirst_name(first_name);
        contact.setLast_name(last_name);
        Contacts.add(contact);
    }

    public void listContacts() {
        for (Contact contact:Contacts
             ) {
            System.out.println(contact.getS() + ". " + contact.getFirst_name() + " " + contact.getLast_name() + " (" + contact.getPhone_number() + ")");
        }
    }



}
