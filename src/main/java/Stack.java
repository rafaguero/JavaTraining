import java.util.Arrays;

public class Stack {

    private int currentElementPosition = 0;
    private Object[] elements;
    private int INITIAL_SIZE = 10;

    public Stack() {
        elements = new Object[INITIAL_SIZE];
    }

    public <T> T pop() {
        
        // retrieve top most element
        T t = (T) elements[--currentElementPosition];
        // empty its position
        elements[currentElementPosition] = null;
        return t;
    }
    public void push(Object elementToPush) {
        // check if array is full
        if (currentElementPosition == elements.length) {
            expandSize();
        }
        elements[currentElementPosition++] = elementToPush;
    }

    public int size() {
        return currentElementPosition;
    }

    /**
     * Increases the size of the array by double its existing size
     */
    private void expandSize() {
        int increasedSize = elements.length * 2;
        // create a new array with double size and copy existing contents into it
        elements = Arrays.copyOf(elements, increasedSize);
    }


}
