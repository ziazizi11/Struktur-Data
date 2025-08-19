public class queue {
    public static void main(String[] args){
        AQueue queue = new AQueue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");


        queue.display();
        System.out.println("dequeue element : "+ queue.dequeue());
        
        queue.display();
        queue.enqueue("F");
        queue.display();

    }
}