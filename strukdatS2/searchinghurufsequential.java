import java.util.Scanner;

public class searchinghurufsequential {
    
    // Method untuk sequential search
    public static boolean sequentialSearch(char[] arr, char target) {
        for (char c : arr) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
    
    // Method untuk selection sort
    public static void selectionSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] dengan arr[minIndex]
            char temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Masukkan huruf yang ingin dicari: ");
        char targetChar = scanner.next().charAt(0); // Membaca hanya satu karakter
        
        // Memisahkan string input menjadi array karakter
        char[] charArray = inputString.toCharArray();
        
        // Lakukan sequential search
        boolean found = sequentialSearch(charArray, targetChar);
        
        if (found) {
            System.out.println("Huruf '" + targetChar + "' ditemukan dalam string.");
        } else {
            System.out.println("Huruf '" + targetChar + "' tidak ditemukan dalam string.");
        }
        
        // Lakukan selection sort untuk mengurutkan array karakter
        selectionSort(charArray);
        
        System.out.print("String setelah diurutkan: ");
        for (char c : charArray) {
            System.out.print(c);
        }
        
        scanner.close();
    }
}
