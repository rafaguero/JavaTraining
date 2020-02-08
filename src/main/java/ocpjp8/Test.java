package ocpjp8;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}
enum Season {
    WINTER,SPRING,SUMMER,FALL
}
public class Test {
    public static void main(String[] args) {
        Season s = Season.WINTER;
        System.out.println(s
        );

    }

}