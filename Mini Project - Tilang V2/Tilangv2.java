import java.util.Scanner;
public class Tilangv2 {

    public static String Nopol, Nama, print, TanyaUlang;
    public static int menu;
    public static int [] DendaList = {0,100000,250000,500000,1000000};
    public static int [] Denda = new int[10];
    public static Scanner inputString = new Scanner(System.in);
    public static Scanner inputInt = new Scanner(System.in);
    public static void println(String p){System.out.println(p);}
    public static String[] Kesalahan = {"Tidak membawa SIM", "Tidak membawa STNK", "Tidak menggunakan plat nomor standar", "Tidak menggunakan aksesoris / spare part motor standar", "Tidak menggunakan aksesoris / spare part mobil standar", "Tidak membawa ban serep / segitiga pengaman", "Tidak menggunakan helm / tidak standar", "Tidak menyalakan lampu pada malam hari / cuaca buruk", "Tidak menyalakan lampu motor pada siang hari", "Tidak menyalakan lampu sein / riting saat berbelok"};

    public static void main(String[] args) {
        System.out.print("Masukkan nama pengendara : ");
        Nama = inputString.nextLine();
        System.out.print("Masukkan Nopol Kendaraan : ");
        Nopol = inputString.nextLine();
        BagMenu();
    }

    public static void BagMenu(){
        System.out.println("\n\n--------------------------------");
        System.out.println("Menu : ");
        System.out.println("1. SIM");
        System.out.println("2. STNK");
        System.out.println("3. Plat Nomor");
        System.out.println("4. Spare Part / Aksesoris Motor");
        System.out.println("5. Spare Part / Aksesoris Mobil");
        System.out.println("6. Ban Serep dan Segitiga Pengaman");
        System.out.println("7. Helm untuk Pengendara Motor");
        System.out.println("8. Lampu Kendaraan saat Malam Hari / Cuaca Buruk / Kabut");
        System.out.println("9. Lampu motor saat siang hari");
        System.out.println("10. Lampu sein / Riting saat berbelok");
        System.out.println("11. Total Denda");
        System.out.print("Pilih menu : ");
        menu = inputInt.nextInt();
        switch(menu){
            case(1):
                HargaTilang(0, 1);
                break;
            case(2):
                HargaTilang(1, 2);
                break;
            case(3):
                HargaTilang(2, 3);
                break;
            case(4):
                HargaTilang(3, 2);
                break;
            case(5):
                HargaTilang(4, 3);
                break;
            case(6):
                HargaTilang(5, 2);
                break;
            case(7):
                HargaTilang(6, 2);
                break;
            case(8):
                HargaTilang(7, 2);
                break;
            case(9):
                HargaTilang(8, 1);
                break;
            case(10):
                HargaTilang(9, 1);
                break;
            case(11):
                BagTotal();
                break;
            default:
            TidakValid();
                BagMenu();
        }
    }

    public static void HargaTilang(int Kesalahan, int Denda){
        System.out.println("--------------------------------------");
        System.out.println("Apakah pengendara "+ Tilangv2.Kesalahan[Kesalahan]+ "?");
        System.out.println("Y / N");
        TanyaUlang = inputString.nextLine();
        if (TanyaUlang.equals("Y")||TanyaUlang.equals("y")) {
            Tilangv2.Denda[Kesalahan] = Tilangv2.DendaList[Denda];
        } else if(TanyaUlang.equals("N")||TanyaUlang.equals("n")) {
            Tilangv2.Denda[Kesalahan] = Tilangv2.DendaList[0]; 
        }
        else{
            TidakValid();
        }BagMenu();
    }

    public static void TidakValid(){
        System.out.println("Input tidak valid, anda akan dibawa ke menu.");
    }
    
    public static void BagTotal(){
        int Total = 0;
        System.out.println("\n--------------------------------------");
        System.out.println("Nama anda : " +Nama);
        System.out.println("Nopol anda "+ Nopol);
        System.out.println("Kesalahan anda : \n");
        int count = 1;
        for (int i = 0; i < DendaList.length; i++) {
            if (Denda[i]>0) {
                System.out.println(count+". "+ Kesalahan[i] + " ("+Denda[i]+")");
                count++;
            }
        }
        
        for (int i = 0; i < Denda.length; i++) {
            if (Denda[i]>0) {
                Total += Denda[i];
            }
        }
        System.out.println("Denda anda sebesar : Rp. "+ Total);
        System.out.println("\nanda bisa mendatangi polsek terdekat \nuntuk informasi lebih lanjut");

    }
}