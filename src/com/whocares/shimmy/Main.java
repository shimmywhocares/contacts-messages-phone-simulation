package com.whocares.shimmy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean shouldFinish = false;
    static boolean shouldFinishInner = false;

    public static void main(String[] args) {
        //App simulates phone's contacts and messages
        //UI handling
        Phone shimmyPhone = new Phone(
                "LG G5",
                "Shimmy",
                new ArrayList<>());


        Scanner scanner = new Scanner(System.in);

        while (!shouldFinish) {
            handleMainMenu(shimmyPhone, scanner);
        }

    }

    public static void displayMainMenu(Phone phone) {
        System.out.println("Hello " + phone.getOwner() + "!");
        System.out.println("Tell me what you want to do: " +
                "\n\t 1. Manage contacts" +
                "\n\t 2. Messages" +
                "\n\t ANY. Quit");
    }

    public static void displayManageContactsMenu() {
        System.out.println("Options:" +
                "\n\t 1. Show all contacts" +
                "\n\t 2. Add a new contact" +
                "\n\t 3. Search for a contact" +
                "\n\t 4. Delete a contact" +
                "\n\t ANY. Go back to the previous menu");
    }

    public static void displayManageMessagesMenu() {
        System.out.println("Options:" +
                "\n\t 1. See the list of all messages" +
                "\n\t 2. Send a new message" +
                "\n\t ANY. Go back to the previous menu");
    }

    public static void handleMainMenu(Phone phone, Scanner scanner) {
        displayMainMenu(phone);
        String choice = scanner.next();
        switch (choice) {
            case "1":
                while (!shouldFinishInner) {
                    handleManageContactsMenu(phone, scanner);
                }
                shouldFinishInner = false;
                break;

            case "2":
                while (!shouldFinishInner) {
                    handleManageMessagesMenu(phone, scanner);
                }
                shouldFinishInner = false;
                break;

            default:
                shouldFinish = true;
        }
    }

    public static void handleManageContactsMenu(Phone phone, Scanner scanner) {
        displayManageContactsMenu();
        String choice = scanner.next();
        switch (choice) {
            case "1":
                showAllContacts(phone);
                break;
            case "2":
                // here I had a short wondering - can I get past declaratione of variables here
                phone.addNewContact("Seba", 777066601, "mlodyszatan@lubieplacki.com");

                long number;
                String email;


                System.out.print("New Contact " + "\n\t Name: ");
                String name = readString();
                System.out.print("\t Number: ");
//                TODO: while(number != long){
//
//            }
                number = scanner.nextInt();
                System.out.print("\t e-mail: ");
                email = scanner.next();

                phone.addNewContact(name, number, email);
                break;
            case "3":
                System.out.print("Type who you searching for: ");
                String query;
                query = readString();
                System.out.println(phone.searchForContact(query).getName()  + ", " +
                        phone.searchForContact(query).getNumber() + ", " +
                        phone.searchForContact(query).getEmail());
                break;
            case "4":
                System.out.print("Type who you want to delete: ");
                String trash;
                trash = scanner.next();
                phone.deleteContact(trash);
                break;
            default:
                shouldFinishInner = true;
        }
    }

    public static void handleManageMessagesMenu(Phone phone, Scanner scanner) {
        displayManageMessagesMenu();
        String choice = scanner.next();
        switch (choice) {
            case "1":

                break;

            case "2":
                break;

            default:
                shouldFinishInner = true;
        }
    }

    //TODO: Add an alphabetic sorting
    public static void showAllContacts(Phone phone) {
        if (phone.getContactArrayList().isEmpty()) {
            System.out.println("You don't have any contacts. SmutnaŻaba.jpg \n");
        }
        for (Contact c : phone.getContactArrayList()) {
            System.out.println(c.getName() + ", " + c.getNumber() + ", " + c.getEmail());
        }
    }
    private static String readString()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}




