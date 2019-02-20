/**
 * Tugas2
 */
public class Tugas2 {
    public static void main(String[] args) {
        System.out.println(PenjumlahanRekursif(5));
    }

    public static int PenjumlahanRekursif(int n){
        if (n>0) {
            return n + PenjumlahanRekursif(n-1);
        } else {
            return 0;
        }
    }
}