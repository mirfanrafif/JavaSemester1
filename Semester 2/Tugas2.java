package jobsheet2;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah tanah : ");
        int jumlahTanah = sc.nextInt();
        
        Tanah[] tanah = new Tanah[jumlahTanah];
        
        for (int i = 0; i < jumlahTanah; i++) {
            tanah[i] = new Tanah();
            System.out.print("Masukkan panjang tanah ke-"+i+" : ");
            tanah[i].panjang= sc.nextInt();
            System.out.print("Masukkan lebar tanah ke-"+i+" : ");
            tanah[i].lebar=sc.nextInt();
        }
        
        for (int i = 0; i < jumlahTanah; i++) {
            tanah[i].hitungLuas();
            System.out.println("Luas tanah ke-"+i+" adalah "+ tanah[i].luas+" meter persegi");
        }
        
        //jawaban no. 4
        
        int max = 0;
        
        for (int i = 0; i < jumlahTanah; i++) {
            if (tanah[i].luas > max) {
                max = tanah[i].luas;
            }
        }
        
        System.out.println("Tanah terluas dalam perhitungan ini adalah "+ max);
        
    }
}
