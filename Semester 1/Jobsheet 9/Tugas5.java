/**
 * Tugas5
 */
import java.util.Scanner;
public class Tugas5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();
        int [][] MatriksA = new int [baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan angka pada posisi["+i+"]["+j+"] : ");
                MatriksA[i][j] = sc.nextInt();
            }
        }

        int [][] MatriksB = new int [kolom][baris];

        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < baris; j++) {
                MatriksB[i][j] = MatriksA[j][i];
                System.out.print(MatriksB[i][j]+" ");
            }
            System.out.println();
        }

        // for (int i = 0; i < kolom; i++) {
        //     for (int j = 0; j < baris; j++) {
        //         System.out.print(MatriksB[i][j]+" ");
        //     }
        //     System.out.println();
        // }

    }
}