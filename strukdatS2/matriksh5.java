public class matriksh5 {
    public static void main(String[] args) {
        // Mendefinisikan dua matrix untuk dijumlahkan
        int[][] Matriks1 = {
            {9, 15, 7,},
            {16, 15, -4},
            {3, 2, 1}
        };
        int[][] Matriks2 = {
            {3, 12, 1},
            {4, 3, 6},
            {-1, 21, 9}
        };

        // Untuk menyimpan hasil penjumlahan matriks
        int[][] sum = new int[3][3];

        // Menambahkan matriks1 dan matriks2
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                sum[x][y] = Matriks1 [x][y] + Matriks2 [x][y];
            }
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan matriks:");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(sum[x][y] + "|");
            }
            System.out.println();
        }
    }
}