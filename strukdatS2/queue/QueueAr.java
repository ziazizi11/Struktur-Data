public class QueueAr {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(6);

        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(0);
        queue.enqueue(4);
        queue.printQueue();

        queue.enqueue(9);
        queue.printQueue();

        queue.enqueue(8);
        queue.printQueue();

        queue.enqueue(7);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();

        System.out.println("Peek  : " + queue.peek());

        queue.dequeue();
        queue.printQueue();

        queue.enqueue(7);
        queue.printQueue();
    }
}
