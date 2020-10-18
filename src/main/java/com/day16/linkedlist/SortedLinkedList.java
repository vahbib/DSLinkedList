package com.day16.linkedlist;

public class SortedLinkedList<E extends Comparable<E>> {

    private static class Node<E extends Comparable<E>>
    {
        public E data;
        public Node<E> next;

        public Node( E i) {
            data = i;
            next = null;
        }
    }
    public Node<E> head;
    public Node<E> temp;


    protected SortedLinkedList() {
        head = null;
        temp = null;
    }
    public void add(E data) {

        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        }
        else if (data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        }
        else{
            Node<E> curr = head.next;
            Node<E> prev = head;
            while (curr != null) {
                if (data.compareTo(curr.data) < 0) {
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    public void display()
    {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null)
        {
            System.out.print( "["+current.data + "]-");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        SortedLinkedList list=new SortedLinkedList();
        list.add(30);
        list.add(111);
        list.add(5);
        list.add(65);
        list.display();
    }


}
