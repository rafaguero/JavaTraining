package problems;

public class ThreadsExample {

    public static void main(String[] args) {

        Thread test = new Thread(()-> System.out.println("This is a test"));

        test.run();
        Runnable r = () -> System.out.println(
                "lambda expression implementing the run method");
        new Thread(r).start();
    }

}
