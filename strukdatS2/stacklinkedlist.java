public class stacklinkedlist{
    public static void main (String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("top element is " + stack.peek());
        System.out.println(stack.pop() + "popped from stack ");

        stack.display();
    }
}
