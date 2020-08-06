package com.whocares.shimmy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean shouldFinish = false;

    public static void main(String[] args) {
        //App simulates phone's contacts and messages
        Phone shimmyPhone = new Phone(
                "LG G5",
                "Shimmy",
                new ArrayList<>());

        //obsługa UI

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
                "\n\t 3. Quit");
    }

    public static void displayManageContactsMenu() {
        System.out.println("Options:" +
                "\n\t 1. Show all contacts" +
                "\n\t 2. Add a new contact" +
                "\n\t 3. Search for a contact" +
                "\n\t 4. Delete a contact" +
                "\n\t 5. Go back to the previous menu");

    }
    public static void handleMainMenu(Phone phone, Scanner scanner){
        displayMainMenu(phone);
        String choice = scanner.next();
        switch (choice) {
            case "1":
                handleManageContactsMenu(phone, scanner);
                break;

            case "2":

                break;
            default:
                shouldFinish = true;
        }
    }
    public static void handleManageContactsMenu(Phone phone, Scanner scanner) {
        displayManageContactsMenu();
        String choice = scanner.next();
        switch (choice){
            case "1":
                phone.showAllContacts();

                break;
            case "2":
                phone.addNewContact("Seba", 666777888, "sztan@zapiecem.com");
                break;
        }
    }
}


