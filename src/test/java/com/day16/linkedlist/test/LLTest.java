package com.day16.linkedlist.test;

import com.day16.linkedlist.Linkedlist;
import org.junit.Assert;
import org.junit.Test;

public class LLTest {
    /* UC 7 :
     *search element Test JUnit
     */
    @Test
    public void searchListTest() {
        // Code Here
        Linkedlist list=new Linkedlist();
        list.addNode(30);
        list.addNode(56);
        list.addNode(70);
//        list.display(list.head);
        Assert.assertTrue(list.searchList(list.head,30));

    }

}
