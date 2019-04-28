package problems;

import org.junit.Test;

public class GenericTest {

    public int getFibo(int n){
        if (n== 0)
            return 0;
        if (n==1)
            return 1;
        else
            return getFibo(n-1) + getFibo(n-2);

    }

    public int getGCD(int p, int q) {
        if (q == 0) {
            return p;
        }
        return getGCD(q, p % q);
    }
/*
Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilo each), write a method
that returns true if it is possible to make a package with goal kilos of rice.
*/
public Boolean packageRice(Integer big, Integer small, Integer goal) {

    if ( big * small*5 >= goal)
        return true;
    else
        return false;



}

    @Test
    public void testFibo(){
        System.out.println(10%15);
        GenericTest genericTest = new GenericTest();
        int fibo = genericTest.getFibo(10);
        System.out.println("the fibo of 10 is " + fibo);
        System.out.println("The GCD of 10 & 15 is " + genericTest.getGCD(10,15));

        System.out.println("rice packages goal is " + 12 + "small is 2 big is 2 result " + genericTest.packageRice(5,3,24) );

    }
}
