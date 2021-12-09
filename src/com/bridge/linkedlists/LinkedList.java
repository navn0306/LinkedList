package com.bridge.linkedlists;

public class LinkedList {
    public Node third;
    Node head, second;

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

    public void deleteAtEnd() {
        if (head != null) {
            Node current = head;

            if (current.next == null) {
                head = current.next;
            } else {
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public boolean search(int data) {
        if (head == null) {
            System.out.println("Value not found");
            return false;
        }
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Value found");
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void insertAfter(int data, int nextNode) {
        Node newNode = new Node(nextNode);
        if (head == null) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Value found");
                newNode.next = current.next;
                current.next = newNode;
            }
            current = current.next;
        }
    }

    public void deleteAfter(int data) {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                Node newNode = current.next;
                current.next = newNode.next;
            }
            current = current.next;
        }
    }

    public int size() {
        int count=0;
        if (head == null) {
            return 0;
        } else {
            while (head != null) {
                count++;
                head = head.next;
            }
            System.out.println("\nSize of the list is : "+count);
        }
        return count;
    }
}
















