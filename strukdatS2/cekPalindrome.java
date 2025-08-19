import java.util.Scanner;

public class cekPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int j = 0; j < 50; j++) {
            System.out.print("Masukkan string (ketik 'q' untuk dihentikan) : ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Program dihentikan oleh pengguna.");
                break;
            }

            boolean isPalindrome = true;
            int length = input.length();

            for (int i = 0; i < length / 2; i++) {
                if (!String.valueOf(input.charAt(i)).equals(String.valueOf(input.charAt(length - 1 - i)))) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Palindrom");
            } else {
                System.out.println("Bukan Palindrom");
            }
        }

        scanner.close();
    }
}
