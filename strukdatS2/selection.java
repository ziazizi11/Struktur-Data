public class selection {
    public static void selection(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Menukar elemen terkecil dengan elemen pertama
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {21, 68, 12, 2, 98, 76, 33, 14, 16, 4};
        System.out.println("Elemen sebelum selection :");
        printArray(arr);
        
        selection(arr);
        
        System.out.println("\nElemen setelah selection :");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}