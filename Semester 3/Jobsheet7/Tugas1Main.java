package PBO.Jobsheet7;

public class Tugas1Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total sudut lainnya jika diketahui sudut A 30 adalah : " + segitiga.totalSudut(30));
        System.out.println("Total sudut lainnya jika diketahui sudut A 30 dan sudut B 90 adalah : " + segitiga.totalSudut(30, 90));
        System.out.println("keliling segitiga dengan sisi 30, 40 dan 50 adalah : " + segitiga.keliling(30, 40, 50));
        System.out.println("Sisi miring dengan sisi 30 dan 40 adalah : "
                + segitiga.sisiMiring(30, 40));

    }
}
