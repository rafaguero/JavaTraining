package com.perez.java.linklist.addtwonumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        LinkListOfListNodes linkListOfListNodes = new LinkListOfListNodes(listNode);
        ListNode listNode1 = new ListNode(4);
        linkListOfListNodes.addListNode(listNode1);
        ListNode listNode2 = new ListNode(2);
        linkListOfListNodes.addListNode(listNode2);
        linkListOfListNodes.print();
        System.out.println("the list size is " + linkListOfListNodes.getListSize());

        LinkListOfListNodes linkListOfListNodes2 = new LinkListOfListNodes(new ListNode(4));
        linkListOfListNodes2.addListNode(new ListNode(6));
        linkListOfListNodes2.addListNode(new ListNode(5));
        int totVal2 = linkListOfListNodes2.getIntValueOfList();
        System.out.println("totVal2 " + totVal2);
        int totVal = linkListOfListNodes.getIntValueOfList();
        addTwoNumbers(linkListOfListNodes,linkListOfListNodes2);
        System.out.println("tot  val is " + totVal);
        int digit=0;

        while(totVal > 0)
        {
            digit = totVal % 10;
            System.out.println("Digit at place is: " + digit);
            totVal = totVal / 10;

        }
        LinkListOfListNodes temp = addTwoNumbers(linkListOfListNodes,linkListOfListNodes2);
        System.out.println("printing temp ");
        temp.print();

    }
    static public LinkListOfListNodes addTwoNumbers(LinkListOfListNodes l1,LinkListOfListNodes l2){
        int totVal1 = l1.getIntValueOfList();
        int totVal2 = l2.getIntValueOfList();
        System.out.println("totval1 is " + totVal1);
        System.out.println("totval2 is " + totVal2);
        int totVal = totVal1 + totVal2;
        LinkListOfListNodes linkListOfListNodes = new LinkListOfListNodes(null);
        List<Integer> myList = new ArrayList<>();

        while (totVal > 0){
            int digit = totVal % 10;
            myList.add(digit);
            totVal = totVal/10;
        }
        for (int i =myList.size()-1; i>=0;i--){
            System.out.println("my list has " + myList.get(i));
            linkListOfListNodes.addListNode(new ListNode(myList.get(i)));
        }
        return linkListOfListNodes;
    }
}
