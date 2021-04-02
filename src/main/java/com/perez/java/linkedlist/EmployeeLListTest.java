package com.perez.java.linkedlist;

public class EmployeeLListTest {
    public static void main(String[] args) {
        Employee employee = new Employee("john","Doe",1);
        Employee employee1 = new Employee("juan","Doe",2);
        Employee employee2 = new Employee("Peter","Lopez",3);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList(employee);
        employeeLinkedList.addEmployee(employee1);
        employeeLinkedList.addEmployee(employee2);
        employeeLinkedList.printLinkedList();


    }
}
