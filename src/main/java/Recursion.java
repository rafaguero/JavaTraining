public class Recursion {

    public static void main(String[] args){

        Recursion recursion = new Recursion();
        int i = 4;
        System.out.println(recursion.doRecursion(i));
    }

    public int doRecursion(int i){
        if (i == 1){
            return i;
        }else {
            return i * doRecursion(i - 1);
        }
    }
}
