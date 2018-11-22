import java.util.Scanner;
/**
 * Tugas1
 */
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] nilai = new int[3][4];
        int max = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Masukkan angka ["+i+"]["+j+"] : ");
                nilai[i][j] = sc.nextInt();
                if(nilai[i][j]>=max){
                    max = nilai[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Bilangan terbesar adalah : "+ max);

        
    }
}