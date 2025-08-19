import java.util.Scanner;

public class azizi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; 

        System.out.println("Masukkan 10 angka:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Masukkan angka yang ingin dicari: ");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                index = i;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (found) {
            System.out.println("Angka ditemukan pada indeks: " + index);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        scanner.close();
    }
}