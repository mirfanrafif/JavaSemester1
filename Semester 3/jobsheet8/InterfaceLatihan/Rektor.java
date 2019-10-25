package Semester3.jobsheet8.InterfaceLatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya rektor, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri anda.");
        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("--------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya rektor, memberikan sertifikat mawapres");
        System.out.println("Selamat! bagaimana anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        System.out.println("---------------------------------------------");
    }
}
