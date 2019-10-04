package PBO.Jobsheet6.Tugas;

public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }

    public Komputer(){

    }

    public void tampilData(){
        System.out.println("Merk : " + this.merk);
        System.out.println("Size Memory : " + this.sizeMemory);
        System.out.println("Jenis Prosesor : " + this.jnsProsesor);
        System.out.println("Kecepatan Prosesor : " + this.kecProsesor);
    }
}
