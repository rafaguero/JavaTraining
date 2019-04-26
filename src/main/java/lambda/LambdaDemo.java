package lambda;

public class LambdaDemo {
    public static void main(String[] args){
        MyValue myValue;
        myValue = () -> 98.6;
        System.out.println("A constant value is " + myValue.getValue());
        MyParamValue myParamValue = (n) -> 1.0/n;
        System.out.println("The inverse of 4 is " + myParamValue.getValue(4));

    }
}
