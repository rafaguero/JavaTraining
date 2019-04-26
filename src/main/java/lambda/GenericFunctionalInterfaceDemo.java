package lambda;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args){
        //this lambda expression determines if one integer is a factor of another.
        SomeTest<Integer> isFactor = (n,d) -> (n%d) == 0;
        if (isFactor.test(10,2))
            System.out.println("2 is a factor of 10");
    }
}
