import java.util.Scanner;
public class Tugas1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pangkat p1 = new Pangkat();
        
        p1 = new Pangkat();
        System.out.print(". Masukkan angka yang akan dipangkatkan : ");
        p1.x = sc.nextInt();
        System.out.print(". Masukkan pangkatnya : ");
        p1.n = sc.nextInt();
                
        //Brute Force
        System.out.println("Hasil perhitungan pangkat dari bilangan tersebut adalah : " + p1.pangkatBruteForce());
        
        //Divide Conquer
        PangkatProp hasil = new PangkatProp();
        p1.pangkatDivideConquer(1, p1.n, hasil);
        System.out.println("Hasil perhitungan pangkat dari bilangan tersebut adalah : " + hasil.hasil);
    }
}
