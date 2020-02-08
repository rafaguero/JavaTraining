package ocpjp8;
public class TestPaths {
    class MyException extends RuntimeException {}

    class YourException extends RuntimeException {}
    public static void main(String[] args) {
        try {
            System.out.println("testing");
            throw new Exception();
        } catch (MyException | YourException e2) {
            System.out.println("Caught");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}