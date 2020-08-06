package com.whocares.shimmy;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    private String model;
    private String owner;
    private ArrayList<Contact> contactArrayList;

    public Phone(String model, String owner, ArrayList<Contact> contactArrayList) {
        this.model = model;
        this.owner = owner;
        this.contactArrayList = contactArrayList;
    }



    public void addNewContact(String name, long number, String email) {
        contactArrayList.add(new Contact(name, number, email, new ArrayList<>()));
    }

    // TODO: what if in my ContactArrayList is more objects with the same name?
    //  get getContactArrayList() vs ContactArrayList
    public Contact searchForContact(String query) {
        for (Contact c : getContactArrayList()) {
            if (c.getName().equals(query))
                return c;
        }
        return null;
    }

    public void deleteContact(String trash) {
        contactArrayList.remove(searchForContact(trash));
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Contact> getContactArrayList() {
        return contactArrayList;
    }

    public void setContactArrayList(ArrayList<Contact> contactArrayList) {
        this.contactArrayList = contactArrayList;
    }
}
