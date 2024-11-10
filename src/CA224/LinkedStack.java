package CA224;

public class LinkedStack <T> {
    int count;
    Node<T> top;

    LinkedStack() {
        count = 0;
        top = null;
    }

    //size
    int size() {
        return count;
    }

    //isEmpty
    boolean isEmpty() {
        return count == 0;
    }

    // //push
    void push(T element) {
        Node<T> tempAddress = new Node<T>(element);
        tempAddress.setNext(top);
        top = tempAddress;
        count++;
    }

    //pop
    T pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        T removed = top.getElement();
        top = top.getNext();
        count--;
        return removed;
    }

    //peek
    T peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        return top.getElement();
    }

    //print stack elements
    void display() {
        if (!isEmpty()) {
            Node<T> currentAddress = top;
            while (currentAddress != null) {
                System.out.println(currentAddress);
                System.out.println(currentAddress.getElement());
                currentAddress = currentAddress.getNext();
            }
        } else
            System.out.println("Empty!");
    }

    //search
//boolean search(T data){
// boolean found = false;
//Node<T> current = top;
//if(isEmpty()){
// System.out.println("EMPTY!");
//}
//else {
// while (current != null){
//if(data.equals(current.getElement()))
//found = true;
//current = current.getNext();
//}
//}
//return found;
//}
    void search(T data) {
        int counter = 0;
        Node<T> current = top;
        if (isEmpty()) {
            System.out.println("EMPTY!");
        } else {
            while (current != null) {
                if (data.equals(current.getElement())) {
                    counter++;
                    System.out.println(current);
                }
                current = current.getNext();
            }
            //display
            if (counter == 0)
                System.out.println("Not found!");
            else
                System.out.println(data + " found " + counter + " times");

            //main method
        }

    }

    public static void main(String[] args) {
        LinkedStack<String> name = new LinkedStack<>();
        name.push("farah");
        name.push("farah");
        name.push("farah");
        name.push("farah");
        name.push("farah");
        name.push("farah");
        System.out.printf(name.peek());


    }
}