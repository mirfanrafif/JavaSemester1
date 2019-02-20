import java.util.Scanner;

/**
 * Lingkaran
 */
public class Lingkaran {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang jari2 : ");
        double r = sc.nextInt();

        System.out.println("Pilih : ");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Diameter lingkaran");
        int pilih = sc.nextInt();

        if (pilih==1) {
            System.out.println("Luas lingkaran berjari jari "+ r + " adalah "+ Luas(r));
        }else if(pilih==2){
            System.out.println("Luas lingkaran berjari jari "+ r + " adalah "+ Keliling(r));
        }else{
            System.out.println("Tidak valid");
        }

    }

    public static double Luas(Double r){
        double luas = Math.PI * r * r;
        return luas;
    }

    public static double Keliling(Double r){
        double keliling = Math.PI * r * 2;
        return keliling;
    }
}