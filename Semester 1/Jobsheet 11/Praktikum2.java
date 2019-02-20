/**
 * Praktikum2
 */
public class Praktikum2 {

    public static void main(String[] args) {
        deretGenap(5);
    }

    static void deretGenap(int i){
        if(i <= 100){
            System.out.print(i+ " ");
            deretGenap(i+=5);
        }
    }
}