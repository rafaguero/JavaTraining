import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsDemo {

    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4,5,6,7,8));

        //Get the union of both sets
        //set1.addAll(set2);
        //System.out.println("The union of both sets is " + set1.toString());

        //the interception of both sets is
       // set1.retainAll(set2);
       // System.out.println("The interception of both sets is " + set1.toString());
        //the difference of both sets is
        set1.removeAll(set2);
        System.out.println("The difference between both sets is " + set1.toString());
    }
}
