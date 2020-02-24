/*
Created By:Nandinee Gupta
date:feb-24-2020
time:8:00 pm
 */

package phoneList;
import Helper.LinkedList1;
import Person.Person;

import java.util.LinkedList;
import java.util.Scanner;

public class Tasks {

    Scanner scanner = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();

    public void addContact(LinkedList1 linkedList1) {
        System.out.println("You have chosen to add a new contact:");
        String f_name, l_name, choiceA="y", Email = "null", choice2="y";
        long[] no=new long[2];

        System.out.println("Person enter the name of the Person");
        System.out.print("First Name: ");
        f_name = scanner.nextLine();
        System.out.print("Last Name: ");
        l_name = scanner.nextLine();
        System.out.print("Contact Number: ");
        for(int i=0;i<1;i++){
            no[i]= scanner.nextLong();
        }
        scanner.nextLine();
        System.out.println("Would you like to add another contact number?(y/n)");
        choiceA = scanner.nextLine();

        if(choiceA.equals("y")){
            for(int i=1;i<2;i++){

                no[i]= scanner.nextLong();
                break;
            }
        }
        System.out.println();
        scanner.nextLine();
        System.out.println("Would you like to add Email address?(y/n)");

        choice2 = scanner.nextLine();
        while (true) {
            if (choice2.equals("y")) {
                System.out.print("Email address: ");
                Email = scanner.nextLine();
                break;
            } else {
                break;
            }
        }

    }


    public void viewcontact(LinkedList1 linkedList1) {
        System.out.println("---Here are all your contacts---");
        if (!linkedList1.isEmpty()) {
            linkedList1.display();
        } else {
            System.out.println("NO results found");
        }

    }


    public void deleteContact(LinkedList1 linkedList1) {
        if (!linkedList1.isEmpty()) {
            System.out.println("Here are all the contacts: Press the number against" +
                    " to delete the contact.");
            linkedList1.displayOne();
            int choice = scanner.nextInt();
            scanner.nextLine();
            linkedList1.deleteNode(choice);
            linkedList1.displayOne();
            System.out.println("Deleted..!!");
        } else {
            System.out.println("No Contacts.You must need to add contacts Before you could delete..");
        }

    }

    public void searchContact(LinkedList1 linkedList1) {
        System.out.println("You could search for a contact from their first names: ");
        String firstName = scanner.nextLine().trim();
        if (linkedList1.indexOf(firstName) >= 0) {
            System.out.println("Match found");
            linkedList1.getNode(linkedList1.indexOf(firstName));
        } else {
            System.out.println("No match found");
        }

    }

}

