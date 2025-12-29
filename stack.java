class Main {
    public static void main(String[] args) {

        Stack s = new Stack(5);   // stack object

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());
        s.pop();
        System.out.println("Top after pop: " + s.peek());
    }
}

class Stack {

    private int[] arr;
    private int top;

    public Stack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed");
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(arr[top--] + " popped");
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
}
