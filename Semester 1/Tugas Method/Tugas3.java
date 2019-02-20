/**
 * Tugas3
 */
import java.util.Scanner;
public class Tugas3 {
    public static double Awal, Akhir;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        

        System.out.println("Pilihan \n1. Menit ke Detik \n2. Detik ke menit");
        int pilihan = sc.nextInt();
        if (pilihan==1) {
            MenitKeDetik();
        } else if(pilihan==2){
            DetikKeMenit();
        }else{
            System.out.println("input tidak valid");
        }
    }

    public static void MenitKeDetik(){
        System.out.print("Masukkan angka awal : ");
        Awal = sc.nextInt();
        Akhir = Awal * 60;
        System.out.println("Hasil konversi menit ke detik adalah " + Akhir + "detik");
    }

    
    public static void DetikKeMenit(){
        System.out.print("Masukkan angka awal : ");
        Awal = sc.nextInt();
        Akhir = Awal / 60;
        System.out.println("Hasil konversi menit ke detik adalah " + Akhir+ "menit");
    }
}