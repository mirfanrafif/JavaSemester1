package Semester3.jobsheet8.AbstractClass;

public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    public Orang(String nama){
        this.nama = nama;
    }

    public void peliharaHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakHewanPelharaanJalanJalan(){
        System.out.println("Namaku : " + this.nama);
        System.out.println("Hewan perliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("------------------------------------------");
    }
}
