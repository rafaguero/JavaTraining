package ocpjp8;

import java.util.concurrent.Executor;

public class ExecutorTest {
    public static void main(String[] args) {
        Runnable runnable = new Task();
        System.out.println("Calling Task.run() by directly creating thread");
        Thread thread = new Thread(runnable);
        thread.start();
        RepeatedExecutor repeatedExecutor = new RepeatedExecutor();
        repeatedExecutor.execute(runnable,3);
    }
}
class Task implements Runnable {
    public void run(){
        System.out.println("calling task");
    }
}
class RepeatedExecutor implements Executor{
    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
    public void execute(Runnable runnable,int times){
        System.out.printf("Calling Task.run() %d times thro' Excutor.execute() %n",times);
        for(int i =0; i < times;i++){
            execute(runnable);
        }
    }
}


