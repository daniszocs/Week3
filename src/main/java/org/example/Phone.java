package org.example;

import java.util.ArrayList;
import java.util.List;

public class Phone implements SpecsAndFeatures{

    String color;
    String material;
    int batteryLife = 1000;
    String IMEI;

    @Override
    public void addContact(String s, String phone_number, String first_name, String last_name) {
        Contact contact = new Contact();
        contact.setS(s);
        contact.setPhone_number(phone_number);
        contact.setFirst_name(first_name);
        contact.setLast_name(last_name);
        Contacts.add(contact);
    }

    List<Contact> Contacts = new ArrayList<>();

    @Override
    public void listContacts() {
        for (Contact contact:Contacts
        ) {
            System.out.println(contact.getS() + ". " + contact.getFirst_name() + " " + contact.getLast_name() + " (" + contact.getPhone_number() + ")");
        }
    }

    List<Message> Messages = new ArrayList<>();

    @Override
    public void sendMessage(String phoneNumber, String Content) {
        if (Content.length() > 500) {
            System.out.println("Message was too long (>500).");
        }
        else {
            System.out.println("Message " + "'" + Content + "'" + " was sent to: " + phoneNumber);
            Message message = new Message();
            message.to = phoneNumber;
            message.content = Content;
            Messages.add(message);
            batteryLife = batteryLife - 1;
        }
    }

    @Override
    public void listMessages(String phoneNumber) {
        for (Message message:Messages
        ) {
            if (message.to.equals(phoneNumber)) {
                System.out.println("Messages from " + phoneNumber + ": " + message.content);
            }
        }

    }

    List<PhoneCall> PhoneCalls = new ArrayList<>();

    @Override
    public void call(String phoneNumber) {
            System.out.println("Phone call was sent to: " + phoneNumber);
            PhoneCall phoneCall = new PhoneCall();
            phoneCall.to = phoneNumber;
            PhoneCalls.add(phoneCall);
            batteryLife = batteryLife - 2;
    }

    @Override
    public void viewHistory() {
        for (PhoneCall phoneCall:PhoneCalls
        ) {
                System.out.println("Called " + phoneCall.to);
        }

    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setMaterial(String material) {
        this.material= material;
    }
    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
    public String getIMEI() {
        return IMEI;
    }

}
