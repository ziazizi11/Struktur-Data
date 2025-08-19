import java.util.Arrays;

public class PenjualanBarang {

    public static void main(String[] args) {
        // Mendeklarasikan array penjualan barang
        int[] penjualan = {100, 200, 300, 400, 500};

        // Menampilkan data penjualan barang
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Data penjualan ke-" + (i + 1) + ": " + penjualan[i]);
        }
    }
}
