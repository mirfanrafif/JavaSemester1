import java.util.Scanner;
/**
 * Arr4
 */
public class Arr4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int BarisA, KolomA;

        System.out.println("Masukkan ukuran baris matriks A : ");
        BarisA = input.nextInt();
        System.out.println("Masukkan ukuran Kolom matriks A : ");
        KolomA = input.nextInt();
        
        int [][] matriksA = new int[BarisA][KolomA];
        System.out.println("Input Matriks : ");

        int i = 0;j = 0;

        while (i<BarisA) {
            while (j<KolomA) {
                System.out.print("Matriks A["+i+"]["+j+"] : ");
                matriksA[i][j] = input.nextInt();
                j++;
            }
            System.out.println("");
            i++;
        }

        for (int i = 0; i < BarisA; i++) {
            for (int j = 0; j < KolomA; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println();
        }
    }
}