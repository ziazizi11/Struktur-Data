public class binarysearch{  

    public static void binarysearch(int arr[], int first, int last, int key){  
        int mid = (first + last)/2; 

        while( first <= last ){  
           if ( arr[mid] < key ){  
             first = mid + 1;     
           }else if ( arr[mid] == key ){  
             System.out.println("Element berada di indeks ke : " + mid);  
             break;  
           }else{  
              last = mid - 1;  
           }  
           mid = (first + last)/2;  
        }  
        if ( first > last ){  
           System.out.println("Element tidak ada.");  
        }  
    }  
      public static void main(String args[]){  
        int arr[] = {10 ,21 ,6 ,20 ,9 ,23 };  
        int key = 23;  
        int last=arr.length-1;  
        binarysearch(arr,0,last,key);     
        }  
}  