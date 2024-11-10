//import java.util.Arrays;
//
//public class ArrayStack<T> {
//    // data fields
//    private T[] array;
//    private int[] test;
//    private int top;
//    private static final int DEFAULT_CAPACITY = 2;
//
//    public ArrayStack(int arraySize) {
//        array = (T[]) new Object[arraySize];
//        top = 0;
//    }
//    public ArrayStack() {
//        this(DEFAULT_CAPACITY);
//    }
//    // expand array capacity if necessary
//    private void expandArray() {
//        array = Arrays.copyOf(array, newLength:array.length * 2);
//    }
//    /* METHODS: Stack Operations */
//    // size, isEmpty, push , pop , peek
//
//    // returns the number of elements array
//    public int size() {
//        return top;
//    }
//    // checks if the array is empty or not
//    public boolean isEmpty() {
//        return top == 0;
//    }
//    // push an item to the array
//    public void push(T item) {
//        if (size()== array.length)
//            expandArray();
//        array[top] = item;
//        top++;
//
//    }
//    // removes an item from the array
//    public T pop() throws ArrayEmptyStackException {
//        if (isEmpty())
//            throw new ArrayEmptyStackException("The stack is empty , so you cannot remove any items!");
//        top--;
//        T deletedItem = array[top];
//        array[top] = null;
//        return deletedItem;
//    }
//    // peek: examines the top item on the array.
//    public T peek() throws ArrayEmptyStackException {
//        if (isEmpty()) {
//            throw new ArrayEmptyStackException("Nothing is on the top of the stack.");
//            return array[top - 1];
//        }
//
//        //display item in the stack.
//
//        public void display() {
//
//            for (int i = 0; i < size(); i++) {
//                System.out.print(array[i]);
//                if (i < size() - 1)
//                    System.out.println(", ");
//            }
//            System.out.println(']');
//
//        }
//    }