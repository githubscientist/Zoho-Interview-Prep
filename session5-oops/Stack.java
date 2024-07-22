public class Stack {
    // define the array
    private int[] items;
    private int top;
    final int SIZE = 5;

    public Stack() {
        // allocate memory for items
        this.items = new int[100];
        // initialize the top pointer to point to -1
        this.top = -1;
    }

    public boolean isStackFull() {
        return this.top == SIZE - 1;
    }

    public void push(int data) {
        if (!this.isStackFull()) {
            // increment the top pointer and push the data into items @ top index
            this.top++;
            this.items[this.top] = data;
        }
    }

    public boolean isStackEmpty() {
        return this.top == -1;
    }

    public int peek() {
        if (!this.isStackEmpty()) {
            return this.items[this.top];
        }
        return -1;
    }

    public void pop() {
        if (!this.isStackEmpty()) {
            // decrement the top pointer
            this.top--;
        }
    }

    public static void main(String[] args) {
        // test the stack data structure
        // create a new stack
        Stack stack = new Stack();
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.pop();
        System.out.print(stack.peek());
    }
}
