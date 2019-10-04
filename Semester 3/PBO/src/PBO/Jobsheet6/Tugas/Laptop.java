package PBO.Jobsheet6.Tugas;

public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrei) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }

    public Laptop() {
    }

    public void tampilLaptop(){
        tampilData();
        System.out.println("Jenis Batrei : " + jnsBatrei);
    }
}
