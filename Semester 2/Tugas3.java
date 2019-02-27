package jobsheet2;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        
        NilaiMhs[] nilai = new NilaiMhs[jumlahMhs];
        
        for (int i = 0; i < jumlahMhs; i++) {
            nilai[i] = new NilaiMhs();
            System.out.println("Mahasiswa "+i);
            System.out.print("Masukkan nilai pertama : ");
            nilai[i].nilai1 = sc.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai[i].nilai2 = sc.nextInt();
        }
        
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Nilai tertinggi mahasiswa"+ i+" adalah "+ 
                    nilai[i].nilaiTertinggi());
        }
    }
}
