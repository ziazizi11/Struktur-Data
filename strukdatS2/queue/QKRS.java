import java.util.LinkedList;
import java.util.Queue;

public class QKRS {
    private Queue<Student> queue;

    public QKRS() {
        this.queue = new LinkedList<>();
    }

    public void addStudent(Student student) {
        queue.add(student);
    }

    public void processQueue() {
        Queue<Student> paidQueue = new LinkedList<>();
        Queue<Student> unpaidQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            Student student = queue.poll();
            if (student.isUKTLunas()) {
                paidQueue.add(student);
            } else {
                unpaidQueue.add(student);
            }
        }

        queue.addAll(paidQueue);
        queue.addAll(unpaidQueue);
    }

    public void printQueue(String message) {
        System.out.println(message);
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println(String.format("%-1s | %-21s | %-10s | %-10s", "No", "Name", "Nim", "Status"));
            System.out.println("-----------------------------------------------");
            int position = 1;
            for (Student student : queue) {
                System.out.println(String.format("%-2d | %s", position, student));
                position++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QKRS krsQueue = new QKRS();

        Student student1 = new Student("Moch. Azizi Alfarizki", "3130023043", true);
        Student student2 = new Student("Rama Wahyu Satrio", "3130023006",false);
        Student student3 = new Student("Muhammad Yusuf", "3130023009",true);
        Student student4 = new Student("Nasyrul Fuady", "3130023016",false);
        Student student5 = new Student("Habibur Rahman", "3130023024",true);

        krsQueue.addStudent(student1);
        krsQueue.addStudent(student2);
        krsQueue.addStudent(student3);
        krsQueue.addStudent(student4);
        krsQueue.addStudent(student5);

        System.out.println("*Simulasi KRS Sistem Informasi A23*");

        krsQueue.printQueue("Queue Sebelum di Proses :");

        krsQueue.processQueue();

        krsQueue.printQueue("Queue Setelah di Proses :");
    }
}
