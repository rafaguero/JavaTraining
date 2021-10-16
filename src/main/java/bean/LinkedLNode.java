package bean;

public class LinkedLNode {
    int data;
    LinkedLNode next;
    public LinkedLNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedLNode getNext() {
        return next;
    }

    public void setNext(LinkedLNode next) {
        this.next = next;
    }
}
