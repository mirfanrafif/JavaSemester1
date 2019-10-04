package PBO.Jobsheet6.Tugas;

public class Windows extends Laptop{
    public String fitur;

    public Windows(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrei, String fitur) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatrei);
        this.fitur = fitur;
    }

    public Windows() {
    }

    public void tampilWindows(){
        tampilLaptop();
        System.out.println("Fitur : " + fitur + "\n");
    }
}
