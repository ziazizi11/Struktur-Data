import java.util.Arrays;

public class projekuts {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {22, 43, 75, 72, 50, 67, 81, 1, 9, 53};
        System.out.println("Sebelum di urutkan :" + Arrays.toString(arr));
        
        bubbleSort(arr);
        System.out.println("Sesudah di urutkan : " + Arrays.toString(arr));
        int key = 43;
        int index = binarySearch(arr, key);
        if (index != -1)
            System.out.println("Element " + key + " Berada Di index ke " + index);
        else
            System.out.println("Element " + key + " Tidak ada");
     }
}