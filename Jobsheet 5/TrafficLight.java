package jobsheet.pkg5;
import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String Lampu;
        System.out.println("Input warna lampu");
        Lampu = sc.nextLine();
        
        if("Hijau".equals(Lampu)){
            System.out.println("Silahkan jalan");
        }else if("Kuning".equals(Lampu)){
            System.out.println("Hati-hati");
        }else if("Merah".equals(Lampu)){
            System.out.println("Berhenti");
        }else{
            System.out.println("Tidak ada warna lampu seperti itu");
        }
    }
}
