package lambda;

public class LambdaDemo3 {

    public static void main(String[] args) {
        StringTest strEqual = (n, m) -> n.equals(m);
        if (strEqual.areStringsEqual("Hello","Hello"))
            System.out.println("The strings are equal ");
    }

}
