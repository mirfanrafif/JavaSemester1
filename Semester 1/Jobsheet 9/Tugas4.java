/**
 * Tugas4
 */
import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan jumlah baris");
        int baris = sc.nextInt();
        System.out.println("Masukkan jumlah kolom");
        int kolom = sc.nextInt();
        
        int [][] angka = new int [baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan angka["+i+"]["+j+"]");
                angka[i][j] = sc.nextInt();
            }
        }

        int maxBaris = 0, maxKolom = 0;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if(maxBaris<angka[i][j]){
                    maxBaris = angka[i][j];
                }
            }
        }
        
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < baris; j++) {
                if(maxKolom<angka[j][i]){
                    maxKolom = angka[j][i];
                }
            }
        }

        System.out.println("Nilai terbesar dicari berdasarkan baris adalah "+ maxBaris);
        System.out.println("Nilai terbesar dicari berdasarkan kolom adalah "+ maxKolom);
        
    }
}