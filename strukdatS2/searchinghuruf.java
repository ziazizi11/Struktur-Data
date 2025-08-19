import java.util.Scanner;

public class searchinghuruf {
    
    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    char temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--; 
        } while (swapped);
    }
    
   
    public static boolean searchChar(char[] arr, char target) {
        for (char c : arr) {
            if (c == target) {
                return true; 
            }
        }
        return false; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        
        String kalimatInput = scanner.nextLine();
        System.out.print("Masukkan huruf yang ingin dicari dan diurutkan: ");
        
        char hurufInput = scanner.next().charAt(0); 
        char[] karakterArray = kalimatInput.toCharArray();
        bubbleSort(karakterArray);
        System.out.print("Huruf-huruf dalam kalimat setelah diurutkan: ");
        for (char c : karakterArray) {
            System.out.print(c + " ");
            }
        System.out.println();
        
        boolean hurufDitemukan = searchChar(karakterArray, hurufInput);
        if (hurufDitemukan) {
            System.out.println("Huruf '" + hurufInput + "' ditemukan dalam kalimat.");
            } else {
            System.out.println("Huruf '" + hurufInput + "' tidak ditemukan dalam kalimat.");
            }
        
        scanner.close();
    }
}
