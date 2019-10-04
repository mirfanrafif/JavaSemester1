package PBO.Jobsheet6.Tugas;

public class PC extends Komputer{
    public int ukuranMonitor;

    public PC() {
    }

    public PC(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, int ukuranMonitor) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPC(){
        tampilData();
        System.out.println("Ukuran Monitor : " + ukuranMonitor + "\n");

    }
}
