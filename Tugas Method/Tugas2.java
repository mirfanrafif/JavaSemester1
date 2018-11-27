/**
 * Tugas2
 */
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ukuran file dalam satuan ukuran awal : ");
        double Kb = sc.nextInt();

        System.out.println("Pilih salah satu \n1. Konversi Kb ke MB \n2. Konversi MB ke Kb");
        int pilihan = sc.nextInt();

        if (pilihan==1) {
            System.out.println("Ukuran file tersebut dalam satuan MegaByte adalah "+ KbtoMB(Kb)+ " MB");
        } else if(pilihan==2){
            System.out.println("Ukuran file tersebut dalam satuan Kilobit adalah "+ MBtoKb(Kb)+ " Kb");
        } else{
            System.out.println("input salah");
        }
        
        
    }

    static double KbtoMB(double Kb){
        return Kb/8192;
    }

    static double MBtoKb(double Kb){
        return Kb*8192;
    }

}