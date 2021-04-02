package com.perez.java.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Employee> myStack = new Stack<Employee>();
        Employee employee0 = new Employee("Jose","Smith",0);
        Employee employee1 = new Employee("Joe","Smith",1);
        Employee employee2 = new Employee("Maria","DB",2);
        myStack.push(employee0);
        myStack.push(employee1);
        myStack.push(employee2);
        Iterator iter = myStack.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
