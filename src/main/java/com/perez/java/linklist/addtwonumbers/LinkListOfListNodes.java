package com.perez.java.linklist.addtwonumbers;

public class LinkListOfListNodes {

    ListNode top;

    public LinkListOfListNodes(ListNode top) {
        this.top = top;
    }

    public void addListNode(ListNode listNode){
        if (top != null) {
            listNode.setNext(top);
        }
        top = listNode;
    }

    public int getListSize(){
        int counter=0;
        ListNode traverse;
        traverse = top;
        while (traverse !=null){
            counter++;
            traverse = traverse.getNext();
        }
        return counter;
    }

    public void print(){
        ListNode traverse;
        traverse = top;

        while (traverse != null){
            System.out.println(traverse.getVal());
            traverse = traverse.getNext();
        }
    }

    public int getIntValueOfList(){
        int size=getListSize();
        int times=1;
        int counter;
        int val=0;
        ListNode traverse = top;
        while (traverse!=null){
            val = val + traverse.getVal() * times;
            times = times*10;
            traverse = traverse.getNext();
        }
        System.out.println("the traverse value is " + val);
        return val;
    }

}
