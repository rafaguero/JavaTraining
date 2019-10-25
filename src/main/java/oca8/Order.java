package oca8;


import java.time.LocalDate;

public class Order {

    private static void m1() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            m1();
        } finally {
            System.out.println("A");
        }
    }
}
