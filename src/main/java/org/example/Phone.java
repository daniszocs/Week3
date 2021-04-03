package org.example;

import java.util.ArrayList;
import java.util.List;

public class Phone{


    String color;
    String material;
    int batteryLife;
    String IMEI;

    public void addContact(String s, String phone_number, String first_name, String last_name) {
        Contact contact = new Contact();
        contact.setS(s);
        contact.setPhone_number(phone_number);
        contact.setFirst_name(first_name);
        contact.setLast_name(last_name);
        Contacts.add(contact);
    }

    List<Contact> Contacts = new ArrayList<>();
    public void listContacts() {
        for (Contact contact:Contacts
        ) {
            System.out.println(contact.getS() + ". " + contact.getFirst_name() + " " + contact.getLast_name() + " (" + contact.getPhone_number() + ")");
        }
    }

    List<Message> Messages = new ArrayList<>();

    public void sendMessage(String phoneNumber, String messageContent) {
        if (messageContent.length() > 100) {
            System.out.println("Message to " + phoneNumber + " was too long (>100).");
        }
        else {
            System.out.println("Message " + "'" + messageContent + "'" + " was sent to: " + phoneNumber);
            Message message = new Message();
            message.to = phoneNumber;
            message.content = messageContent;
            Messages.add(message);
        }
    }

    public void listMessages(String phoneNumber) {
        for (Message message:Messages
        ) {
            if (message.to.equals(phoneNumber)) {
                System.out.println("Message from " + phoneNumber + ": " + message.content);
            }
        }

    }

    List<PhoneCall> PhoneCalls = new ArrayList<>();
    public void call(String phoneNumber) {
            System.out.println("Phone call was sent to: " + phoneNumber);
            PhoneCall phoneCall = new PhoneCall();
            phoneCall.to = phoneNumber;
            PhoneCalls.add(phoneCall);
    }

    public void viewHistory() {
        for (PhoneCall phoneCall:PhoneCalls
        ) {
                System.out.println("Called " + phoneCall.to);
        }

    }

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

}
