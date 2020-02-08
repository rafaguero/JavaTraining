package ocpjp8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> c = new Callable<String>() {
            private int counter;
            @Override
            public String call() throws Exception {
                try {
                    counter++;
                    Thread.sleep(3000);
                }catch(InterruptedException e){}
                return "Hello" + counter;
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(10);
        List<Callable<String>> list = Arrays.asList(c,c,c,c,c);
        List<Future<String>> futures = es.invokeAll(list);
        System.out.println(futures.size());
        for (Future<String> s : futures){
            System.out.println(s.get());

        }
        es.shutdown();
    }
}

