import java.util.stream.Stream;

public class Recursion {

    public static void main(String[] args) {


    }

    public int search(Integer n, Integer[] list) {

        for(int i = 0; i < list.length; i++){
            if (list[i].equals(n)){
                return i;
            }
        }
        return -1;

    }
}
