/**
 * Tugas3
 */
public class Tugas3 {

    public static void main(String[] args) {
        System.out.println(PangkatRekursif(5, 3));
    }

    static int PangkatRekursif(int angka, int Pangkat){
        if (Pangkat>1) {
            return angka*PangkatRekursif(angka, Pangkat-1);
        }
        else{
            return angka;
        }
    }
}