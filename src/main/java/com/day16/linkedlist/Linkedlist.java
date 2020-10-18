package com.day16.linkedlist;


public class Linkedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node temp = null;

    // UserCase 1
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
        }
        else {
            temp.next = newNode;
        }
        temp = newNode;
    }
    // UserCase 2
    public void addAtStart(int data) {

        Node newNode = new Node(data);
        if (head == null) {

            head = newNode;
            temp =newNode;
        }
        else
        {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }
    // UserCase 3
    public void append(int data) {

        Node newNode = new Node(data);
        if (head == null) {

            head = newNode;
            temp =newNode;
        }
        else
        {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    static Node GetNode(int data) {
        return new Node(data);
    }
    /* UC 5 :
     *delete first element
     */
    static Node deleteFirst(Node head)
    {
        if (head == null)
            return null;

        Node temp = head;
        head = head.next;

        return head;
    }
    /* UC 5 :
     *delete last element
     */
    static Node deleteLast(Node head)
    {
        if (head == null)
            return null;

        if (head.next == null) {
            return null;
        }
        Node secLast = head;
        while (secLast.next.next != null)
            secLast = secLast.next;

        // Change next of second last
        secLast.next = null;

        return head;
    }
    /* UC 4 :
     *Insert at given position
     */

    static Node InsertPosition(Node headNode, int position, int data) {
        Node head = headNode;
        if (position < 1)
            System.out.print("Invalid position");

        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = headNode;
            head = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    Node newNode = GetNode(data);
                    newNode.next = headNode.next;
                    headNode.next = newNode;
                    break;
                }
                headNode = headNode.next;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        return head;
    }

    public static void display(Node head)
    {
        Node n = head;
        if (head == null) {
            System.out.println("Oops!! Nothing in list");
            return;
        }
        while (n != null)
        {
            System.out.print("["+n.data + "]-");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = GetNode(56);
        head.next = GetNode(30);
        head.next.next = GetNode(70);

        System.out.print("Before: ");
        display(head);
        System.out.print("After: ");
        head = deleteLast(head);
        display(head);


    }
}