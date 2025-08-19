import java.util.Scanner;
public class azizi2 {
public static void main(String[] args) {

        // Membuat array dengan ukuran 10
        int[] array = new int[10];

        // Membaca 10 angka dari user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan 10 angka:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Menghitung rata-rata
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;

        // Menampilkan hasil rata-rata
        System.out.println("Rata-rata: " + average);

        scanner.close();
    }
}