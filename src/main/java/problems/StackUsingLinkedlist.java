package problems;

import static java.lang.System.exit;

public class StackUsingLinkedlist {

    // A linked list node
    private class Node {

        int data; // integer data
        Node link; // reference variable Node type
        Node (int x){
            data = x;
        }
        int getData(){
            return data;
        }
    }
    Node top;
    StackUsingLinkedlist()
    {
        top = null;
    }
    public void push(int x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node(x);
        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }
    public boolean isEmpty()
    {
        return top == null;
    }
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.getData();
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).link;
    }
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        // print Stack elements
        obj.display();

        // pritn Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());

        // Delete top element of Stack
        obj.pop();
        obj.pop();

        // print Stack elements
        obj.display();

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());

    }
}
