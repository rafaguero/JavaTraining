package ocpjp8;
import java.util.*;
import java.util.concurrent.*;

public class WeightAnimalAction extends RecursiveAction{
    private int start;
    private int end;
    private Double[] weights;
    public WeightAnimalAction(Double [] weights,int start, int end){
        this.start = start;
        this.end = end;
        this.weights = weights;
    }
    @Override
    protected void compute() {
        if (end-start <= 3)
            for(int i=start; i<end; i++) {
                weights[i] = (double)new Random().nextInt(100);
                System.out.println("Animal Weights: " + i);
            }
        else {
            int middle = start+((end-start)/2);
            System.out.println("Start = " + start + " middle = " + middle + "end = " + end);
            invokeAll(new WeightAnimalAction(weights,start,middle),new WeightAnimalAction(weights,middle,end));
        }
    }

    public static void main(String[] args) {
        Double [] weights = new Double[20];
        ForkJoinTask<?> task = new WeightAnimalAction(weights,0,weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
        System.out.println();
        System.out.print("Weights: ");
        Arrays.asList(weights).stream().forEach(d -> System.out.println(d.intValue()+ " "));
    }
}
