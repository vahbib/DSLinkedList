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
    public Node temp= null;

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

    public static void main(String[] args) {

        Linkedlist List = new Linkedlist();
        List.addNode(70);
        List.addNode(30);
        List.addNode(56);
    }
}