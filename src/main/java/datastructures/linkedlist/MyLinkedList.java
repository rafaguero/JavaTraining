package datastructures.linkedlist;

import bean.LinkedLNode;

public class MyLinkedList {
    LinkedLNode first;
    LinkedLNode last;


    public void addFirst(LinkedLNode node) {
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first = node;
        }
    }

    public void addLast(LinkedLNode node) {
        if (last == null) {
            last = node;
            first = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public void deleteFirst() {
        LinkedLNode temp = first;
        first = first.getNext();
        temp.setNext(null);
    }

    public void deleteLast() {
        LinkedLNode temp = first;
        while (temp.getNext() != last) {
            temp = temp.getNext();
        }
        last = temp;
        last.setNext(null);
    }
    public boolean contains(int data){
        LinkedLNode temp = first;
        while ( temp != last){
            if (temp.getData() == data){
                return true;
            }else {
                temp = temp.getNext();
            }
        }
        return false;
    }
    public int indexOf(int data){
        int counter = 0;
        LinkedLNode temp = first;
        while (temp != last){
            if (temp.getData() == data){
                return counter;
            }else {
                temp = temp.getNext();
                counter++;
            }
        }
        return -1;
    }
    public void printLinkedList(){
        LinkedLNode temp = first;
        while (temp != last){
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
        }
        System.out.println(temp.getData() );
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        LinkedLNode node1 = new LinkedLNode(5);
        LinkedLNode node2 = new LinkedLNode(8);
        LinkedLNode node3 = new LinkedLNode(10);
        LinkedLNode node4 = new LinkedLNode(15);
        LinkedLNode node5 = new LinkedLNode(20);
        myLinkedList.addFirst(node1);
        myLinkedList.addLast(node2);
        myLinkedList.addLast(node3);
        myLinkedList.addLast(node4);
        myLinkedList.addLast(node5);
        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.indexOf(10));
        myLinkedList.printLinkedList();
    }
}
