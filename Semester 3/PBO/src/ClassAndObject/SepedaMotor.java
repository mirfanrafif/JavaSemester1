package ClassAndObject;

class SepedaMotor {
    private String merek;
    private int kecepatan;

    SepedaMotor(String merek, int kecepatan) {
        this.merek = merek;
        this.kecepatan = kecepatan;
    }

    void tambahKecepatan(){
        kecepatan += 10;
    }

    void kurangiKecepatan(){
        kecepatan -= 10;
    }

    void tampilkanData(){
        System.out.println("Merek : " + merek);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println();
    }
}
