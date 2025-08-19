import java.util.Scanner; // import plugin scanner untuk inputan

class ipk {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // object scanner baru
    String nama, nim; // variabel untuk nama dan nim
    double ipk; // variabel untuk ipk
    System.out.println("## Program Java IPK Mahasiswa ##");
    System.out.println("================================");
    System.out.print("Masukkan nama mahasiswa: ");
    nama = input.nextLine(); // input nama
    System.out.print("Masukkan NIM mahasiswa: ");
    nim = input.nextLine(); // input nim
    System.out.print("Masukkan IPK mahasiswa: ");
    ipk = input.nextDouble(); // input ipk
    System.out.println();
    System.out.println("# Data Mahasiswa #");
    System.out.println("==================");
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("IPK: " + ipk);
    if (ipk < 3.5) { // jika ipk kurang dari 3.5 maka
      System.out.println("Predikat: Selamat Anda Tidak Cumlaude");
    } else if (ipk >= 3.8) { // jika ipk lebih dari atau sama dengan 3.8 maka
      System.out.println("Predikat: Cumlaude");
       }
  }
}