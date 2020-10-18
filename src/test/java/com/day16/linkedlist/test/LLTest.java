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
        list.addNode(40);
        list.addNode(56);
        list.addNode(70);
        list.display(list.head);
        int total1=list.length();
        System.out.println("List Length: "+total1);

        list.head=list.removeValue(list.head,40);
        list.display(list.head);
        int total2=list.length();
        System.out.println("List Length: "+total2);
        Assert.assertEquals(3,total2);
    }

}
