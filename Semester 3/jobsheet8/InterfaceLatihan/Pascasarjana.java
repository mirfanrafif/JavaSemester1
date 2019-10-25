package Semester3.jobsheet8.InterfaceLatihan;

public class Pascasarjana extends Mahasiswa implements ICumlaude, IBerprestasi {

    public Pascasarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan tesis");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK ku lebih dari 3.71");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi  internasional");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal internasional");
    }
}
