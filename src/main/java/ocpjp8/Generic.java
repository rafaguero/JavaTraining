package ocpjp8;

import static java.lang.System.*;

public class Generic {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 4 / x-- + --x;
        out.println("x + y is = " + (x+y));
        String _4 = "hello";
    }
}
