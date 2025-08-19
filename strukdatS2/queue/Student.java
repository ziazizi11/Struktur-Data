public class Student {
    private String name;
    private String nim;
    private boolean UKTLunas;

    public Student(String name, String nim,boolean UKTLunas) {
        this.name = name;
        this.nim = nim;
        this.UKTLunas = UKTLunas;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public boolean isUKTLunas() {
        return UKTLunas;
    }

    public void setUKTLLUNAS(boolean UKTLunas) {
        this.UKTLunas = UKTLunas;
    }

    @Override
    public String toString() {
        return String.format("%-21s | %-10s | %-10s", name, nim, UKTLunas ? "Lunas" : "Belum Lunas");
    }
}
