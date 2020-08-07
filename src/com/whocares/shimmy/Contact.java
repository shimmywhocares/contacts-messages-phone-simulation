package com.whocares.shimmy;

import java.util.ArrayList;

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


//    public void showMessages(String name){
//        for (Message m : getMessageArrayList()) {
//            System.out.println(m.getSender() + ", " + m.getText() );
//        }
//    }

    public void youGetSMS(String sender, String text){
        this.messageArrayList.add(new Message(sender, "Me", text));
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
