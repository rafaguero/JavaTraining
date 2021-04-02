package com.perez.java.doublelinkedlist;

import com.perez.java.doublelinkedlist.Employee;


public class EmployeeDoubleLinkedList {

    EmployeeDNode head;
    EmployeeDNode tail;


    public void addEmployee(Employee employee){
        System.out.println("head contains " + head);
        System.out.println("tail contains " + tail);

        EmployeeDNode employeeDNode = new EmployeeDNode(employee);
        if (head == null){
            tail = employeeDNode;
        }else {
            employeeDNode.setPrev(head);
        }

        head = employeeDNode;

    }

    public void addToBack(Employee employee){
        EmployeeDNode employeeDNode = new EmployeeDNode(employee);
        employeeDNode.setNext(tail);
        tail = employeeDNode;

    }

    public void printLinkedList(){
        EmployeeDNode employeeNode = head;
        System.out.print("Head --> ");
        while (employeeNode != null ){
            System.out.print(employeeNode.toString());
            employeeNode = employeeNode.getPrev();

        }
        System.out.println(" -- end");
    }


}
