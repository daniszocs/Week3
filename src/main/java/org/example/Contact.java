package org.example;

public class Contact {

    String s;
    String phone_number;
    String first_name;
    String last_name;

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setFirst_name(String first_name) {
        // *  max number of characters - 100
        if (first_name.length() > 100) {
            System.out.println("First name too long (>100)");
        } else {
            this.first_name = first_name;
        }
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setLast_name(String last_name) {
        // *  max number of characters - 100
        if (last_name.length() > 100) {
            System.out.println("Last name too long (>100)");
        } else {
            this.last_name = last_name;
        }
    }

    public String getLast_name() {
        return last_name;
    }

}