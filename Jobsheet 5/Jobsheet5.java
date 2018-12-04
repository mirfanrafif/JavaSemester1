package jobsheet.pkg5;
import java.util.Scanner;
public class Jobsheet5 {
    public static void main(String[] args) {
        int HargaAwal, JumlahBarang, Status, UangBayar, Harga;
        double Diskon, HargaAkhir, Kembalian, KelipatanDiskon, Diskon1, Diskon2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan ID Pelanggan");
        Status = sc.nextInt();
        if(Status == 123456){
            System.out.println("Masukkan jumlah barang");
            JumlahBarang = sc.nextInt();
            System.out.println("Masukkan harga :");
            Harga = sc.nextInt();
            System.out.println("Masukkan jumlah tunai anda :");
            UangBayar = sc.nextInt();
            
            HargaAwal = JumlahBarang * Harga;
            
            if(JumlahBarang > 30){
            Diskon = HargaAwal * 30/100;
            }else if(JumlahBarang >= 11 && JumlahBarang<=30){
            Diskon = HargaAwal * 15/100;
            }else{
            Diskon = 0;
            }
            HargaAkhir = HargaAwal - Diskon;
            Kembalian = UangBayar - HargaAkhir;
            System.out.println("Anda membayar sebesar " + UangBayar);
            System.out.println("Total belanja anda sebesar " + HargaAwal);
            System.out.println("Anda mendapat diskon sebesar " + Diskon);
            System.out.println("Total Belanja anda  setelah diskon sebesar " + HargaAkhir);
            System.out.println("Kembalian anda sebesar " + Kembalian);
        }
    }
}