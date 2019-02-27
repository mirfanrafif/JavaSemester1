package jobsheet2;
import java.util.Scanner;
public class Tugas1 {
    
    public static void main(String[] args) {
        JajarGenjang[] arr1 = new JajarGenjang[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            arr1[i] = new JajarGenjang();
            System.out.print("Masukkan panjang jajar genjang ke-"+ i +": ");
            arr1[i].panjang = sc.nextDouble();
            System.out.print("Masukkan tinggi jajar genjang ke-"+ i +": ");
            arr1[i].tinggi = sc.nextDouble();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Luas jajar genjang ke-"+ i +" adalah "+ arr1[i].hitungLuas());
            System.out.println("Keliling jajar genjang ke-" +i+ " adalah "+arr1[i].hitungKeliling());
        }
    }
}
