import java.util.Stack;

public class DaftarMahasiswaSI23 {
    public static void main(String[] args) {
        Stack<Mahasiswa> stackMahasiswa = new Stack<>();

        stackMahasiswa.push(new Mahasiswa("ERISTYA RIEKE FIRNANDA", "3130023001"));
        stackMahasiswa.push(new Mahasiswa("FITRIAN PRAMUDIA EFENDI", "3130023002"));
        stackMahasiswa.push(new Mahasiswa("DIMAS HARDIANSYAH", "3130023003"));
        stackMahasiswa.push(new Mahasiswa("DHISI NAFIULIA HAYYU", "3130023004"));
        stackMahasiswa.push(new Mahasiswa("SITI KHOTIMAH", "3130023005"));
        stackMahasiswa.push(new Mahasiswa("RAMA WAHYU SATRIO", "3130023006"));
        stackMahasiswa.push(new Mahasiswa("ACHMAT CHOIRUN NASAB", "3130023007"));
        stackMahasiswa.push(new Mahasiswa("FATCHUR ROZI", "3130023008"));
        stackMahasiswa.push(new Mahasiswa("MUHAMAD YUSUF", "3130023009"));
        stackMahasiswa.push(new Mahasiswa("DIMAS BAGUS AJI SAPUTRA", "31300230010"));
        stackMahasiswa.push(new Mahasiswa("ANISA PUTRI AULIA", "31300230011"));
        stackMahasiswa.push(new Mahasiswa("MUHAMMAD LUTFI HASAN R", "31300230012"));
        stackMahasiswa.push(new Mahasiswa("MOCHAMMAD BAKHRI ILMI K", "31300230013"));
        stackMahasiswa.push(new Mahasiswa("MULYA NAFA", "31300230014"));
        stackMahasiswa.push(new Mahasiswa("DEVI NADYA SABILLA", "31300230015"));
        stackMahasiswa.push(new Mahasiswa("NASYRUL FUADY", "31300230016"));
        stackMahasiswa.push(new Mahasiswa("AYU PUTRI GIANTI", "31300230017"));
        stackMahasiswa.push(new Mahasiswa("AFRAH AMANI", "31300230018"));
        stackMahasiswa.push(new Mahasiswa("FARA FADILLAH NAMIRA ADJANI", "31300230019"));
        stackMahasiswa.push(new Mahasiswa("LORRIS AGUSTIN HARIYANTO", "31300230020"));
        stackMahasiswa.push(new Mahasiswa("M. CHAFIFULLAH FATHUR A.", "31300230021"));
        stackMahasiswa.push(new Mahasiswa("SULTHAN FATARULLAH AKBAR M", "31300230022"));
        stackMahasiswa.push(new Mahasiswa("BRYENCA RIZKI MARSHELLINE", "31300230023"));
        stackMahasiswa.push(new Mahasiswa("HABIBUR RAHMAN", "31300230024"));
        stackMahasiswa.push(new Mahasiswa("MUHAMMAD DAVID TAUFIKUR R", "31300230025"));
        stackMahasiswa.push(new Mahasiswa("ANIFA NIKMATUL AZZA", "31300230026"));
        stackMahasiswa.push(new Mahasiswa("AMAR SAYRIYO AGUNG", "31300230027"));
        stackMahasiswa.push(new Mahasiswa("SOFIAN ALI", "31300230028"));
        stackMahasiswa.push(new Mahasiswa("DINA KAMILIA", "31300230029"));
        stackMahasiswa.push(new Mahasiswa("TRYANDIKA DIAS ANGGONO", "31300230030"));
        stackMahasiswa.push(new Mahasiswa("MUHAMMAD ALDITIYA VEBRIANTO", "31300230031"));
        stackMahasiswa.push(new Mahasiswa("HALIMATUS SAKDIYAH", "31300230032"));
        stackMahasiswa.push(new Mahasiswa("ACHMAD RIZKI MIFTAHUDDIN", "31300230033"));
        stackMahasiswa.push(new Mahasiswa("MUHAMMAD FIRDAUS AGUSTIAN", "31300230034"));
        stackMahasiswa.push(new Mahasiswa("SUSILO MAULANA ERDIANSYAH", "31300230035"));
        stackMahasiswa.push(new Mahasiswa("MUHAMMAD IMAM GHOZALI F", "31300230036"));
        stackMahasiswa.push(new Mahasiswa("UBAIDULLOH AL ACHRORI", "31300230037"));
        stackMahasiswa.push(new Mahasiswa("DWIKY ADE PUTRA ZAKARIA", "31300230038"));
        stackMahasiswa.push(new Mahasiswa("ELVIRA AMELIA PUTRI", "31300230039"));
        stackMahasiswa.push(new Mahasiswa("SULTAN MUHAMMAD DZULFALAH A", "31300230040"));
        stackMahasiswa.push(new Mahasiswa("MAULA NAHDLIYAH MUCHLIS", "31300230041"));
        stackMahasiswa.push(new Mahasiswa("M. MU'AFFA ADITYA", "31300230042"));
        stackMahasiswa.push(new Mahasiswa("MOCH. AZIZI ALFARIZKI", "31300230043"));
        stackMahasiswa.push(new Mahasiswa("MUHAMMAD IZZUL HAQ", "31300230044"));
        stackMahasiswa.push(new Mahasiswa("MOHAMMAD QO'IS FATHUR R", "31300230045"));
        stackMahasiswa.push(new Mahasiswa("MUHAMMAD ZIDAN ILMI AFHAMY", "31300230046"));
        stackMahasiswa.push(new Mahasiswa("ARDAN PRAMUDYA ARIFIANTO", "31300230047"));
        stackMahasiswa.push(new Mahasiswa("IKA NUR PUSPITA RAHAYU", "31300230048"));

        System.out.println("Daftar Mahasiswa Sistem Informasi Unusa A23:");
        System.out.println("NAMA LENGKAP                  | NIM");
        System.out.println("------------------------------|---------");
        for (Mahasiswa mahasiswa : stackMahasiswa) {
            System.out.println(mahasiswa);
        }
    }
}
