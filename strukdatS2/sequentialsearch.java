public class sequentialsearch {      
    public static void main(String[] args) {  
            int[] arr = { 10, 9, 5, 15, 23, 2 };  
            int targetelement = 23;  

       int result = sequentialSearch(arr, targetelement);  
        if (result != -1) {  
                System.out.println("Element berada di indeks ke : " + result);  
            } else {  
                System.out.println("Element tidak ada.");  
            }    
        }  
    public static int sequentialSearch(int[] arr, int target) {  

        for (int i=0 ; i < arr.length; i++) {   
            if (arr[i] == target) {  
                
                return i;  
            }  
        }   
            return -1;  
        }  
    }    