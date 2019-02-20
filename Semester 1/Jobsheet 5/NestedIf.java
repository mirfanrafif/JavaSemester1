package jobsheet.pkg5;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Nilai;
        System.out.print("Masukkan nilai");
        Nilai = sc.nextInt();
        
        if(Nilai>=0 && Nilai <= 100){
            if (Nilai >= 90 && Nilai <= 100){
                System.out.print("Nilai anda A");
            }
            else if (Nilai >=80 && Nilai <= 89){
                System.out.print("Nilai anda B");
            }
            else if (Nilai >=60 && Nilai <= 79){
                System.out.print("Nilai anda C");
            }
            else if (Nilai >=50 && Nilai <= 59){
                System.out.print("Nilai anda D");
            }
            else {
                System.out.print("Nilai anda E");
            }
        }else{System.out.println("Tidak termasuk dalam range nilai kami");}
    }
}
