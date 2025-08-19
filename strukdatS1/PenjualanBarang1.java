import java.util.Arrays;

public class PenjualanBarang1 {

    public static void main(String[] args) {
        // Mendeklarasikan array penjualan barang
        int[] penjualan = {100, 200, 300, 400, 500};

        // Menampilkan data penjualan barang
        int i = 0;
        while (i < penjualan.length) {
            System.out.println("Data penjualan ke-" + (i + 1) + ": " + penjualan[i]);
            i++;
        }
    }
}
