package com.bridge.linkedlists;

import java.util.Scanner;


public class Implementation {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Scanner c = new Scanner(System.in);
        int ch;
        System.out.println("To add data to list enter 1 \nTo add data to at front of list enter 2\n" +
                "To add data to at rear of list enter 3\n"+"To add data at middle of list enter 4\n");
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
                list.insertAtStart(30);
                list.insertAtStart(56);
                list.show();
                break;
            case 3:
                list.insert(56);
                list.append(30);
                list.append(70);
                list.show();
            case 4:
                list.insert(56);
                list.insert(70);
                list.insertAtMiddle(30);
                list.show();

            default:

        }


    }
}

