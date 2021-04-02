package com.perez.java.stack;

import java.util.EmptyStackException;

public class ArrayStack {
    Employee[] myStack = new Employee[10];
    int top;
    int size = 10;

    public void pushToStack(Employee employee){
        if ( top >= myStack.length){
            Employee[] newStack = new Employee[2*myStack.length];
            System.arraycopy(myStack,0,newStack,0,myStack.length);
            myStack = newStack;
        }
        myStack[top++] = employee;
    }

    public Employee popFromStock(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = myStack[--top];
        myStack[top] = null;
        return employee;
    }

    public Employee peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        Employee employee = myStack[top-1];
        return employee;
    }
    public boolean isEmpty(){
        return top == 0;
    }

}
