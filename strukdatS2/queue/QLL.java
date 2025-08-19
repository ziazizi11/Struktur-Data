public class QLL {
    public String nama;
    public boolean lunas;

    public QLL(String nama, boolean lunas) {
        this.nama = nama;
        this.lunas = lunas;
    }

    @Override
    public String toString() {
        return nama + " (Lunas: " + (lunas ? "Ya" : "Belum") + ")";
    }
}
