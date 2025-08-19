public class array3h {
    public static void main(String[] args){

        String[] kumpulanString = new String[1];
        int[] kumpulanint = new int[6];

        kumpulanString[0] = "Perkenalkan Nama Saya Moch. Azizi Alfarizki";
  
        kumpulanint[0] = 121;
        kumpulanint[1] = 2324;
        kumpulanint[2] = 300;
        kumpulanint[3] = 343;
        kumpulanint[4] = 12;
        kumpulanint[5] = 50;

        for (int i=0; i < kumpulanString.length; i++){
        System.out.println(kumpulanString [i]);
        }

        int perhitungan = kumpulanint[0]+kumpulanint[1]-kumpulanint[3];{
        System.out.print("Hasil Perhitungan "+perhitungan);
        }
        
    }
}