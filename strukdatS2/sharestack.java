import java.util.Stack;

public class sharestack<A> {
    private Stack<A> stack;

    public sharestack() {
        stack = new Stack<>();
    }

    public void push(A Nilai) {
        stack.push(Nilai);
    }

    public A pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public A peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStackInt() {
        System.out.print("Nilai stack : ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
    public void printStackStr() {
        System.out.print("Nama Hewan dalam stack : ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
}
