
package jobsheet.pkg5;
import java.util.Scanner;
public class MenghitungLuas {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        float Pilih, Angka1, Angka2, Result;
        float pi = 3.14f;
        //angka1 dan angka 2 dapat berupa panjang, lebar, jari2, dll.
        
        System.out.println("Pilih : ");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Jajar Genjang");
        System.out.println("4. Lingkaran");
        Pilih = sc.nextInt();
        
        if(Pilih == 1){
            System.out.println("Masukkan alas : ");
            Angka1 = sc.nextInt();
            System.out.println("Masukkan tinggi : ");
            Angka2 = sc.nextInt();
            
            Result = Angka1 * Angka2 / 2;
            
            System.out.println("Luas segitiga tersebut " + Result);
        }
        
        else if(Pilih == 2){
            System.out.println("Masukkan panjang : ");
            Angka1 = sc.nextInt();
            System.out.println("Masukkan lebar : ");
            Angka2 = sc.nextInt();
            
            Result = Angka1 * Angka2;
            
            System.out.println("Luas persegi panjang tersebut " + Result);
        }
        
        else if(Pilih == 3){
            System.out.println("Masukkan alas : ");
            Angka1 = sc.nextInt();
            System.out.println("Masukkan tinggi : ");
            Angka2 = sc.nextInt();
            
            Result = Angka1 * Angka2;
            
            System.out.println("Luas jajar genjang tersebut " + Result);
        }
        
        else if(Pilih == 4){
            System.out.println("Masukkan jari-jari : ");
            Angka1 = sc.nextInt();

            
            Result = pi * Angka1 * Angka1;
            
            System.out.println("Luas lingkaran tersebut " + Result);
        }
        else {
            System.out.println("Tidak ada dalam pilihan");
        }
    }
}
