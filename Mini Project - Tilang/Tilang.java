import java.util.Scanner;
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
    public static int SIM, BawaSIM, PlatNomor, PartMotor, PartMobil, SerepMobil;
        public static int LaluLintas, SpeedLimit, STNK, Sabuk, Helm, LampuMalam, LampuMotorSiang, MenggokRaRiting;
        public static int Total, Menu;
        public static int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, G = 0, H = 0, I = 0, J = 0, K = 0,L = 0;
        public static String Nopol, Nama;
        public static int Denda0 = 0;
        public static int Denda1 = 100000;
        public static int Denda2 = 250000;
        public static int Denda3 = 500000;
        public static int Denda4 = 1000000;
        public static char pilihan1; 
        
        public static Scanner inputString = new Scanner(System.in);
        public static Scanner inputInt = new Scanner(System.in);
        public static Tilang Tilang1 = new Tilang();
        public static Source Source1 = new Source();
    
        
        
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
                A = 0;
            }else{
                A = Denda1;
            }
        }else if (SIM==0){
            A = Denda4;
        }else {
            Source1.TidakValid();
            BagMenu();
        }
        Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();
            BagMenu();
        }
    }
    public static void BagSTNK(){
        Source1.Batas();
        Source1.PertanyaanSTNK();
        STNK = inputInt.nextInt();
        if(STNK==1){
            B = 0;
        }else if(STNK==0){
            B = Denda2;
        }else{
            Source1.TidakValid();
            BagMenu();
        }
        Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();
            BagMenu();
        }
    }
    public static void BagPlat(){
        Source1.Batas();
        Source1.PertanyaanPlatNomor();
        PlatNomor = inputInt.nextInt();
        if(PlatNomor==1){
            C = 0;
        }else if(PlatNomor==0){
            C = Denda3;
        }else{
            Source1.TidakValid();
            BagMenu();
        }
        Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();
            BagMenu();
        }
    }
    public static void BagPartMotor(){
        Source1.Batas();
        Source1.PertanyaanPartMotor();
        PartMotor = inputInt.nextInt();
        if(PartMotor==1){
            D = 0;
        }else if(STNK==0){
            D = Denda2;
        }else{
            Source1.TidakValid();
            BagMenu();
        }
        Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();
            BagMenu();
        }
    }
    public static void BagPartMobil(){
        Source1.Batas();
        Source1.PertanyaanPartMobil();
        PartMobil = inputInt.nextInt();
        if(PartMobil==1){
            E = 0;
        }else if(PartMobil==0){
            E = Denda3;
        }else{
            Source1.TidakValid();
            BagMenu();
        }
        Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();BagMenu();
        }
    }
    public static void BagSerepMobil(){
        Source1.Batas();
        Source1.PertanyaanSerepMobil();
        SerepMobil = inputInt.nextInt();
        if(SerepMobil==1){
            F = 0;
        }else if(SerepMobil==0){
            F = Denda2;
        }else{
            Source1.TidakValid();BagMenu();
        }
        Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();BagMenu();
        }
    }
    public static void BagHelm(){
        Source1.Batas();
        Source1.MenggunakanHelm();
        Helm = inputInt.nextInt();
        if(Helm==1){
            G = 0;
        }else if(Helm==0){
            G = Denda2;
        }else{
            Source1.TidakValid();BagMenu();
        }
        Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();BagMenu();
        }
    }
    public static void BagLampuMalam(){
        Source1.Batas();
        Source1.LampuMalamHari();
        LampuMalam = inputInt.nextInt();
        if(LampuMalam==1){
            H = 0;
        }else if(LampuMalam==0){
            H = Denda2;
        }else{
            Source1.TidakValid();BagMenu();
        }Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();BagMenu();
        }
    }
    public static void BagLampuSiangMotor(){
        Source1.Batas();
        Source1.LampuMotorSiangHari();
        LampuMotorSiang = inputInt.nextInt();
        if(LampuMotorSiang==1){
            I = 0;
        }else if(LampuMotorSiang==0){
            I = Denda1;
        }else{
            Source1.TidakValid();BagMenu();
        }
        Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();BagMenu();
        }
    }
    public static void BagRiting(){
        Source1.Batas();
        Source1.Riting();
        STNK = inputInt.nextInt();
        if(STNK==1){
            J = 0;
        }else if(STNK==0){
            J = Denda2;
        }else{
            Source1.TidakValid();BagMenu();
        }Source1.PilihanLain();
        pilihan1 = inputInt.next().charAt(0);
        if(pilihan1=='Y'){
            BagMenu();
        }else if(pilihan1=='N'){
            BagTotal();
        }else{
            Source1.TidakValid();BagMenu();
        }
    }
    public static void BagTotal(){
        Source1.Batas();
        Total = A + B + C + D + E + F + G + H + I + J + K + L;
        System.out.println("Nama anda : " +Nama);
        System.out.println("Nopol anda "+ Nopol);
        System.out.println("Kesalahan anda : \n");
        if(A>0){
            System.out.println("Tidak membawa SIM");
        }if(B>0){
            System.out.println("Tidak membawa STNK");
        }if(C>0){
            System.out.println("Tidak menggunakan plat nomor standar");
        }if(D>0){
            System.out.println("Tidak menggunakan aksesoris / spare part motor standar");
        }if(E>0){
            System.out.println("Tidak menggunakan aksesoris / spare part mobil standar");
        }if(F>0){
            System.out.println("Tidak membawa ban serep / segitiga pengaman");
        }if(G>0){
            System.out.println("Tidak menggunakan helm / tidak standar");
        }if(H>0){
            System.out.println("Tidak menyalakan lampu pada malam hari / cuaca buruk");
        }if(I>0){
            System.out.println("Tidak menyalakan lampu motor pada siang hari");
        }if(J>0){
            System.out.println("Tidak menyalakan lampu sein / riting saat berbelok");
        }
        System.out.println("Denda anda sebesar "+Total);
        System.out.println("\nanda bisa mendatangi polsek terdekat \nuntuk informasi lebih lanjut");
        Source1.Batas();
        
    }
}
