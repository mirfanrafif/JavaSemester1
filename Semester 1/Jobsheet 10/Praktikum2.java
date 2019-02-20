/**
 * Praktikum2
 */
public class Praktikum2 {

    static void beriSalam(){
        System.out.println("Selamat pagi, Dunia");
    }

    static void BeriUcapan(String ucapan){
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
        beriSalam();
        String salam = "selamat datang di pemrograman java";
        BeriUcapan(salam);
    }
}