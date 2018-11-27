/**
 * Tugas1
 */

import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan suhu awal : ");
        int SuhuAwal = sc.nextInt();

        System.out.println("Pilih salah satu \n1. Konversi Celcius ke Fahrenheit \n2. Konversi Fahrenheit ke Celcius");
        int pilihan = sc.nextInt();

        if (pilihan==1) {
            System.out.println("Suhu hasil konversi C to F dari "+ SuhuAwal + " Adalah " +KonversiCtoF(SuhuAwal) );
        } else if(pilihan==2){
            System.out.println("Suhu hasil konversi F to C dari "+ SuhuAwal + " Adalah " +KonversiFtoC(SuhuAwal) );
        } else{
            System.out.println("input salah");
        }
    }
    static int KonversiCtoF(int SuhuAwal){
        int SuhuAkhir = (SuhuAwal/5)*9 + 32;
        return SuhuAkhir;
    }

    static int KonversiFtoC(int SuhuAwal){
        int SuhuAkhir = (SuhuAwal - 32) * 5 / 9;
        return SuhuAkhir;
    }
}