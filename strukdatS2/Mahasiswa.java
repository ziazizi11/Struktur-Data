public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public String toString() {
        return String.format("%-29s | %s", nama, nim);
    }
}
