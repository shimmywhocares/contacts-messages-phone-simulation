package com.whocares.shimmy;

import java.util.ArrayList;

//5:01:00
/** Options:
 *      1. Show all contacts
 *      2. Add a new contact
 *      3. Search for a contact
 *      4. Delete a contact
 *      5. Go back to the previous menu
 */

public class Contact {
    private String name;
    private long number;
    private String email;
    private ArrayList<Message> messageArrayList;


    public Contact(String name, long number, String email, ArrayList<Message> messageArrayList) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.messageArrayList = messageArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Message> getMessageArrayList() {
        return messageArrayList;
    }

    public void setMessageArrayList(ArrayList<Message> messageArrayList) {
        this.messageArrayList = messageArrayList;
    }
}
