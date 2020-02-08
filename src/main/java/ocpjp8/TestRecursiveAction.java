package ocpjp8;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class TestRecursiveAction {
    public static void main(String[] args) {
        Adder adder = new Adder(1,20);
        ForkJoinPool pool = new ForkJoinPool(4);
        pool.invoke(adder);
        System.out.println(adder.total);
    }
}
class Adder extends RecursiveAction {
    private int from;
    private int to;
    int total=0;
    Adder(int from, int to){
        this.from =from;
        this.to =to;
    }
    @Override
    protected void compute()
    {
        if ((to - from)<= 4){
            int sum = 0;
            for(int i = from; i <= to; i++){
                sum += i;
            }
            total += sum;
        }else {
            int mid = (from+to) / 2;
            Adder first = new Adder(from,mid);
            Adder second = new Adder(mid+1, to);
            invokeAll(first,second);
            total = first.total + second.total;
        }
    }
}
