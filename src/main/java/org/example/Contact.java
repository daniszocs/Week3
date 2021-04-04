package org.example;

public class Contact {

    String s;
    String phoneNumber;
    String firstName;
    String lastName;

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        // *  max number of characters - 100
        if (firstName.length() > 100) {
            System.out.println("First name too long (>100)");
        } else {
            this.firstName = firstName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        // *  max number of characters - 100
        if (lastName.length() > 100) {
            System.out.println("Last name too long (>100)");
        } else {
            this.lastName = lastName;
        }
    }

    public String getLastName() {
        return lastName;
    }

}