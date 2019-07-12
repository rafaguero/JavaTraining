package ocpjp8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
    public static void main(String[] args) {
        long N = 72;
        Callable<Long> task = new Factorial(N);
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Long> future = es.submit(task);
        try {
            System.out.printf("factorial of %d is %d", N, future.get());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

class Factorial implements Callable<Long> {
    long n;
    public Factorial(long n){
        this.n = n;
    }
    public Long call() throws Exception {
        if(n<0) {
            throw new Exception("for finding factorial n should be > 0");
        }
        long fact = 1;
        for(long longVal = 1; longVal <=n;longVal++){
            fact *=longVal;
        }
        return fact;
    }

}