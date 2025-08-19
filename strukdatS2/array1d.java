public class array1d {

    public static void main(String[] args) {
        int suhu [] = new int[7];
        suhu [0] = 66;
        suhu [1] = 69;
        suhu [2] = 64;
        suhu [3] = 77;
        suhu [4] = 74;
        suhu [5] = 76;
        suhu [6] = 77;

        for (int i = 0; i < suhu.length; i++) {
            System.out.println(i);
            System.out.println(suhu[i]);
        }
        int total =0;
        for (int i=0; i< suhu.length; i++)
        total = total + suhu[i];
        System.out.println(total);

    } 
}   