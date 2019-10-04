package PBO.Jobsheet6.Tugas;

public class Mac extends Laptop{
    public String security;

    public Mac() {

    }

    public Mac(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrei, String security) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatrei);
        this.security = security;
    }

    public void tampilmac(){
        tampilLaptop();
        System.out.println("Security : " + security + "\n");
    }


}
