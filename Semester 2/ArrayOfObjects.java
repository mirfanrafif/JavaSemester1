package jobsheet2;
import java.util.Scanner;
public class ArrayOfObjects {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
            Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-"+i);
            System.out.print("Masukkan Panjang : ");
            ppArray[i].Panjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            ppArray[i].Lebar = sc.nextInt();   
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang : "+ ppArray[i].Panjang + ", Lebar : "+ ppArray[i].Lebar);
        }
    }
}
