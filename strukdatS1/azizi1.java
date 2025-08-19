
import java.util.Scanner;
public class azizi1 {
    
    public static void main(String[] args) {
        // Membuat array untuk menyimpan 10 angka
        int[] arr = new int [10];

        // Membaca 10 angka dari pengguna
        int i = 0;
        Scanner input = new Scanner(System.in);
        
        while (i < arr.length) {
            System.out.print( "Masukkan nilai anda: ");
            arr[i] = input.nextInt();
            i++;
        }

        // Menampilkan elemen pertama dan terakhir
        System.out.println("nilai awal yang dimasukkan user: " + arr[0]);
        System.out.println("nilai akhir yang dimasukkan user: " + arr[9]);
    }
}