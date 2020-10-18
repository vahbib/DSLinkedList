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
    /* UC 8 :
     *Insert element
     */

    public static int Insert(Node head, int data) {
        if (head == null)
            return 0;

        if (head.data == data) {
            return 1;
        }
        int c = 1;
        Node secLast = head;
        while (secLast.next != null) {
            c += 1;
            if (secLast.next.data == data)
                return c;
            secLast = secLast.next;
        }

        return 0;
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

    /* UC 7 :
     *search element
     */
    public static boolean searchList(Node head, int data)
    {
        if (head == null)
            return false;

        if (head.data==data) {
            return true;
        }
        Node secLast = head;
        while (secLast.next!= null) {
            if (secLast.next.data == data)
                return true;
            secLast = secLast.next;
        }

        return false;
    }
    /* UC 4 :
     *Insert at given position
     */

    public static Node InsertPosition(Node headNode, int position, int data) {
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
                System.out.print("\nPosition out of range");
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
    // UserCase 9
    public int length()
    {
        Node temp=head;
        int c = 0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        return c;
    }
    public static Node removeValue(Node head, int value)
    {
        Node prev=head;
        Node curr=head;
        if (head == null)
            return null;

        if (head.data == value) {
            head=curr.next;
            return head;
        }
        while (prev.next != null)
        {
            if (prev.next.data == value)
            {
                curr = prev.next.next;
                prev.next = curr;
                return head;
            }
            prev=prev.next;
        }
        return head;
    }


    public static void main(String[] args) {

//        Node head = GetNode(56);
//        head.next = GetNode(30);
//        head.next.next = GetNode(70);
//
//        System.out.print("Before: ");
//        display(head);
//        System.out.print("After: ");
//        head = deleteLast(head);
//        display(head);


    }
}