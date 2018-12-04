package jobsheet.pkg5;
import java.util.Scanner;
public class SudutSegitiga {
    public static void main(String[] args){
        int Angle1, Angle2, Angle3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sudut pertama");
        Angle1 = sc.nextInt();
        if(Angle1 < 180 && Angle1 > 0){
            System.out.println("Masukkan sudut kedua");
            Angle2 = sc.nextInt();
            if(Angle2 < 180 && Angle2 > 0){
                System.out.println("Masukkan sudut ketiga");
                Angle3 = sc.nextInt();
                if(Angle1 > 0 && Angle3 < 180 && (Angle1 + Angle2 + Angle3) == 180){
                    if(Angle1 == Angle2 || Angle2 == Angle3 || Angle1 == Angle3){
                        System.out.println("Segitiga sama kaki");
                    }
                }else{
                    System.out.println("Bukan segitiga");
                }
            }else{
                System.out.print("Input tidak valid");
            }
        }else{
            System.out.print("Input tidak valid");
        }
    }
}
