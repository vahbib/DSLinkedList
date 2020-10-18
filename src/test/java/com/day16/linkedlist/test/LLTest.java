package com.day16.linkedlist.test;

import com.day16.linkedlist.Linkedlist;
import org.junit.Assert;
import org.junit.Test;

public class LLTest {

    @Test
    public void testLinkedList() {
        // Code Here
        Linkedlist list=new Linkedlist();
        list.addNode(30);
        list.addNode(56);
        list.addNode(70);
        list.display(list.head);
        int pos=list.Insert(list.head,56);
        System.out.println("Pos is: "+pos);
        list.head=list.InsertPosition(list.head,pos,40);
        list.display(list.head);

    }

}
