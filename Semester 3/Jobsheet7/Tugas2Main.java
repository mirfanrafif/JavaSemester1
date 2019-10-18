package PBO.Jobsheet7;

public class Tugas2Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Mahasiswa mahasiswa = new Mahasiswa();
        Dosen dosen = new Dosen();

        //Manusia
        System.out.println("\nManusia");
        manusia.bernafas();
        manusia.makan();

        //Mahasiswa
        System.out.println("\nMahasiswa");
        mahasiswa.bernafas();
        mahasiswa.makan();
        mahasiswa.tidur();

        //dosen
        System.out.println("\nDosen");
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();



    }
}
