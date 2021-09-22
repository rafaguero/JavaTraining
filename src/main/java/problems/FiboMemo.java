package problems;

import java.util.HashMap;
import java.util.Map;

public class FiboMemo {
    private Map<Long,Long>interimResults = new HashMap<>();
    public Long getFibo(Long n){
        if (n <= 2){
            return 1L;
        }
        if (interimResults.containsKey(n)){
            return interimResults.get(n);
        }else {
            interimResults.put(n,getFibo(n-1)+getFibo(n-2));
        }
        return getFibo(n-1) + getFibo(n - 2);
    }

    public static void main(String[] args) {
        FiboMemo fiboMemo = new FiboMemo();
        Long n = 50L;
        Long result = fiboMemo.getFibo(n);
        System.out.format("fibo of %s is %s",n,result);
    }
}
