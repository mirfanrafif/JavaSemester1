import java.util.Scanner;
/**
 * Tugas3
 */
public class Tugas3 {

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

        System.out.println("Pilihan menu : ");
        System.out.println("1. Nilai Minimum");
        System.out.println("2. Nilai Minimum dan jumlahnya");
        System.out.println("3. Kondisi Array");
        int pilihan = sc.nextInt();
        int min = angka[0][0];
        int sum = 0;

        switch (pilihan) {
            case 1:
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if(angka[i][j]<min){
                            min = angka[i][j];
                        }
                    }
                }
                System.out.println("Nilai terkecil dari array tersebut adalah : "+ min);
                break;
            case 2:
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if(angka[i][j]<min){
                            min = angka[i][j];
                            sum+=angka[i][j];
                        }
                    }
                }
                System.out.println("Nilai terkecil dari array tersebut adalah : "+min);
                System.out.println("Jumlah semua angka pada array tersebut adalah : "+ sum);
                break;
            case 3:
            boolean found = false;
            System.out.println("Masukkan angka : ");
            int finder = sc.nextInt();
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        found = (angka[i][j]==finder);
                    }
                }
                if (found==true) {
                    System.out.println("ADA");
                } else {
                    System.out.println("TIDAK ADA");
                }
            default:
                break;
        }
    }
}