/**
 * Tugas1
 */
public class Tugas1 {

    public static void main(String[] args) {
        DeretDescendingRekursif(20);
    }

    public static int DeretDescendingRekursif(int n) {
        if(n>0){
            System.out.print(n+" ");
            return DeretDescendingRekursif(n-1);
        }else{
            return 0;
        }
    }
}