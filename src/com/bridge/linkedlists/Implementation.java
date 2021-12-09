package com.bridge.linkedlists;

import java.util.Scanner;


public class Implementation {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Scanner c = new Scanner(System.in);
        int ch;
        System.out.println("To add data to list enter 1 \nTo add data to at front of list enter 2\n" +
                "To add data to at rear of list enter 3\n" + "To add data at middle of list enter 4\n" +
                "To delete data from front enter 5\n" + "To delete at end of the list enter 6\n" +
                "To search the value 30 enter 7\n" + "To add data next to middle element enter 8\n"+
                "To add data next to 30 element enter 9\n");
        ch = c.nextInt();
        switch (ch) {
            case 1:
                list.insert(56);
                list.insert(30);
                list.insert(70);
                list.show();
                break;
            case 2:
                list.insert(70);
                System.out.println("List before adding element at start");
                list.show();
                list.insertAtStart(30);
                list.insertAtStart(56);
                System.out.println("\nList after adding element at start");
                list.show();
                break;
            case 3:
                list.insert(56);
                System.out.println("List before adding element at end");
                list.show();
                list.append(30);
                list.append(70);
                System.out.println("\nList after adding element at end");
                list.show();
                break;
            case 4:
                list.insert(56);
                list.insert(70);
                System.out.println("List before adding element at middle");
                list.show();
                list.insertAtMiddle(30);
                System.out.println("\nList before adding element at middle");
                list.show();
                break;
            case 5:
                list.insert(56);
                list.insert(30);
                list.insert(70);
                System.out.println("List before deleting from front");
                list.show();
                list.deleteAtFront();
                System.out.println("\nList after deleting from front");
                list.show();
                break;
            case 6:
                list.insert(56);
                list.insert(30);
                list.insert(70);
                System.out.println("List before deleting from end");
                list.show();
                list.deleteAtEnd();
                System.out.println("\nList after deleting from end");
                list.show();
                break;
            case 7:
                list.insert(56);
                list.insert(30);
                list.insert(70);
                list.search(30);
                list.show();
                break;
            case 8:
                list.insert(56);
                list.insert(30);
                list.insert(70);
                System.out.println("List before inserting");
                list.show();
                list.insertAfter(30, 40);
                System.out.println("\nList after inserting");
                list.show();
                break;
            case 9:
                list.insert(56);
                list.insert(30);
                list.insert(70);
                list.insertAfter(30, 40);
                System.out.println("List before deleting");
                list.show();
                System.out.println("\nList after deleting");
                list.deleteAfter(30);
                list.show();
                list.size();

                break;
            default:
        }
    }
}

