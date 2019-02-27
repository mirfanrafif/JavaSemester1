import java.util.Scanner;
public class Tugas2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriks m1 = new Matriks();

        //input
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Masukkan isi matriks pada baris "+ i + " "
                        + "kolom "+ j + " : ");
                m1.Matrix[i][j] = sc.nextInt();
            }
        }
        
        //menampilkan output untuk mengecek input
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m1.Matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Brute Force
        KaliMatriksBF brute1 = new KaliMatriksBF();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                brute1.bf1[i][j] = m1.Matrix[i][j];
                brute1.bf2[i][j] = m1.Matrix[i][j];
            }
        }
        System.out.println();
        brute1.OperasiBrute();
        
        //Output Brute Force
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(brute1.res[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}