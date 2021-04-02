package com.perez.java.linkedlist;

public class EmployeeLinkedList {

    EmployeeNode head;

    public EmployeeLinkedList(Employee employee) {
       EmployeeNode employeeNode = new EmployeeNode(employee);
       head = employeeNode;

    }

    public void addEmployee(Employee employee){
        System.out.println("head contains " + head);
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;


    }

    public void printLinkedList(){
        EmployeeNode employeeNode = head;
        System.out.print("Head --> ");
        while (employeeNode.getNext()!= null ){
            System.out.print(employeeNode.getEmployee().toString());
            employeeNode = employeeNode.getNext();

        }
        System.out.println(" -- end");
    }


}
