/**
 * Tugas4
 */
import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jari2 dari bola : ");
        double radius = sc.nextDouble();

        System.out.println("Luas permukaan bola dengan jari jari "+ radius + " adalah "+ LuasBola(radius));

    }

    public static double LuasLingkaran(double radius){
        double A = radius * radius * 3.14;
        return A;
    }

    public static double LuasBola(Double radius){
        double TotalA = 4 * LuasLingkaran(radius);
        return TotalA;
    }
}