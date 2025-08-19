import java.util.Scanner;

public class predikatIPK{
public static void main(String[] args) {
    // object scanner baru
    Scanner input = new Scanner(System.in); 
    // variabel untuk nama dan nim
    String nama, nim; 
    // variabel untuk ipk
    double ipk; 

    System.out.println("# Predikat IPK Mahasiswa #");
    System.out.println("==================");
    // input nama
    System.out.print("Masukkan Nama Mahasiswa : ");
    nama = input.nextLine(); 
    // input nim
    System.out.print("Masukkan NIM Mahasiswa : ");
    nim = input.nextLine(); 
    // input ipk
    System.out.print("Masukkan IPK Mahasiswa : ");
    ipk = input.nextDouble(); 

    System.out.println();
    System.out.println("# Data Mahasiswa #");
    System.out.println("==================");
    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + nim);
    System.out.println("IPK : " + ipk);
    // jika ipk < 3.5 maka
    if (ipk < 3.5) { 
      System.out.println("Predikat : Selamat Anda Tidak Cumlaude");
    // jika ipk >= 3.5 & <= 3.79 maka "Cumlaude"
    } else if (ipk >= 3.5 && ipk <= 3.79) { 
      System.out.println("Predikat : Selamat Anda Cumlaude");
      // jika ipk >= 3.8 & <=3.99 maka "Magna Cumlaude"
       } else if (ipk >= 3.8 && ipk <= 3.99) {
        System.out.println("Predikat : Selamat Anda Magna Cumlaude");
        // jika ipk >= 4.00 maka "Summa Cumlaude" & Jika ipk < 4.01 maka "Masukkan IPK dengan benar"
       } else if (ipk >= 4.00 && ipk < 4.01) {
        System.out.println("Predikat : Selamat Anda Summa Cumlaude");
       } else {
        System.out.print("Masukkan IPK dengan benar");
       }
  }
}