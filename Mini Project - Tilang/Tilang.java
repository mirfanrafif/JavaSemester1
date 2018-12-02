import java.util.Scanner;
import java.util.Date;
/*
    Data denda dalam program ini
    sudah sesuai dengan yang ada
    di internet dan sesuai hukum
    sebenarnya.
    
    untuk gambar asli dapat 
    dilihat di :

    https://cdn.moneysmart.id/wp-content/uploads/2018/02/dfsfs-768x1433.png

*/
//file ini hanya berisi perintah2 saja. untuk output print diletakkan di file terpisah
public class Tilang {
    public static void print(String a){
        System.out.println(a);
    }
    public static int SIM, BawaSIM, PlatNomor, PartMotor, PartMobil, SerepMobil;
    public static int LaluLintas, SpeedLimit, STNK, Sabuk, Helm, LampuMalam;
    public static int LampuMotorSiang, MenggokRaRiting;
    public static int Menu;
    public static String Nopol, Nama, print;
    public static int [] Denda = {0,100000,250000,500000,1000000};
    public static int [] Total = new int[10];
        
    public static Scanner inputString = new Scanner(System.in);
    public static Scanner inputInt = new Scanner(System.in);
    public static Source Source1 = new Source();
    public static Date date1 = new Date();
    
        
        
    public static void main(String[] args){
        
        Source1.Pembuka();
        Source1.InputNama();
        Nama = inputString.nextLine();
        Source1.InputNoPol();
        Nopol = inputString.nextLine();
        System.out.println("--------------------------------");
        BagMenu();
    }
    public static void BagMenu(){
        Source1.Menu();
        Menu = inputInt.nextInt();
        switch(Menu){
            case(1):
                BagSIM();
                break;
            case(2):
                BagSTNK();
                break;
            case(3):
                BagPlat();
                break;
            case(4):
                BagPartMotor();
                break;
            case(5):
                BagPartMobil();
                break;
            case(6):
                BagSerepMobil();
                break;
            case(7):
                BagHelm();
                break;
            case(8):
                BagLampuMalam();
                break;
            case(9):
                BagLampuSiangMotor();
                break;
            case(10):
                BagRiting();
                break;
            case(11):
                BagTotal();
                break;
            default:
                Source1.TidakValid();
                BagMenu();
        }
    }
    public static void BagSIM(){
        Source1.Batas();
        Source1.PertanyaanSIM();
        SIM = inputInt.nextInt();
        Source1.PertanyaanBawaSIM();
        BawaSIM = inputInt.nextInt();
        if (SIM==1){
            if (BawaSIM==1){
                Total[0] = Denda[0];
            }else{
                Total[0] = Denda[1];
            }
        }else if (SIM==0){
            Total[0] = Denda[4];
        }else {
            Source1.TidakValid();
            BagMenu();
        }BagMenu();
    }
    public static void BagSTNK(){
        Source1.Batas();
        Source1.PertanyaanSTNK();
        STNK = inputInt.nextInt();
        if(STNK==1){
            Total[1] = Denda[0];
        }else if(STNK==0){
            Total[1] = Denda[2];
        }else{
            Source1.TidakValid();
            BagMenu();
        }BagMenu();
    }
    public static void BagPlat(){
        Source1.Batas();
        Source1.PertanyaanPlatNomor();
        PlatNomor = inputInt.nextInt();
        if(PlatNomor==1){
            Total[2] = Denda[0];
        }else if(PlatNomor==0){
            Total[2] = Denda[3];
        }else{
            Source1.TidakValid();
            BagMenu();
        }BagMenu();
    }
    public static void BagPartMotor(){
        Source1.Batas();
        Source1.PertanyaanPartMotor();
        PartMotor = inputInt.nextInt();
        if(PartMotor==1){
            Total[3] = Denda[0];
        }else if(STNK==0){
            Total[3] = Denda[2];
        }else{
            Source1.TidakValid();
            BagMenu();
        }BagMenu();
    }
    public static void BagPartMobil(){
        Source1.Batas();
        Source1.PertanyaanPartMobil();
        PartMobil = inputInt.nextInt();
        if(PartMobil==1){
            Total[4] = Denda[0];
        }else if(PartMobil==0){
            Total[4] = Denda[3];
        }else{
            Source1.TidakValid();
            BagMenu();
        }BagMenu();
    }
    public static void BagSerepMobil(){
        Source1.Batas();
        Source1.PertanyaanSerepMobil();
        SerepMobil = inputInt.nextInt();
        if(SerepMobil==1){
            Total[5] = Denda[0];
        }else if(SerepMobil==0){
            Total[5] = Denda[2];
        }else{
            Source1.TidakValid();BagMenu();
        }BagMenu();
    }
    public static void BagHelm(){
        Source1.Batas();
        Source1.MenggunakanHelm();
        Helm = inputInt.nextInt();
        if(Helm==1){
            Total[6] = Denda[0];
        }else if(Helm==0){
            Total[6] = Denda[2];
        }else{
            Source1.TidakValid();BagMenu();
        }
        BagMenu();
    }
    public static void BagLampuMalam(){
        Source1.Batas();
        Source1.LampuMalamHari();
        LampuMalam = inputInt.nextInt();
        if(LampuMalam==1){
            Total[7] = Denda[0];
        }else if(LampuMalam==0){
            Total[7] = Denda[2];
        }else{
            Source1.TidakValid();
            BagMenu();
        }
        BagMenu();
    }
    public static void BagLampuSiangMotor(){
        Source1.Batas();
        Source1.LampuMotorSiangHari();
        LampuMotorSiang = inputInt.nextInt();
        if(LampuMotorSiang==1){
            Total[8] = Denda[0];
        }else if(LampuMotorSiang==0){
            Total[8] = Denda[1];
        }else{
            Source1.TidakValid();BagMenu();
        }BagMenu();
    }
    public static void BagRiting(){
        Source1.Batas();
        Source1.Riting();
        STNK = inputInt.nextInt();
        if(STNK==1){
            Total[9] = Denda[0];
        }else if(STNK==0){
            Total[9] = Denda[2];
        }else{
            Source1.TidakValid();BagMenu();
        }
        BagMenu();
    }
    public static void BagTotal(){
        Source1.Batas();
        int a = 0;
        int sum = 0;
        while(a < 10){
            sum += Total[a];
            a++;
        }
        System.out.println(date1);
        System.out.println("Nama anda : " +Nama);
        System.out.println("Nopol anda "+ Nopol);
        System.out.println("Kesalahan anda : \n");
        if(Total[0]>0){
            print("Tidak membawa SIM");
        }if(Total[1]>0){
            print("Tidak membawa STNK");
        }if(Total[2]>0){
            print("Tidak menggunakan plat nomor standar");
        }if(Total[3]>0){
            print("Tidak menggunakan aksesoris / spare part motor standar");
        }if(Total[4]>0){
            print("Tidak menggunakan aksesoris / spare part mobil standar");
        }if(Total[5]>0){
            print("Tidak membawa ban serep / segitiga pengaman");
        }if(Total[6]>0){
            print("Tidak menggunakan helm / tidak standar");
        }if(Total[7]>0){
            print("Tidak menyalakan lampu pada malam hari / cuaca buruk");
        }if(Total[8]>0){
            print("Tidak menyalakan lampu motor pada siang hari");
        }if(Total[9]>0){
            print("Tidak menyalakan lampu sein / riting saat berbelok");
        }
        print("\nDenda anda sebesar "+sum);
        print("\nanda bisa mendatangi polsek terdekat \nuntuk informasi lebih lanjut");
        Source1.Batas();
        
    }
    
    
}
    