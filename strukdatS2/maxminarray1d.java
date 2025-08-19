public class maxminarray1d {
    public static void main(String[] args) {
        int[] nilai = {1,3,7,4,2,4,6,9,3,1};
        int max,min;
        int i;

        min=nilai[0];
        max=nilai[0];

        //menghitung nilai max dan nilai min
        for (i=0; i < nilai.length; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
            else if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        System.out.println("Nilai Max = "+max);
        System.out.println("Nilai Min = "+min);   
    }

}