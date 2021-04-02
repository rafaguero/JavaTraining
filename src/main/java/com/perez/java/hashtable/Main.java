package com.perez.java.hashtable;

import com.perez.java.hashtable.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("john","Doe",1);
        Employee employee1 = new Employee("juan","Marcia",2);
        Employee employee2 = new Employee("Peter","Lopez",3);
        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Doe",employee);
        ht.put("Marcia",employee1);
        ht.put("Lopez",employee2);

        Employee tempEmp = ht.get("Lopez");

        ht.printHashTable();
        System.out.println("the temp emp is " + tempEmp);

    }
}
