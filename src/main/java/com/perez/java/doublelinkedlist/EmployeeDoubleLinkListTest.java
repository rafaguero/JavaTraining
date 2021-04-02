package com.perez.java.doublelinkedlist;


public class EmployeeDoubleLinkListTest {
    public static void main(String[] args) {
        Employee employee = new Employee("john","Doe",1);
        Employee employee1 = new Employee("juan","Doe",2);
        Employee employee2 = new Employee("Peter","Lopez",3);
        Employee employee3 = new Employee("George","Lopez",4);
        Employee employee4 = new Employee("Jesus","Martinez",0);

        EmployeeDoubleLinkedList employeeLinkedList = new EmployeeDoubleLinkedList();
        employeeLinkedList.addEmployee(employee);
        employeeLinkedList.addEmployee(employee1);
        employeeLinkedList.addEmployee(employee2);
        employeeLinkedList.addEmployee(employee3);
        employeeLinkedList.addToBack(employee4);

        employeeLinkedList.printLinkedList();


    }
}
