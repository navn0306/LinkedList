package com.bridge.linkedlists;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + "--> ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node(data);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void append(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insertAtMiddle(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node slow, fast;
            slow = fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            node.next = slow.next;
            slow.next = node;
        }
    }

    public void deleteAtFront() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Node is Empty");
        }
    }

}