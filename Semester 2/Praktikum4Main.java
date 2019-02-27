import java.util.Scanner;
public class Praktikum4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faktorial fak = new Faktorial();
        System.out.print("Masukkan jumlah n faktorial : ");
        fak.nilai = sc.nextInt();
        
        System.out.println("Nilai faktorial Brute Force : "+fak.FaktorialBP(fak.nilai));
        System.out.println("Nilai faktorial Divide Conquer : "+fak.FaktorialDC(fak.nilai));
    }
}
