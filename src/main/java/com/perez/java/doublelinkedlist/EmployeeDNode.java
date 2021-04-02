package com.perez.java.doublelinkedlist;

public class EmployeeDNode {
    private Employee employee;
    private EmployeeDNode next;
    private EmployeeDNode prev;

    public EmployeeDNode(Employee employee) {
        this.employee = employee;

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDNode getNext() {
        return next;
    }

    public void setNext(EmployeeDNode next) {
        this.next = next;
    }

    public EmployeeDNode getPrev() {
        return prev;
    }

    public void setPrev(EmployeeDNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "EmployeeDNode{" +
                "employee=" + employee.toString() +
                '}';
    }
}
