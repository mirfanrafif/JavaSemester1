/**
 * Laundry
 */
import java.util.*;
public class Laundry {
    public static Scanner sc = new Scanner(System.in);
    public static String Nama, Alamat, Status, JK;
    public static Date date1 = new Date();
    public static int Menu, LaundryKiloan, Waktu, Harga, Berat, LaundrySatuan, Jumlah, TotalBayar, NoMember;
    public static int [][] HargaLaundryKiloan = {{15000,13000},{10000,8500}};
    public static int [] HargaSatuan = {7000, 20000, 25000, 26000, 30000};
    public static int [] Struk = new int [1];
    
    
    public static void main(String[] args) {
        Awal();
    }

    public static void Awal(){
        System.out.println("=============================================");
        System.out.println("|       Selamat Datang di TETEW Laundry     |");
        System.out.println("=============================================");
        System.out.print("Masukkan nama : ");
        Nama = sc.nextLine();
        System.out.print("Masukkan alamat : ");
        Alamat = sc.nextLine();
        System.out.print("Apakah anda member? Ya / Tidak : ");
        Status = sc.nextLine();
        System.out.print("Jenis Kelamin (W / P)");
        JK = sc.nextLine();
        
        Menu();
    }

    public static void Menu(){
        System.out.println("\n=============Menu==============");
		System.out.println("1. Landry Kiloan");
        System.out.println("2. Laundry Satuan");
        System.out.println("3. Total");

        System.out.print("Sistem Laundry Yang Di Inginkan [1 atau 2]:");
        Menu = sc.nextInt();
        switch (Menu) {
            case 1:
                LaundryKiloan();
                break;
            case 2:
                LaundrySatuan();
                break;
            case 3:
                BagTotal();
                break;
            default:
                InputSalah();
                break;
        }
    }

    public static void LaundryKiloan() {
        System.out.println("Laundry Kiloan:");
        System.out.println("1. CUCI KERING SETRIKA");
        System.out.println("2. CUCI SAJA");
        System.out.print("Jenis Laundry Yang Di Inginkan :");
        LaundryKiloan = sc.nextInt();

        if (LaundryKiloan==1) {
            CKS();
            Waktu = sc.nextInt();
            BagHarga(LaundryKiloan-1, Waktu-1);
        } else if(LaundryKiloan==2){
            CS();
            Waktu = sc.nextInt();
            BagHarga(LaundryKiloan-1, Waktu-1);
        }else{
            InputSalah();
        }

    }

    public static void LaundrySatuan(){
        System.out.println("Laundry Satuan[CUCI KERING SETRIKA. Otomatis 2 HARI]:");
		System.out.println("1.Baju \t\t\t= Rp 7.000");
		System.out.println("2.Jas  atau Dress \t= Rp 20.0000 ");
		System.out.println("3.Selimut \t\t= Rp 25.000");
		System.out.println("4.Boneka \t\t= Rp 26.000");
		System.out.println("5.Jeans \t\t= Rp 30.000");
        System.out.print("pilih nomor jenis barang [1/2/3/4/5]: ");
        LaundrySatuan = sc.nextInt();
        System.out.print("Masukkan jumlah barang : ");
        Jumlah = sc.nextInt();

        Harga = Jumlah * HargaSatuan[LaundrySatuan-1];
        TotalBayar += Harga;
        System.out.println("Tagihan anda untuk cucian ini : "+ Harga);
        Menu();
        }
    

    public static void BagHarga(int a, int b){
        System.out.print("Masukkan berat cucian anda :");
        Berat = sc.nextInt();

        Harga = Berat * HargaLaundryKiloan[a][b];
        TotalBayar += Harga;
        System.out.println("Tagihan anda untuk cucian ini : "+ Harga);
        Menu();

    }

    public static void CKS(){
        System.out.println("1. 1 HARI SELESAI \t= Rp 15.000");
	System.out.println("2. 2-3 HARI SELESAI \t= Rp 13.000");
        System.out.print("Jangka waktu yang diinginkan [1 atau 2] :");
    }

    public static void CS(){
        System.out.println("1. 1 HARI SELESAI \t= Rp 10.000");
        System.out.println("2. 2-3 HARI SELESAI \t= Rp 8.500");
		System.out.print("Jangka waktu yang diinginkan [1 atau 2] :");
    }

    public static void InputSalah(){
        System.out.println("Input salah. Anda akan dibawa ke menu utama ");
        Menu();
    }

    public static void BagTotal() {
        if ("Ya".equals(Status)&& "W".equals(JK)) {
            System.out.print("Masukkan No. Member :");
            NoMember = sc.nextInt();
            TotalBayar = TotalBayar * 95/100 - 1500;
            System.out.println("\nKarena anda seorang member anda mendapat diskon 5%");
            System.out.println("Karena anda seorang wanita, anda mendapat potongan 1500");
        }else if ("Ya".equals(Status)&& "P".equals(JK)) {
            System.out.print("Masukkan No. Member :");
            NoMember = sc.nextInt();
            TotalBayar = TotalBayar * 95/100;
            System.out.println("\nKarena anda seorang member anda mendapat diskon 5%");
        }else if ("Tidak".equals(Status) && "W".equals(JK)) {
            TotalBayar = TotalBayar - 1500;
            System.out.println("Karena anda seorang wanita, anda mendapat potongan 1500");
        }
        
        
        System.out.println("=============================================");
        System.out.println("|       Selamat Datang di TETEW Laundry     |");
        System.out.println("=============================================");
        System.out.println("\tTanggal Pembayaran : "+date1);
        System.out.println("Nama anda : " + Nama);
        System.out.println("Alamat anda : " + Alamat);
        System.out.println("Status member : "+ Status);
        System.out.println();
        System.out.println("Total bayar anda :" + TotalBayar);
        
    }
}