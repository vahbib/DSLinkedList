package com.day16.linkedlist;


public class Linkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node temp= null;
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

    public void display()
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

        Linkedlist List = new Linkedlist();
        List.append(70);
        List.append(30);
        List.append(56);
        List.display();
    }
}