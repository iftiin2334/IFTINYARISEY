
package AssignmentJava;

import java.util.Arrays;

public class StackArray <T> {
    private static final int capacity = 2;
    private int top;
    private T [] Stack;

    StackArray() {
        this(capacity);
    }
    StackArray(int size)
    {
        top = 0;
        Stack  = (T[]) new Object[size];
    }
    boolean Empty()
    {
        return top == 0;
    }
    int size() {
        return top;
    }

    void push(T element){
        if(IFull()) {
            expand();
        }
        Stack[top] = element;
        top++;
    }
    public void expand() {
        Stack = Arrays.copyOf(Stack, Stack.length * 2);
    }

    @Override
    public String toString() {
        return "StackArray{" + "top=" + top + ", stack=" + Arrays.toString(Stack)+'}';
    }
    T peak() {
        if (Empty()) {
            return null;
        }
        return Stack[top - 1];
    }

    T pop() {
        if (Empty()) {
            return null;
        }
        top--;
        T removed = Stack[top];
        Stack[top] = null;
        return removed;
    }

    boolean IFull() {
        return top == Stack.length;
    }

    void display() {
        if (Empty()
        ){
            System.out.println("Is Empty");
        }
        for (int i = top - 1; i >= 0; i--)
        {
            System.out.println(Stack[i]);
        }
    }

    private boolean contains(T element) {
        for (int i = 0; i < size(); i++) {
            if (Stack[i] == element || (Stack[i] != null && Stack[i].equals(element)))
            {
                return true;
            }
        }
        return false;
    }

    public void merge(StackArray<T> arr1, StackArray<T> arr2) {
        int newSize = arr1.size() + arr2.size();

        if (Stack.length < newSize) {
            Stack = Arrays.copyOf(Stack, newSize);
        }

        for (int i = 0; i < arr1.size(); i++) {
            if (!contains(arr1.Stack[i])) {
                this.push(arr1.Stack[i]);
            }
        }

        for (int i = 0; i < arr2.size(); i++) {
            if (!contains(arr2.Stack[i])) {
                this.push(arr2.Stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackArray<Integer> list1 = new StackArray<>(3);
        StackArray<Integer> list2 = new StackArray<>(4);
        StackArray<Integer> list3 = new StackArray<>();

        list1.push(100);
        list1.push(900);
        list1.push(900);
        list1.push(200);

        list2.push(400);
        list2.push(300);
        list2.push(300);
        list2.push(200);
        list3.merge(list1, list2);
        list3.display();

    }
}
