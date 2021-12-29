package stack;

public class StackArray {
    int[] stack;
    int pointer = 0;

    public StackArray(int size){
        stack = new int[size];
    }
    public void push(int number){
        stack[pointer++] = number;
    }
    public int pop(){
        if (pointer == 0) {
            return -1;
        }
        int item = stack[pointer-1];
        stack[pointer-1] = 0;
        pointer--;
        return item;
    }
    public void print(){
        for (int item:stack){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(10);
        stackArray.pop();
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(1);
        stackArray.push(7);
        stackArray.print();
        System.out.println("pop one item " + stackArray.pop());
        System.out.println("pop one item " + stackArray.pop());
        stackArray.print();
    }
}
