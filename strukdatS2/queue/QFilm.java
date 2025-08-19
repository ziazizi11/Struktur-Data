import java.util.LinkedList;
import java.util.Queue;

public class QFilm {
    private Queue<Customer> queue;

    public QFilm() {
        this.queue = new LinkedList<>();
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println(customer.getName() + " telah ditambahkan ke dalam antrian untuk Movie \"" + customer.getMovieTitle() + "\".");
    }

    public void serveCustomer() {
        Customer customer = queue.poll();
        if (customer != null) {
            System.out.println("Melayani " + customer.getName() + ". Selamat Menonton Movie \"" + customer.getMovieTitle() + "\"");
        } else {
            System.out.println("Tidak ada customer yang mengantri.");
        }
    }

    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("Antrian Kosong.");
        } else {
            System.out.println("Antrian Saat Ini :");
            System.out.println(String.format("%-5s | %-10s | %-20s", "Customer", "Name", "Movie"));
            System.out.println("-----------------------------------------");
            int position = 1;
            for (Customer customer : queue) {
                System.out.println(String.format("%-8d | %s", position, customer));
                position++;
            }
        }
    }

    public static void main(String[] args) {
        QFilm cinemaQueue = new QFilm();

        Customer customer1 = new Customer("Azizi", "Siksa Kubur");
        Customer customer2 = new Customer("Afif", "Vina");
        Customer customer3 = new Customer("Khisnu", "Kuyang");
        Customer customer4 = new Customer("Zami", "Siksa Neraka");

        cinemaQueue.addCustomer(customer1);
        cinemaQueue.addCustomer(customer2);
        cinemaQueue.addCustomer(customer3);
        cinemaQueue.addCustomer(customer4);

        cinemaQueue.printQueue();

        System.out.println();

        cinemaQueue.serveCustomer();
        cinemaQueue.serveCustomer();
        cinemaQueue.serveCustomer();
        cinemaQueue.serveCustomer();
    }
}
